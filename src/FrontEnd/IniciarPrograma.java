package FrontEnd;

import javax.swing.JOptionPane;
import BD.Serializacao;
import BackEnd.Administrador;
import BackEnd.Controlo;
import BackEnd.Parque;
import BackEnd.ParqueAssegurado;
import BackEnd.ParqueCondicionado;
import BackEnd.ParqueLivre;
import BackEnd.Pedido;
import BackEnd.RepositorioControlos;
import BackEnd.RepositorioParques;
import BackEnd.RepositorioPedidos;
import BackEnd.RepositorioUtilizadores;
import BackEnd.Seguranca;
import BackEnd.Sistema;
import BackEnd.Utente;
import BackEnd.Utilizador;
import BackEnd.Viatura;
import java.time.LocalDate;

public class IniciarPrograma {
    
    public static void main(String[] args) throws RepositorioUtilizadores.UtilizadorDuplicadoException {
        Sistema sistema;
        String ficheiroDados = String.format("%s\\Sistema.data", System.getProperty("user.dir"));
        System.out.println(String.format("Ficheiro de dados: %s.", ficheiroDados));
        Serializacao bd = new Serializacao(ficheiroDados);
        
        if (!bd.getFicheiro().exists()) {
            sistema = new Sistema();    
            sistema.getListaUtilizadores().getListaUtilizadores().add(new Administrador("Admin", 111, "Algarve", LocalDate.of(1978, 2, 10), "admin"));
            sistema.getListaUtilizadores().criarUtente(new Utente("Marcelo", 222, "Braga", LocalDate.of(1998, 9, 15), "user"));
            sistema.adicionarViatura(222, "MM-20-07", "Seat", "Ibiza", "Gasolina");

        }else{
            sistema = bd.carregar();           
        }
                     
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal(sistema);               
        janelaPrincipal.setVisible(true);
    }  
}
