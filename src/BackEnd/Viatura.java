package BackEnd;

import java.io.Serializable;

public class Viatura extends Sistema implements Serializable{

    private int nif;
    private String matricula;
    private String marca;
    private String modelo;
    private String combustivel;     // gasolina, gasoleo, gpl

    public Viatura() {

    }

    public Viatura(int nif, String matricula, String marca, String modelo, String combustivel) {
        this.nif = nif;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
    }

    public int getNif() {
        return nif;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Viatura{" + "Nif de utente=" + nif + ", Matricula=" + matricula + ", Marca=" + marca + ", Modelo=" + modelo + ", Combustivel=" + combustivel + '}';
    }

}
