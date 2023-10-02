package BackEnd;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioUtilizadores implements Serializable {
    
    private ArrayList<Utilizador> listaUtilizadores;
    
    public class UtilizadorNaoExistenteException extends Exception {
        public UtilizadorNaoExistenteException() { }
        public UtilizadorNaoExistenteException(String message) {
            super(message);
        }        
    }
    
    public class UtilizadorDuplicadoException extends Exception {
        public UtilizadorDuplicadoException() { }
        public UtilizadorDuplicadoException(String message) {
            super(message);
        }        
    }
    
    public RepositorioUtilizadores(ArrayList<Utilizador> listaUtilizadores){
        this.listaUtilizadores = listaUtilizadores;
    }
	
	public RepositorioUtilizadores(){
        listaUtilizadores = new ArrayList<Utilizador>();
    }
   
    public  ArrayList<Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }
    
    public int tamanho(){
        return listaUtilizadores.size();
    }
    
    public Utilizador indice(int i){

        return listaUtilizadores.get(i);
    }

    public boolean existeUtilizador(int nif){
        for(int i = 0; i < listaUtilizadores.size(); i++){
            Utilizador u = listaUtilizadores.get(i);
            if(u.getNif() == nif) {
                return true;
            }
        }
        return false;
    }
    
    public int utilizadorPorTipo(int nif){
        for(int i = 0; i < listaUtilizadores.size(); i++){
            Utilizador u = listaUtilizadores.get(i);
            if(u instanceof Utente && u.getNif() == nif) {
                return 1;
            }else{
                if(u instanceof Seguranca && u.getNif() == nif){
                    return 2;
                }else{
                    if(u instanceof Administrador && u.getNif() == nif){
                    return 3;
                    }
                }
            }
        }
        return 0;
    }
    

    public void criarUtente(Utilizador utilizador) throws UtilizadorDuplicadoException {
        if (utilizador == null) {
            throw new NullPointerException("O parâmetro 'utilizador' não pode ser um valor nulo");
        }        
        
        if (!this.existeUtilizador(utilizador.getNif())) {
            listaUtilizadores.add(utilizador);
        }else{
            throw new UtilizadorDuplicadoException(String.format("O utente com o nif '%d' já está registado", utilizador.getNif()));
        }
    }

    public Utilizador utilizadorPorNif(int nif){
        for (int i = 0; i < listaUtilizadores.size(); i++){
            Utilizador u = listaUtilizadores.get(i);
            if(u.getNif() == nif){
                return u;
            }
        }
        return null;
    }
	
	public Utilizador segurancaPorNif(int nif){
        for (int i = 0; i < listaUtilizadores.size(); i++){
            Utilizador u = listaUtilizadores.get(i);
            if(u.getNif() == nif && u instanceof Seguranca){
                return u;
            }
        }
        return null;
    }
   
    public void criarSeguranca(String nome, int nif, String naturalidade, LocalDate data_nasc, String password) {
        Seguranca s = new Seguranca (nome,nif,naturalidade,data_nasc,password);
        if (segurancaPorNif(nif) == null) {    
            listaUtilizadores.add(s);
        }
        else {
            System.out.println("Já se encontra um Segurança com NIF igual no sistema.");
        }
    }

    public void removerSegurança(int nif){
        Utilizador u = segurancaPorNif(nif);
        if (u == null){
            System.out.println("Não existe segurança com esse NIF");
        }
        else{
            this.listaUtilizadores.remove(u);
        }
    }   

    public String viaturasPorCombustivel(){
        int totalGasolina = 0;
        int totalGasoleo = 0;
        int totalGPL = 0;

        for( int i = 0; i < listaUtilizadores.size(); i++){
            Utilizador u = listaUtilizadores.get(i);
            if (u instanceof Utente){
                for (int j = 0; j < ((Utente) u).getViaturas().size(); j++){
                    Viatura v = ((Utente) u).getViaturas().get(j);
                    switch (v.getCombustivel()){
                        case "gasolina": totalGasolina++;
                        case "gasoleo": totalGasoleo++;
                        case "gpl": totalGPL++;
                    }
                }
            }
        }

        int total = totalGasolina + totalGasoleo + totalGPL;

        String s = ("Carros a gasolina: " + (totalGasolina/total) + "%\n" +
                "Carros a gasoleo: " + (totalGasoleo/total + "%\n" +
                "Carros a GPL: " + (totalGPL/total)) + "%");
        return s;
    }

    public Utilizador utentePorMatricula(String matricula){
        Utilizador u = null;
        for (int i = 0; i < listaUtilizadores.size(); i++){
            Utilizador x = listaUtilizadores.get(i);
            
            if(x instanceof Utente){
                if(((Utente) x).devolveMatriculas().contains(matricula)){
                    u = x;
                }
            }
        }
        return u;
    }
    
}

