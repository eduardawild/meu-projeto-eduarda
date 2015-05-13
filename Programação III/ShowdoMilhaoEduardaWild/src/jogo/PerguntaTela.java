package jogo;

import dao.PerguntaDAO;
import java.util.List;
import modelo.Jogador;
import modelo.Pergunta;

public class PerguntaTela extends javax.swing.JFrame {

    private Jogador jogador;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    List<Pergunta> perguntas; //pergunta do jogo
    Pergunta perguntaAtual; //pergunta que está sendo exibida no momento
    
    public PerguntaTela() {
        initComponents();
             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPerg = new javax.swing.JLabel();
        lblOp1 = new javax.swing.JRadioButton();
        lblOp2 = new javax.swing.JRadioButton();
        lblOp3 = new javax.swing.JRadioButton();
        lblOp4 = new javax.swing.JRadioButton();
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

        lblPerg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPerg.setText("Pergunta:");
        getContentPane().add(lblPerg, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 29, -1, -1));

        lblOp1.setText("Opção 1");
        lblOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblOp1ActionPerformed(evt);
            }
        });
        getContentPane().add(lblOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 90, -1, -1));

        lblOp2.setText("Opção 2");
        lblOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblOp2ActionPerformed(evt);
            }
        });
        getContentPane().add(lblOp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 116, -1, -1));

        lblOp3.setText("Opção 3");
        getContentPane().add(lblOp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 142, -1, -1));

        lblOp4.setText("Opção 4");
        getContentPane().add(lblOp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 168, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, 90));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 170, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/silvioo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 150, 180));

        lblNome.setText("Label Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOp1ActionPerformed

    private void lblOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblOp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOp2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblNome.setText(jogador.getLogin());
        
        PerguntaDAO dao = new PerguntaDAO();
        perguntas = dao.listarNivel1(); //busca as perguntas do nível 1, que estão embaralhadas
        
        perguntaAtual = perguntas.get(0); //colocar a primeira que aparece no perguntaAtual
        
        //exibir na tela
        lblPerg.setText(perguntaAtual.getEnunciado());
        lblOp1.setText(perguntaAtual.getA());
        lblOp2.setText(perguntaAtual.getB());
        lblOp3.setText(perguntaAtual.getC());
        lblOp4.setText(perguntaAtual.getD());
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerguntaTela().setVisible(true);
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
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton lblOp1;
    private javax.swing.JRadioButton lblOp2;
    private javax.swing.JRadioButton lblOp3;
    private javax.swing.JRadioButton lblOp4;
    private javax.swing.JLabel lblPerg;
    // End of variables declaration//GEN-END:variables
}
