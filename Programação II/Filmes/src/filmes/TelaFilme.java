package filmes;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaFilme extends javax.swing.JFrame {
List <InfFilmes> lista;
Integer posicao;

    public TelaFilme() 
    {
        initComponents();
        lista = new ArrayList <InfFilmes> ();
        posicao = 0;
    }

    public void Limpar ()
    {
        txtcodigo.setText("");
        txtNome.setText("");
        txtanolanc.setText("");
        cboGenero.setSelectedIndex(0);
        cboDistribuidora.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoprimeiro = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtanolanc = new javax.swing.JTextField();
        cboGenero = new javax.swing.JComboBox();
        cboDistribuidora = new javax.swing.JComboBox();
        botaoconsultar = new javax.swing.JButton();
        botaoatualizar = new javax.swing.JButton();
        botaoremover = new javax.swing.JButton();
        botaoinserir = new javax.swing.JButton();
        botaonovo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO DE FILMES");

        jLabel2.setText("NOME:");

        jLabel3.setText("ANO DE LANÇAMENTO:");

        jLabel4.setText("GÊNERO:");

        jLabel5.setText("DISTRIBUIDORA:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        botaoprimeiro.setText("Primeiro");
        botaoprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoprimeiroActionPerformed(evt);
            }
        });

        botaoanterior.setText("Anterior");
        botaoanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoanteriorActionPerformed(evt);
            }
        });

        botaoproximo.setText("Próximo");
        botaoproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoproximoActionPerformed(evt);
            }
        });

        botaoultimo.setText("Último");
        botaoultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botaoprimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botaoanterior)
                .addGap(18, 18, 18)
                .addComponent(botaoproximo)
                .addGap(26, 26, 26)
                .addComponent(botaoultimo)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoprimeiro)
                    .addComponent(botaoanterior)
                    .addComponent(botaoproximo)
                    .addComponent(botaoultimo))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel6.setText("Eduarda Delabary Wild");

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Drama", "Ação", "Comédia", "Suspense" }));

        cboDistribuidora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Warner", "Fox", "Sony", "Globo Filmes" }));

        botaoconsultar.setText("Consultar");
        botaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultarActionPerformed(evt);
            }
        });

        botaoatualizar.setText("Atualizar");
        botaoatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoatualizarActionPerformed(evt);
            }
        });

        botaoremover.setText("Remover");
        botaoremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoremoverActionPerformed(evt);
            }
        });

        botaoinserir.setText("Inserir");
        botaoinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoinserirActionPerformed(evt);
            }
        });

        botaonovo.setText("Novo");

        jLabel7.setText("CODIGO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome)
                                        .addComponent(txtanolanc)
                                        .addComponent(cboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboDistribuidora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcodigo))))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoconsultar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoatualizar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoremover)
                                .addGap(18, 18, 18)
                                .addComponent(botaoinserir)
                                .addGap(18, 18, 18)
                                .addComponent(botaonovo)))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtanolanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboDistribuidora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoconsultar)
                    .addComponent(botaoatualizar)
                    .addComponent(botaoremover)
                    .addComponent(botaoinserir)
                    .addComponent(botaonovo))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserirActionPerformed
        InfFilmes filme = new InfFilmes ();
        
        if (txtNome.getText().equals("") || txtcodigo.getText().equals("") || txtanolanc.getText().equals("") || cboGenero.getSelectedIndex() == 0 || cboDistribuidora.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos do cadastro!");
        }
        else if (Integer.parseInt(txtanolanc.getText()) > 2014)
        {
            JOptionPane.showMessageDialog(null, "Ano de lançamento inválido!");
        }
        else 
        {
            filme.setCodfilme(txtcodigo.getText());
            filme.setNome(txtNome.getText());
            filme.setAnolanc(txtanolanc.getText());
        
            if (cboGenero.getSelectedIndex() == 1)
            {
                filme.setGenero("Drama");
            }
            else if (cboGenero.getSelectedIndex() == 2)
            {
                filme.setGenero("Ação");
            }
            else if (cboGenero.getSelectedIndex() == 3)
            {
                filme.setGenero("Comédia");
            }
            else if (cboGenero.getSelectedIndex() == 4)
            {
                filme.setGenero("Suspense");
            }
        
        
        
            if (cboDistribuidora.getSelectedIndex() == 1)
            {
                filme.setDistribuidora("Warner");
            }
            else if (cboDistribuidora.getSelectedIndex() == 2)
            {
                filme.setDistribuidora("Fox");
            }
            else if (cboDistribuidora.getSelectedIndex() == 3)
            {
                filme.setDistribuidora("Sony");
            }
            else if (cboDistribuidora.getSelectedIndex() == 4)
            {
                filme.setDistribuidora("Globo Filmes");
            } 
            
            lista.add(filme);
            posicao ++;
            Limpar ();
        }    
        
    }//GEN-LAST:event_botaoinserirActionPerformed

    private void botaoremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremoverActionPerformed
        lista.remove(lista.get(posicao)); 
        Limpar();
    }//GEN-LAST:event_botaoremoverActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        Boolean encontrou = false;
        Integer posicaoachou = 0;
        
        for (InfFilmes infFilmes : lista) 
        {
            if (nome.equalsIgnoreCase(infFilmes.getNome()))
            {
                posicao = posicaoachou;
                encontrou = true;
                
                txtcodigo.setText(infFilmes.getCodfilme());
                txtNome.setText(infFilmes.getNome());
                txtanolanc.setText(infFilmes.getAnolanc());
                
                if (infFilmes.getGenero().equals("Drama"))
                {
                    cboGenero.setSelectedIndex(1);
                }
                else if (infFilmes.getGenero().equals("Ação"))
                {
                    cboGenero.setSelectedIndex(2);
                }
                else if (infFilmes.getGenero().equals("Comédia"))
                {
                    cboGenero.setSelectedIndex(3);
                }
                else if (infFilmes.getGenero().equals("Suspense"))
                {
                    cboGenero.setSelectedIndex(4);
                }
                
                if (infFilmes.getDistribuidora().equals("Warner"))
                {
                    cboDistribuidora.setSelectedIndex(1);
                }
                else if (infFilmes.getDistribuidora().equals("Fox"))
                {
                    cboDistribuidora.setSelectedIndex(2);
                }
                else if (infFilmes.getDistribuidora().equals("Sony"))
                {
                    cboDistribuidora.setSelectedIndex(3);
                }
                else if (infFilmes.getDistribuidora().equals("Globo Filmes"))
                {
                    cboDistribuidora.setSelectedIndex(4);
                }
                
                break;
            }
            posicaoachou++;
        }
        
        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Filme ainda não cadastrado!");
        }
        
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void botaoatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoatualizarActionPerformed
        
    }//GEN-LAST:event_botaoatualizarActionPerformed

    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        
        if (lista.size()>0)
        {    
            posicao = 0;
            
            InfFilmes elemento = lista.get(0);
            
            txtcodigo.setText(elemento.getCodfilme());
            txtNome.setText(elemento.getNome());
            txtanolanc.setText(elemento.getAnolanc());
            
                if (elemento.getGenero().equals("Drama"))
                {
                    cboGenero.setSelectedIndex(1);
                }
                else if (elemento.getGenero().equals("Ação"))
                {
                    cboGenero.setSelectedIndex(2);
                }
                else if (elemento.getGenero().equals("Comédia"))
                {
                    cboGenero.setSelectedIndex(3);
                }
                else if (elemento.getGenero().equals("Suspense"))
                {
                    cboGenero.setSelectedIndex(4);
                }
                
                if (elemento.getDistribuidora().equals("Warner"))
                {
                    cboDistribuidora.setSelectedIndex(1);
                }
                else if (elemento.getDistribuidora().equals("Fox"))
                {
                    cboDistribuidora.setSelectedIndex(2);
                }
                else if (elemento.getDistribuidora().equals("Sony"))
                {
                    cboDistribuidora.setSelectedIndex(3);
                }
                else if (elemento.getDistribuidora().equals("Globo Filmes"))
                {
                    cboDistribuidora.setSelectedIndex(4);
                }
        }
    }//GEN-LAST:event_botaoprimeiroActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true); 
        
        if (posicao > 0)
        {
            posicao = posicao - 1;
            
            InfFilmes elemento = lista.get(posicao);
            
            txtcodigo.setText(elemento.getCodfilme());
            txtNome.setText(elemento.getNome());
            txtanolanc.setText(elemento.getAnolanc());
            
                if (elemento.getGenero().equals("Drama"))
                {
                    cboGenero.setSelectedIndex(1);
                }
                else if (elemento.getGenero().equals("Ação"))
                {
                    cboGenero.setSelectedIndex(2);
                }
                else if (elemento.getGenero().equals("Comédia"))
                {
                    cboGenero.setSelectedIndex(3);
                }
                else if (elemento.getGenero().equals("Suspense"))
                {
                    cboGenero.setSelectedIndex(4);
                }
                
                if (elemento.getDistribuidora().equals("Warner"))
                {
                    cboDistribuidora.setSelectedIndex(1);
                }
                else if (elemento.getDistribuidora().equals("Fox"))
                {
                    cboDistribuidora.setSelectedIndex(2);
                }
                else if (elemento.getDistribuidora().equals("Sony"))
                {
                    cboDistribuidora.setSelectedIndex(3);
                }
                else if (elemento.getDistribuidora().equals("Globo Filmes"))
                {
                    cboDistribuidora.setSelectedIndex(4);
                }
                
                if (posicao == 0)
                {
                    botaoprimeiro.setEnabled(false);
                    botaoanterior.setEnabled(false);
                }
                
                if (lista.size() == 1)
                {
                    botaoproximo.setEnabled(false);
                    botaoanterior.setEnabled(false);
                }
        }
        
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        
        posicao = posicao + 1;
        
        InfFilmes elemento = lista.get(posicao);
        
        txtcodigo.setText(elemento.getCodfilme());
        txtNome.setText(elemento.getNome());
        txtanolanc.setText(elemento.getAnolanc());
        
                if (elemento.getGenero().equals("Drama"))
                {
                    cboGenero.setSelectedIndex(1);
                }
                else if (elemento.getGenero().equals("Ação"))
                {
                    cboGenero.setSelectedIndex(2);
                }
                else if (elemento.getGenero().equals("Comédia"))
                {
                    cboGenero.setSelectedIndex(3);
                }
                else if (elemento.getGenero().equals("Suspense"))
                {
                    cboGenero.setSelectedIndex(4);
                }
                
                if (elemento.getDistribuidora().equals("Warner"))
                {
                    cboDistribuidora.setSelectedIndex(1);
                }
                else if (elemento.getDistribuidora().equals("Fox"))
                {
                    cboDistribuidora.setSelectedIndex(2);
                }
                else if (elemento.getDistribuidora().equals("Sony"))
                {
                    cboDistribuidora.setSelectedIndex(3);
                }
                else if (elemento.getDistribuidora().equals("Globo Filmes"))
                {
                    cboDistribuidora.setSelectedIndex(4);
                }
                
                if (lista.size() - 1 == posicao)
                {
                    botaoproximo.setEnabled(false);
                    botaoultimo.setEnabled(false);
                }
    }//GEN-LAST:event_botaoproximoActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(false);
        botaoultimo.setEnabled(false);
        
        posicao = lista.size() - 1;
        
        InfFilmes elemento = lista.get(posicao);
        
        txtcodigo.setText(elemento.getCodfilme());
        txtNome.setText(elemento.getNome());
        txtanolanc.setText(elemento.getAnolanc());
        
                if (elemento.getGenero().equals("Drama"))
                {
                    cboGenero.setSelectedIndex(1);
                }
                else if (elemento.getGenero().equals("Ação"))
                {
                    cboGenero.setSelectedIndex(2);
                }
                else if (elemento.getGenero().equals("Comédia"))
                {
                    cboGenero.setSelectedIndex(3);
                }
                else if (elemento.getGenero().equals("Suspense"))
                {
                    cboGenero.setSelectedIndex(4);
                }
                
                if (elemento.getDistribuidora().equals("Warner"))
                {
                    cboDistribuidora.setSelectedIndex(1);
                }
                else if (elemento.getDistribuidora().equals("Fox"))
                {
                    cboDistribuidora.setSelectedIndex(2);
                }
                else if (elemento.getDistribuidora().equals("Sony"))
                {
                    cboDistribuidora.setSelectedIndex(3);
                }
                else if (elemento.getDistribuidora().equals("Globo Filmes"))
                {
                    cboDistribuidora.setSelectedIndex(4);
                }
    }//GEN-LAST:event_botaoultimoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoatualizar;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoinserir;
    private javax.swing.JButton botaonovo;
    private javax.swing.JButton botaoprimeiro;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoremover;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JComboBox cboDistribuidora;
    private javax.swing.JComboBox cboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtanolanc;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
