package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

public class RepositorioParques implements Serializable {
    
    private ArrayList<Parque> listaParques;
    
    public RepositorioParques(ArrayList<Parque> listaParques) {
        this.listaParques = listaParques;
    }
    
    public RepositorioParques() {
        listaParques = new ArrayList<Parque>();
    }
    
    public ArrayList<Parque> getListaParques(){
        return listaParques;
    }
	
    public int tamanho(){
        return listaParques.size();
    }
    
    public Parque indice(int i){
        return listaParques.get(i);
    }
    
    public Parque parqueProcurado(String nomeParque){
        for(int i= 0; i < listaParques.size(); i++){
            Parque p = listaParques.get(i);
            
            if(p.getNome().equals(nomeParque)){
                return p;
            }
        }
        return null;
    }

    public void registarParque(String nomeParque, int lotacaoMax, int tipoParque){
        Parque p = null;
        switch (tipoParque){
            case 1:
                p = new ParqueLivre(nomeParque, lotacaoMax);
                listaParques.add(p);
                break;
            case 2:
                p = new ParqueCondicionado(nomeParque, lotacaoMax);
                listaParques.add(p);
                break;
            case 3:
                p = new ParqueAssegurado(nomeParque, lotacaoMax);
                listaParques.add(p);
                break;
            default:
                System.out.println("Opcao Invalida");
        }
    }

}
