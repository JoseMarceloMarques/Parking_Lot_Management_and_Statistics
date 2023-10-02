package BackEnd;

import java.io.Serializable;

public class ParqueLivre extends Parque implements Serializable{
 
    private static double preco = 22.5;

    public ParqueLivre(String nome, int lotacaoMax) {
        super(nome, lotacaoMax);
    }

    public double getPreco(){
        return preco;
    }
    
    
}
