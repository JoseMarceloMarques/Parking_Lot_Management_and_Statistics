package FrontEnd;

import BD.Serializacao;
import BackEnd.Sistema;


public class InterfaceSeguranca extends javax.swing.JFrame {
    
    private Sistema sistema;
   
    public InterfaceSeguranca(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        entrada = new javax.swing.JMenuItem();
        saida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        viaturasInstalacoes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        lugares = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        matriculaAcesso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Registar");

        entrada.setText("Entrada de viatura");
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });
        jMenu1.add(entrada);

        saida.setText("Saída de viatura");
        saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaActionPerformed(evt);
            }
        });
        jMenu1.add(saida);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        viaturasInstalacoes.setText("Viaturas nas instalações");
        viaturasInstalacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viaturasInstalacoesActionPerformed(evt);
            }
        });
        jMenu2.add(viaturasInstalacoes);

        jMenuItem4.setText("Viaturas nas instalações numa determinada data");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Viaturas nas instalações numa data e parque específicos");
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator1);

        lugares.setText("Lugares disponíveis num determinado parque");
        lugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugaresActionPerformed(evt);
            }
        });
        jMenu2.add(lugares);
        jMenu2.add(jSeparator2);

        matriculaAcesso.setText("Matrícula com acesso a determinado parque");
        matriculaAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaAcessoActionPerformed(evt);
            }
        });
        jMenu2.add(matriculaAcesso);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ficheiroDados = String.format("%s\\Sistema.data", System.getProperty("user.dir"));
        Serializacao bd = new Serializacao(ficheiroDados);
        bd.guardar(sistema);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        EntradaViatura entradaViatura = new EntradaViatura(sistema);
        entradaViatura.setVisible(true);
    }//GEN-LAST:event_entradaActionPerformed

    private void saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaActionPerformed
        SaidaViatura saidaViatura = new SaidaViatura(sistema);
        saidaViatura.setVisible(true);
    }//GEN-LAST:event_saidaActionPerformed

    private void viaturasInstalacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viaturasInstalacoesActionPerformed
        ViaturasInstalacoes viaturasInstalacoes = new ViaturasInstalacoes(sistema);
        viaturasInstalacoes.setVisible(true);
    }//GEN-LAST:event_viaturasInstalacoesActionPerformed

    private void lugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugaresActionPerformed
        LugaresDisponiveis lugaresDisponiveis = new LugaresDisponiveis(sistema);
        lugaresDisponiveis.setVisible(true);
    }//GEN-LAST:event_lugaresActionPerformed

    private void matriculaAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaAcessoActionPerformed
        MatriculaAcesso matriculaAcesso = new MatriculaAcesso(sistema);
        matriculaAcesso.setVisible(true);
    }//GEN-LAST:event_matriculaAcessoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem lugares;
    private javax.swing.JMenuItem matriculaAcesso;
    private javax.swing.JMenuItem saida;
    private javax.swing.JMenuItem viaturasInstalacoes;
    // End of variables declaration//GEN-END:variables
}
