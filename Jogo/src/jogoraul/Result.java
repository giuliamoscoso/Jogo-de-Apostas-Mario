package jogoraul;

import java.text.DecimalFormat;
import java.util.Random;

public class Result extends javax.swing.JFrame {

    Random s = new Random();
    public Lutador z, w;
    dados d = new dados(100);
    
    int a,e;
    
    DecimalFormat df = new DecimalFormat("###,##0.0");
    
    public Result(Lutador x, Lutador y, int rounds, double aposta) {
        initComponents();
        int i = 0;
        int x1 = 0, y1 = 0;
        z = x;
        w = y;
        
        double valor = x.getFt() * aposta;
                
        j1.setText(x.getNome()+":");
        j2.setText(y.getNome()+":");
        fator1.setText(Double.toString(x.getFt()));
        fator2.setText(Double.toString(y.getFt()));
        for(i = 0;i<5;i++){
            double poder1 = x.getFt() * s.nextInt(5);
            double poder2 = y.getFt() * s.nextInt(5);
            if(poder1 > poder2){
                x1++;
            }
            else if(poder2 > poder1){
                y1++;
            }
            else{
                x1++;
                y1++;
            }
        }
        
        if(x1>y1){
            x.setNv(x.getNv()+1);
            y.setNd(y.getNd()+1);
            vencedor.setText(x.getNome());
            valor = aposta * (x.getFt() + 1);
            d.setDinheiro(valor + d.getDinheiro());
            nome.setText("ganho:");
        }else if(x1<y1){
            y.setNv(y.getNv()+1);
            x.setNd(x.getNd()+1);
            vencedor.setText(y.getNome());
            valor = aposta * (-1);
            d.setDinheiro(valor + d.getDinheiro());
            nome.setText("perdido:");
        }else{
            x.setNe(x.getNe()+1);
            y.setNe(y.getNe()+1);
            vencedor.setText("Empatados!");
            valor = aposta * 0.5;
            d.setDinheiro(valor + d.getDinheiro());
            nome.setText("ganho:");
        }
        ganho.setText(Double.toString(valor));
        dindin2.setText(Double.toString(d.getDinheiro()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        vencedor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        fator1 = new javax.swing.JLabel();
        dindin2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fator2 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        ganho = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel13.setText("Vencedor:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        vencedor.setFont(new java.awt.Font("Sylfaen", 1, 22)); // NOI18N
        vencedor.setForeground(new java.awt.Color(0, 153, 0));
        vencedor.setText("----------");
        jPanel1.add(vencedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jLabel15.setText("Fator Dificuldade:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 20));

        j1.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        j1.setText("--------");
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        fator1.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        fator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fator1.setText("--------");
        jPanel1.add(fator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 60, 20));

        dindin2.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        dindin2.setText("lala");
        jPanel1.add(dindin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/coin.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        fator2.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        fator2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fator2.setText("--------");
        jPanel1.add(fator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 60, 20));

        j2.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        j2.setText("--------");
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 20));

        ganho.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        ganho.setText("-------");
        jPanel1.add(ganho, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        nome.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        nome.setText("-------");
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 60, 20));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel8.setText("Dinheiro");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(d.getDinheiro() <= 0){
            Result.this.dispose();
            perdeu p = new perdeu();
            p.setVisible(true);
        }
        else{
            Result.this.dispose();
            Luta lts = new Luta(w, z, d.getDinheiro());
            lts.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dindin2;
    private javax.swing.JLabel fator1;
    private javax.swing.JLabel fator2;
    private javax.swing.JLabel ganho;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel vencedor;
    // End of variables declaration//GEN-END:variables
}
