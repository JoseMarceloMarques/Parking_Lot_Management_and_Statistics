package FrontEnd;

import BD.Serializacao;
import BackEnd.Sistema;
import BackEnd.Utilizador;
import javax.swing.JOptionPane;

public class InterfaceUtente extends javax.swing.JFrame {

    private Sistema sistema;
    
    public InterfaceUtente(Sistema sistema, Utilizador utilizador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
    }
    
    public boolean numeroViaturas(){
        if(sistema.getUtilizadorLigado().getViaturas().isEmpty()){
            return true;
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        botaoFechar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        verDadosUtente = new javax.swing.JMenuItem();
        verDadosViatura = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        editarDadosUtente = new javax.swing.JMenuItem();
        editarDadosViatura = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        botaoAdicionarViatura = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        solicitarCompra = new javax.swing.JMenuItem();
        verPedidos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Utente");

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        jMenu1.setText("Ver");

        verDadosUtente.setText("Dados  do  utilizador");
        verDadosUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDadosUtenteActionPerformed(evt);
            }
        });
        jMenu1.add(verDadosUtente);

        verDadosViatura.setText("Dados da Viatura");
        verDadosViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDadosViaturaActionPerformed(evt);
            }
        });
        jMenu1.add(verDadosViatura);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        editarDadosUtente.setText("Dados do utilizador");
        editarDadosUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDadosUtenteActionPerformed(evt);
            }
        });
        jMenu2.add(editarDadosUtente);

        editarDadosViatura.setText("Dados da viatura");
        editarDadosViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDadosViaturaActionPerformed(evt);
            }
        });
        jMenu2.add(editarDadosViatura);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Adicionar");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        botaoAdicionarViatura.setText("Adicionar Viatura");
        botaoAdicionarViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarViaturaActionPerformed(evt);
            }
        });
        jMenu4.add(botaoAdicionarViatura);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Parques");

        solicitarCompra.setText("Solicitar compra de parque");
        solicitarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarCompraActionPerformed(evt);
            }
        });
        jMenu3.add(solicitarCompra);

        verPedidos.setText("Ver estados dos pedidos");
        verPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPedidosActionPerformed(evt);
            }
        });
        jMenu3.add(verPedidos);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(botaoFechar)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(botaoFechar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        
        String ficheiroDados = String.format("%s\\Sistema.data", System.getProperty("user.dir"));
        Serializacao bd = new Serializacao(ficheiroDados);
        bd.guardar(sistema);
        dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void verDadosViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDadosViaturaActionPerformed
        if(!numeroViaturas()){
            VerDadosViatura verDadosViatura = new VerDadosViatura(sistema, sistema.getUtilizadorLigado());
            verDadosViatura.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(this, "O utilizador não tem viaturas");
        }

    }//GEN-LAST:event_verDadosViaturaActionPerformed

    private void verDadosUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDadosUtenteActionPerformed
        VerDadosUtilizador verDadosUtilizador = new VerDadosUtilizador(sistema, sistema.getUtilizadorLigado());
        verDadosUtilizador.setVisible(true);
    }//GEN-LAST:event_verDadosUtenteActionPerformed

    private void editarDadosUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDadosUtenteActionPerformed
        EditarDadosUtilizador editarDadosUtilizador = new EditarDadosUtilizador(sistema, sistema.getUtilizadorLigado());
        editarDadosUtilizador.setVisible(true);
    }//GEN-LAST:event_editarDadosUtenteActionPerformed

    private void editarDadosViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDadosViaturaActionPerformed
        if(!numeroViaturas()){            
            EditarDadosViatura editarDadosViatura = new EditarDadosViatura(sistema, sistema.getUtilizadorLigado());
            editarDadosViatura.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(this, "O utilizador não tem viaturas");
        }

    }//GEN-LAST:event_editarDadosViaturaActionPerformed

    private void botaoAdicionarViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarViaturaActionPerformed
        AdicionarViatura adicionarViatura = new AdicionarViatura(sistema, sistema.getUtilizadorLigado());
        adicionarViatura.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarViaturaActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void solicitarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarCompraActionPerformed
        ComprarParque comprarParque = new ComprarParque(sistema, sistema.getUtilizadorLigado());
        comprarParque.setVisible(true);
    }//GEN-LAST:event_solicitarCompraActionPerformed

    private void verPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPedidosActionPerformed
        VerEstadoPedidos verEstadoPedidos = new VerEstadoPedidos(sistema, sistema.getUtilizadorLigado());
        verEstadoPedidos.setVisible(true);
    }//GEN-LAST:event_verPedidosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botaoAdicionarViatura;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JMenuItem editarDadosUtente;
    private javax.swing.JMenuItem editarDadosViatura;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem solicitarCompra;
    private javax.swing.JMenuItem verDadosUtente;
    private javax.swing.JMenuItem verDadosViatura;
    private javax.swing.JMenuItem verPedidos;
    // End of variables declaration//GEN-END:variables
}
