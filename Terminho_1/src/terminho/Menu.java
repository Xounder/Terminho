/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminho;

import java.awt.Color;

/**
 *
 * @author renan
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        jTerminho.setBackground(Color.gray);
        jQuartetinho.setBackground(Color.gray);
        jDuetinho.setBackground(Color.gray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTerminho = new javax.swing.JButton();
        jDuetinho = new javax.swing.JButton();
        jQuartetinho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Terminho.UwU");
        setResizable(false);

        jTerminho.setText("Terminho");
        jTerminho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTerminhoMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTerminhoMouseMoved(evt);
            }
        });
        jTerminho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTerminhoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTerminhoMouseReleased(evt);
            }
        });
        jTerminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTerminhoActionPerformed(evt);
            }
        });

        jDuetinho.setText("Duetinho");
        jDuetinho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDuetinhoMouseMoved(evt);
            }
        });
        jDuetinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDuetinhoMouseExited(evt);
            }
        });
        jDuetinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDuetinhoActionPerformed(evt);
            }
        });

        jQuartetinho.setText("Quartetinho");
        jQuartetinho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jQuartetinhoMouseMoved(evt);
            }
        });
        jQuartetinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuartetinhoMouseExited(evt);
            }
        });
        jQuartetinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuartetinhoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel1.setText("Terminho.UwU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTerminho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDuetinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jQuartetinho, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jTerminho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jDuetinho, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jQuartetinho, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTerminhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTerminhoMouseReleased
        // TODO add your handling code here:     
    }//GEN-LAST:event_jTerminhoMouseReleased

    private void jTerminhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTerminhoMouseDragged
        // TODO add your handling code here:   
    }//GEN-LAST:event_jTerminhoMouseDragged

    private void jTerminhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTerminhoMouseMoved
        // TODO add your handling code here:
         jTerminho.setBackground(Color.red);
        jQuartetinho.setBackground(Color.gray);
        jDuetinho.setBackground(Color.gray);
    }//GEN-LAST:event_jTerminhoMouseMoved

    private void jDuetinhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDuetinhoMouseMoved
        // TODO add your handling code here:
        jTerminho.setBackground(Color.gray);
        jQuartetinho.setBackground(Color.gray);
        jDuetinho.setBackground(Color.red);
    }//GEN-LAST:event_jDuetinhoMouseMoved

    private void jQuartetinhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuartetinhoMouseMoved
        // TODO add your handling code here:
        jTerminho.setBackground(Color.gray);
        jQuartetinho.setBackground(Color.red);
        jDuetinho.setBackground(Color.gray);
    }//GEN-LAST:event_jQuartetinhoMouseMoved

    private void jQuartetinhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuartetinhoMouseExited
        // TODO add your handling code here:
        jTerminho.setBackground(Color.gray);
        jQuartetinho.setBackground(Color.gray);
        jDuetinho.setBackground(Color.gray);
    }//GEN-LAST:event_jQuartetinhoMouseExited

    private void jDuetinhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDuetinhoMouseExited
        // TODO add your handling code here:
        jTerminho.setBackground(Color.gray);
        jQuartetinho.setBackground(Color.gray);
        jDuetinho.setBackground(Color.gray);
    }//GEN-LAST:event_jDuetinhoMouseExited

    private void jTerminhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTerminhoMouseExited
        // TODO add your handling code here:
        jTerminho.setBackground(Color.gray);
        jQuartetinho.setBackground(Color.gray);
        jDuetinho.setBackground(Color.gray);
    }//GEN-LAST:event_jTerminhoMouseExited

    private void jTerminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTerminhoActionPerformed
        // TODO add your handling code here:
        new Terminho().setVisible(true);
        dispose();
    }//GEN-LAST:event_jTerminhoActionPerformed

    private void jDuetinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDuetinhoActionPerformed
        // TODO add your handling code here:
        new Duetinho().setVisible(true);
        dispose();
    }//GEN-LAST:event_jDuetinhoActionPerformed

    private void jQuartetinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuartetinhoActionPerformed
        // TODO add your handling code here:
        new Quartetinho().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jQuartetinhoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDuetinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jQuartetinho;
    private javax.swing.JButton jTerminho;
    // End of variables declaration//GEN-END:variables
}
