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

        jPanel3 = new javax.swing.JPanel();
        lblPerg = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoPular = new javax.swing.JButton();
        botaoCartas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblOp3 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        lblOp1 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        lblOp2 = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        lblOp4 = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        botaoConfirmar = new javax.swing.JButton();
        botaoParar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPerg.setBackground(new java.awt.Color(255, 255, 255));
        lblPerg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblPerg.setForeground(new java.awt.Color(255, 255, 255));
        lblPerg.setText("Quantos estados possui o Brasil?");
        jPanel3.add(lblPerg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel3.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 80, 610, 280));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/silvioo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 160, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("2 MIL");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("500");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel9.setBackground(new java.awt.Color(255, 255, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel9.setToolTipText("");
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("500");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel10.setToolTipText("");
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("500");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel11.setBackground(new java.awt.Color(255, 255, 0));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel11.setToolTipText("");
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("500");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 0));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel12.setToolTipText("");
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("500");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel13.setBackground(new java.awt.Color(255, 255, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel13.setToolTipText("");
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("500");
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 0));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel14.setToolTipText("");
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("500");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 70, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ERRAR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel7.setToolTipText("");
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("500");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 0));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("500");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 70, 60));

        jPanel15.setBackground(new java.awt.Color(255, 255, 0));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel15.setToolTipText("");
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("1 MIL");
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 255, 0));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel16.setToolTipText("");
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("500");
        jPanel16.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel17.setBackground(new java.awt.Color(255, 255, 0));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel17.setToolTipText("");
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("500");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 0));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel18.setToolTipText("");
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("500");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel19.setBackground(new java.awt.Color(255, 255, 0));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel19.setToolTipText("");
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("500");
        jPanel19.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 0));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel20.setToolTipText("");
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("500");
        jPanel20.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel21.setBackground(new java.awt.Color(255, 255, 0));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel21.setToolTipText("");
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("500");
        jPanel21.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel22.setBackground(new java.awt.Color(255, 255, 0));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel22.setToolTipText("");
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("500");
        jPanel22.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel19.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel15.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 70, 60));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ACERTAR");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoPular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pular.jpg"))); // NOI18N
        botaoPular.setContentAreaFilled(false);
        jPanel2.add(botaoPular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 70));

        botaoCartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartas.jpg"))); // NOI18N
        botaoCartas.setContentAreaFilled(false);
        jPanel2.add(botaoCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 60, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 230, 110));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblOp3.setBackground(new java.awt.Color(255, 0, 0));
        lblOp3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOp3.setForeground(new java.awt.Color(255, 255, 255));
        lblOp3.setText("Opção 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOp3)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lblOp3)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 320, 40));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        lblOp1.setBackground(new java.awt.Color(255, 0, 0));
        lblOp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOp1.setForeground(new java.awt.Color(255, 255, 255));
        lblOp1.setText("Opção 1");
        lblOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblOp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOp1)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lblOp1)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, 40));

        jPanel23.setBackground(new java.awt.Color(255, 0, 0));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel23.setForeground(new java.awt.Color(255, 255, 255));

        lblOp2.setBackground(new java.awt.Color(255, 0, 0));
        lblOp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOp2.setForeground(new java.awt.Color(255, 255, 255));
        lblOp2.setText("Opção 2");
        lblOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblOp2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOp2)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOp2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, 40));

        jPanel24.setBackground(new java.awt.Color(255, 0, 0));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel24.setForeground(new java.awt.Color(255, 255, 255));

        lblOp4.setBackground(new java.awt.Color(255, 0, 0));
        lblOp4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOp4.setForeground(new java.awt.Color(255, 255, 255));
        lblOp4.setText("Opção 4");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOp4)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOp4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 320, -1));

        jPanel26.setBackground(new java.awt.Color(0, 0, 255));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PARAR");
        jPanel26.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("jLabel1");
        lblNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNomeMouseClicked(evt);
            }
        });
        jPanel26.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        botaoConfirmar.setBackground(new java.awt.Color(51, 102, 255));
        botaoConfirmar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        botaoConfirmar.setText("CONFIRMAR");
        jPanel26.add(botaoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 40));

        botaoParar.setBackground(new java.awt.Color(51, 102, 255));
        botaoParar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoParar.setForeground(new java.awt.Color(255, 255, 255));
        botaoParar.setText("PARAR");
        botaoParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPararActionPerformed(evt);
            }
        });
        jPanel26.add(botaoParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 90, 40));

        getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lblOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOp1ActionPerformed

    private void lblOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblOp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOp2ActionPerformed

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel26MouseClicked

    private void lblNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNomeMouseClicked
       lblNome.setText(jogador.getLogin());
    }//GEN-LAST:event_lblNomeMouseClicked

    private void botaoPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPararActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton lblOp1;
    private javax.swing.JRadioButton lblOp2;
    private javax.swing.JRadioButton lblOp3;
    private javax.swing.JRadioButton lblOp4;
    private javax.swing.JLabel lblPerg;
    // End of variables declaration//GEN-END:variables
}
