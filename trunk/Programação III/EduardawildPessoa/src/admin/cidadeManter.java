package admin;
    import java.util.ArrayList;
    import java.util.List;
    import javax.swing.JOptionPane;
    import modelo.Cidade;
public class cidadeManter extends javax.swing.JFrame {

    private List <Cidade> lista;
    Integer posicao;
    
    public cidadeManter() 
    {
        initComponents();
        lista = new ArrayList<Cidade>();
        posicao = 0;
    }
    
    private void Limpar ()
    {
        txtcod.setText("");
        txtnome.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botaoPrimeiro = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoUltimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoInserir = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("CIDADE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CÓDIGO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOME:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        botaoPrimeiro.setText("Primeiro");
        botaoPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrimeiroActionPerformed(evt);
            }
        });

        botaoAnterior.setText("Anterior");
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        botaoProximo.setText("Próximo");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoUltimo.setText("Último");
        botaoUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(botaoPrimeiro)
                .addGap(18, 18, 18)
                .addComponent(botaoAnterior)
                .addGap(18, 18, 18)
                .addComponent(botaoProximo)
                .addGap(18, 18, 18)
                .addComponent(botaoUltimo)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPrimeiro)
                    .addComponent(botaoAnterior)
                    .addComponent(botaoProximo)
                    .addComponent(botaoUltimo))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimpar)
                .addGap(34, 34, 34)
                .addComponent(botaoExcluir)
                .addGap(33, 33, 33)
                .addComponent(botaoConsultar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserir)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoConsultar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcod)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        Cidade item = new Cidade ();
        
        if (txtcod.getText().isEmpty() || txtnome.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane,"Preencher todos os campos!");
        }
        else
        {
                Boolean deu = false;
                try 
                {
                    item.setCidcod(Integer.parseInt(txtcod.getText()));
                    deu = true;
                }
                catch (Exception ex)
                {
                    deu = false;
                    JOptionPane.showMessageDialog(rootPane, "O CÓDIGO É EM NÚMERO");
                }
                
                if (deu == true)
                {
                    item.setCidnome(txtnome.getText());
                   
                    JOptionPane.showMessageDialog(rootPane,"Cadastrado com sucesso!");
                    lista.add(item);
                    posicao ++;
                    Limpar ();
                }
        }
        
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (txtcod.getText().isEmpty()==false)
        {
            lista.remove(lista.get(posicao));
            Limpar();
        }
        
        else
        {
            
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        
        Boolean encontrou = false;
        Integer posicaoachou = 0;
        
        for (Cidade lista1 : lista) 
        {
            if (nome.equalsIgnoreCase(lista1.getCidnome()))
            {
                encontrou = true;
                posicao = posicaoachou;
                
                txtcod.setText(lista1.getCidcod().toString());
                txtnome.setText(lista1.getCidnome());
                
                break;
            }
            
            posicaoachou ++;
        }
        
        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Cidade ainda não cadastrada!");
        }
    
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrimeiroActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(false);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);
        
        if (lista.size()>0)
        {
            posicao = 0;
            
            Cidade elemento = lista.get(0);
            
            txtcod.setText(elemento.getCidcod().toString());
            txtnome.setText(elemento.getCidnome());
        }
    }//GEN-LAST:event_botaoPrimeiroActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true); 
        
        if (posicao > 0)
        {
            posicao = posicao - 1;
            
            Cidade elemento = lista.get(posicao);
            
            txtcod.setText(elemento.getCidcod().toString());
            txtnome.setText(elemento.getCidnome());
        }  
        
        if (posicao == 0)
        {
            botaoPrimeiro.setEnabled(false);
            botaoAnterior.setEnabled(false);
        }
            
        if (lista.size() == 1)
        {
            botaoProximo.setEnabled(false);
            botaoAnterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);
        
        if (posicao <lista.size() - 1)
        {
            posicao = posicao + 1;
        
            Cidade elemento = lista.get(posicao);
        
            txtcod.setText(elemento.getCidcod().toString());
            txtnome.setText(elemento.getCidnome());
        }
        
        if (lista.size() - 1 == posicao)
        {
            botaoProximo.setEnabled(false);
            botaoUltimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUltimoActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(false);
        botaoUltimo.setEnabled(false);
        
        if (lista.size()>0)
        {
            posicao = lista.size()-1;
        
            Cidade elemento = lista.get(posicao);
        
            txtcod.setText(elemento.getCidcod().toString());
            txtnome.setText(elemento.getCidnome());
        }
    }//GEN-LAST:event_botaoUltimoActionPerformed

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
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cidadeManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPrimeiro;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
