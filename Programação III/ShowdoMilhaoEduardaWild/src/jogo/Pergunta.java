/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogo;

/**
 *
 * @author zz
 */
public class Pergunta extends javax.swing.JFrame {

    /**
     * Creates new form Pergunta
     */
    public Pergunta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radio23estados = new javax.swing.JRadioButton();
        radio24estados = new javax.swing.JRadioButton();
        radio25estados = new javax.swing.JRadioButton();
        radio26estados = new javax.swing.JRadioButton();
        botaoParar = new javax.swing.JButton();
        botaoConfirmar = new javax.swing.JButton();
        botaoPular = new javax.swing.JButton();
        botaoCartas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Quantos estados possui o Brasil?");

        radio23estados.setText("23 estados");
        radio23estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio23estadosActionPerformed(evt);
            }
        });

        radio24estados.setText("24 estados");
        radio24estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio24estadosActionPerformed(evt);
            }
        });

        radio25estados.setText("25 estados");

        radio26estados.setText("26 estados");

        botaoParar.setText("Parar");

        botaoConfirmar.setText("Confirmar");

        botaoPular.setText("Pular");

        botaoCartas.setText("Cartas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoParar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCartas))
                    .addComponent(radio26estados)
                    .addComponent(radio25estados)
                    .addComponent(radio24estados)
                    .addComponent(radio23estados)
                    .addComponent(jLabel1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(radio23estados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio24estados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio25estados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio26estados)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoParar)
                    .addComponent(botaoPular)
                    .addComponent(botaoCartas))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio23estadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio23estadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio23estadosActionPerformed

    private void radio24estadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio24estadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio24estadosActionPerformed

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
    private javax.swing.JRadioButton radio23estados;
    private javax.swing.JRadioButton radio24estados;
    private javax.swing.JRadioButton radio25estados;
    private javax.swing.JRadioButton radio26estados;
    // End of variables declaration//GEN-END:variables
}
