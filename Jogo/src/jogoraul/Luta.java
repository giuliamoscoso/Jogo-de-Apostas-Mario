package jogoraul;

import java.util.Random;

public class Luta extends javax.swing.JFrame {

    Random s = new Random();
    public Lutador a, b;
    dados d = new dados(100);
    double din;
    
    public Luta(Lutador x, Lutador y, double dinheiro) {
        initComponents();
        
        din = dinheiro;
        
        dindin.setText(Double.toString(dinheiro));
        Lutador1.setText(x.getNome());
        Lutador2.setText(y.getNome());
        a = x;
        b = y;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Lutador1 = new javax.swing.JLabel();
        Lutador2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aposta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rounds = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dindin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lutador1.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        Lutador1.setForeground(new java.awt.Color(255, 0, 0));
        Lutador1.setText("--------");
        jPanel2.add(Lutador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        Lutador2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        Lutador2.setForeground(new java.awt.Color(255, 0, 0));
        Lutador2.setText("--------");
        jPanel2.add(Lutador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel2.setText("Qual será sua aposta na luta seguinte?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        jLabel4.setText("X");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        aposta.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jPanel2.add(aposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 50, -1));

        jButton1.setText("Lutar!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel5.setText("Quantos rounds?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));
        jPanel2.add(rounds, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 30, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel6.setText("(entre 1 e 5)");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dindin.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        dindin.setText("lala");
        jPanel3.add(dindin, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 22, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/coin.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 12, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        aviso.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 0, 0));
        aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 420, 20));

        jButton2.setText("Escolher outro personagem");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 439, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int partid = Integer.parseInt(rounds.getText());
        double money = Double.valueOf(aposta.getText());
        d.setDinheiro(d.getDinheiro() - money);
        double coin = Double.valueOf(dindin.getText());
        if(money > coin || (money) <= 0 || partid <= 0 || partid > 5){
            aviso.setText("Erro na quantidade de dinheiro/rounds!");
        }
        else{
           Luta.this.dispose();
           Result res = new Result(a, b, partid, money);
           res.setVisible(true); 
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Luta.this.dispose();
        Personagens perso = new Personagens(din);
        perso.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lutador1;
    private javax.swing.JLabel Lutador2;
    private javax.swing.JTextField aposta;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel dindin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField rounds;
    // End of variables declaration//GEN-END:variables
}
