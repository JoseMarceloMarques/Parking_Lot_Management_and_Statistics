package FrontEnd;

import BackEnd.RepositorioUtilizadores;
import BackEnd.Sistema;
import BackEnd.Utente;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class AdicionarSeguranca extends javax.swing.JFrame {

    private Sistema sistema;
    private LocalDate formatoData;
    
    public AdicionarSeguranca(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        
        setTitle("Registo de um novo segurança");
        
        txtNome.requestFocus();
    }
    
    private void registarSeguranca() {
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu nome!");            
            txtNome.requestFocus();
            return;
        }
        
        if (txtNif.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o nif!");
            txtNif.requestFocus();
            return;
        }
        
        if (txtNaturalidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza a sua naturalidade!");
            txtNaturalidade.requestFocus();
            return;
        } 
        
        if (txtDataNasc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento!");
            txtDataNasc.requestFocus();
            return;
        } 
        
        if (txtPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Introduza a password!");
            txtPassword.requestFocus();
            return;
        }
        
        if (txtConfirmacao.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Introduza a password de confirmação!");
            txtConfirmacao.requestFocus();
            return;
        }  
        
        String password = new String(txtPassword.getPassword());
        
        if (!password.equals(new String(txtConfirmacao.getPassword()))){
            JOptionPane.showMessageDialog(this, "A password de confirmação não corresponde à password introduzida!");
            txtConfirmacao.requestFocus();
            return;
        }                                          
          
        
        sistema.getListaUtilizadores().criarSeguranca(txtNome.getText(), Integer.parseInt(txtNif.getText()), txtNaturalidade.getText(), formatoData.parse(txtDataNasc.getText()), password);   
        
        dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNif = new javax.swing.JTextField();
        txtNaturalidade = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        botaoFechar3 = new javax.swing.JButton();
        botaoRegistar = new javax.swing.JButton();
        Confirmação = new javax.swing.JLabel();
        txtConfirmacao = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registar Segurança");

        jLabel2.setText("Nome");

        jLabel3.setText("NIF");

        jLabel4.setText("Naturalidade");

        jLabel5.setText("Data de nascimento");

        jLabel6.setText("Password");

        botaoFechar3.setText("Fechar");
        botaoFechar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFechar3ActionPerformed(evt);
            }
        });

        botaoRegistar.setText("Registar");
        botaoRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistarActionPerformed(evt);
            }
        });

        Confirmação.setText("Confirmação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoFechar3)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(Confirmação))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoRegistar)
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addComponent(txtPassword)
                    .addComponent(txtNome)
                    .addComponent(txtDataNasc)
                    .addComponent(txtNif)
                    .addComponent(txtNaturalidade)
                    .addComponent(txtConfirmacao))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmação)
                    .addComponent(txtConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoFechar3)
                    .addComponent(botaoRegistar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFechar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFechar3ActionPerformed
        dispose();
    }//GEN-LAST:event_botaoFechar3ActionPerformed

    private void botaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarActionPerformed
        registarSeguranca();
    }//GEN-LAST:event_botaoRegistarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Confirmação;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoFechar1;
    private javax.swing.JButton botaoFechar2;
    private javax.swing.JButton botaoFechar3;
    private javax.swing.JButton botaoRegistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtConfirmacao;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNif;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
