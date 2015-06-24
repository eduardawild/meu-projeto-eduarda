package jogo;

import dao.JogadorDAO;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botaoCadastro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        esqueciSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Bem Vindo ao");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 24, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Show do Milhão");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 74, -1, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Login:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 147, -1, 50));

        txtLogin.setText("duda");
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 162, -1));

        jButton1.setText("Ir para o jogo");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 389, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Senha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 208, -1, 37));

        botaoCadastro.setText("Fazer Cadastro");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 335, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Se você ainda não é cadastrado, cadastre-se clicando aqui:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 314, -1, -1));

        botaoEntrar.setText("Ir para o jogo");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 251, -1, -1));

        esqueciSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        esqueciSenha.setForeground(new java.awt.Color(204, 0, 0));
        esqueciSenha.setText("Esqueci minha senha");
        esqueciSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esqueciSenhaMouseClicked(evt);
            }
        });
        jPanel1.add(esqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 285, -1, -1));

        txtSenha.setText("12345");
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void esqueciSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esqueciSenhaMouseClicked
        
        
    }//GEN-LAST:event_esqueciSenhaMouseClicked

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        if (txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        }
        else
        {
            Jogador jogador = new Jogador();
            
            jogador.setLogin(txtLogin.getText());
            jogador.setSenha(txtSenha.getText());
            
            JogadorDAO dao = new JogadorDAO();
            
            Jogador retorno = dao.login(jogador);
            
            if (retorno == null)
            {
                JOptionPane.showMessageDialog(rootPane, "Login e/ou senha incorretos!");
            }
            else
            {
                PerguntaTela tela = new PerguntaTela();                           
                tela.setJogador(retorno);
                tela.setVisible(true);
                            
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        
        Cadastro tela = new Cadastro();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel esqueciSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
