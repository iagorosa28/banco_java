/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerDebitoCliente;
import controller.ControllerDepositarCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author unifmgomes
 */
public class DepositarCliente extends javax.swing.JFrame {

    /**
     * Creates new form DepositoCliente
     */
    public DepositarCliente() {
        initComponents();
        controllerDeposito = new ControllerDepositarCliente(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloDepositarCliente = new javax.swing.JLabel();
        cpfClienteDepositarTXT = new javax.swing.JLabel();
        senhaClienteDepositarTXT = new javax.swing.JLabel();
        cpfClienteDepositarEntrada = new javax.swing.JTextField();
        senhaClienteDepositarEntrada1 = new javax.swing.JTextField();
        butClienteDepositarEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloDepositarCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        tituloDepositarCliente.setText("Depositar:");

        cpfClienteDepositarTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpfClienteDepositarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteDepositarTXT.setText("CPF:");

        senhaClienteDepositarTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        senhaClienteDepositarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaClienteDepositarTXT.setText("Senha:");

        cpfClienteDepositarEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cpfClienteDepositarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteDepositarEntradaActionPerformed(evt);
            }
        });

        senhaClienteDepositarEntrada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        senhaClienteDepositarEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaClienteDepositarEntrada1ActionPerformed(evt);
            }
        });

        butClienteDepositarEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        butClienteDepositarEntrar.setText("Entrar");
        butClienteDepositarEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteDepositarEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Banco Mariago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpfClienteDepositarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaClienteDepositarTXT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(butClienteDepositarEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(senhaClienteDepositarEntrada1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfClienteDepositarEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tituloDepositarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(tituloDepositarCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfClienteDepositarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfClienteDepositarTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaClienteDepositarTXT)
                    .addComponent(senhaClienteDepositarEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butClienteDepositarEntrar)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfClienteDepositarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteDepositarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteDepositarEntradaActionPerformed

    private void senhaClienteDepositarEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaClienteDepositarEntrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaClienteDepositarEntrada1ActionPerformed

    private void butClienteDepositarEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteDepositarEntrarActionPerformed
        controllerDeposito.entrarClienteDeposito();
    }//GEN-LAST:event_butClienteDepositarEntrarActionPerformed

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
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DepositoCliente().setVisible(true);
//            }
//        });
//    }
    private ControllerDepositarCliente controllerDeposito;

    public ControllerDepositarCliente getControllerDeposito() {
        return controllerDeposito;
    }

    public void setControllerDeposito(ControllerDepositarCliente controllerDeposito) {
        this.controllerDeposito = controllerDeposito;
    }

    public JButton getButClienteDepositarEntrar() {
        return butClienteDepositarEntrar;
    }

    public void setButClienteDepositarEntrar(JButton butClienteDepositarEntrar) {
        this.butClienteDepositarEntrar = butClienteDepositarEntrar;
    }

    public JTextField getCpfClienteDepositarEntrada() {
        return cpfClienteDepositarEntrada;
    }

    public void setCpfClienteDepositarEntrada(JTextField cpfClienteDepositarEntrada) {
        this.cpfClienteDepositarEntrada = cpfClienteDepositarEntrada;
    }

    public JLabel getCpfClienteDepositarTXT() {
        return cpfClienteDepositarTXT;
    }

    public void setCpfClienteDepositarTXT(JLabel cpfClienteDepositarTXT) {
        this.cpfClienteDepositarTXT = cpfClienteDepositarTXT;
    }

    public JTextField getSenhaClienteDepositarEntrada1() {
        return senhaClienteDepositarEntrada1;
    }

    public void setSenhaClienteDepositarEntrada1(JTextField senhaClienteDepositarEntrada1) {
        this.senhaClienteDepositarEntrada1 = senhaClienteDepositarEntrada1;
    }

    public JLabel getSenhaClienteDepositarTXT() {
        return senhaClienteDepositarTXT;
    }

    public void setSenhaClienteDepositarTXT(JLabel senhaClienteDepositarTXT) {
        this.senhaClienteDepositarTXT = senhaClienteDepositarTXT;
    }

    public JLabel getTituloDepositarCliente() {
        return tituloDepositarCliente;
    }

    public void setTituloDepositarCliente(JLabel tituloDepositarCliente) {
        this.tituloDepositarCliente = tituloDepositarCliente;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClienteDepositarEntrar;
    private javax.swing.JTextField cpfClienteDepositarEntrada;
    private javax.swing.JLabel cpfClienteDepositarTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField senhaClienteDepositarEntrada1;
    private javax.swing.JLabel senhaClienteDepositarTXT;
    private javax.swing.JLabel tituloDepositarCliente;
    // End of variables declaration//GEN-END:variables
}
