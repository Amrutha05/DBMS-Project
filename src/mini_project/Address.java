/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nayana
 */
public class Address extends javax.swing.JFrame {

    /**
     * Creates new form Address
     */
    private int Ad_order;
    
    private String Ad_uname;
    private String dis1,dis2,dis3,dis4,rest,mobb,pinn;
    private int ct1,pr1,ct2,pr2,ct3,pr3,ct4,pr4,amt,update;
    public Address() {
        initComponents();
    }
    public Address(String rname,int order,String uname,String D1, int C1, int P1, String D2, int C2, int P2, String D3, int C3, int P3, String D4, int C4, int P4,int total,int updat) {
        initComponents();
        Ad_uname=uname;
        Ad_order=order;
        dis1=D1;
        ct1=C1;
        pr1=P1;
        dis2=D2;
        ct2=C2;
        pr2=P2;
        dis3=D3;
        ct3=C3;
        pr3=P3;
        dis4=D4;
        ct4=C4;
        pr4=P4;
        amt=total;
        rest=rname;
        update=updat;
        //System.out.println(Ad_uname);
    }
    
    public Address(String rname,int order,String uname,String D1, int C1, int P1, String D2, int C2, int P2, String D3, int C3, int P3, String D4, int C4, int P4,int total) {
        initComponents();
        Ad_uname=uname;
        Ad_order=order;
        dis1=D1;
        ct1=C1;
        pr1=P1;
        dis2=D2;
        ct2=C2;
        pr2=P2;
        dis3=D3;
        ct3=C3;
        pr3=P3;
        dis4=D4;
        ct4=C4;
        pr4=P4;
        amt=total;
        rest=rname;
       // System.out.println(Ad_uname);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        house = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pin = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 34)); // NOI18N
        jLabel2.setText("Customer Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("NAME :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("MOBILE NO :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("HOUSE/FLAT/BLOCK NO :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 40));

        name.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 330, 50));

        mobile.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 330, 50));

        house.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseActionPerformed(evt);
            }
        });
        jPanel1.add(house, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 330, 50));

        jButton1.setFont(new java.awt.Font("Garamond", 3, 24)); // NOI18N
        jButton1.setText("PLACE ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("APARTMENT/ROAD/AREA :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 310, 40));

        area.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });
        jPanel1.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 330, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("CITY :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 100, 40));

        city.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 330, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setText("PIN CODE :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 130, -1));

        pin.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinKeyTyped(evt);
            }
        });
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 330, 50));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/Untitled.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseActionPerformed

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(name.getText().isEmpty() || mobile.getText().isEmpty() || house.getText().isEmpty() || area.getText().isEmpty() || city.getText().isEmpty() || pin.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        }
        mobb=mobile.getText();
        pinn=pin.getText();
        if(mobb.length()==10)
        {
            if(pinn.length()==6)
            {
                if(update==1)
                {
                    try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
                    String query="UPDATE address SET Name='"+name.getText()+"',Mobile='"+mobile.getText()+"',House='"+house.getText()+"',Area='"+area.getText()+"',City='"+city.getText()+"',Pin='"+pin.getText()+"' WHERE oid='"+Ad_order+"'";
                    PreparedStatement pst=con.prepareStatement(query);
                    //pst.setString(1, user);
                    //pst.setString(2, value);
                    int updateCount = pst.executeUpdate();
                    last_page lp1=new last_page(rest,Ad_order,name.getText(),mobile.getText(),house.getText(),area.getText(),city.getText(),pin.getText(),dis1,ct1,pr1,dis2,ct2,pr2,dis3,ct3,pr3,dis4,ct4,pr4,amt);
                    lp1.setVisible(true);
                    this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                }
                else
                {
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        String query="INSERT INTO address VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
                        PreparedStatement pst=con.prepareStatement(query);
                        pst.setInt(1, Ad_order);
                        pst.setString(2, Ad_uname);
                        pst.setString(3, name.getText());
                        pst.setString(4, mobile.getText());
                        pst.setString(5, house.getText());
                        pst.setString(6, area.getText());
                        pst.setString(7, city.getText());
                        pst.setString(8, pin.getText());
                        pst.execute();
                        last_page lp1=new last_page(rest,Ad_order,name.getText(),mobile.getText(),house.getText(),area.getText(),city.getText(),pin.getText(),dis1,ct1,pr1,dis2,ct2,pr2,dis3,ct3,pr3,dis4,ct4,pr4,amt);
                        lp1.setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    } 
                }
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Pin code should be of 6 digits"); 
            }
        }   
        else
        {
            JOptionPane.showMessageDialog(null,"Mobile number should be of 10 digits");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String query="delete from details where oid=?";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1, Ad_order);
            pst.execute();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        //Update_table();
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
        if(!(Character.isLetter(evt.getKeyChar()))){
                evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
        // TODO add your handling code here:
        if(!(Character.isDigit(evt.getKeyChar()))){
                evt.consume();
        }
    }//GEN-LAST:event_mobileKeyTyped

    private void pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyTyped
        // TODO add your handling code here:
         if(!(Character.isDigit(evt.getKeyChar()))){
                evt.consume();
        }
    }//GEN-LAST:event_pinKeyTyped

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
            java.util.logging.Logger.getLogger(Address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Address().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JTextField city;
    private javax.swing.JTextField house;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables

    
}
