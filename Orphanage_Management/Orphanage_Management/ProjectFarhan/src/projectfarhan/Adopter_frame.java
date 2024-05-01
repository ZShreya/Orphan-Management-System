package projectfarhan;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Adopter_frame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;

    public Adopter_frame() {
        initComponents();

        ProjectFarhan cnt = new ProjectFarhan();
        cnt.connectDB();
        con = cnt.con;
        table();
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public void table() {
        try {
            Statement statement = con.createStatement();
            //pst = con.prepareStatement("SELECT * FROM orphan");

            String query = "SELECT * FROM adopter";
            ResultSet rs = statement.executeQuery(query);

            ResultSetMetaData RSM = rs.getMetaData();
            int c;
            c = RSM.getColumnCount();

            DefaultTableModel DF = (DefaultTableModel) rSTableMetro1.getModel();
            DF.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("adopterID"));
                    v2.add(rs.getString("adoptername"));
                    v2.add(rs.getString("locality"));
                    v2.add(rs.getString("phoneno"));
                    v2.add(rs.getString("email"));
                }
                DF.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Adopter_frame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCTextField2 = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCTextField4 = new app.bolivia.swing.JCTextField();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle4 = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        jCTextField3 = new app.bolivia.swing.JCTextField();
        jCTextField6 = new app.bolivia.swing.JCTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OMS - ADOPTER");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adopter's Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jCTextField2.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField2.setPlaceholder("Enter Adopter Address...");
        jCTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 310, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adopter's Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adopter's Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 30));

        jCTextField4.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField4.setPlaceholder("Enter Adopter's Name...");
        jCTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, 40));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle1.setText("DELETE");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 100, 50));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle2.setText("ADD");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 100, 50));

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle3.setText("CLEAR");
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 100, 50));

        rSMaterialButtonRectangle4.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle4.setText("UPDATE");
        rSMaterialButtonRectangle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 100, 50));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Adopter's Phone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jCTextField3.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField3.setPlaceholder("Enter Adopter Email...");
        jCTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 310, -1));

        jCTextField6.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField6.setPlaceholder("Enter Adopter Phone...");
        jCTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 310, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 720));

        jPanel2.setBackground(new java.awt.Color(218, 239, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro1.setAutoCreateRowSorter(true);
        rSTableMetro1.setForeground(new java.awt.Color(153, 153, 153));
        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adopter ID", "Name", "Address", "Phone", "Email"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(102, 153, 255));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(153, 204, 255));
        rSTableMetro1.setColorBordeHead(new java.awt.Color(102, 153, 255));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(102, 102, 255));
        rSTableMetro1.setFuenteHead(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rSTableMetro1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        rSTableMetro1.setRowHeight(28);
        rSTableMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 800, -1));

        rSButtonHover2.setBackground(new java.awt.Color(0, 51, 102));
        rSButtonHover2.setBorder(null);
        rSButtonHover2.setText("BACK");
        rSButtonHover2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 100, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Adopter Information");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 210, 5));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 840, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField2ActionPerformed

    private void jCTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField4ActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) rSTableMetro1.getModel();
        int SelectIndex = rSTableMetro1.getSelectedRow();

        String id = d1.getValueAt(SelectIndex, 0).toString();

        try {
            pst = con.prepareStatement("DELETE FROM adopter WHERE adopterID = ?");
            pst.setString(1, id);

            int i = pst.executeUpdate();

            if (i == 1) {
                JOptionPane.showMessageDialog(this, "Adopter Record Deleted");
                jCTextField4.setText("");
                jCTextField2.setText("");
                jCTextField6.setText("");
                jCTextField3.setText("");
                table();
                rSMaterialButtonRectangle2.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Record Failed to Delete!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Adopter_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:

        String fname = jCTextField4.getText();
        String add = jCTextField2.getText();
        String phn = jCTextField6.getText();
        String email = jCTextField3.getText();

        int length = phn.length();
        if (fname.equals("") || add.equals("") || phn.equals("") || email.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all attributes", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((!(Pattern.matches("^[0-9]$", phn))) && length != 11) {
            JOptionPane.showMessageDialog(null, "Please enter a valid phone", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jCTextField3.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = con.prepareStatement("INSERT INTO adopter(adoptername, locality, phoneno, email) VALUES(?, ?, ?, ?)");
                pst.setString(1, fname);
                pst.setString(2, add);
                pst.setString(3, phn);
                pst.setString(4, email);
                int i = pst.executeUpdate();

                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Adopter Record Added");
                    jCTextField4.setText("");
                    jCTextField2.setText("");
                    jCTextField6.setText("");
                    jCTextField3.setText("");
                    table();
                } else {
                    JOptionPane.showMessageDialog(this, "Record Failed to Add!!!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Adopter_frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
        jCTextField4.setText("");
        jCTextField2.setText("");
        jCTextField6.setText("");
        jCTextField3.setText("");
        table();
        rSMaterialButtonRectangle2.setEnabled(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void rSMaterialButtonRectangle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) rSTableMetro1.getModel();
        int SelectIndex = rSTableMetro1.getSelectedRow();

        String id = d1.getValueAt(SelectIndex, 0).toString();

        String fname = jCTextField4.getText();
        String add = jCTextField2.getText();
        String phn = jCTextField6.getText();
        String email = jCTextField3.getText();

        try {
            pst = con.prepareStatement("UPDATE adopter SET adoptername = ?, locality = ?, phoneno = ?, email = ? WHERE adopterID = ?");
            pst.setString(1, fname);
            pst.setString(2, add);
            pst.setString(3, phn);
            pst.setString(4, email);
            pst.setString(5, id);
            int i = pst.executeUpdate();

            if (i == 1) {
                JOptionPane.showMessageDialog(this, "Adopter Record Updated");
                jCTextField4.setText("");
                jCTextField2.setText("");
                jCTextField6.setText("");
                jCTextField3.setText("");
                table();
                rSMaterialButtonRectangle2.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Record Failed to Update!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Adopter_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle4ActionPerformed

    private void jCTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField3ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
        close();
        Home_Frame h = new Home_Frame();
        h.setVisible(true);
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void jCTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField6ActionPerformed

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) rSTableMetro1.getModel();
        int SelectIndex = rSTableMetro1.getSelectedRow();

        jCTextField4.setText(d1.getValueAt(SelectIndex, 1).toString());
        jCTextField2.setText(d1.getValueAt(SelectIndex, 2).toString());
        jCTextField6.setText(d1.getValueAt(SelectIndex, 3).toString());
        jCTextField3.setText(d1.getValueAt(SelectIndex, 4).toString());
        rSMaterialButtonRectangle2.setEnabled(false);
    }//GEN-LAST:event_rSTableMetro1MouseClicked

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
            java.util.logging.Logger.getLogger(Adopter_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adopter_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adopter_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adopter_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adopter_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField jCTextField2;
    private app.bolivia.swing.JCTextField jCTextField3;
    private app.bolivia.swing.JCTextField jCTextField4;
    private app.bolivia.swing.JCTextField jCTextField6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle4;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
