package BackEnd;

import java.io.Serializable;

public class ParqueAssegurado extends Parque implements Serializable{
    
    private static double preco = 100.0;
    private int lugaresAtribuidos;

    public ParqueAssegurado(String nome, int lotacaoMax) {
        super(nome, lotacaoMax);
        lugaresAtribuidos = 0;
    }

    public double getPreco(){
        return preco;
    }
    
    public int getLugaresAtribuidos(){
        return lugaresAtribuidos;
    }

    public void setLugaresAtribuidos(int lugaresAtribuidos){
        this.lugaresAtribuidos = lugaresAtribuidos;
    }
}
