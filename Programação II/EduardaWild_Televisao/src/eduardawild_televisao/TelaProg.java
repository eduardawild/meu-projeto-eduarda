package eduardawild_televisao;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaProg extends javax.swing.JFrame {
List <InfProg> lista;
Integer posicao;

    public TelaProg() {
        initComponents();
        lista = new ArrayList <InfProg> ();
        posicao = 0;
    }

    public void Limpar ()
    {
        txtcodprog.setText("");
        txtnomeprog.setText("");
        cboEmissora.setSelectedIndex(0);
        txtTempo.setText("");
        cboDia.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoprimeiro = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodprog = new javax.swing.JTextField();
        txtnomeprog = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTempo = new javax.swing.JTextField();
        cboEmissora = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox();
        botaoconsultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botaoremover = new javax.swing.JButton();
        botaoinserir = new javax.swing.JButton();
        botaonovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO DE PROGRAMAS DE TELEVISÃO ");

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
                .addGap(20, 20, 20)
                .addComponent(botaoprimeiro)
                .addGap(27, 27, 27)
                .addComponent(botaoanterior)
                .addGap(18, 18, 18)
                .addComponent(botaoproximo)
                .addGap(18, 18, 18)
                .addComponent(botaoultimo)
                .addContainerGap(19, Short.MAX_VALUE))
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

        jLabel2.setText("Eduarda Delabary Wild");

        jLabel3.setText("CODIGO:");

        jLabel4.setText("NOME:");

        jLabel5.setText("EMISSORA:");

        jLabel6.setText("TEMPO DE DURAÇÃO:");

        cboEmissora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Globo", "SBT", "Band", "TVE" }));

        jLabel7.setText("DIA DA EXIBIÇÃO:");

        cboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" }));

        botaoconsultar.setText("Consultar");
        botaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultarActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcodprog)
                                    .addComponent(txtnomeprog)
                                    .addComponent(txtTempo)
                                    .addComponent(cboEmissora, 0, 258, Short.MAX_VALUE)
                                    .addComponent(cboDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(botaoconsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoremover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoinserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaonovo)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcodprog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnomeprog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEmissora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoconsultar)
                    .addComponent(jButton1)
                    .addComponent(botaoremover)
                    .addComponent(botaoinserir)
                    .addComponent(botaonovo))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserirActionPerformed
        InfProg prog = new InfProg ();
        
        while (txtcodprog.getText().equals("") || txtnomeprog.getText().equals("") || cboEmissora.getSelectedIndex() == 0 || txtTempo.getText().equals("") || cboDia.getSelectedIndex() == 0 || Integer.parseInt(txtTempo.getText()) > 200)
        {
            
        if (txtcodprog.getText().equals("") || txtnomeprog.getText().equals("") || cboEmissora.getSelectedIndex() == 0 || txtTempo.getText().equals("") || cboDia.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos do cadastro!");
        }
        else if (Integer.parseInt(txtTempo.getText()) > 200)
        {
            JOptionPane.showMessageDialog(null, "Programa de longa duração!");
        }
        else
        {
            prog.setCodprog(txtcodprog.getText());
            prog.setEmissora(txtnomeprog.getText());
            
            if (cboEmissora.getSelectedIndex() == 1)
            {
                prog.setEmissora("Globo");
            }
            else if (cboEmissora.getSelectedIndex() == 2)
            {
                prog.setEmissora("SBT");
            }
            else if (cboEmissora.getSelectedIndex() == 3)
            {
                prog.setEmissora("Band");
            }
            else if (cboEmissora.getSelectedIndex() == 4)
            {
                prog.setEmissora("TVE");
            }
            
            prog.setTempo(txtTempo.getText());
            
            if (cboDia.getSelectedIndex() == 1)
            {
                prog.setDia("Segunda");
            }
            else if (cboDia.getSelectedIndex() == 2)
            {
                prog.setDia("Terça");
            }
            else if (cboDia.getSelectedIndex() == 3)
            {
                prog.setDia("Quarta");
            }
            else if (cboDia.getSelectedIndex() == 4)
            {
                prog.setDia("Quinta");
            }
            else if (cboDia.getSelectedIndex() == 5)
            {
                prog.setDia("Sexta");
            }
            else if (cboDia.getSelectedIndex() == 6)
            {
                prog.setDia("Sábado");
            }
            else if (cboDia.getSelectedIndex() == 7)
            {
                prog.setDia("Domingo");
            }
        }
        }
        
            lista.add(prog);
            posicao ++;
            Limpar ();
        
    }//GEN-LAST:event_botaoinserirActionPerformed

    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        
        if (lista.size()>0)
        {    
            posicao = 0;
            InfProg elemento = lista.get(0);
            
            txtcodprog.setText(elemento.getCodprog());
            txtnomeprog.setText(elemento.getNomeprog());
            
            if (elemento.getEmissora().equals("Globo"))
            {
                cboEmissora.setSelectedIndex(1);
            }
            else if (elemento.getEmissora().equals("SBT"))
            {
                cboEmissora.setSelectedIndex(2);
            }
            else if (elemento.getEmissora().equals("Band"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            else if (elemento.getEmissora().equals("TVE"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            
            txtTempo.setText(elemento.getTempo());
            
            if (elemento.getDia().equals("Segunda"))
            {
                cboDia.setSelectedIndex(1);
            }
            else if (elemento.getDia().equals("Terça"))
            {
                cboDia.setSelectedIndex(2);
            }
            else if (elemento.getDia().equals("Quarta"))
            {
                cboDia.setSelectedIndex(3);
            }
            else if (elemento.getDia().equals("Quinta"))
            {
                cboDia.setSelectedIndex(4);
            }
            else if (elemento.getDia().equals("Sexta"))
            {
                cboDia.setSelectedIndex(5);
            }
            else if (elemento.getDia().equals("Sábado"))
            {
                cboDia.setSelectedIndex(6);
            }
            else if (elemento.getDia().equals("Domingo"))
            {
                cboDia.setSelectedIndex(7);
            }
        }
    }//GEN-LAST:event_botaoprimeiroActionPerformed

    private void botaoremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremoverActionPerformed
        lista.remove(lista.get(posicao)); 
        Limpar();
    }//GEN-LAST:event_botaoremoverActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        Boolean encontrou = false;
        Integer posicaoachou = 0;
        
        for (InfProg infprog : lista) 
        {
            if (nome.equalsIgnoreCase(infprog.getNomeprog()))
            {
                posicao = posicaoachou;
                encontrou = true;
                
                txtcodprog.setText(infprog.getCodprog());
                txtnomeprog.setText(infprog.getNomeprog());
                
                if (infprog.getEmissora().equals("Globo"))
                {
                    cboEmissora.setSelectedIndex(1);
                }
                else if (infprog.getEmissora().equals("SBT"))
                {
                    cboEmissora.setSelectedIndex(2);
                }
                else if (infprog.getEmissora().equals("Band"))
                {
                    cboEmissora.setSelectedIndex(3);
                }
                else if (infprog.getEmissora().equals("TVE"))
                {
                    cboEmissora.setSelectedIndex(4);
                }
                
                txtTempo.setText(infprog.getTempo());
                
                if (infprog.getDia().equals("Segunda"))
                {
                    cboDia.setSelectedIndex(1);
                }
                else if (infprog.getDia().equals("Terça"))
                {
                    cboDia.setSelectedIndex(2);
                }
                else if (infprog.getDia().equals("Quarta"))
                {
                    cboDia.setSelectedIndex(3);
                }
                else if (infprog.getDia().equals("Quinta"))
                {
                    cboDia.setSelectedIndex(4);
                }
                else if (infprog.getDia().equals("Sexta"))
                {
                    cboDia.setSelectedIndex(5);
                }
                else if (infprog.getDia().equals("Sábado"))
                {
                    cboDia.setSelectedIndex(6);
                }
                else if (infprog.getDia().equals("Domingo"))
                {
                    cboDia.setSelectedIndex(7);
                }
                
               break; 
            }
            
            posicaoachou ++;
        }
        
        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Programa ainda não cadastrado!");
        }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true); 
        
        if (posicao > 0)
        {
            posicao = posicao - 1;
            
            InfProg elemento = lista.get(posicao);
            
            txtcodprog.setText(elemento.getCodprog());
            txtnomeprog.setText(elemento.getNomeprog());
            
            if (elemento.getEmissora().equals("Globo"))
            {
                cboEmissora.setSelectedIndex(1);
            }
            else if (elemento.getEmissora().equals("SBT"))
            {
                cboEmissora.setSelectedIndex(2);
            }
            else if (elemento.getEmissora().equals("Band"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            else if (elemento.getEmissora().equals("TVE"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            
            txtTempo.setText(elemento.getTempo());
            
            if (elemento.getDia().equals("Segunda"))
            {
                cboDia.setSelectedIndex(1);
            }
            else if (elemento.getDia().equals("Terça"))
            {
                cboDia.setSelectedIndex(2);
            }
            else if (elemento.getDia().equals("Quarta"))
            {
                cboDia.setSelectedIndex(3);
            }
            else if (elemento.getDia().equals("Quinta"))
            {
                cboDia.setSelectedIndex(4);
            }
            else if (elemento.getDia().equals("Sexta"))
            {
                cboDia.setSelectedIndex(5);
            }
            else if (elemento.getDia().equals("Sábado"))
            {
                cboDia.setSelectedIndex(6);
            }
            else if (elemento.getDia().equals("Domingo"))
            {
                cboDia.setSelectedIndex(7);
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
        
        InfProg elemento = lista.get(posicao);
        
            txtcodprog.setText(elemento.getCodprog());
            txtnomeprog.setText(elemento.getNomeprog());
            
            if (elemento.getEmissora().equals("Globo"))
            {
                cboEmissora.setSelectedIndex(1);
            }
            else if (elemento.getEmissora().equals("SBT"))
            {
                cboEmissora.setSelectedIndex(2);
            }
            else if (elemento.getEmissora().equals("Band"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            else if (elemento.getEmissora().equals("TVE"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            
            txtTempo.setText(elemento.getTempo());
            
            if (elemento.getDia().equals("Segunda"))
            {
                cboDia.setSelectedIndex(1);
            }
            else if (elemento.getDia().equals("Terça"))
            {
                cboDia.setSelectedIndex(2);
            }
            else if (elemento.getDia().equals("Quarta"))
            {
                cboDia.setSelectedIndex(3);
            }
            else if (elemento.getDia().equals("Quinta"))
            {
                cboDia.setSelectedIndex(4);
            }
            else if (elemento.getDia().equals("Sexta"))
            {
                cboDia.setSelectedIndex(5);
            }
            else if (elemento.getDia().equals("Sábado"))
            {
                cboDia.setSelectedIndex(6);
            }
            else if (elemento.getDia().equals("Domingo"))
            {
                cboDia.setSelectedIndex(7);
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
        
        InfProg elemento = lista.get(posicao);
        
            txtcodprog.setText(elemento.getCodprog());
            txtnomeprog.setText(elemento.getNomeprog());
            
            if (elemento.getEmissora().equals("Globo"))
            {
                cboEmissora.setSelectedIndex(1);
            }
            else if (elemento.getEmissora().equals("SBT"))
            {
                cboEmissora.setSelectedIndex(2);
            }
            else if (elemento.getEmissora().equals("Band"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            else if (elemento.getEmissora().equals("TVE"))
            {
                cboEmissora.setSelectedIndex(3);
            }
            
            txtTempo.setText(elemento.getTempo());
            
            if (elemento.getDia().equals("Segunda"))
            {
                cboDia.setSelectedIndex(1);
            }
            else if (elemento.getDia().equals("Terça"))
            {
                cboDia.setSelectedIndex(2);
            }
            else if (elemento.getDia().equals("Quarta"))
            {
                cboDia.setSelectedIndex(3);
            }
            else if (elemento.getDia().equals("Quinta"))
            {
                cboDia.setSelectedIndex(4);
            }
            else if (elemento.getDia().equals("Sexta"))
            {
                cboDia.setSelectedIndex(5);
            }
            else if (elemento.getDia().equals("Sábado"))
            {
                cboDia.setSelectedIndex(6);
            }
            else if (elemento.getDia().equals("Domingo"))
            {
                cboDia.setSelectedIndex(7);
            }
    }//GEN-LAST:event_botaoultimoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoinserir;
    private javax.swing.JButton botaonovo;
    private javax.swing.JButton botaoprimeiro;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoremover;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JComboBox cboDia;
    private javax.swing.JComboBox cboEmissora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtTempo;
    private javax.swing.JTextField txtcodprog;
    private javax.swing.JTextField txtnomeprog;
    // End of variables declaration//GEN-END:variables
}
