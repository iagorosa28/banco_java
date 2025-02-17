/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerExibirSaldoCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author iago2
 */
public class ExibirSaldo extends javax.swing.JFrame {

    /**
     * Creates new form ExibirSaldo
     */
    public ExibirSaldo() {
        initComponents();
        controller = new ControllerExibirSaldoCliente(this);
    }

    public JButton getBtExibir() {
        return btExibir;
    }

    public void setBtExibir(JButton btExibir) {
        this.btExibir = btExibir;
    }

    public JLabel getLbCPF() {
        return lbCPF;
    }

    public void setLbCPF(JLabel lbCPF) {
        this.lbCPF = lbCPF;
    }

    public JLabel getLbExibirSaldo() {
        return lbExibirSaldo;
    }

    public void setLbExibirSaldo(JLabel lbExibirSaldo) {
        this.lbExibirSaldo = lbExibirSaldo;
    }

    public JTextField getTxtEntradaCPFExibir() {
        return txtEntradaCPFExibir;
    }

    public void setTxtEntradaCPFExibir(JTextField txtEntradaCPFExibir) {
        this.txtEntradaCPFExibir = txtEntradaCPFExibir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbExibirSaldo = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        txtEntradaCPFExibir = new javax.swing.JTextField();
        btExibir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbExibirSaldo.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        lbExibirSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExibirSaldo.setText("Exibir Saldo");

        lbCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCPF.setText("CPF:");

        txtEntradaCPFExibir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntradaCPFExibir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btExibir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btExibir.setText("Exibir");
        btExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Banco Mariago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExibirSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbCPF))
                    .addComponent(txtEntradaCPFExibir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(lbExibirSaldo)
                .addGap(18, 18, 18)
                .addComponent(lbCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEntradaCPFExibir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExibir)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirActionPerformed
        // TODO add your handling code here:
        controller.entrarExibirSaldo();
    }//GEN-LAST:event_btExibirActionPerformed

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

    // Instânciando controller.
    private ControllerExibirSaldoCliente controller;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExibir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbExibirSaldo;
    private javax.swing.JTextField txtEntradaCPFExibir;
    // End of variables declaration//GEN-END:variables
}
