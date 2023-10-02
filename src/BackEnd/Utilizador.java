package BackEnd;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Utilizador extends Sistema implements Serializable{
    private String nome;
    private int nif;
    private String naturalidade;
    private LocalDate data_nasc;
    private String password;
    public static Sistema sistema;
    
   
    public Utilizador() {        
    }
    
    public Utilizador(String nome, int nif, String naturalidade, LocalDate data_nasc, String password) {
        this.nome = nome;
        this.nif = nif;
        this.naturalidade = naturalidade;
        this.data_nasc = data_nasc;
        this.password = password;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getNif() {
        return nif;
    }
    
    public String getNaturalidade() {
        return naturalidade;
    }
    
    public LocalDate getDataNasc() {
        return data_nasc;
        
    }
    
    public String getPassword() {
        return password;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    
    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "nome=" + nome + ", nif=" + nif + ", naturalidade=" + naturalidade + ", data_nasc=" + data_nasc + ", password=" + password + '}';
    }
    
}
