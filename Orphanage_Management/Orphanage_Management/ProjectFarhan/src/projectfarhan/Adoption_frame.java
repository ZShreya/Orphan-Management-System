package projectfarhan;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

public class Adoption_frame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    public Adoption_frame() {
        initComponents();
        
        ProjectFarhan cnt = new ProjectFarhan();
        cnt.connectDB();
        con = cnt.con;
    }
    
    public void getOrphanDetails()
    {
        int o_id = Integer.parseInt(jCTextField4.getText());
        try{
            pst=con.prepareStatement("select *from orphan where orphanID=?");
            pst.setInt(1,o_id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                jLabel9.setText(rs.getString("orphanID"));
                jLabel10.setText(rs.getString("firstname"));
                jLabel11.setText(rs.getString("age"));
                jLabel8.setText(rs.getString("gender"));
                jLabel3.setText("");
                
                jLabel18.setText("");
                jLabel19.setText("");
                jLabel20.setText("");
                jLabel17.setText("");
                jLabel25.setText("");
                        
            }
            else{
                jLabel3.setText("Invalid Orphan ID");
                jLabel9.setText("");
                jLabel10.setText("");
                jLabel11.setText("");
                jLabel8.setText("");
            }
            
                    
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    public void getAdopterDetails()
    {
        
        int a_id = Integer.parseInt(jCTextField1.getText());
        try{
            pst=con.prepareStatement("select *from adopter where adopterID=?");
            pst.setInt(1,a_id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                jLabel18.setText(rs.getString("adopterID"));
                jLabel19.setText(rs.getString("adoptername"));
                jLabel20.setText(rs.getString("phoneno"));
                jLabel17.setText(rs.getString("email"));
                jLabel25.setText(rs.getString("locality"));
                jLabel5.setText("");
                        
            }
            else{
                jLabel5.setText("Invalid Adopter ID");
                jLabel18.setText("");
                jLabel19.setText("");
                jLabel20.setText("");
                jLabel17.setText("");
                jLabel25.setText("");
            }
            
                    
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        jCTextField4 = new app.bolivia.swing.JCTextField();
        EnterBtn = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jPanel2 = new javax.swing.JPanel();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OMS - ADOPTION");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adopter's ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jCTextField1.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField1.setPlaceholder("Enter Valid Adopter ID...");
        jCTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCTextField1FocusLost(evt);
            }
        });
        jCTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 310, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adopted Orphan's ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jCTextField4.setBackground(new java.awt.Color(102, 153, 255));
        jCTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCTextField4.setPlaceholder("Enter Valid Orphan ID...");
        jCTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCTextField4FocusLost(evt);
            }
        });
        jCTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jCTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 310, -1));

        EnterBtn.setBackground(new java.awt.Color(0, 51, 102));
        EnterBtn.setText("ENTER");
        EnterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EnterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 210, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adoption Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        rSDateChooser1.setColorBackground(new java.awt.Color(0, 51, 102));
        rSDateChooser1.setColorDiaActual(new java.awt.Color(67, 150, 209));
        rSDateChooser1.setFuente(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rSDateChooser1.setPlaceholder(" Enter Adoption Date");
        jPanel1.add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 310, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 720));

        jPanel2.setBackground(new java.awt.Color(218, 239, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel6.setText("Adoption Information");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 210, 5));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Adopter's Information");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 190, 40));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 160, 40));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 160, 40));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 160, 40));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Adopter ID:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 40));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Adopter Name:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 40));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Adopter Phone:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 40));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Adopter Email:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 40));
        jLabel24.getAccessibleContext().setAccessibleName("Adopter Email:");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 190, 40));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Adopter Address:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 170, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 400, 520));

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Orphan's Information");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Orphan ID:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Orphan Name:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Orphan Age:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 40));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Orphan Gender:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 180, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, 520));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 840, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterBtnActionPerformed
        // TODO add your handling code here:
        int o_id = Integer.parseInt(jCTextField4.getText());
        int a_id = Integer.parseInt(jCTextField1.getText());
        Date adoptdate=rSDateChooser1.getDatoFecha();
        Long l1=adoptdate.getTime();
        java.sql.Date sadoptdate=new java.sql.Date(l1);
        try{
            String sql="update adopter set adoptiondate=?,orphanID=? where adopterID = ?";
             pst=con.prepareStatement(sql);
             pst.setDate(1,sadoptdate);
             pst.setInt(2,o_id);
             pst.setInt(3,a_id);
             
             int k= pst.executeUpdate();
             if(k==1)
            {
                JOptionPane.showMessageDialog(this,"ADDED");
               jCTextField4.setText("");
               jCTextField1.setText("");
                       
             
            }
            else 
            {
                JOptionPane.showMessageDialog(this,"FAILED");
            }
             
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        try {
            String sql="update orphan set adoptionstatus=? where orphanID = ?";
            pst=con.prepareStatement(sql);
            
            pst.setString(1,"Adopted");
            pst.setInt(2,o_id);
            
            int j = pst.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EnterBtnActionPerformed

    private void jCTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField4ActionPerformed

    private void jCTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField1ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
        close();
        Home_Frame h = new Home_Frame();
        h.setVisible(true);
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void jCTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCTextField4FocusLost
        // TODO add your handling code here:
        if(!jCTextField4.getText().equals (""))
        {
           getOrphanDetails(); 
        }
    }//GEN-LAST:event_jCTextField4FocusLost

    private void jCTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCTextField1FocusLost
        // TODO add your handling code here:
        if(!jCTextField1.getText().equals ("")){
            getAdopterDetails();
          }
    }//GEN-LAST:event_jCTextField1FocusLost

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
            java.util.logging.Logger.getLogger(Adoption_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adoption_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adoption_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adoption_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adoption_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle EnterBtn;
    private app.bolivia.swing.JCTextField jCTextField1;
    private app.bolivia.swing.JCTextField jCTextField4;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    // End of variables declaration//GEN-END:variables
}
