/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Nayana
 */
public class CART_Update extends javax.swing.JFrame {

    
    public CART_Update() {
        initComponents();   
    }
    private int c1,c2,c3,c4,p1,p2,p3,p4,od=-1;
    private String d1,d2,d3,d4,rest1,rest2;
    public CART_Update(String rname,int order,String dis1,int ct1,int pr1,String dis2,int ct2,int pr2,String dis3,int ct3,int pr3,String dis4,int ct4,int pr4) {
        initComponents();
        d1=dis1;
        c1=ct1;
        p1=pr1;
        d2=dis2;
        c2=ct2;
        p2=pr2;
        d3=dis3;
        c3=ct3;
        p3=pr3;
        d4=dis4;
        c4=ct4;
        p4=pr4;
        rest1=rname;
        od=order;
        if(c1>=1)
        {
            Dish_1.setText(d1);
            Quant_1.setText(String.valueOf(c1));
            Price_1.setText("Rs"+(c1*p1));
            
        }
         if(c2>=1)
        {
            Dish_2.setText(d2);
            Quant_2.setText(String.valueOf(c2));
            Price_2.setText("Rs"+(c2*p2));
            
        }
          if(c3>=1)
        {
            Dish_3.setText(d3);
            Quant_3.setText(String.valueOf(c3));
            Price_3.setText("Rs"+(c3*p3));
            
        }
           if(c4>=1)
        {
            Dish_4.setText(d4);
            Quant_4.setText(String.valueOf(c4));
            Price_4.setText("Rs"+(c4*p4));
        }
        order_id.setText(String.valueOf(od));
        
    }
    
    private int total=0;
    private int C1,C2,C3,C4,P1,P2,P3,P4,showMe,ord_ex;
    private String D1,D2,D3,D4,Ca_uname,rest,rno;
    public CART_Update(int ord,String rname,String uname,String Dish1,String Cnt1,String Price1,String Dish2,String Cnt2,String Price2,String Dish3,String Cnt3,String Price3,String Dish4,String Cnt4,String Price4) {
        initComponents();
        
        od=ord;
        order_id.setText(String.valueOf(od));
        if(Cnt1.equals(""))
        {
            C1=0;
            P1=0;
            D1="0";
        }
        else
        {
            C1=Integer.parseInt(Cnt1);
            D1=Dish1;
            P1=Integer.parseInt(Price1);
        }
        
        
        if(Cnt2.equals(""))
        {
            C2=0;
            P2=0;
            D2="0";
        }
        else
        {
            C2=Integer.parseInt(Cnt2);
            D2=Dish2;
            P2=Integer.parseInt(Price2);
        }
            
        
        if(Cnt3.equals(""))
        {
            C3=0;
            P3=0;
            D3="0";
        }
        else
        {
            C3=Integer.parseInt(Cnt3);
            D3=Dish3;
            P3=Integer.parseInt(Price3);
        }
            
        
        if(Cnt4.equals(""))
        {
            C4=0;
            P4=0;
            D4="0";
        }
        else
        {
            C4=Integer.parseInt(Cnt4);
            D4=Dish4;
            P4=Integer.parseInt(Price4);
        }
        
        
        if(C1>=1)
        {
            Dish_1.setText(Dish1);
            Quant_1.setText(Cnt1);
            Price_1.setText("Rs"+(C1*P1));
            
        }
        if(C2>=1)
        {
            Dish_2.setText(Dish2);
            Quant_2.setText(Cnt2);
            Price_2.setText("Rs"+(C2*P2));
        }
        if(C3>=1)
        {
            Dish_3.setText(Dish3);
            Quant_3.setText(Cnt3);
            Price_3.setText("Rs"+(C3*P3));
        }
        if(C4>=1)
        {
            Dish_4.setText(Dish4);
            Quant_4.setText(Cnt4);
            Price_4.setText("Rs"+(C4*P4));
        }
        total=((C1*P1)+(C2*P2)+(C3*P3)+(C4*P4));
        Ca_uname=uname;
            
        rno=rname;
        if(rno=="R01"){
            rest2="MAHARAJA RESTAURANT";
        }
        else if(rno=="R02"){
            rest2="DAWAT";
        }
        else if(rno=="R03"){
            rest2="TARTS AND BEANS";
        }
        else
            rest2="BON APPETIT";
        
        
    }
    
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        order_id = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sfghb = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Dish_1 = new javax.swing.JLabel();
        Dish_2 = new javax.swing.JLabel();
        Dish_3 = new javax.swing.JLabel();
        Dish_4 = new javax.swing.JLabel();
        Quant_1 = new javax.swing.JLabel();
        Quant_2 = new javax.swing.JLabel();
        Quant_3 = new javax.swing.JLabel();
        Quant_4 = new javax.swing.JLabel();
        Price_1 = new javax.swing.JLabel();
        Price_2 = new javax.swing.JLabel();
        Price_3 = new javax.swing.JLabel();
        Price_4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("CART");

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("ORDER ID :");

        order_id.setBackground(new java.awt.Color(0, 0, 0));
        order_id.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        order_id.setForeground(new java.awt.Color(204, 204, 255));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(order_id, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(order_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(24, 24, 24))
        );

        sfghb.setBackground(new java.awt.Color(204, 204, 255));
        sfghb.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("DISH NAME");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("QUANTITY");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("PRICE");

        Dish_1.setBackground(new java.awt.Color(255, 204, 204));
        Dish_1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Dish_2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Dish_3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Dish_4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Quant_1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Quant_2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Quant_3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Quant_4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sfghbLayout = new javax.swing.GroupLayout(sfghb);
        sfghb.setLayout(sfghbLayout);
        sfghbLayout.setHorizontalGroup(
            sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sfghbLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sfghbLayout.createSequentialGroup()
                        .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dish_2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dish_1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185)
                        .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Quant_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quant_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quant_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sfghbLayout.createSequentialGroup()
                        .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Dish_4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dish_3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185)
                        .addComponent(Quant_4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sfghbLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Price_1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        sfghbLayout.setVerticalGroup(
            sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sfghbLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Quant_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dish_1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dish_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quant_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sfghbLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Dish_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sfghbLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quant_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addGroup(sfghbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quant_4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dish_4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sfghb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(sfghb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
            String query="UPDATE details SET Rid='"+rno+"',Dish1='"+D1+"',Quantity1='"+C1+"',Price1='"+P1+"',Dish2='"+D2+"',Quantity2='"+C2+"',Price2='"+P2+"',Dish3='"+D3+"',Quantity3='"+C3+"',Price3='"+P3+"',Dish4='"+D4+"',Quantity4='"+C4+"',Price4='"+P4+"' WHERE oid='"+od+"'";
            PreparedStatement pst=con.prepareStatement(query);
            //pst.setString(1, user);
            //pst.setString(2, value);
            int updateCount = pst.executeUpdate();
            Address ad=new Address(rest2,od,Ca_uname,D1,C1,P1,D2,C2,P2,D3,C3,P3,D4,C4,P4,total,1);
            ad.setVisible(true);
            this.dispose();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        
               
                    
        
        
               
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(CART_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CART_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CART_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CART_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CART_Update().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Dish_1;
    private javax.swing.JLabel Dish_2;
    private javax.swing.JLabel Dish_3;
    private javax.swing.JLabel Dish_4;
    private javax.swing.JLabel Price_1;
    private javax.swing.JLabel Price_2;
    private javax.swing.JLabel Price_3;
    private javax.swing.JLabel Price_4;
    private javax.swing.JLabel Quant_1;
    private javax.swing.JLabel Quant_2;
    private javax.swing.JLabel Quant_3;
    private javax.swing.JLabel Quant_4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel order_id;
    private javax.swing.JPanel sfghb;
    // End of variables declaration//GEN-END:variables
}