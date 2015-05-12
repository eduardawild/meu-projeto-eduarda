package jogo;

import modelo.Jogador;

public class Pergunta extends javax.swing.JFrame {

    private Jogador jogador;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    public Pergunta() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPergunt = new javax.swing.JLabel();
        labelOpcao1 = new javax.swing.JRadioButton();
        labelOpcao2 = new javax.swing.JRadioButton();
        labelOpcao3 = new javax.swing.JRadioButton();
        labelOpcao4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        botaoConfirmar = new javax.swing.JButton();
        botaoParar = new javax.swing.JButton();
        botaoPular = new javax.swing.JButton();
        botaoCartas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPergunt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPergunt.setText("Pergunta:");
        getContentPane().add(labelPergunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 29, -1, -1));

        labelOpcao1.setText("Opção 1");
        labelOpcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelOpcao1ActionPerformed(evt);
            }
        });
        getContentPane().add(labelOpcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 90, -1, -1));

        labelOpcao2.setText("Opção 2");
        labelOpcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelOpcao2ActionPerformed(evt);
            }
        });
        getContentPane().add(labelOpcao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 116, -1, -1));

        labelOpcao3.setText("Opção 3");
        getContentPane().add(labelOpcao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 142, -1, -1));

        labelOpcao4.setText("Opção 4");
        getContentPane().add(labelOpcao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 168, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoConfirmar.setText("Confirmar");
        jPanel1.add(botaoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 37, -1, -1));

        botaoParar.setText("Parar");
        jPanel1.add(botaoParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 37, -1, -1));

        botaoPular.setText("Pular");
        jPanel1.add(botaoPular, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 37, -1, -1));

        botaoCartas.setText("Cartas");
        jPanel1.add(botaoCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 37, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 360, 90));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(250, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("0");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setText("Errar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setText("999");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel4.setText("Parar");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel5.setText("99999");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel6.setText("Acertar");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 170, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/silvioo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 180));

        lblNome.setText("Label Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelOpcao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelOpcao1ActionPerformed

    private void labelOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelOpcao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelOpcao2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblNome.setText(jogador.getLogin());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pergunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCartas;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoParar;
    private javax.swing.JButton botaoPular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton labelOpcao1;
    private javax.swing.JRadioButton labelOpcao2;
    private javax.swing.JRadioButton labelOpcao3;
    private javax.swing.JRadioButton labelOpcao4;
    private javax.swing.JLabel labelPergunt;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
