package exemplointerface;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class AtorTela extends javax.swing.JFrame {
List <Ator> lista;
Integer posicao;

    public AtorTela() {
        initComponents();
        lista = new ArrayList <Ator>(); //inicializa a lista de atores
        posicao = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNomeArt = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtQuantNov = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtCache = new javax.swing.JTextField();
        selecestado = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoprimeiro = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        botaoconsultar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botaoinserir = new javax.swing.JButton();
        botaoexcluir = new javax.swing.JButton();
        botaolimpar = new javax.swing.JButton();
        botaostatus = new javax.swing.JButton();
        txtGanhos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("ATOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Quantidade de Novelas:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nome Artístico:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Salário Mensal:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Cachê por evento:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Cidade:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Endereço:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Bairro:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Estado:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtNomeArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeArtActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascActionPerformed(evt);
            }
        });

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        selecestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "RS", "PR", "SC" }));
        selecestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecestadoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Ganhos:");

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
                .addComponent(botaoprimeiro)
                .addGap(18, 18, 18)
                .addComponent(botaoanterior)
                .addGap(18, 18, 18)
                .addComponent(botaoproximo)
                .addGap(18, 18, 18)
                .addComponent(botaoultimo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoprimeiro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoproximo)
                        .addComponent(botaoanterior)
                        .addComponent(botaoultimo)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        botaoconsultar.setText("Consultar");
        botaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultarActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar");

        botaoinserir.setText("Inserir");
        botaoinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoinserirActionPerformed(evt);
            }
        });

        botaoexcluir.setText("Excluir");
        botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexcluirActionPerformed(evt);
            }
        });

        botaolimpar.setText("Limpar");
        botaolimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolimparActionPerformed(evt);
            }
        });

        botaostatus.setText("Status");
        botaostatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaostatusActionPerformed(evt);
            }
        });

        txtGanhos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtQuantNov, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtCache, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(selecestado, 0, 208, Short.MAX_VALUE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtNomeArt, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtGanhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(botaoinserir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaolimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoconsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(botaostatus)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(selecestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantNov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoinserir)
                    .addComponent(botaoexcluir)
                    .addComponent(botaoconsultar)
                    .addComponent(jButton2)
                    .addComponent(botaolimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaostatus)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("Navegação");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Limpar()
    {
        txtNome.setText("");
        txtNomeArt.setText("");
        txtEmail.setText("");
        txtDataNasc.setText("");
        txtCidade.setText("");
        txtEnd.setText("");
        txtBairro.setText("");
        txtQuantNov.setText("");
        txtSalario.setText("");
        txtCache.setText("");
        selecestado.setSelectedIndex(0);
    }
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeArtActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascActionPerformed

    private void selecestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecestadoActionPerformed
        
    }//GEN-LAST:event_selecestadoActionPerformed

    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        
        //testa se tem algum elemento na lista
        
        if (lista.size()>0)
        {    
            posicao = 0;
        
            //Pegar o primeiro elemento da lista. A variável elemento é o primeiro objeto da lista de Emissoras
            Ator elemento = lista.get(0);
        
            txtNome.setText(elemento.getNomeator());
            txtEnd.setText(elemento.getEnd());
            txtNomeArt.setText(elemento.getNomeart());
            txtEmail.setText(elemento.getEmail());
            txtDataNasc.setText(elemento.getDatanasc());
            txtCidade.setText (elemento.getCidade());
            txtBairro.setText(elemento.getBairro());
            txtQuantNov.setText(elemento.getQuantnov().toString());
            txtSalario.setText(String.valueOf(elemento.getSalario()));
            txtCache.setText(String.valueOf(elemento.getCache()));
            txtGanhos.setText(String.valueOf(elemento.calcularGanhos(1)));
        
            if ((elemento.getEstado()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstado()).equals("PR") == true)
            {
                selecestado.setSelectedIndex(2);
            }
            else
            {
                selecestado.setSelectedIndex(3);
            }
            
            if (lista.size() == 1)
            {
                botaoproximo.setEnabled(false);
                botaoanterior.setEnabled(false);
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
        
        Ator elemento = lista.get(posicao);
        
        txtNome.setText(elemento.getNomeator());
        txtEnd.setText(elemento.getEnd());
        txtNome.setText(elemento.getNomeator());
        txtEnd.setText(elemento.getEnd());
        txtNomeArt.setText(elemento.getNomeart());
        txtEmail.setText(elemento.getEmail());
        txtDataNasc.setText(elemento.getDatanasc());
        txtCidade.setText (elemento.getCidade());
        txtBairro.setText(elemento.getBairro());
        txtQuantNov.setText(elemento.getQuantnov().toString());
        txtSalario.setText(String.valueOf(elemento.getSalario()));
        txtCache.setText(String.valueOf(elemento.getCache()));
        txtGanhos.setText(String.valueOf(elemento.calcularGanhos(1)));
        
        if ((elemento.getEstado()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstado()).equals("PR") == true)
            {
                selecestado.setSelectedIndex(2);
            }
            else
            {
                selecestado.setSelectedIndex(3);
            }
            
            if (lista.size() == 1)
            {
                botaoproximo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        
        posicao = posicao + 1;
        
        Ator elemento = lista.get(posicao);
        
        txtNome.setText(elemento.getNomeator());
        txtEnd.setText(elemento.getEnd());
        txtNome.setText(elemento.getNomeator());
        txtEnd.setText(elemento.getEnd());
        txtNome.setText(elemento.getNomeator());
        txtEnd.setText(elemento.getEnd());
        txtNomeArt.setText(elemento.getNomeart());
        txtEmail.setText(elemento.getEmail());
        txtDataNasc.setText(elemento.getDatanasc());
        txtCidade.setText (elemento.getCidade());
        txtBairro.setText(elemento.getBairro());
        txtQuantNov.setText(elemento.getQuantnov().toString());
        txtSalario.setText(String.valueOf(elemento.getSalario()));
        txtCache.setText(String.valueOf(elemento.getCache()));
        txtGanhos.setText(String.valueOf(elemento.calcularGanhos(1)));
        
        if ((elemento.getEstado()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstado()).equals("PR") == true)
            {
                selecestado.setSelectedIndex(2);
            }
            else
            {
                selecestado.setSelectedIndex(3);
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
        
        Ator elemento = lista.get(posicao);
        
        txtNome.setText(elemento.getNomeator());
        txtEnd.setText(elemento.getEnd());
        txtNome.setText(elemento.getNomeator());
        txtEnd.setText(elemento.getEnd());
        txtNomeArt.setText(elemento.getNomeart());
        txtEmail.setText(elemento.getEmail());
        txtDataNasc.setText(elemento.getDatanasc());
        txtCidade.setText (elemento.getCidade());
        txtBairro.setText(elemento.getBairro());
        txtQuantNov.setText(elemento.getQuantnov().toString());
        txtSalario.setText(String.valueOf(elemento.getSalario()));
        txtCache.setText(String.valueOf(elemento.getCache()));
        txtGanhos.setText(String.valueOf(elemento.calcularGanhos(1)));
        
        if ((elemento.getEstado()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstado()).equals("PR") == true)
            {
                selecestado.setSelectedIndex(2);
            }
            else
            {
                selecestado.setSelectedIndex(3);
            }
    }//GEN-LAST:event_botaoultimoActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        Boolean encontrou = false;
        Integer posicaoachou = 0;
        
        for (Ator ator : lista)
        {
            //testar se o texto digitado é igual ao elemento da lista
            if (nome.equals(ator.getNomeator()))
            {
                posicao = posicaoachou;
                encontrou = true;
                //Exibir o conteúdo no formulário
                txtNome.setText(ator.getNomeator());
                txtEnd.setText(ator.getEnd());
                txtNome.setText(ator.getNomeator());
                txtEnd.setText(ator.getEnd());
                txtNome.setText(ator.getNomeator());
                txtEnd.setText(ator.getEnd());
                txtNomeArt.setText(ator.getNomeart());
                txtEmail.setText(ator.getEmail());
                txtDataNasc.setText(ator.getDatanasc());
                txtCidade.setText (ator.getCidade());
                txtBairro.setText(ator.getBairro());
                txtQuantNov.setText(ator.getQuantnov().toString());
                txtSalario.setText(String.valueOf(ator.getSalario()));
                txtCache.setText(String.valueOf(ator.getCache()));
                txtGanhos.setText(String.valueOf(ator.calcularGanhos(1)));
                

            if ((ator.getEstado()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((ator.getEstado()).equals("PR") == true)
            {
                selecestado.setSelectedIndex(2);
            }
            else
            {
                selecestado.setSelectedIndex(3);
            }
        
                //parar o for
                break;
            }
            
            posicaoachou ++;
        }

        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Ator ainda não cadastrado!");
        }

    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void botaoinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserirActionPerformed
        Ator obj = new Ator(); //cria o objeto da classe Ator

        obj.setNomeator(txtNome.getText());
        obj.setNomeart(txtNomeArt.getText());
        obj.setEmail(txtEmail.getText());
        obj.setDatanasc(txtDataNasc.getText());
        obj.setCidade(txtCidade.getText());
        obj.setEnd(txtEnd.getText());
        obj.setBairro(txtBairro.getText());
        obj.setEstado(selecestado.getSelectedItem().toString()); 
        obj.setQuantnov(Integer.parseInt(txtQuantNov.getText()));
        obj.setSalario(Double.parseDouble(txtSalario.getText()));
        obj.setCache(Double.parseDouble(txtCache.getText()));
        
        lista.add(obj);
        posicao ++;

        Limpar();
    }//GEN-LAST:event_botaoinserirActionPerformed

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        lista.remove(lista.get(posicao)); //pega o objeto da posicao
        Limpar();
    }//GEN-LAST:event_botaoexcluirActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        Limpar();
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaostatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaostatusActionPerformed
       Ator a = lista.get(posicao);
       String status;
       status = a.obterStatus();
       JOptionPane.showMessageDialog(null, "Status do Ator: " + status);
    }//GEN-LAST:event_botaostatusActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtorTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton botaoinserir;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaoprimeiro;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaostatus;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox selecestado;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCache;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JLabel txtGanhos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeArt;
    private javax.swing.JTextField txtQuantNov;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
