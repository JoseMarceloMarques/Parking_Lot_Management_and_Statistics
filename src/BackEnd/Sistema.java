package BackEnd;

import java.io.Serializable;

public class Sistema implements Serializable {

    private RepositorioUtilizadores listaUtilizadores;
    private RepositorioParques listaParques;
    private RepositorioControlos listaControlos;
    private RepositorioPedidos listaPedidos;
    private Utente utilizadorLigado;

    public Sistema() {
        listaUtilizadores = new RepositorioUtilizadores();
        listaParques = new RepositorioParques();
        listaPedidos = new RepositorioPedidos(listaUtilizadores, listaParques);
        listaControlos = new RepositorioControlos(listaUtilizadores, listaPedidos, listaParques);
    }

    public Sistema(RepositorioUtilizadores listaUtilizadores, RepositorioParques listaParques, RepositorioControlos listaControlos, RepositorioPedidos listaPedidos) {
        this.listaUtilizadores = listaUtilizadores;
        this.listaParques = listaParques;
        this.listaControlos = listaControlos;
        this.listaPedidos = listaPedidos;
    }

    public RepositorioUtilizadores getListaUtilizadores() {
        return listaUtilizadores;
    }

    public void setListaUtilizadores(RepositorioUtilizadores listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }

    public RepositorioParques getListaParques() {
        return listaParques;
    }

    public void setListaParques(RepositorioParques listaParques) {
        this.listaParques = listaParques;
    }

    public RepositorioControlos getListaControlos() {
        return listaControlos;
    }

    public void setListaControlos(RepositorioControlos listaControlos) {
        this.listaControlos = listaControlos;
    }

    public RepositorioPedidos getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(RepositorioPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public Utente getUtilizadorLigado() {
        return utilizadorLigado;
    }

    public void setUtilizadorLigado(Utente utilizadorLigado) {
        this.utilizadorLigado = utilizadorLigado;
    }
    
    public void adicionarViatura(int nif, String matricula, String marca, String modelo, String combustivel) {
        for(int i = 0; i < listaUtilizadores.tamanho(); i++){
            Utilizador u = listaUtilizadores.indice(i);
            
            if(u.getNif() == nif) {
                if(((Utente) u).getViaturas().size() <= 3){
                    ((Utente) u).getViaturas().add(new Viatura(nif, matricula, marca, modelo, combustivel));
                }else{
                //System.out.println("O utente já possui 3 viaturas");
                }
            }else{
                //System.out.println("O utente com esse nif não foi encontrado");
            }
        }     
    }
    
    public boolean autenticarUtilizador(int nif, String password) {        
        if (listaUtilizadores.existeUtilizador(nif)) {
            try{
                Utilizador u = listaUtilizadores.utilizadorPorNif(nif);                
                if (u.getPassword().equals(password)){
                    if(listaUtilizadores.utilizadorPorTipo(nif) == 1){
                        utilizadorLigado = ((Utente)u);
                    }   
                    return true;
                }                
            }catch (Exception e) {}                        
        }        
        return false;        
    }
            
     public void terminar() {
        System.exit(0);
    }

}
