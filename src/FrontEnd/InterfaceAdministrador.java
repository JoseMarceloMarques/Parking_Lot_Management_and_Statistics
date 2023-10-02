package FrontEnd;

import BD.Serializacao;
import BackEnd.Sistema;

public class InterfaceAdministrador extends javax.swing.JFrame {

    private Sistema sistema;
    
    public InterfaceAdministrador(Sistema sistema) {
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
        botaoAdicionarSeg = new javax.swing.JMenuItem();
        BotaoEliminarSeg = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        botaoRegistarParque = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        estado = new javax.swing.JMenuItem();
        pendentes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        percCombustivel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Administrar");

        botaoAdicionarSeg.setText("Adicionar segurança");
        botaoAdicionarSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarSegActionPerformed(evt);
            }
        });
        jMenu1.add(botaoAdicionarSeg);

        BotaoEliminarSeg.setText("Eliminar segurança");
        BotaoEliminarSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEliminarSegActionPerformed(evt);
            }
        });
        jMenu1.add(BotaoEliminarSeg);
        jMenu1.add(jSeparator1);

        botaoRegistarParque.setText("Registar parque");
        botaoRegistarParque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistarParqueActionPerformed(evt);
            }
        });
        jMenu1.add(botaoRegistarParque);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Pedidos");

        estado.setText("Listar pedidos de acesso por estado");
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
        jMenu3.add(estado);

        pendentes.setText("Listar pedidos de acesso pendentes");
        pendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendentesActionPerformed(evt);
            }
        });
        jMenu3.add(pendentes);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Consultar");

        jMenuItem7.setText("Valor angariado ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        percCombustivel.setText("Percentagem de viaturas por combustível");
        percCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percCombustivelActionPerformed(evt);
            }
        });
        jMenu2.add(percCombustivel);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ficheiroDados = String.format("%s\\Sistema.data", System.getProperty("user.dir"));
        Serializacao bd = new Serializacao(ficheiroDados);
        bd.guardar(sistema);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoAdicionarSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarSegActionPerformed
        AdicionarSeguranca adicionarSeguranca = new AdicionarSeguranca(sistema);
        adicionarSeguranca.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarSegActionPerformed

    private void BotaoEliminarSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEliminarSegActionPerformed
        EliminarSeguranca eliminarSeguranca = new EliminarSeguranca(sistema);
        eliminarSeguranca.setVisible(true);
    }//GEN-LAST:event_BotaoEliminarSegActionPerformed

    private void botaoRegistarParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarParqueActionPerformed
        RegistarParque registarParque = new RegistarParque(sistema);
        registarParque.setVisible(true);
    }//GEN-LAST:event_botaoRegistarParqueActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ValorTotal valorTotal = new ValorTotal(sistema);
        valorTotal.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void percCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percCombustivelActionPerformed
        PercentagemCombustivel percentagemCombustivel = new PercentagemCombustivel(sistema);
        percentagemCombustivel.setVisible(true);
    }//GEN-LAST:event_percCombustivelActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        ListarPedidosEstado listarPedidosEstado = new ListarPedidosEstado(sistema);
        listarPedidosEstado.setVisible(true);
    }//GEN-LAST:event_estadoActionPerformed

    private void pendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendentesActionPerformed
        ListarPedidosPendentes listarPedidosPendentes = new ListarPedidosPendentes(sistema);
        listarPedidosPendentes.setVisible(true);
    }//GEN-LAST:event_pendentesActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BotaoEliminarSeg;
    private javax.swing.JMenuItem botaoAdicionarSeg;
    private javax.swing.JMenuItem botaoRegistarParque;
    private javax.swing.JMenuItem estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem pendentes;
    private javax.swing.JMenuItem percCombustivel;
    // End of variables declaration//GEN-END:variables
}
