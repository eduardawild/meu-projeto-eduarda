package exemplointerface;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ApresentadorTela extends javax.swing.JFrame {
List <Apresentador> lista;
Integer posicao;

    public ApresentadorTela() {
        initComponents();
        posicao = 0;
        lista = new ArrayList <Apresentador>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeApresentador = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botaoprimeiro = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dataNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailApresentador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomeArtApresent = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidadeApresent = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        endApresent = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bairroApresent = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        salarioApresent = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cacheApresent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        merchandising = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ganhosApresent = new javax.swing.JLabel();
        selecestado = new javax.swing.JComboBox();
        botaolimpar = new javax.swing.JButton();
        botaoinserir = new javax.swing.JButton();
        botaoexcluir = new javax.swing.JButton();
        botaoconsultar = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("APRESENTADOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");

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
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(botaoprimeiro)
                .addGap(18, 18, 18)
                .addComponent(botaoanterior)
                .addGap(18, 18, 18)
                .addComponent(botaoproximo)
                .addGap(18, 18, 18)
                .addComponent(botaoultimo)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoprimeiro)
                    .addComponent(botaoanterior)
                    .addComponent(botaoproximo)
                    .addComponent(botaoultimo))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nome Artístico:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cidade:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Endereço:");

        endApresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endApresentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Bairro:");

        bairroApresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroApresentActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Salário:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Cachê:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Merchandising:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Ganhos:");

        ganhosApresent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        selecestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "RS", "SC", "PR" }));

        botaolimpar.setText("Limpar");
        botaolimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolimparActionPerformed(evt);
            }
        });

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

        botaoconsultar.setText("Consultar");
        botaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(botaoinserir)
                .addGap(18, 18, 18)
                .addComponent(botaolimpar)
                .addGap(18, 18, 18)
                .addComponent(botaoexcluir)
                .addGap(18, 18, 18)
                .addComponent(botaoconsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(merchandising, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cacheApresent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(salarioApresent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(selecestado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bairroApresent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(endApresent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cidadeApresent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailApresentador)
                                    .addComponent(ganhosApresent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(nomeApresentador)
                                    .addComponent(nomeArtApresent))))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeApresentador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nomeArtApresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(emailApresentador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cidadeApresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(endApresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(bairroApresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(selecestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(salarioApresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cacheApresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(merchandising, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(ganhosApresent, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaolimpar)
                    .addComponent(botaoinserir)
                    .addComponent(botaoexcluir)
                    .addComponent(botaoconsultar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Limpar()
    {
        nomeApresentador.setText("");
        nomeArtApresent.setText("");
        dataNascimento.setText("");
        emailApresentador.setText("");
        cidadeApresent.setText("");
        endApresent.setText("");
        bairroApresent.setText("");
        selecestado.setSelectedIndex(0);
        salarioApresent.setText("");
        cacheApresent.setText("");
        merchandising.setText("");      
    }
    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        
        posicao = 0;
        
        if (lista.size() > 0)
        {
            Apresentador elemento = lista.get(0);
            
            nomeApresentador.setText(elemento.getNomeap());
            nomeArtApresent.setText(elemento.getNomeartap());
            dataNascimento.setText(elemento.getDatanascap());
            emailApresentador.setText(elemento.getEmailap());
            cidadeApresent.setText(elemento.getCidadeap());
            endApresent.setText(elemento.getEndap());
            bairroApresent.setText(elemento.getBairroap());     
            salarioApresent.setText(String.valueOf(elemento.getSalarioap()));
            cacheApresent.setText(String.valueOf(elemento.getCacheap()));
            merchandising.setText(String.valueOf(elemento.getMerchandising()));
            ganhosApresent.setText(String.valueOf(elemento.calcularGanhos(1)));
            
            if ((elemento.getEstadoap()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstadoap()).equals("PR") == true)
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
    }//GEN-LAST:event_botaoprimeiroActionPerformed

    private void bairroApresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroApresentActionPerformed
        
    }//GEN-LAST:event_bairroApresentActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
       Limpar();
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
         
        if (posicao > 0)
        { 
            posicao = posicao - 1;
        
            Apresentador elemento = lista.get(posicao);
            
            nomeApresentador.setText(elemento.getNomeap());
            nomeArtApresent.setText(elemento.getNomeartap());
            dataNascimento.setText(elemento.getDatanascap());
            emailApresentador.setText(elemento.getEmailap());
            cidadeApresent.setText(elemento.getCidadeap());
            endApresent.setText(elemento.getEndap());
            bairroApresent.setText(elemento.getBairroap());     
            salarioApresent.setText(String.valueOf(elemento.getSalarioap()));
            cacheApresent.setText(String.valueOf(elemento.getCacheap()));
            merchandising.setText(String.valueOf(elemento.getMerchandising()));
            ganhosApresent.setText(String.valueOf(elemento.calcularGanhos(1)));
            
            if ((elemento.getEstadoap()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstadoap()).equals("PR") == true)
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
        
        Apresentador elemento = lista.get(posicao);
        
            nomeApresentador.setText(elemento.getNomeap());
            nomeArtApresent.setText(elemento.getNomeartap());
            dataNascimento.setText(elemento.getDatanascap());
            emailApresentador.setText(elemento.getEmailap());
            cidadeApresent.setText(elemento.getCidadeap());
            endApresent.setText(elemento.getEndap());
            bairroApresent.setText(elemento.getBairroap());     
            salarioApresent.setText(String.valueOf(elemento.getSalarioap()));
            cacheApresent.setText(String.valueOf(elemento.getCacheap()));
            merchandising.setText(String.valueOf(elemento.getMerchandising()));
            ganhosApresent.setText(String.valueOf(elemento.calcularGanhos(1)));
            
            if ((elemento.getEstadoap()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstadoap()).equals("PR") == true)
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

    private void endApresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endApresentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endApresentActionPerformed

    private void botaoinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserirActionPerformed
       Apresentador apresent = new Apresentador ();
       
       apresent.setNomeap(nomeApresentador.getText());
       apresent.setNomeartap(nomeArtApresent.getText());
       apresent.setDatanascap(dataNascimento.getText());
       apresent.setEmailap(emailApresentador.getText());
       apresent.setCidadeap(cidadeApresent.getText());
       apresent.setEndap(endApresent.getText());
       apresent.setBairroap(bairroApresent.getText());
       apresent.setEstadoap(selecestado.getSelectedItem().toString());
       apresent.setSalarioap(Double.parseDouble(salarioApresent.getText()));
       apresent.setCacheap(Double.parseDouble(cacheApresent.getText()));
       apresent.setMerchandising(Double.parseDouble(merchandising.getText()));
       
       lista.add(apresent);
       posicao ++;
       Limpar();
    }//GEN-LAST:event_botaoinserirActionPerformed

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_botaoexcluirActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
       String pesquisa = JOptionPane.showInputDialog(null, "Digite o nome do Apresentador a ser pesquisado: ");
       boolean encontrou = false;
       Integer posicaoachou = 0; //Inicializa o contador
       
        for (Apresentador apresentador : lista) 
        {
            if (apresentador.getNomeap().equals(pesquisa))
            {
                //atualizar a posicao
                posicao = posicaoachou; //Atualuza a posição quando achar
                encontrou = true;
                
            nomeApresentador.setText(apresentador.getNomeap());
            nomeArtApresent.setText(apresentador.getNomeartap());
            dataNascimento.setText(apresentador.getDatanascap());
            emailApresentador.setText(apresentador.getEmailap());
            cidadeApresent.setText(apresentador.getCidadeap());
            endApresent.setText(apresentador.getEndap());
            bairroApresent.setText(apresentador.getBairroap());     
            salarioApresent.setText(String.valueOf(apresentador.getSalarioap()));
            cacheApresent.setText(String.valueOf(apresentador.getCacheap()));
            merchandising.setText(String.valueOf(apresentador.getMerchandising()));
            ganhosApresent.setText(String.valueOf(apresentador.calcularGanhos(1)));
            
            if ((apresentador.getEstadoap()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((apresentador.getEstadoap()).equals("PR") == true)
            {
                selecestado.setSelectedIndex(2);
            }
            else
            {
                selecestado.setSelectedIndex(3);
            }              
                break;
            }
            
            posicaoachou ++; //senão incrementa a variavel
            
           
        }
         if (encontrou == false)
            {
                JOptionPane.showMessageDialog(null, "Apresentador ainda não cadastrado!");
            }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(false);
        botaoultimo.setEnabled(false);       
        
        posicao = lista.size() - 1;
        
        Apresentador elemento = lista.get(posicao);
        
            nomeApresentador.setText(elemento.getNomeap());
            nomeArtApresent.setText(elemento.getNomeartap());
            dataNascimento.setText(elemento.getDatanascap());
            emailApresentador.setText(elemento.getEmailap());
            cidadeApresent.setText(elemento.getCidadeap());
            endApresent.setText(elemento.getEndap());
            bairroApresent.setText(elemento.getBairroap());     
            salarioApresent.setText(String.valueOf(elemento.getSalarioap()));
            cacheApresent.setText(String.valueOf(elemento.getCacheap()));
            merchandising.setText(String.valueOf(elemento.getMerchandising()));
            ganhosApresent.setText(String.valueOf(elemento.calcularGanhos(1)));
            
            if ((elemento.getEstadoap()).equals("RS")== true)
            {
                selecestado.setSelectedIndex(1);
            }
            else if ((elemento.getEstadoap()).equals("PR") == true)
            {
                selecestado.setSelectedIndex(2);
            }
            else
            {
                selecestado.setSelectedIndex(3);
            }
            
            if (lista.size() - 1 == posicao && lista.size() == 1)
            {
                botaoproximo.setEnabled(false);
                botaoultimo.setEnabled(false);
                botaoanterior.setEnabled(false);
            }
    }//GEN-LAST:event_botaoultimoActionPerformed

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
            java.util.logging.Logger.getLogger(ApresentadorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApresentadorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApresentadorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApresentadorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApresentadorTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroApresent;
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton botaoinserir;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaoprimeiro;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JTextField cacheApresent;
    private javax.swing.JTextField cidadeApresent;
    private javax.swing.JTextField dataNascimento;
    private javax.swing.JTextField emailApresentador;
    private javax.swing.JTextField endApresent;
    private javax.swing.JLabel ganhosApresent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField merchandising;
    private javax.swing.JTextField nomeApresentador;
    private javax.swing.JTextField nomeArtApresent;
    private javax.swing.JTextField salarioApresent;
    private javax.swing.JComboBox selecestado;
    // End of variables declaration//GEN-END:variables
}
