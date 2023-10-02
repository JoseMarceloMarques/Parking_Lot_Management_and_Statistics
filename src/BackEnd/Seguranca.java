package BackEnd;

import java.io.Serializable;
import java.time.LocalDate;

public class Seguranca extends Utilizador implements Serializable{

    public Seguranca() {

    }

    public Seguranca(String nome, int nif, String naturalidade, LocalDate data_nasc, String password) {
        super(nome, nif, naturalidade, data_nasc, password);
    }
    
}
