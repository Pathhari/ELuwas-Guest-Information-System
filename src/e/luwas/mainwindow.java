/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.luwas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class mainwindow extends javax.swing.JFrame {
    
    String vType;
    String ID;
    
    public mainwindow() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wh = new javax.swing.ButtonGroup();
        id = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        twh = new javax.swing.JRadioButton();
        oid = new javax.swing.JRadioButton();
        did = new javax.swing.JRadioButton();
        fwh = new javax.swing.JRadioButton();
        tid = new javax.swing.JRadioButton();
        sid = new javax.swing.JRadioButton();
        ptxt = new javax.swing.JTextField();
        pnum = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        idno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dis = new javax.swing.JTextArea();
        in = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        b = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Akira Expanded", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID No.:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, 40));

        jLabel5.setFont(new java.awt.Font("Akira Expanded", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Summary");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 170, 40));

        jLabel4.setFont(new java.awt.Font("Akira Expanded", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 40));

        jLabel6.setFont(new java.awt.Font("Akira Expanded", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Plate number:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 340, 30));

        jLabel7.setFont(new java.awt.Font("Akira Expanded", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 230, 40));

        jLabel8.setFont(new java.awt.Font("Akira Expanded", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Plate text:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 300, 30));

        jLabel9.setFont(new java.awt.Font("Akira Expanded", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vehicle type:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 390, 40));

        wh.add(twh);
        twh.setFont(new java.awt.Font("Akira Expanded", 0, 24)); // NOI18N
        twh.setText("2-wheels");
        twh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twhActionPerformed(evt);
            }
        });
        jPanel1.add(twh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        id.add(oid);
        oid.setFont(new java.awt.Font("Akira Expanded", 0, 24)); // NOI18N
        oid.setText("other");
        oid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oidActionPerformed(evt);
            }
        });
        jPanel1.add(oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        id.add(did);
        did.setFont(new java.awt.Font("Akira Expanded", 0, 24)); // NOI18N
        did.setText("Drivers");
        did.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                didActionPerformed(evt);
            }
        });
        jPanel1.add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        wh.add(fwh);
        fwh.setFont(new java.awt.Font("Akira Expanded", 0, 24)); // NOI18N
        fwh.setText("4-Wheeler");
        fwh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fwhMouseClicked(evt);
            }
        });
        fwh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fwhActionPerformed(evt);
            }
        });
        jPanel1.add(fwh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        id.add(tid);
        tid.setFont(new java.awt.Font("Akira Expanded", 0, 24)); // NOI18N
        tid.setText("TIN");
        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });
        jPanel1.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        id.add(sid);
        sid.setFont(new java.awt.Font("Akira Expanded", 0, 24)); // NOI18N
        sid.setText("Student ID");
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        ptxt.setBackground(new java.awt.Color(102, 102, 102));
        ptxt.setFont(new java.awt.Font("Bebas", 1, 14)); // NOI18N
        ptxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 150, 30));

        pnum.setBackground(new java.awt.Color(102, 102, 102));
        pnum.setFont(new java.awt.Font("Bebas", 1, 18)); // NOI18N
        pnum.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 150, 30));

        nm.setBackground(new java.awt.Color(102, 102, 102));
        nm.setFont(new java.awt.Font("Bebas", 1, 18)); // NOI18N
        nm.setForeground(new java.awt.Color(255, 255, 255));
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        jPanel1.add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 150, 30));

        idno.setBackground(new java.awt.Color(102, 102, 102));
        idno.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        idno.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(idno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 30));

        dis.setBackground(new java.awt.Color(51, 51, 51));
        dis.setColumns(20);
        dis.setForeground(new java.awt.Color(255, 255, 255));
        dis.setRows(5);
        jScrollPane1.setViewportView(dis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 310, 150));

        in.setBackground(new java.awt.Color(255, 102, 102));
        in.setFont(new java.awt.Font("Akira Expanded", 0, 18)); // NOI18N
        in.setForeground(new java.awt.Color(255, 255, 255));
        in.setText("IN");
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });
        jPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 100, 60));

        ex.setBackground(new java.awt.Color(153, 153, 255));
        ex.setFont(new java.awt.Font("Akira Expanded", 0, 18)); // NOI18N
        ex.setForeground(new java.awt.Color(255, 255, 255));
        ex.setText("OUT");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 100, 60));

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setFont(new java.awt.Font("Hansief", 1, 12)); // NOI18N
        b.setForeground(new java.awt.Color(255, 0, 0));
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_back_arrow_10px_2.png"))); // NOI18N
        b.setText("Back");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/infoform.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 600));

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
    
   
    
    private void twhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twhActionPerformed
       vType = "Two Wheels";
    }//GEN-LAST:event_twhActionPerformed

    private void oidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oidActionPerformed
        ID = "Other";
    }//GEN-LAST:event_oidActionPerformed

    private void fwhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fwhActionPerformed
        vType = "Four Wheeler";
    }//GEN-LAST:event_fwhActionPerformed

    private void didActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_didActionPerformed
       ID = "Drivers License";
    }//GEN-LAST:event_didActionPerformed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        ID = "TIN";
    }//GEN-LAST:event_tidActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
       ID = "Student ID";
    }//GEN-LAST:event_sidActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        LocalDateTime now = LocalDateTime.now();
        String y= vlist.PrintList();
        try (FileWriter fw = new FileWriter("vlist.txt", true)) {
        fw.write("Date Inputed: " + now + "\n" + y);
        } catch (IOException e) {
        e.printStackTrace();
        }

    }//GEN-LAST:event_exActionPerformed

    private void fwhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fwhMouseClicked
     
    }//GEN-LAST:event_fwhMouseClicked

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        String name = nm.getText();
        name = name.toUpperCase();
        int idnum = Integer.parseInt(idno.getText());
        String pt = ptxt.getText();
        pt = pt.toUpperCase();
        int pno = Integer.parseInt(pnum.getText());
        
       
        
        NodeData n = new NodeData(name, idnum, pt, pno);
        vlist.add(idnum, n);
        dis.setText("\n"+ n + "\n" +
                "Vehicle Type: " + vType + "\n"+
                "ID Presented: " + ID + "\n");
        
        vlist.PrintList();

        nm.setText("");
        idno.setText("");
        ptxt.setText("");
        pnum.setText("");
    }//GEN-LAST:event_inActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        setVisible(false);
        new wcmain().setVisible(true);
    }//GEN-LAST:event_bActionPerformed

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

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
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainwindow().setVisible(true);
            }
        });
    }
    visitorList vlist = new visitorList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JRadioButton did;
    private javax.swing.JTextArea dis;
    private javax.swing.JButton ex;
    private javax.swing.JRadioButton fwh;
    private javax.swing.ButtonGroup id;
    private javax.swing.JTextField idno;
    private javax.swing.JButton in;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nm;
    private javax.swing.JRadioButton oid;
    private javax.swing.JTextField pnum;
    private javax.swing.JTextField ptxt;
    private javax.swing.JRadioButton sid;
    private javax.swing.JRadioButton tid;
    private javax.swing.JRadioButton twh;
    private javax.swing.ButtonGroup wh;
    // End of variables declaration//GEN-END:variables
}
