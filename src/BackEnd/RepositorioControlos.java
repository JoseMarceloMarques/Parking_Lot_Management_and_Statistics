package BackEnd;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RepositorioControlos implements Serializable {
   
    private ArrayList<Controlo> listaAtual = new ArrayList<>();
    private ArrayList<Controlo> listaHistorico = new ArrayList<>();
    private RepositorioUtilizadores utilizadores;
    private RepositorioPedidos pedidos;
    private RepositorioParques parques;
    
    public RepositorioControlos(ArrayList<Controlo> listaAtual, ArrayList<Controlo> listaHistorico , RepositorioUtilizadores utilizadores, RepositorioPedidos pedidos, RepositorioParques parques) {
        this.listaAtual = listaAtual;
        this.listaHistorico = listaHistorico;
        this.utilizadores = utilizadores;
        this.pedidos = pedidos;
        this.parques = parques;
    }
	
    public RepositorioControlos(){
        listaAtual = new ArrayList<Controlo>();
        listaHistorico = new ArrayList<Controlo>();
    }
    
    public RepositorioControlos(RepositorioUtilizadores utilizadores, RepositorioPedidos pedidos, RepositorioParques parques) {
        this.utilizadores = utilizadores;
        this.pedidos = pedidos;
        this.parques = parques;
    }

    
    public boolean verificaNif(int nif){
        
        for(int i=0; i < listaAtual.size(); i++){
            Controlo x = listaAtual.get(i);
            if(nif == x.getNif()){
                return true;
            }
        }
        return false;
    }
    
    public boolean temLugares(String nomeParque){
        int capacidadeMax = 0;
        int contadorLugares = 0;
        
        try{
            Parque p = parques.parqueProcurado(nomeParque);
            capacidadeMax = p.getLotacaoMax();
            for(int i = 0; i < listaAtual.size(); i++){
                Controlo linhaControlo = listaAtual.get(i);
                if(linhaControlo.getParque().getNome().equals(nomeParque)){
                    contadorLugares ++;
                }
            }
            if(capacidadeMax > contadorLugares){
                return true;
            }
        }
        catch(NullPointerException e){
            System.out.println("O parque não foi encontrado");
        }
        return false;
    }
    
    public boolean acessoPermitido(int nif, int tipoParque, String nomeParque) {    
        for (int i = 0; i < pedidos.tamanho(); i++){
            Pedido p = pedidos.indice(i);
            if(tipoParque == 1){
                if (p.getUtente().getNif() == nif && p.getTipo() >= tipoParque && p.getEstado().equals("atribuido") && temLugares(nomeParque)) {
                    return true;
                }
            }else{
                if (p.getUtente().getNif() == nif && p.getTipo() == tipoParque && p.getEstado().equals("atribuido") && temLugares(nomeParque)) {
                    if(tipoParque == 2){
                        return true;
                    }else{
                        if(p.getParque().getNome().equals(nomeParque)){
                            return true;
                        }
                    }
                } 
            }
        }
        return false;
    }

    public void registarEntrada(String matricula, int tipoParque, String nomeParque){  
        
        Utilizador u = utilizadores.utentePorMatricula(matricula);
        
        if(u == null){
            //System.out.println("O cliente não tem acesso ao parque");
        }else{
            if(verificaNif(u.getNif())){
               //System.out.println("O utente da viatura já se encontra nas instalações");
            }else{
                if(acessoPermitido(u.getNif(), tipoParque, nomeParque)){
                    Controlo c = new Controlo(((Utente) u).viaturaPorMatricula(matricula), u.getNif(), LocalDateTime.now(), parques.parqueProcurado(nomeParque));
                    listaAtual.add(c);
                    //System.out.println("Entrada registada com sucesso");
                }
            }
        }
    }

    public void registarSaida(String matricula, String nomeParque) { 
        
        for (int i = 0; i < listaAtual.size(); i++){  
            Controlo c = listaAtual.get(i);
            
            if(c.getViatura().getMatricula().equals(matricula)){
                c.setDataSaida(LocalDateTime.now());
                listaHistorico.add(c);
                listaAtual.remove(i);                    
            }
        }
    }

    
    public String  viaturasNasInstalacoes(){
        StringBuilder stringViaturasNasInstalacoes = new StringBuilder();
        for (int i = 0; i < listaAtual.size(); i++){  
            Controlo c = listaAtual.get(i);
            stringViaturasNasInstalacoes.append("[").append(c.getViatura().getMatricula()).append("]; ");
        } 
        
	return stringViaturasNasInstalacoes.toString();
    }


    public String viaturasPorData(LocalDateTime data){    
        StringBuilder stringViaturasPorData = new StringBuilder();                                                                             
        for (int i = 0; i < listaAtual.size(); i++) {
            Controlo c = listaAtual.get(i);
            if ((c.getDataEntrada().equals(data) || c.getDataEntrada().isBefore(data))) {
                stringViaturasPorData.append("[").append(c.getViatura().getMatricula()).append("]; ");
            }
        }
        for (int i = 0; i < listaHistorico.size(); i++) {
            Controlo c = listaHistorico.get(i);
            if (((c.getDataEntrada().equals(data) || c.getDataEntrada().isBefore(data)) && (c.getDataSaida().equals(data) || c.getDataSaida().isAfter(data)))) {
                stringViaturasPorData.append("[").append(c.getViatura().getMatricula()).append("]; ");
            }
        }
	return stringViaturasPorData.toString();
    }       

    public String viaturasPorParqueEData(String nomeParque, LocalDateTime data) {  
        StringBuilder stringViaturasPorParqueEData = new StringBuilder();
        for (int i = 0; i < listaHistorico.size(); i++){
            Controlo c = listaHistorico.get(i);
            if (c.getParque().getNome().equals(nomeParque) && (c.getDataEntrada().equals(data) || c.getDataEntrada().isBefore(data))){
                stringViaturasPorParqueEData.append("[").append(c.getViatura().getMatricula()).append("]; ");
            }
        }
        for (int i = 0; i < listaHistorico.size(); i++) {
            Controlo c = listaHistorico.get(i);
            if (c.getParque().getNome().equals(nomeParque) && ((c.getDataEntrada().equals(data) || c.getDataEntrada().isBefore(data)) && (c.getDataSaida().equals(data) || c.getDataSaida().isAfter(data)))) {
                stringViaturasPorParqueEData.append("[").append(c.getViatura().getMatricula()).append("]; ");
            }
        }
        return stringViaturasPorParqueEData.toString();
    }       
            

    public int lugaresDisponiveis(String nomeParque){
        if (temLugares(nomeParque)) {
            return 1;
        }
        return 2;
    }


    public int acessoMatriculaParque(String matricula, String nomeParque){
        Utilizador u = utilizadores.utentePorMatricula(matricula);
        Parque parque = parques.parqueProcurado(nomeParque);
        int acesso = 0;

        if (u == null || parque == null) {
            //System.out.println("Matricula ou Parque inexistente");
        }
        else{
            int tipoParque = parque.parqueParaTipo();
            int nif = u.getNif();

            for (int i = 0; i < pedidos.tamanho(); i++){
                Pedido p = pedidos.indice(i);
                if(tipoParque == 1){
                    if (p.getUtente().getNif() == nif && p.getTipo() >= tipoParque && p.getEstado().equals("atribuido")) {
                        acesso = 1;
                    }
                }else{
                    if (p.getUtente().getNif() == nif && p.getTipo() == tipoParque && p.getEstado().equals("atribuido")) {
                        if(tipoParque == 2){
                            acesso = 1;
                        }else{
                            if(p.getParque().getNome().equals(nomeParque)){
                                acesso = 1;
                            }
                        }
                    }
                }
            }
        }
        if (acesso == 1){
            return 1;
        }
        else{
            return 2;
        }
    }   

    public void viaturasPorParque(String nomeParque){ //FUNCIONALIDADE EXTRA
        StringBuilder stringViaturasPorParque = new StringBuilder();

        for (int i = 0; i < listaAtual.size(); i++) {
            Controlo c = listaAtual.get(i);
            if(c.getParque().getNome().equals(nomeParque)){
                stringViaturasPorParque.append("[").append(c.getViatura().getMatricula()).append("]; ");
            }
        }
    }       
}




