package FrontEnd;

import BackEnd.Sistema;
import BackEnd.Utilizador;
import javax.swing.JOptionPane;


public class EditarDadosViatura extends javax.swing.JFrame {

    private Sistema sistema;
    private Utilizador utilizador;
    
    public EditarDadosViatura(Sistema sistema, Utilizador utilizador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        this.utilizador = utilizador;;
        
        setTitle("Editar dados das viaturas");
        
        if(sistema.getUtilizadorLigado().getViaturas().size() == 1){
            txtMatricula1.setText(sistema.getUtilizadorLigado().getViaturas().get(0).getMatricula());
        }else{
            if(sistema.getUtilizadorLigado().getViaturas().size() == 2){
                txtMatricula1.setText(sistema.getUtilizadorLigado().getViaturas().get(0).getMatricula());   
                txtMatricula2.setText(sistema.getUtilizadorLigado().getViaturas().get(1).getMatricula());
            }else{
                if(sistema.getUtilizadorLigado().getViaturas().size() == 3){
                    txtMatricula1.setText(sistema.getUtilizadorLigado().getViaturas().get(0).getMatricula());
                    txtMatricula2.setText(sistema.getUtilizadorLigado().getViaturas().get(1).getMatricula());;                  
                    txtMatricula3.setText(sistema.getUtilizadorLigado().getViaturas().get(2).getMatricula());
                }else{
                    JOptionPane.showMessageDialog(this, "O utente não tem nenhuma viatura");  
                }
            }
        }
    }
        
        private void editarDadosViaturas() {  
            if(sistema.getUtilizadorLigado().getViaturas().size() == 1){
                if (txtMarca1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Introduza a sua naturalidade!");
                txtMarca1.requestFocus();
                return;
                } 

                if (txtModelo1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento!");
                    txtModelo1.requestFocus();
                    return;
                } 

                if (txtCombustivel1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Introduza a password!");
                    txtCombustivel1.requestFocus();
                    return;
                }
                sistema.getUtilizadorLigado().getViaturas().get(0).setMarca(txtMarca1.getText());
                sistema.getUtilizadorLigado().getViaturas().get(0).setModelo(txtModelo1.getText());
                sistema.getUtilizadorLigado().getViaturas().get(0).setCombustivel(txtCombustivel1.getText());
            }else{
                if(sistema.getUtilizadorLigado().getViaturas().size() == 2){
                    if (txtMarca1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Introduza a sua naturalidade!");
                    txtMarca1.requestFocus();
                    return;
                    } 

                    if (txtModelo1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento!");
                        txtModelo1.requestFocus();
                        return;
                    } 

                    if (txtCombustivel1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Introduza a password!");
                        txtCombustivel1.requestFocus();
                        return;
                    }
                    sistema.getUtilizadorLigado().getViaturas().get(0).setMarca(txtMarca1.getText());
                    sistema.getUtilizadorLigado().getViaturas().get(0).setModelo(txtModelo1.getText());
                    sistema.getUtilizadorLigado().getViaturas().get(0).setCombustivel(txtCombustivel1.getText());
                    
                    if (txtMarca2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Introduza a sua naturalidade!");
                    txtMarca2.requestFocus();
                    return;
                    } 

                    if (txtModelo2.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento!");
                        txtModelo2.requestFocus();
                        return;
                    } 

                    if (txtCombustivel2.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Introduza a password!");
                        txtCombustivel2.requestFocus();
                        return;
                    }
                    sistema.getUtilizadorLigado().getViaturas().get(1).setMarca(txtMarca1.getText());
                    sistema.getUtilizadorLigado().getViaturas().get(1).setModelo(txtModelo1.getText());
                    sistema.getUtilizadorLigado().getViaturas().get(1).setCombustivel(txtCombustivel1.getText());
                }else{
                    if(sistema.getUtilizadorLigado().getViaturas().size() == 3){
                        if (txtMarca1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Introduza a sua naturalidade!");
                        txtMarca1.requestFocus();
                        return;
                        } 

                        if (txtModelo1.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento!");
                            txtModelo1.requestFocus();
                            return;
                        } 

                        if (txtCombustivel1.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Introduza a password!");
                            txtCombustivel1.requestFocus();
                            return;
                        }
                        sistema.getUtilizadorLigado().getViaturas().get(0).setMarca(txtMarca1.getText());
                        sistema.getUtilizadorLigado().getViaturas().get(0).setModelo(txtModelo1.getText());
                        sistema.getUtilizadorLigado().getViaturas().get(0).setCombustivel(txtCombustivel1.getText());

                        if (txtMarca2.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Introduza a sua naturalidade!");
                        txtMarca2.requestFocus();
                        return;
                        } 

                        if (txtModelo2.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento!");
                            txtModelo2.requestFocus();
                            return;
                        } 

                        if (txtCombustivel2.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Introduza a password!");
                            txtCombustivel2.requestFocus();
                            return;
                        }
                        sistema.getUtilizadorLigado().getViaturas().get(1).setMarca(txtMarca1.getText());
                        sistema.getUtilizadorLigado().getViaturas().get(1).setModelo(txtModelo1.getText());
                        sistema.getUtilizadorLigado().getViaturas().get(1).setCombustivel(txtCombustivel1.getText());
                        
                        if (txtMarca3.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Introduza a sua naturalidade!");
                        txtMarca2.requestFocus();
                        return;
                        } 

                        if (txtModelo3.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento!");
                            txtModelo2.requestFocus();
                            return;
                        } 

                        if (txtCombustivel3.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Introduza a password!");
                            txtCombustivel3.requestFocus();
                            return;
                        }
                        sistema.getUtilizadorLigado().getViaturas().get(2).setMarca(txtMarca1.getText());
                        sistema.getUtilizadorLigado().getViaturas().get(2).setModelo(txtModelo1.getText());
                        sistema.getUtilizadorLigado().getViaturas().get(2).setCombustivel(txtCombustivel1.getText());
                    }else{
                        JOptionPane.showMessageDialog(this, "O utente não tem nenhuma viatura");  
                    }
                }
            } 
        dispose(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCombustivel2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtMatricula1 = new javax.swing.JTextField();
        txtMarca1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtModelo1 = new javax.swing.JTextField();
        txtCombustivel1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMatricula3 = new javax.swing.JTextField();
        txtMarca3 = new javax.swing.JTextField();
        txtModelo3 = new javax.swing.JTextField();
        txtCombustivel3 = new javax.swing.JTextField();
        botaoGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Matrícula");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Marca");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Modelo");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Combustível");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Editar dados das Viaturas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Matrícula");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Modelo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Combustível");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Viatura 1");

        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Viatura 2");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Viatura 3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Matrícula");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Modelo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Combustível");

        botaoGuardar.setText("Guardar");
        botaoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula3)
                            .addComponent(txtMarca3)
                            .addComponent(txtModelo3)
                            .addComponent(txtCombustivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(botaoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtMarca1)
                            .addComponent(txtModelo1)
                            .addComponent(txtCombustivel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMatricula2)
                                    .addComponent(txtMarca2)
                                    .addComponent(txtModelo2)
                                    .addComponent(txtCombustivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCombustivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtMatricula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtModelo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCombustivel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMatricula3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMarca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtModelo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCombustivel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botaoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGuardarActionPerformed
        editarDadosViaturas();
    }//GEN-LAST:event_botaoGuardarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCombustivel1;
    private javax.swing.JTextField txtCombustivel2;
    private javax.swing.JTextField txtCombustivel3;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtMarca2;
    private javax.swing.JTextField txtMarca3;
    private javax.swing.JTextField txtMatricula1;
    private javax.swing.JTextField txtMatricula2;
    private javax.swing.JTextField txtMatricula3;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtModelo2;
    private javax.swing.JTextField txtModelo3;
    // End of variables declaration//GEN-END:variables
}
