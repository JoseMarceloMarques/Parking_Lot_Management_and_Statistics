package BackEnd;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Controlo extends Sistema implements Serializable  {                      

    private Viatura viatura;
    private int nif;
    private LocalDateTime data_entrada;
    private LocalDateTime data_saida;
    private Parque parque;

    public Controlo() {

    }

    public Controlo(Viatura viatura,int nif, LocalDateTime data_entrada,Parque parque) {
        this.viatura= viatura;
        this.nif = nif;
        this.data_entrada= data_entrada;      
        this.parque=parque;
        data_saida = null;
    }
    
    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    public LocalDateTime getDataEntrada() {
        return data_entrada;
    }

    public void setDataEntrada(LocalDateTime data_entrada) {
        this.data_entrada = data_entrada;
    }

    public LocalDateTime getDataSaida() {
        return data_saida;
    }

    public void setDataSaida(LocalDateTime data_saida) {
        this.data_saida = data_saida;
    }

    public Parque getParque() {
        return parque;
    }

    public void setParque(Parque parque) {
        this.parque = parque;
    }
    
    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Controlo{" + "viatura=" + viatura + ", data_entrada=" + data_entrada + ", data_saida=" + data_saida + ", parque=" + parque.getNome() + '}';
    }

    
   
}
