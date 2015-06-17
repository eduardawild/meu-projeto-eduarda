package jogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cartas extends javax.swing.JFrame {
    
    public Cartas() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carta2 = new javax.swing.JLabel();
        carta0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        carta3 = new javax.swing.JLabel();
        carta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartas.png"))); // NOI18N
        carta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta2MouseClicked(evt);
            }
        });
        jPanel1.add(carta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        carta0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartas.png"))); // NOI18N
        carta0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta0MouseClicked(evt);
            }
        });
        jPanel1.add(carta0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CARTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartas.png"))); // NOI18N
        carta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta3MouseClicked(evt);
            }
        });
        jPanel1.add(carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartas.png"))); // NOI18N
        carta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta1MouseClicked(evt);
            }
        });
        jPanel1.add(carta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carta0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta0MouseClicked
        
        carta0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nenhuma.png")));
        JOptionPane.showMessageDialog(null, "NÃO ELIMINA ALTERNATIVAS!");
        
    }//GEN-LAST:event_carta0MouseClicked

    private void carta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseClicked
       
        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/uma.png")));
        JOptionPane.showMessageDialog(null, "ELIMINA UMA ALTERNATIVA!");
        
    }//GEN-LAST:event_carta1MouseClicked

    private void carta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseClicked
        
        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/duas.png")));
        JOptionPane.showMessageDialog(null, "ELIMINA DUAS ALTERNATIVAS!");
    }//GEN-LAST:event_carta2MouseClicked

    private void carta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseClicked
        
        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tres.png")));
        JOptionPane.showMessageDialog(null, "ELIMINA TRÊS ALTERNATIVAS");
    }//GEN-LAST:event_carta3MouseClicked

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
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carta0;
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
