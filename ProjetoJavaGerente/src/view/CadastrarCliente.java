/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerCadastroCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author iago2
 */
public class CadastrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
        controller = new ControllerCadastroCliente(this);
    }

    public JButton getBtCadastrar() {
        return btCadastrar;
    }

    public void setBtCadastrar(JButton btCadastrar) {
        this.btCadastrar = btCadastrar;
    }

    public JLabel getLbCPF() {
        return lbCPF;
    }

    public void setLbCPF(JLabel lbCPF) {
        this.lbCPF = lbCPF;
    }

    public JLabel getLbCadastrarCliente() {
        return lbCadastrarCliente;
    }

    public void setLbCadastrarCliente(JLabel lbCadastrarCliente) {
        this.lbCadastrarCliente = lbCadastrarCliente;
    }

    public JLabel getLbNome() {
        return lbNome;
    }

    public void setLbNome(JLabel lbNome) {
        this.lbNome = lbNome;
    }

    public JLabel getLbSenha() {
        return lbSenha;
    }

    public void setLbSenha(JLabel lbSenha) {
        this.lbSenha = lbSenha;
    }

    public JTextField getTxtEntradaCPFCadastrar() {
        return txtEntradaCPFCadastrar;
    }

    public void setTxtEntradaCPFCadastrar(JTextField txtEntradaCPFCadastrar) {
        this.txtEntradaCPFCadastrar = txtEntradaCPFCadastrar;
    }

    public JTextField getTxtEntradaNomeCadastrar() {
        return txtEntradaNomeCadastrar;
    }

    public void setTxtEntradaNomeCadastrar(JTextField txtEntradaNomeCadastrar) {
        this.txtEntradaNomeCadastrar = txtEntradaNomeCadastrar;
    }

    public JTextField getTxtEntradaSenhaCadastrar() {
        return txtEntradaSenhaCadastrar;
    }

    public void setTxtEntradaSenhaCadastrar(JTextField txtEntradaSenhaCadastrar) {
        this.txtEntradaSenhaCadastrar = txtEntradaSenhaCadastrar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCadastrarCliente = new javax.swing.JLabel();
        txtEntradaNomeCadastrar = new javax.swing.JTextField();
        txtEntradaSenhaCadastrar = new javax.swing.JTextField();
        txtEntradaCPFCadastrar = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbCadastrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCadastrarCliente.setText("Cadastrar Cliente");

        txtEntradaNomeCadastrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntradaNomeCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaNomeCadastrarActionPerformed(evt);
            }
        });

        txtEntradaSenhaCadastrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntradaCPFCadastrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntradaCPFCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaCPFCadastrarActionPerformed(evt);
            }
        });

        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNome.setText("Nome:");

        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCPF.setText("CPF:");
        lbCPF.setToolTipText("");

        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSenha.setText("Senha:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEntradaCPFCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEntradaNomeCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastrar)
                            .addComponent(txtEntradaSenhaCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbCadastrarCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntradaNomeCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntradaCPFCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntradaSenhaCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntradaNomeCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaNomeCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaNomeCadastrarActionPerformed

    private void txtEntradaCPFCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaCPFCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaCPFCadastrarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        controller.salvarCliente();
    }//GEN-LAST:event_btCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastrarCliente().setVisible(true);
//            }
//        });
//    }

    // Instânciando controller.
    private ControllerCadastroCliente controller;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCadastrarCliente;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTextField txtEntradaCPFCadastrar;
    private javax.swing.JTextField txtEntradaNomeCadastrar;
    private javax.swing.JTextField txtEntradaSenhaCadastrar;
    // End of variables declaration//GEN-END:variables
}
