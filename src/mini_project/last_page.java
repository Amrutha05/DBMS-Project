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
public class last_page extends javax.swing.JFrame {

    /**
     * Creates new form last_page
     */
    private String nam,mob,hou,ar,cit,pi,D1,D2,D3,D4,nam1,mob1,hou1,ar1,cit1,pi1,res,RID1,exam;
    private int C1,P1,C2,C3,P3,P2,C4,P4,amt,pay,ord,tot,payment1;
    public last_page() {
        initComponents();
    }
    public last_page(int Ad_order) {
        initComponents();
        
        ord=Ad_order;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
            Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
            String query1="SELECT Rid,Dish1,Quantity1,Price1,Dish2,Quantity2,Price2,Dish3,Quantity3,Price3,Dish4,Quantity4,Price4,Total FROM details WHERE oid=? ";
            String query2="SELECT Name,Mobile,House,Area,City,Pin FROM address WHERE oid=? ";
            PreparedStatement pst1=con1.prepareStatement(query1);
            PreparedStatement pst2=con2.prepareStatement(query2);
            pst1.setInt(1, ord);
            pst2.setInt(1, ord);
            ResultSet rs=pst1.executeQuery();
            ResultSet rs1=pst2.executeQuery();
          
            while(rs.next()){
                RID1=rs.getString("Rid");
                D1=rs.getString("Dish1");
                C1=rs.getInt("Quantity1");
                P1=rs.getInt("Price1");
                D2=rs.getString("Dish2");
                C2=rs.getInt("Quantity2");
                P2=rs.getInt("Price2");
                D3=rs.getString("Dish3");
                C3=rs.getInt("Quantity3");
                P3=rs.getInt("Price3");
                D4=rs.getString("Dish4");
                C4=rs.getInt("Quantity4");
                P4=rs.getInt("Price4");
                tot=rs.getInt("Total");
                if(C1>=1)
                {
                    Dish_1.setText(D1);
                    Cnt_1.setText(String.valueOf(C1));
                    Price_1.setText("Rs"+(C1*P1));
                }
                if(C2>=1)
                {
                    Dish_2.setText(D2);
                    Cnt_2.setText(String.valueOf(C2));
                    Price_2.setText("Rs"+(C2*P2));
                }
                if(C3>=1)
                {
                    Dish_3.setText(D3);
                    Cnt_3.setText(String.valueOf(C3));
                    Price_3.setText("Rs"+(C3*P3));
                }
                if(C4>=1)
                {
                    Dish_4.setText(D4);
                    Cnt_4.setText(String.valueOf(C4));
                    Price_4.setText("Rs"+(C4*P4));
                }
                tot_cost.setText(String.valueOf(tot));
                payment1=tot+50;
                payment.setText(String.valueOf(payment1));
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
                    String query3="SELECT Rname FROM restaurant WHERE Rid=?";
                    PreparedStatement pst3=con3.prepareStatement(query3);
                    pst3.setString(1, RID1);
                    ResultSet rs2=pst3.executeQuery();
                    while(rs2.next())
                    {
                        exam=rs2.getString("Rname");
                        restaurant.setText(exam);
                    }
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            while(rs1.next())
            {
                nam1=rs1.getString("Name");
                mob1=rs1.getString("Mobile");
                hou1=rs1.getString("House");
                ar1=rs1.getString("Area");
                cit1=rs1.getString("City");
                pi1=rs1.getString("Pin");
                addrs.setText("<html>"+nam1+"<br/>"+mob1+"<br/>"+hou1+"<br/>"+ar1+"<br/>"+cit1+"<br/>"+pi1+"</html>");
            }
            
      
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public last_page(String rest,int Ad_order,String name,String mobile,String house,String area,String city,String pin,String Dish1,int Cnt1,int Price1,String Dish2,int Cnt2,int Price2,String Dish3,int Cnt3,int Price3,String Dish4,int Cnt4,int Price4,int total) {
        initComponents();
        nam=name;
        mob=mobile;
        hou=house;
        ar=area;
        cit=city;
        pi=pin;
        D1=Dish1;
        C1=Cnt1;
        P1=Price1;
        D2=Dish2;
        C2=Cnt2;
        P2=Price2;
        D3=Dish3;
        C3=Cnt3;
        P3=Price3;
        D4=Dish4;
        C4=Cnt4;
        P4=Price4;
        ord=Ad_order;
        res=rest;
        amt=total;
        pay=total+50;
        addrs.setText("<html>"+nam+"<br/>"+mob+"<br/>"+hou+"<br/>"+ar+"<br/>"+cit+"<br/>"+pi+"</html>");
        if(C1>=1)
        {
            Dish_1.setText(D1);
            Cnt_1.setText(String.valueOf(C1));
            Price_1.setText(String.valueOf(P1));
        }
        if(C2>=1)
        {
            Dish_2.setText(D2);
            Cnt_2.setText(String.valueOf(C2));
            Price_2.setText(String.valueOf(P2));
        }
        if(C3>=1)
        {
            Dish_3.setText(D3);
            Cnt_3.setText(String.valueOf(C3));
            Price_3.setText(String.valueOf(P3));
        }
        if(C4>=1)
        {
            Dish_4.setText(D4);
            Cnt_4.setText(String.valueOf(C4));
            Price_4.setText(String.valueOf(P4));
        }
        tot_cost.setText(String.valueOf(amt));
        payment.setText(String.valueOf(pay));
        if(res=="R01"){
            restaurant.setText("MAHARAJA RESTAURANT");
        }
        else if(res=="R02"){
            restaurant.setText("DAWAT");
        }
        else if(res=="R03"){
            restaurant.setText("TARTS AND BEANS");
        }
        else{
            restaurant.setText("BON APPETIT");
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addrs = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Dish_1 = new javax.swing.JLabel();
        Dish_2 = new javax.swing.JLabel();
        Dish_3 = new javax.swing.JLabel();
        Dish_4 = new javax.swing.JLabel();
        Cnt_1 = new javax.swing.JLabel();
        Cnt_2 = new javax.swing.JLabel();
        Cnt_3 = new javax.swing.JLabel();
        Cnt_4 = new javax.swing.JLabel();
        Price_1 = new javax.swing.JLabel();
        Price_2 = new javax.swing.JLabel();
        Price_3 = new javax.swing.JLabel();
        Price_4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tot_cost = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        restaurant = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Garamond", 3, 30)); // NOI18N
        jLabel1.setText("ORDER DESCRIPTION");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Restaurant name:");

        addrs.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel4.setText("DISH");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel5.setText("QUANTITY");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel6.setText("PRICE");

        Dish_1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Dish_2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Dish_3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Dish_4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Cnt_1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Cnt_2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Cnt_3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Cnt_4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        Price_4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel19.setText("TOTAL");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel20.setText("DELIVERY CHARGES");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel21.setText("AMOUNT TO BE PAID");

        jButton1.setFont(new java.awt.Font("Garamond", 3, 24)); // NOI18N
        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tot_cost.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel23.setText("50");

        payment.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel3.setText("Rs.");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel7.setText("Rs.");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel8.setText("Rs.");

        restaurant.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel10.setText("Your order will be delivered to following address");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dish_1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dish_2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dish_3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dish_4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cnt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cnt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cnt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cnt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Price_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(Price_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Price_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Price_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tot_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addrs, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(restaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restaurant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(addrs, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Price_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnt_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dish_1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cnt_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Price_2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(Dish_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Price_3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(Dish_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(Cnt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Dish_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Price_4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                            .addComponent(Cnt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tot_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         thanku t1=new thanku(ord);
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String query1="delete from address where oid=?";
            String query2="delete from details where oid=?";
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
            Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root","");
            PreparedStatement pst1=con1.prepareStatement(query1);
            PreparedStatement pst2=con2.prepareStatement(query2);
            pst1.setInt(1, ord);
            pst2.setInt(1, ord);
            pst1.execute();
            pst2.execute();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        //Update_table();
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(last_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(last_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(last_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(last_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new last_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cnt_1;
    private javax.swing.JLabel Cnt_2;
    private javax.swing.JLabel Cnt_3;
    private javax.swing.JLabel Cnt_4;
    private javax.swing.JLabel Dish_1;
    private javax.swing.JLabel Dish_2;
    private javax.swing.JLabel Dish_3;
    private javax.swing.JLabel Dish_4;
    private javax.swing.JLabel Price_1;
    private javax.swing.JLabel Price_2;
    private javax.swing.JLabel Price_3;
    private javax.swing.JLabel Price_4;
    private javax.swing.JLabel addrs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel payment;
    private javax.swing.JLabel restaurant;
    private javax.swing.JLabel tot_cost;
    // End of variables declaration//GEN-END:variables
}
