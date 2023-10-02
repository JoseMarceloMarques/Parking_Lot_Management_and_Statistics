package BackEnd;

import java.io.Serializable;

public class ParqueCondicionado extends Parque implements Serializable{
 
    private static double preco = 50.0;

    public ParqueCondicionado(String nome, int lotacaoMax) {
        super(nome, lotacaoMax);
    }

    public double getPreco(){
        return preco;
    }
}
