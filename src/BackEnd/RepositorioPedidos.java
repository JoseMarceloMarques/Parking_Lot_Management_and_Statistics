package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

public class RepositorioPedidos implements Serializable {

    private ArrayList<Pedido> listaPedidos;
    private RepositorioUtilizadores listaUtilizadores;
    private RepositorioParques listaParques;
    
    public RepositorioPedidos(ArrayList<Pedido> listaPedidos, RepositorioUtilizadores listaUtilizadores, RepositorioParques listaParques) {
        this.listaPedidos = listaPedidos;
	this.listaUtilizadores  = listaUtilizadores;
        this.listaParques =  listaParques;
    }
	
    public RepositorioPedidos() {
        listaPedidos = new ArrayList<Pedido>();
    }
    public RepositorioPedidos(RepositorioUtilizadores listaUtilizadores, RepositorioParques listaParques) {
	this.listaUtilizadores  = listaUtilizadores;
        this.listaParques =  listaParques;
        listaPedidos = new ArrayList<Pedido>();
    }


    public int tamanho(){
        return listaPedidos.size();
    }

    public Pedido indice(int i){
        return listaPedidos.get(i);
    }

    public void criarPedido(int nif, int tipo, String nomeParque){
        
        Pedido p = new Pedido(listaPedidos.size(), ((Utente) listaUtilizadores.utilizadorPorNif(nif)), "pendente", tipo, listaParques.parqueProcurado(nomeParque));
        
        if(tipo == 3 && listaParques.parqueProcurado(nomeParque) == null){
            //System.out.println("Erro ao criar pedido, parque nao encontrado");
        }else{
            listaPedidos.add(p);
        }   
    }
	

    public String verEstadoPedido(int nif){
        String s = null;
        for(int i = 0; i < listaPedidos.size(); i++){
            Pedido p = listaPedidos.get(i);
            if (p.getUtente().getNif() == nif) {
                s = p.getEstado();
            }
        }
        return s;
    }


    public String pedidosPorEstado() {
        StringBuilder pendente = new StringBuilder("Lista pendente: ");
        StringBuilder atribuido = new StringBuilder("Lista atribuido: ");
        StringBuilder recusado = new StringBuilder( "Lista recusado: ");
        String s = new String();
        for(int i = 0; i < listaPedidos.size(); i++){
            Pedido p = listaPedidos.get(i);
            switch(p.getEstado()){
                case "pendente": pendente.append("[").append(p.getNumero()).append("]");
                case "atribuido": atribuido.append("[").append(p.getNumero()).append("]");
                case "recusado": recusado.append("[").append(p.getNumero()).append("]");
            }

        } 
      return pendente.append(atribuido.append(recusado)).toString();  
    }

    public String listaPendentes(){
        StringBuilder pendente = new StringBuilder("Lista pendente: ");
             
        for(int i = 0; i < listaPedidos.size(); i++){
            Pedido p = listaPedidos.get(i);
            if(p.getEstado().equals("pendente")){
                pendente.append("[").append(p.getNumero()).append("]");
            }

        }
        return pendente.toString();
    }

    public Pedido pedidoPorNumero(int numero){
        for(int i = 0; i < listaPedidos.size(); i++){
            Pedido p = listaPedidos.get(i);
            if (p.getNumero() == numero){
                return p;
            }
        }
        return null;
    }


    public void concederPedido(int numero){
        Pedido p = pedidoPorNumero(numero);
        if (p == null){
            System.out.println("Não existe pedido com esse número");
        }
        else{
            if (p.getTipo() == 3) {
                if (p.getParque().getLotacaoMax() > ((ParqueAssegurado)p.getParque()).getLugaresAtribuidos()){
                    listaPedidos.remove(p);
                    p.setEstado("atribuido");
                    ((ParqueAssegurado)p.getParque()).setLugaresAtribuidos(((ParqueAssegurado)p.getParque()).getLugaresAtribuidos()+1);
                    listaPedidos.add(p);
                    System.out.println("Pedido concedido! Lugar número: " + ((ParqueAssegurado)p.getParque()).getLugaresAtribuidos());
                }
            }
            else {
                listaPedidos.remove(p);
                p.setEstado("atribuido");
                listaPedidos.add(p);
                System.out.println("Pedido concedido!");
            }
        }
    }

    public String calcularValorAdquirido(){
        int totalLivre = 0;
        int totalCondicionado = 0;
        int totalAssegurado = 0;
        
        for(int i = 0; i < listaPedidos.size(); i++){
            Pedido p = listaPedidos.get(i);
            if (p.getEstado().equals("atribuido")){
                if (p.getParque() instanceof ParqueLivre){
                    totalLivre += ((ParqueLivre) p.getParque()).getPreco();
                }
                if (p.getParque() instanceof ParqueCondicionado){
                    totalCondicionado += ((ParqueCondicionado) p.getParque()).getPreco();
                }
                if (p.getParque() instanceof ParqueAssegurado){
                    totalAssegurado += ((ParqueAssegurado) p.getParque()).getPreco();
                }
            }
        }
        int total = totalLivre + totalCondicionado + totalAssegurado;
        String s =("Total Parque Livre: " + totalLivre + "\n" +
                "Total Parque Condicionado: " + totalCondicionado + "\n" +
                "Total Parque Assegurado: " + totalAssegurado + "\n" +
                "Total Parque: " + total);
        return s;
    }
   
    
}
