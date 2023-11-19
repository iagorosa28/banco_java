/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerLoginGerente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author iago2
 */
public class LoginGerente extends javax.swing.JFrame {

    /**
     * Creates new form LoginGerente
     */
    public LoginGerente() {
        initComponents();
        controller = new ControllerLoginGerente(this);
    }

    public JMenuItem getNovoGerente() {
        return NovoGerente;
    }

    public void setNovoGerente(JMenuItem NovoGerente) {
        this.NovoGerente = NovoGerente;
    }

    public JMenu getOpcoes() {
        return Opcoes;
    }

    public void setOpcoes(JMenu Opcoes) {
        this.Opcoes = Opcoes;
    }

    public JButton getBtEntrar() {
        return btEntrar;
    }

    public void setBtEntrar(JButton btEntrar) {
        this.btEntrar = btEntrar;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JLabel getLbLogin() {
        return lbLogin;
    }

    public void setLbLogin(JLabel lbLogin) {
        this.lbLogin = lbLogin;
    }

    public JLabel getLbSenhaLogin() {
        return lbSenhaLogin;
    }

    public void setLbSenhaLogin(JLabel lbSenhaLogin) {
        this.lbSenhaLogin = lbSenhaLogin;
    }

    public JTextField getTxtEntradaLogin() {
        return txtEntradaLogin;
    }

    public void setTxtEntradaLogin(JTextField txtEntradaLogin) {
        this.txtEntradaLogin = txtEntradaLogin;
    }

    public JTextField getTxtEntradaSenha() {
        return txtEntradaSenha;
    }

    public void setTxtEntradaSenha(JTextField txtEntradaSenha) {
        this.txtEntradaSenha = txtEntradaSenha;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogin = new javax.swing.JLabel();
        lbSenhaLogin = new javax.swing.JLabel();
        txtEntradaLogin = new javax.swing.JTextField();
        txtEntradaSenha = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opcoes = new javax.swing.JMenu();
        NovoGerente = new javax.swing.JMenuItem();
        ExcluirGerente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLogin.setText("Login:");

        lbSenhaLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbSenhaLogin.setText("Senha:");

        txtEntradaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEntradaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaLoginActionPerformed(evt);
            }
        });

        txtEntradaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEntradaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaSenhaActionPerformed(evt);
            }
        });

        btEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Banco Mariago");

        Opcoes.setText("Opções");
        Opcoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NovoGerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NovoGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/newuser.png"))); // NOI18N
        NovoGerente.setText("Novo gerente");
        NovoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoGerenteActionPerformed(evt);
            }
        });
        Opcoes.add(NovoGerente);

        ExcluirGerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ExcluirGerente.setText("Excluir gerente");
        ExcluirGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirGerenteActionPerformed(evt);
            }
        });
        Opcoes.add(ExcluirGerente);

        jMenuBar1.add(Opcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSenhaLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEntradaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtEntradaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(txtEntradaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenhaLogin)
                    .addComponent(txtEntradaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btEntrar)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntradaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaLoginActionPerformed

    private void txtEntradaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaSenhaActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
        controller.loginGerente();
    }//GEN-LAST:event_btEntrarActionPerformed

    private void NovoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoGerenteActionPerformed
        // TODO add your handling code here:
        CadastroGerente cg = new CadastroGerente();
        cg.setVisible(true);
    }//GEN-LAST:event_NovoGerenteActionPerformed

    private void ExcluirGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirGerenteActionPerformed
        // TODO add your handling code here:
        ExcluirGerente eg = new ExcluirGerente();
        eg.setVisible(true);
    }//GEN-LAST:event_ExcluirGerenteActionPerformed

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
//            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginGerente().setVisible(true);
//            }
//        });
//    }

    // Instânciando controller.
    private ControllerLoginGerente controller;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExcluirGerente;
    private javax.swing.JMenuItem NovoGerente;
    private javax.swing.JMenu Opcoes;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbSenhaLogin;
    private javax.swing.JTextField txtEntradaLogin;
    private javax.swing.JTextField txtEntradaSenha;
    // End of variables declaration//GEN-END:variables
}
