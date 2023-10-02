package BackEnd;

import java.io.Serializable;

public abstract class Parque extends Sistema implements Serializable{
    
    private String nome;
    private int lotacaoMax;
    
    public Parque() {
    }

    public Parque(String nome, int lotacaoMax) {
        this.nome = nome;
        this.lotacaoMax = lotacaoMax;
    }

    public int parqueParaTipo(){
        if (this instanceof ParqueLivre){
            return 1;
        }
        if (this instanceof ParqueCondicionado){
            return 2;
        }
        if (this instanceof ParqueAssegurado){
            return 3;
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }


    public int getLotacaoMax() {
        return lotacaoMax;
    }

    public void setLotaçãoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Parque{"  + ", nome=" + nome + ", lotacaoMax=" + lotacaoMax + '}';
    }

}
