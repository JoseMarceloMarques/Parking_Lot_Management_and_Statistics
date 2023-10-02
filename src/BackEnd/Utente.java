package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;

public class Utente extends Utilizador implements Serializable {
    
    private ArrayList<Viatura> viaturas;
    
    public Utente() {
        
    }
    
    public Utente (String nome, int nif, String naturalidade, LocalDate data_nasc, String password) {
        super(nome, nif, naturalidade, data_nasc, password);
        viaturas = new ArrayList<>();
    }

    public ArrayList<Viatura> getViaturas() {
        return viaturas;
    }
    
    public ArrayList<String> devolveMatriculas(){
        
        ArrayList<String> matriculas = new ArrayList<>();
        
        for (int i = 0; i < viaturas.size(); i++){
            matriculas.add(viaturas.get(i).getMatricula());
        }
        
        return matriculas;
    }
    
    public Viatura viaturaPorMatricula(String matricula){
        Viatura v = null;
        
        for (int i = 0; i < viaturas.size(); i++){
            v = viaturas.get(i);
            
            if(v.getMatricula().equals(matricula)){
                return v;
            }
        }
        return v;
    }
           
    @Override
    public String toString() {
        return super.toString()+ ", viaturas=" + viaturas;
    }
                 
}
        
    

    
    
    
    
    
    
    
    
    

