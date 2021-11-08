package com.mycompany.so_juego_triqui;

import javax.swing.JLabel;

/**
 *
 * @author santiago.alvarez
 */
public class panel_juego extends javax.swing.JFrame {

   String initial_shift= "X";
    /**
     * This array "board_spaces" it's likea table array and it will check the turns and 
 determinate if some user press one buton
     */
    JLabel[] board_spaces = new JLabel [9];
    /**
     * On this matriz I will check if the user do a win move
     */
    int[][] win_moves = {
       
    //For horizontal movements
        {1,2,3},
        {4,5,6},
        {7,8,9},
    //for vertical movements
        {1,4,7},
        {2,5,8},
        {3,6,9},
    //for lateral movements
        {1,5,9},
        {3,5,7}   
    };
    public panel_juego() {
        initComponents();
        System.out.println(win_moves[7][1]);
        this.setLocationRelativeTo(null);
        board_spaces[0] = Espacio_triqui01;
        board_spaces[1] = Espacio_triqui02;
        board_spaces[2] = Espacio_triqui03;
        board_spaces[3] = Espacio_triqui04;
        board_spaces[4] = Espacio_triqui05;
        board_spaces[5] = Espacio_triqui06;
        board_spaces[6] = Espacio_triqui07;
        board_spaces[7] = Espacio_triqui08;
        board_spaces[8] = Espacio_triqui09;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Espacio_triqui01 = new javax.swing.JLabel();
        Espacio_triqui02 = new javax.swing.JLabel();
        Espacio_triqui03 = new javax.swing.JLabel();
        Espacio_triqui04 = new javax.swing.JLabel();
        Espacio_triqui05 = new javax.swing.JLabel();
        Espacio_triqui06 = new javax.swing.JLabel();
        Espacio_triqui07 = new javax.swing.JLabel();
        Espacio_triqui08 = new javax.swing.JLabel();
        Espacio_triqui09 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego_triqui");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        Espacio_triqui01.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui01.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui01.setOpaque(true);
        Espacio_triqui01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui01MousePressed(evt);
            }
        });

        Espacio_triqui02.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui02.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui02.setOpaque(true);
        Espacio_triqui02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui02MousePressed(evt);
            }
        });

        Espacio_triqui03.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui03.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui03.setOpaque(true);
        Espacio_triqui03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui03MousePressed(evt);
            }
        });

        Espacio_triqui04.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui04.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui04.setOpaque(true);
        Espacio_triqui04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui04MousePressed(evt);
            }
        });

        Espacio_triqui05.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui05.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui05.setOpaque(true);
        Espacio_triqui05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui05MousePressed(evt);
            }
        });

        Espacio_triqui06.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui06.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui06.setOpaque(true);
        Espacio_triqui06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui06MousePressed(evt);
            }
        });

        Espacio_triqui07.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui07.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui07.setOpaque(true);
        Espacio_triqui07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui07MousePressed(evt);
            }
        });

        Espacio_triqui08.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui08.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui08.setOpaque(true);
        Espacio_triqui08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui08MousePressed(evt);
            }
        });

        Espacio_triqui09.setBackground(new java.awt.Color(204, 204, 204));
        Espacio_triqui09.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Espacio_triqui09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Espacio_triqui09.setOpaque(true);
        Espacio_triqui09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Espacio_triqui09MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Espacio_triqui01, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Espacio_triqui02, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Espacio_triqui03, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Espacio_triqui04, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Espacio_triqui05, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Espacio_triqui06, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Espacio_triqui07, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Espacio_triqui08, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Espacio_triqui09, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Espacio_triqui01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_triqui02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_triqui03, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Espacio_triqui04, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_triqui05, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_triqui06, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Espacio_triqui07, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_triqui08, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_triqui09, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMATION TABLE");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("POLITECNICO GRANCOLOMBIANO");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setText("ACTUAL PLAYER");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel7.setText("WINNER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52))))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SISTEMAS OPERACIONALES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Espacio_triqui01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui01MousePressed
        Make_movement(1);
        Check_winner();
    }//GEN-LAST:event_Espacio_triqui01MousePressed

    private void Espacio_triqui02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui02MousePressed
        Make_movement(2);
        Check_winner();
    }//GEN-LAST:event_Espacio_triqui02MousePressed

    private void Espacio_triqui03MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui03MousePressed
       Make_movement(3);
       Check_winner();
    }//GEN-LAST:event_Espacio_triqui03MousePressed

    private void Espacio_triqui04MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui04MousePressed
       Make_movement(4);
       Check_winner();
    }//GEN-LAST:event_Espacio_triqui04MousePressed

    private void Espacio_triqui05MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui05MousePressed
        Make_movement(5);
        Check_winner();
    }//GEN-LAST:event_Espacio_triqui05MousePressed

    private void Espacio_triqui06MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui06MousePressed
        Make_movement(6);
        Check_winner();
    }//GEN-LAST:event_Espacio_triqui06MousePressed

    private void Espacio_triqui07MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui07MousePressed
        Make_movement(7);
        Check_winner();
    }//GEN-LAST:event_Espacio_triqui07MousePressed

    private void Espacio_triqui08MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui08MousePressed
        Make_movement(8);
        Check_winner();
    }//GEN-LAST:event_Espacio_triqui08MousePressed

    private void Espacio_triqui09MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espacio_triqui09MousePressed
        Make_movement(9);
        Check_winner();
    }//GEN-LAST:event_Espacio_triqui09MousePressed
    
    public void Make_movement (int casilla){
       if (board_spaces[casilla-1].getText().equals("")){
           board_spaces[casilla-1].setText(initial_shift);
           Check_player();
       }
    }
    public void Check_player (){
        if (initial_shift.equals("X")){
            initial_shift="O";   
        }else {
            initial_shift="X";
        }
    }
    
    public void Check_winner() {
       for (int i= 0; i<win_moves.length; i++){
           if(board_spaces[win_moves[i][0]-1].getText().equals("X")&&board_spaces[win_moves[i][1] -1].getText().equals("X")&&board_spaces[win_moves[i][2]-1].getText().equals("X")){
               //Casilla_ganador_jugador.setText(initial_shift);
               System.out.println("GanoX");
           }
           if(board_spaces[win_moves[i][0]-1].getText().equals("O")&&board_spaces[win_moves[i][1]-1].getText().equals("O")&&board_spaces[win_moves[i][2]-1].getText().equals("O")){
               //Casilla_ganador_jugador.setText(initial_shift);
              System.out.println("GanoO");
           }
       } 
    }
    
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
            java.util.logging.Logger.getLogger(panel_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espacio_triqui01;
    private javax.swing.JLabel Espacio_triqui02;
    private javax.swing.JLabel Espacio_triqui03;
    private javax.swing.JLabel Espacio_triqui04;
    private javax.swing.JLabel Espacio_triqui05;
    private javax.swing.JLabel Espacio_triqui06;
    private javax.swing.JLabel Espacio_triqui07;
    private javax.swing.JLabel Espacio_triqui08;
    private javax.swing.JLabel Espacio_triqui09;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
