package projectfarhan;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Orphan_frame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;

    public Orphan_frame() {
        initComponents();

        ProjectFarhan cnt = new ProjectFarhan();
        cnt.connectDB();
        con = cnt.con;

        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT roomID FROM room");

            while (rs.next()) {
                String roomID = rs.getString("roomID");
                rSComboMetro4.addItem(roomID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Orphan_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
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

            String query = "SELECT * FROM orphan";
            ResultSet rs = statement.executeQuery(query);

            ResultSetMetaData RSM = rs.getMetaData();
            int c;
            c = RSM.getColumnCount();

            DefaultTableModel DF = (DefaultTableModel) rSTableMetro1.getModel();
            DF.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("orphanID"));
                    v2.add(rs.getString("firstname"));
                    v2.add(rs.getString("lastname"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("dateofbirth"));
                    v2.add(rs.getString("gender"));
                    v2.add(rs.getString("bloodgroup"));
                    v2.add(rs.getString("adoptionstatus"));
                    v2.add(rs.getString("roomID"));
                }
                DF.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Orphan_frame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        jCTextField2 = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSComboMetro1 = new rojerusan.RSComboMetro();
        jLabel5 = new javax.swing.JLabel();
        rSComboMetro2 = new rojerusan.RSComboMetro();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle4 = new rojerusan.RSMaterialButtonRectangle();
        jLabel7 = new javax.swing.JLabel();
        jCTextField3 = new app.bolivia.swing.JCTextField();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jLabel8 = new javax.swing.JLabel();
        rSComboMetro3 = new rojerusan.RSComboMetro();
        rSComboMetro4 = new rojerusan.RSComboMetro();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OMS - ORPHANAGE");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Last Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jCTextField1.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField1.setPlaceholder("Enter Orphan's Last Name...");
        jCTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 310, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jCTextField2.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField2.setPlaceholder("Enter Orphan Age...");
        jCTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 310, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        rSComboMetro1.setForeground(new java.awt.Color(0, 0, 0));
        rSComboMetro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " A+", " A-", " B+", " B-", " O+", " O-", " AB+", " AB-" }));
        rSComboMetro1.setColorArrow(new java.awt.Color(102, 153, 255));
        rSComboMetro1.setColorBorde(new java.awt.Color(255, 255, 255));
        rSComboMetro1.setColorFondo(new java.awt.Color(102, 153, 255));
        rSComboMetro1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rSComboMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSComboMetro1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSComboMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 310, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood Group");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        rSComboMetro2.setForeground(new java.awt.Color(0, 0, 0));
        rSComboMetro2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Male", " Female", " Others" }));
        rSComboMetro2.setColorArrow(new java.awt.Color(102, 153, 255));
        rSComboMetro2.setColorBorde(new java.awt.Color(255, 255, 255));
        rSComboMetro2.setColorFondo(new java.awt.Color(102, 153, 255));
        rSComboMetro2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rSComboMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSComboMetro2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSComboMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 310, 40));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle1.setText("DELETE");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 100, 50));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle2.setText("ADD");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 100, 50));

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle3.setText("CLEAR");
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 100, 50));

        rSMaterialButtonRectangle4.setBackground(new java.awt.Color(0, 51, 102));
        rSMaterialButtonRectangle4.setText("UPDATE");
        rSMaterialButtonRectangle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 100, 50));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jCTextField3.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField3.setPlaceholder("Enter Orphan's First Name...");
        jCTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 310, -1));

        rSDateChooser1.setColorBackground(new java.awt.Color(0, 51, 102));
        rSDateChooser1.setColorDiaActual(new java.awt.Color(67, 150, 209));
        rSDateChooser1.setFormatoFecha("yyyy-MM-dd");
        rSDateChooser1.setFuente(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rSDateChooser1.setPlaceholder(" Enter Orphan DOB...");
        jPanel1.add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 310, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        rSComboMetro3.setForeground(new java.awt.Color(0, 0, 0));
        rSComboMetro3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Male", " Female", " Others" }));
        rSComboMetro3.setColorArrow(new java.awt.Color(102, 153, 255));
        rSComboMetro3.setColorBorde(new java.awt.Color(255, 255, 255));
        rSComboMetro3.setColorFondo(new java.awt.Color(102, 153, 255));
        rSComboMetro3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rSComboMetro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSComboMetro3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSComboMetro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 310, 40));

        rSComboMetro4.setForeground(new java.awt.Color(0, 0, 0));
        rSComboMetro4.setColorArrow(new java.awt.Color(102, 153, 255));
        rSComboMetro4.setColorBorde(new java.awt.Color(255, 255, 255));
        rSComboMetro4.setColorFondo(new java.awt.Color(102, 153, 255));
        rSComboMetro4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rSComboMetro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSComboMetro4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSComboMetro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 310, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Room No");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 720));

        jPanel2.setBackground(new java.awt.Color(218, 239, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro1.setAutoCreateRowSorter(true);
        rSTableMetro1.setForeground(new java.awt.Color(153, 153, 153));
        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Age", "DOB", "Gender", "Blood Grp", "Status", "Room"
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
        if (rSTableMetro1.getColumnModel().getColumnCount() > 0) {
            rSTableMetro1.getColumnModel().getColumn(0).setMinWidth(70);
            rSTableMetro1.getColumnModel().getColumn(0).setMaxWidth(70);
            rSTableMetro1.getColumnModel().getColumn(3).setMinWidth(50);
            rSTableMetro1.getColumnModel().getColumn(3).setMaxWidth(50);
        }

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
        jLabel6.setText("Orphan Information");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 210, 5));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 840, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField1ActionPerformed

    private void jCTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField2ActionPerformed

    private void rSComboMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboMetro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSComboMetro1ActionPerformed

    private void rSComboMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboMetro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSComboMetro2ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:

        String fname = jCTextField3.getText();
        String lname = jCTextField1.getText();
        String fage = jCTextField2.getText();
        Date fdob = rSDateChooser1.getDatoFecha();

        long l1 = fdob.getTime();
        java.sql.Date cfdob = new java.sql.Date(l1);

        String fgender = rSComboMetro2.getSelectedItem().toString();
        String fblood = rSComboMetro1.getSelectedItem().toString();
        String froom = rSComboMetro4.getSelectedItem().toString();

        if (fname.equals("") || lname.equals("") || fage.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all attributes", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((!(Pattern.matches("^[0-9]+[0-9]+$", fage)))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid age", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            try {
                pst = con.prepareStatement("INSERT INTO orphan(firstname, lastname, age, dateofbirth, gender, bloodgroup, roomID) VALUES(?, ?, ?, ?, ?, ?, ?)");
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, fage);
                pst.setDate(4, cfdob);
                pst.setString(5, fgender);
                pst.setString(6, fblood);
                pst.setString(7, froom);

                int i = pst.executeUpdate();

                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Orphan Record Added");
                    jCTextField3.setText("");
                    jCTextField1.setText("");
                    jCTextField2.setText("");
                    rSDateChooser1.setDatoFecha(null);
                    rSComboMetro2.setSelectedIndex(0);
                    rSComboMetro1.setSelectedIndex(0);
                    rSComboMetro4.setSelectedIndex(0);
                    table();
                } else {
                    JOptionPane.showMessageDialog(this, "Record Failed to Add!!!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Orphan_frame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel d1 = (DefaultTableModel) rSTableMetro1.getModel();
        int SelectIndex = rSTableMetro1.getSelectedRow();

        String id = d1.getValueAt(SelectIndex, 0).toString();

        try {
            pst = con.prepareStatement("DELETE FROM orphan WHERE orphanID = ?");
            pst.setString(1, id);

            int i = pst.executeUpdate();

            if (i == 1) {
                JOptionPane.showMessageDialog(this, "Orphan Record Deleted");
                jCTextField3.setText("");
                jCTextField1.setText("");
                jCTextField2.setText("");
                rSDateChooser1.setDatoFecha(null);
                rSComboMetro2.setSelectedIndex(0);
                rSComboMetro1.setSelectedIndex(0);
                rSComboMetro4.setSelectedIndex(0);
                table();
                rSMaterialButtonRectangle2.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Record Failed to Delete!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Orphan_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
        jCTextField3.setText("");
        jCTextField1.setText("");
        jCTextField2.setText("");
        rSDateChooser1.setDatoFecha(null);
        rSComboMetro2.setSelectedIndex(0);
        rSComboMetro1.setSelectedIndex(0);
        rSComboMetro4.setSelectedIndex(0);
        table();
        rSMaterialButtonRectangle2.setEnabled(true);

    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void rSMaterialButtonRectangle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle4ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel d1 = (DefaultTableModel) rSTableMetro1.getModel();
        int SelectIndex = rSTableMetro1.getSelectedRow();

        String id = d1.getValueAt(SelectIndex, 0).toString();

        String fname = jCTextField3.getText();
        String lname = jCTextField1.getText();
        String fage = jCTextField2.getText();
        Date fdob = rSDateChooser1.getDatoFecha();

        long l1 = fdob.getTime();
        java.sql.Date cfdob = new java.sql.Date(l1);

        String fgender = rSComboMetro2.getSelectedItem().toString();
        String fblood = rSComboMetro1.getSelectedItem().toString();
        String froom = rSComboMetro4.getSelectedItem().toString();

        try {
            pst = con.prepareStatement("UPDATE orphan SET firstname = ?, lastname = ?, age = ?, dateofbirth = ?, gender = ?, bloodgroup = ?, roomID = ? WHERE orphanID = ?");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, fage);
            pst.setDate(4, cfdob);
            pst.setString(5, fgender);
            pst.setString(6, fblood);
            pst.setString(7, froom);
            pst.setString(8, id);
            int i = pst.executeUpdate();

            if (i == 1) {
                JOptionPane.showMessageDialog(this, "Orphan Record Updated");
                jCTextField3.setText("");
                jCTextField1.setText("");
                jCTextField2.setText("");
                rSDateChooser1.setDatoFecha(null);
                rSComboMetro2.setSelectedIndex(0);
                rSComboMetro1.setSelectedIndex(0);
                rSComboMetro4.setSelectedIndex(0);
                table();
                rSMaterialButtonRectangle2.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Record Failed to Update!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Orphan_frame.class.getName()).log(Level.SEVERE, null, ex);
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

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel d1 = (DefaultTableModel) rSTableMetro1.getModel();
        int SelectIndex = rSTableMetro1.getSelectedRow();

        jCTextField3.setText(d1.getValueAt(SelectIndex, 1).toString());
        jCTextField1.setText(d1.getValueAt(SelectIndex, 2).toString());
        jCTextField2.setText(d1.getValueAt(SelectIndex, 3).toString());
        //rSDateChooser1.setDatoFecha((Date) d1.getValueAt(SelectIndex, 4));
        rSComboMetro2.setSelectedItem(d1.getValueAt(SelectIndex, 5).toString());
        rSComboMetro1.setSelectedItem(d1.getValueAt(SelectIndex, 6).toString());
        rSComboMetro4.setSelectedItem(d1.getValueAt(SelectIndex, 7).toString());
        rSMaterialButtonRectangle2.setEnabled(false);
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    private void rSComboMetro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboMetro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSComboMetro3ActionPerformed

    private void rSComboMetro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboMetro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSComboMetro4ActionPerformed

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
            java.util.logging.Logger.getLogger(Orphan_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orphan_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orphan_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orphan_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orphan_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField jCTextField1;
    private app.bolivia.swing.JCTextField jCTextField2;
    private app.bolivia.swing.JCTextField jCTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojerusan.RSComboMetro rSComboMetro1;
    private rojerusan.RSComboMetro rSComboMetro2;
    private rojerusan.RSComboMetro rSComboMetro3;
    private rojerusan.RSComboMetro rSComboMetro4;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle4;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
