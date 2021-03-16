package jogoraul;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Random;

public class Personagens extends javax.swing.JFrame {
    
        dados d = new dados(100);
    
        Lutador m = new Lutador("Mario",0,0,0,0,0);
        Lutador l = new Lutador("Luigi",1,0,0,0,0);
        Lutador w = new Lutador("Wario",2,0,0,0,0);
        Lutador p = new Lutador("Peach",3,0,0,0,0);
        Lutador g = new Lutador("Goomba",4,0,0,0,0);
        
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("###,##0.0");
        
        double din;
        
        Lutador[] escolha = {m, l, w, p, g};
        
    public Personagens(double dinheiro) {
        initComponents();
        
        din = dinheiro;
        
        m.setNv(Integer.parseInt(Vm.getText()));
        m.setNd(Integer.parseInt(Dm.getText()));
        m.setNe(Integer.parseInt(Em.getText()));
        
        l.setNv(Integer.parseInt(Vl.getText()));
        l.setNd(Integer.parseInt(Dl.getText()));
        l.setNe(Integer.parseInt(El.getText()));
        
        w.setNv(Integer.parseInt(Vw.getText()));
        w.setNd(Integer.parseInt(Dw.getText()));
        w.setNe(Integer.parseInt(Ew.getText()));
        
        p.setNv(Integer.parseInt(Vp.getText()));
        p.setNd(Integer.parseInt(Dp.getText()));
        p.setNe(Integer.parseInt(Ep.getText()));
        
        g.setNv(Integer.parseInt(Vg.getText()));
        g.setNd(Integer.parseInt(Dg.getText()));
        g.setNe(Integer.parseInt(Eg.getText()));
        
        //Fórmula: V/L – D/10 – (Aleatorio0..5/10)
        
        m.setFt(Math.abs(((m.getNv()/(m.getNv() + m.getNd()+ m.getNe())) - (m.getNd() / 10.0)) - (r.nextInt(6) / 10.0)));
        l.setFt(Math.abs(((l.getNv()/(l.getNv() + l.getNd()+ l.getNe())) - (l.getNd() / 10.0)) - (r.nextInt(6) / 10.0)));
        w.setFt(Math.abs(((w.getNv()/(w.getNv() + w.getNd()+ w.getNe())) - (w.getNd() / 10.0)) - (r.nextInt(6) / 10.0)));
        p.setFt(Math.abs(((p.getNv()/(p.getNv() + p.getNd()+ p.getNe())) - (p.getNd() / 10.0)) - (r.nextInt(6) / 10.0)));
        g.setFt(Math.abs(((g.getNv()/(g.getNv() + g.getNd()+ g.getNe())) - (g.getNd() / 10.0)) - (r.nextInt(6) / 10.0)));
        Ftm.setText(""+df.format(m.getFt()));
        Ftl.setText(""+df.format(l.getFt()));
        Ftw.setText(""+df.format(w.getFt()));
        Ftp.setText(""+df.format(p.getFt()));
        Ftg.setText(""+df.format(g.getFt()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PanelMario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Vm = new javax.swing.JLabel();
        Dm = new javax.swing.JLabel();
        Em = new javax.swing.JLabel();
        Ftm = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        PanelLuigi = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Vl = new javax.swing.JLabel();
        Dl = new javax.swing.JLabel();
        El = new javax.swing.JLabel();
        Ftl = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        PanelWario = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Vw = new javax.swing.JLabel();
        Dw = new javax.swing.JLabel();
        Ew = new javax.swing.JLabel();
        Ftw = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        PanelPeach = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Ftp = new javax.swing.JLabel();
        Ep = new javax.swing.JLabel();
        Dp = new javax.swing.JLabel();
        Vp = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        PanelGoo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Ftg = new javax.swing.JLabel();
        Eg = new javax.swing.JLabel();
        Dg = new javax.swing.JLabel();
        Vg = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMario.setBackground(new java.awt.Color(255, 255, 255));
        PanelMario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMarioMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelMarioMouseMoved(evt);
            }
        });
        PanelMario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelMarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMarioMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/mario.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("Nº Vitórias:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Nº Derrotas:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Nº Empates:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setText("Fator Dificuldade:");

        Vm.setText("2");

        Dm.setText("1");

        Em.setText("2");

        Ftm.setText("0");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText("Mario");

        javax.swing.GroupLayout PanelMarioLayout = new javax.swing.GroupLayout(PanelMario);
        PanelMario.setLayout(PanelMarioLayout);
        PanelMarioLayout.setHorizontalGroup(
            PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(PanelMarioLayout.createSequentialGroup()
                        .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Em, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Vm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ftm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelMarioLayout.setVerticalGroup(
            PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMarioLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Vm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Dm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Em))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Ftm))
                .addGap(68, 68, 68))
        );

        jPanel1.add(PanelMario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 290));

        PanelLuigi.setBackground(new java.awt.Color(255, 255, 255));
        PanelLuigi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelLuigiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLuigiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLuigiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelLuigiMousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/luigi.jpg"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel13.setText("Nome:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel14.setText("Nº Vitórias:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel15.setText("Nº Derrotas:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("Nº Empates:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel17.setText("Fator Dificuldade:");

        Vl.setText("1");

        Dl.setText("2");

        El.setText("2");

        Ftl.setText("0");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setText("Luigi");

        javax.swing.GroupLayout PanelLuigiLayout = new javax.swing.GroupLayout(PanelLuigi);
        PanelLuigi.setLayout(PanelLuigiLayout);
        PanelLuigiLayout.setHorizontalGroup(
            PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLuigiLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLuigiLayout.createSequentialGroup()
                            .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14))
                            .addGap(34, 34, 34)
                            .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(El, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Vl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Dl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(PanelLuigiLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ftl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelLuigiLayout.setVerticalGroup(
            PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLuigiLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Vl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Dl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(El))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLuigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Ftl))
                .addGap(65, 65, 65))
        );

        jPanel1.add(PanelLuigi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 180, 290));

        PanelWario.setBackground(new java.awt.Color(255, 255, 255));
        PanelWario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelWarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelWarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelWarioMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/wario.jpg"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel18.setText("Nome:");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel19.setText("Nº Vitórias:");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel20.setText("Nº Derrotas:");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel21.setText("Nº Empates:");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel22.setText("Fator Dificuldade:");

        Vw.setText("2");

        Dw.setText("2");

        Ew.setText("1");

        Ftw.setText("0");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("Wario");

        javax.swing.GroupLayout PanelWarioLayout = new javax.swing.GroupLayout(PanelWario);
        PanelWario.setLayout(PanelWarioLayout);
        PanelWarioLayout.setHorizontalGroup(
            PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelWarioLayout.createSequentialGroup()
                            .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19))
                            .addGap(34, 34, 34)
                            .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Vw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Dw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(PanelWarioLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ftw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelWarioLayout.setVerticalGroup(
            PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWarioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Vw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Dw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Ew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelWarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Ftw))
                .addGap(65, 65, 65))
        );

        jPanel1.add(PanelWario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 190, 290));

        PanelPeach.setBackground(new java.awt.Color(255, 255, 255));
        PanelPeach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelPeachMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelPeachMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPeachMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/peach.jpg"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel23.setText("Nome:");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel24.setText("Nº Vitórias:");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel25.setText("Nº Derrotas:");

        jLabel26.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel26.setText("Nº Empates:");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel27.setText("Fator Dificuldade:");

        Ftp.setText("0");

        Ep.setText("0");

        Dp.setText("0");

        Vp.setText("5");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("Peach");

        javax.swing.GroupLayout PanelPeachLayout = new javax.swing.GroupLayout(PanelPeach);
        PanelPeach.setLayout(PanelPeachLayout);
        PanelPeachLayout.setHorizontalGroup(
            PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPeachLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(PanelPeachLayout.createSequentialGroup()
                        .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ftp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Vp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelPeachLayout.setVerticalGroup(
            PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPeachLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Vp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(Dp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(Ep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(Ftp))
                .addGap(65, 65, 65))
        );

        jPanel1.add(PanelPeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 190, 290));

        PanelGoo.setBackground(new java.awt.Color(255, 255, 255));
        PanelGoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelGooMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelGooMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelGooMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/goomba.jpg"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel28.setText("Nome:");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel29.setText("Nº Vitórias:");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel30.setText("Nº Derrotas:");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel31.setText("Nº Empates:");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel32.setText("Fator Dificuldade:");

        Ftg.setText("0");

        Eg.setText("1");

        Dg.setText("4");

        Vg.setText("0");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText("Goomba");

        javax.swing.GroupLayout PanelGooLayout = new javax.swing.GroupLayout(PanelGoo);
        PanelGoo.setLayout(PanelGooLayout);
        PanelGooLayout.setHorizontalGroup(
            PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGooLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGooLayout.createSequentialGroup()
                        .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))
                        .addGap(42, 42, 42)
                        .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelGooLayout.createSequentialGroup()
                                .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Vg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Eg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelGooLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelGooLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(Ftg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        PanelGooLayout.setVerticalGroup(
            PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGooLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(Vg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(Dg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(Eg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelGooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(Ftg))
                .addGap(59, 59, 59))
        );

        jPanel1.add(PanelGoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 190, 290));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoraul/selc.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelMarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMarioMouseDragged
        
    }//GEN-LAST:event_PanelMarioMouseDragged

    private void PanelMarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMarioMouseMoved
        
    }//GEN-LAST:event_PanelMarioMouseMoved

    private void PanelWarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelWarioMouseEntered
        PanelWario.setBackground(Color.LIGHT_GRAY);
        PanelWario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));
    }//GEN-LAST:event_PanelWarioMouseEntered

    private void PanelLuigiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLuigiMousePressed
       
    }//GEN-LAST:event_PanelLuigiMousePressed

    private void PanelLuigiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLuigiMouseExited
        PanelLuigi.setBackground(Color.WHITE);
        PanelLuigi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
    }//GEN-LAST:event_PanelLuigiMouseExited

    private void PanelLuigiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLuigiMouseEntered
        PanelLuigi.setBackground(Color.LIGHT_GRAY);
        PanelLuigi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 200, 0), 4));
    }//GEN-LAST:event_PanelLuigiMouseEntered

    private void PanelWarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelWarioMouseExited
        PanelWario.setBackground(Color.WHITE);
        PanelWario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
    }//GEN-LAST:event_PanelWarioMouseExited

    private void PanelMarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMarioMouseEntered
        PanelMario.setBackground(Color.LIGHT_GRAY);
        PanelMario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 4));
    }//GEN-LAST:event_PanelMarioMouseEntered

    private void PanelMarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMarioMouseExited
        PanelMario.setBackground(Color.WHITE);
        PanelMario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
    }//GEN-LAST:event_PanelMarioMouseExited

    private void PanelPeachMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPeachMouseExited
        PanelPeach.setBackground(Color.WHITE);
        PanelPeach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
    }//GEN-LAST:event_PanelPeachMouseExited

    private void PanelPeachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPeachMouseEntered
        PanelPeach.setBackground(Color.LIGHT_GRAY);
        PanelPeach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 204), 4));
    }//GEN-LAST:event_PanelPeachMouseEntered

    private void PanelGooMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGooMouseExited
        PanelGoo.setBackground(Color.WHITE);
        PanelGoo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
    }//GEN-LAST:event_PanelGooMouseExited

    private void PanelGooMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGooMouseEntered
        PanelGoo.setBackground(Color.LIGHT_GRAY);
        PanelGoo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 75, 0), 4));
    }//GEN-LAST:event_PanelGooMouseEntered

    private void PanelMarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMarioMouseClicked
        int i;
        do{
            i = r.nextInt(5);
            if(i != m.getId()){
                Personagens.this.dispose();
                Luta lts = new Luta(m, escolha[i], din);
                lts.setVisible(true); 
            }  
        }while(i == m.getId());  
    }//GEN-LAST:event_PanelMarioMouseClicked

    private void PanelLuigiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLuigiMouseClicked
        int i;
        do{
            i = r.nextInt(5);
            if(i != l.getId()){
                Personagens.this.dispose();
                Luta lts = new Luta(l, escolha[i], din);
                lts.setVisible(true); 
            }  
        }while(i == l.getId());
    }//GEN-LAST:event_PanelLuigiMouseClicked

    private void PanelWarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelWarioMouseClicked
        int i;
        do{
            i = r.nextInt(5);
            if(i != w.getId()){
                Personagens.this.dispose();
                Luta lts = new Luta(w, escolha[i], din);
                lts.setVisible(true); 
            }  
        }while(i == w.getId());
    }//GEN-LAST:event_PanelWarioMouseClicked

    private void PanelPeachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPeachMouseClicked
        int i;
        do{
            i = r.nextInt(5);
            if(i != p.getId()){
                Personagens.this.dispose();
                Luta lts = new Luta(p, escolha[i], din);
                lts.setVisible(true); 
            }  
        }while(i == p.getId());
    }//GEN-LAST:event_PanelPeachMouseClicked

    private void PanelGooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGooMouseClicked
        int i;
        do{
            i = r.nextInt(5);
            if(i != g.getId()){
                Personagens.this.dispose();
                Luta lts = new Luta(g, escolha[i], din);
                lts.setVisible(true); 
            }  
        }while(i == g.getId());
    }//GEN-LAST:event_PanelGooMouseClicked

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
            java.util.logging.Logger.getLogger(Personagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dg;
    private javax.swing.JLabel Dl;
    private javax.swing.JLabel Dm;
    private javax.swing.JLabel Dp;
    private javax.swing.JLabel Dw;
    private javax.swing.JLabel Eg;
    private javax.swing.JLabel El;
    private javax.swing.JLabel Em;
    private javax.swing.JLabel Ep;
    private javax.swing.JLabel Ew;
    private javax.swing.JLabel Ftg;
    private javax.swing.JLabel Ftl;
    private javax.swing.JLabel Ftm;
    private javax.swing.JLabel Ftp;
    private javax.swing.JLabel Ftw;
    private javax.swing.JPanel PanelGoo;
    private javax.swing.JPanel PanelLuigi;
    private javax.swing.JPanel PanelMario;
    private javax.swing.JPanel PanelPeach;
    private javax.swing.JPanel PanelWario;
    private javax.swing.JLabel Vg;
    private javax.swing.JLabel Vl;
    private javax.swing.JLabel Vm;
    private javax.swing.JLabel Vp;
    private javax.swing.JLabel Vw;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void Luta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
