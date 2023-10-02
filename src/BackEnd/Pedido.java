package BackEnd;

import java.io.Serializable;

public class Pedido extends Sistema implements Serializable{
    
    private int numero;
    private Utente utente;
    private String estado;  //pendente, atribuido e rejeitado
    private int tipo;    //livre, condicionado e assegurado
    private Parque parque;
    
    public Pedido() {
    }

    public Pedido(int numero, Utente utente, String estado, int tipo, Parque parque) {
        this.numero = numero;
        this.utente = utente;
        this.estado = estado;
        this.tipo = tipo;
        this.parque = parque;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Parque getParque() {
        return parque;
    }

    public void setParque(Parque parque) {
        this.parque = parque;
    }
            
    
}
