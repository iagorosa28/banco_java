/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerExibirSaldoCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author unifmgomes
 */
public class ExibirSaldoCliente extends javax.swing.JFrame {

    /**
     * Creates new form ExibirSaldo
     */
    public ExibirSaldoCliente() {
        initComponents();
        control = new ControllerExibirSaldoCliente(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpfClienteDebitarTXT = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        tituloExibirSaldoCliente1 = new javax.swing.JLabel();
        senhaClienteExibirSaldoTXT = new javax.swing.JLabel();
        cpfClienteExibirSaldoEntrada = new javax.swing.JTextField();
        senhaClienteExibirSaldoEntrada = new javax.swing.JTextField();
        cpfClienteExibirSaldoTXT = new javax.swing.JLabel();
        butClienteExibirSaldo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        cpfClienteDebitarTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfClienteDebitarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteDebitarTXT.setText("CPF:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloExibirSaldoCliente1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        tituloExibirSaldoCliente1.setText("Exibir Saldo:");

        senhaClienteExibirSaldoTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        senhaClienteExibirSaldoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaClienteExibirSaldoTXT.setText("Senha:");

        cpfClienteExibirSaldoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteExibirSaldoEntradaActionPerformed(evt);
            }
        });

        senhaClienteExibirSaldoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaClienteExibirSaldoEntradaActionPerformed(evt);
            }
        });

        cpfClienteExibirSaldoTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpfClienteExibirSaldoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteExibirSaldoTXT.setText("CPF:");

        butClienteExibirSaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        butClienteExibirSaldo.setText("Exibir Saldo");
        butClienteExibirSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteExibirSaldoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Banco Mariago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloExibirSaldoCliente1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpfClienteExibirSaldoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfClienteExibirSaldoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(senhaClienteExibirSaldoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butClienteExibirSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(senhaClienteExibirSaldoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(tituloExibirSaldoCliente1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfClienteExibirSaldoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfClienteExibirSaldoTXT))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaClienteExibirSaldoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaClienteExibirSaldoTXT))
                .addGap(18, 18, 18)
                .addComponent(butClienteExibirSaldo)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfClienteExibirSaldoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteExibirSaldoEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteExibirSaldoEntradaActionPerformed

    private void senhaClienteExibirSaldoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaClienteExibirSaldoEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaClienteExibirSaldoEntradaActionPerformed

    private void butClienteExibirSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteExibirSaldoActionPerformed
        control.entrarExibirSaldo();
    }//GEN-LAST:event_butClienteExibirSaldoActionPerformed

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
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExibirSaldo().setVisible(true);
//            }
//        });
//    }

    public JButton getButClienteExibirSaldo() {
        return butClienteExibirSaldo;
    }

    public void setButClienteExibirSaldo(JButton butClienteExibirSaldo) {
        this.butClienteExibirSaldo = butClienteExibirSaldo;
    }

    public JLabel getCpfClienteDebitarTXT() {
        return cpfClienteDebitarTXT;
    }

    public void setCpfClienteDebitarTXT(JLabel cpfClienteDebitarTXT) {
        this.cpfClienteDebitarTXT = cpfClienteDebitarTXT;
    }

    public JTextField getCpfClienteExibirSaldoEntrada() {
        return cpfClienteExibirSaldoEntrada;
    }

    public void setCpfClienteExibirSaldoEntrada(JTextField cpfClienteExibirSaldoEntrada) {
        this.cpfClienteExibirSaldoEntrada = cpfClienteExibirSaldoEntrada;
    }

    public JLabel getCpfClienteExibirSaldoTXT() {
        return cpfClienteExibirSaldoTXT;
    }

    public void setCpfClienteExibirSaldoTXT(JLabel cpfClienteExibirSaldoTXT) {
        this.cpfClienteExibirSaldoTXT = cpfClienteExibirSaldoTXT;
    }

    public JSpinner getjSpinner1() {
        return jSpinner1;
    }

    public void setjSpinner1(JSpinner jSpinner1) {
        this.jSpinner1 = jSpinner1;
    }

    public JTextField getSenhaClienteExibirSaldoEntrada() {
        return senhaClienteExibirSaldoEntrada;
    }

    public void setSenhaClienteExibirSaldoEntrada(JTextField senhaClienteExibirSaldoEntrada) {
        this.senhaClienteExibirSaldoEntrada = senhaClienteExibirSaldoEntrada;
    }

    public JLabel getSenhaClienteExibirSaldoTXT() {
        return senhaClienteExibirSaldoTXT;
    }

    public void setSenhaClienteExibirSaldoTXT(JLabel senhaClienteExibirSaldoTXT) {
        this.senhaClienteExibirSaldoTXT = senhaClienteExibirSaldoTXT;
    }

    public JLabel getTituloExibirSaldoCliente1() {
        return tituloExibirSaldoCliente1;
    }

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
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExibirSaldo().setVisible(true);
//            }
//        });
//    }
    public void setTituloExibirSaldoCliente1(JLabel tituloExibirSaldoCliente1) {
        this.tituloExibirSaldoCliente1 = tituloExibirSaldoCliente1;
    }
    private ControllerExibirSaldoCliente control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClienteExibirSaldo;
    private javax.swing.JLabel cpfClienteDebitarTXT;
    private javax.swing.JTextField cpfClienteExibirSaldoEntrada;
    private javax.swing.JLabel cpfClienteExibirSaldoTXT;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField senhaClienteExibirSaldoEntrada;
    private javax.swing.JLabel senhaClienteExibirSaldoTXT;
    private javax.swing.JLabel tituloExibirSaldoCliente1;
    // End of variables declaration//GEN-END:variables
}
