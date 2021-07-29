
package Test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class ManageCategory extends javax.swing.JFrame {
    
    Connection con =null;
    Statement stmt =null;
    ResultSet rs=null;
    PreparedStatement preparedstmt=null;
    
    public ManageCategory() {
        initComponents();
        
        //set page center of the screen
        Toolkit toolkit =getToolkit();
        Dimension size =toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        //database connect
        con=DatabaseConnecting.conection();
        dataLoad();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cidbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cnamebox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cdescbox = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categorytable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sales = new javax.swing.JButton();
        product = new javax.swing.JButton();
        cashier = new javax.swing.JButton();
        income = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Category ID");

        cidbox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Category Name");

        cnamebox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Description");

        cdescbox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(102, 0, 102));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(102, 0, 102));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(102, 0, 102));
        update.setText("EDIT");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(102, 0, 102));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cidbox)
                            .addComponent(cnamebox)
                            .addComponent(cdescbox, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(delete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnamebox, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cdescbox, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(update)
                    .addComponent(add))
                .addGap(47, 47, 47)
                .addComponent(clear)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        categorytable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        categorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        categorytable.setRowHeight(20);
        categorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorytableMouseClicked(evt);
            }
        });
        categorytable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categorytableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(categorytable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE CATEGORY");

        sales.setBackground(new java.awt.Color(102, 0, 102));
        sales.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setText("SALES");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });

        product.setBackground(new java.awt.Color(102, 0, 102));
        product.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        product.setForeground(new java.awt.Color(255, 255, 255));
        product.setText("PRODUCT");
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });

        cashier.setBackground(new java.awt.Color(102, 0, 102));
        cashier.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cashier.setForeground(new java.awt.Color(255, 255, 255));
        cashier.setText("CASHIER");
        cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierActionPerformed(evt);
            }
        });

        income.setBackground(new java.awt.Color(102, 0, 102));
        income.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        income.setForeground(new java.awt.Color(255, 255, 255));
        income.setText("INCOME");
        income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashier, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sales)
                    .addComponent(product)
                    .addComponent(cashier)
                    .addComponent(income))
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void dataLoad(){
        try {
            String query ="SELECT ca_id,ca_name,ca_description FROM category";
            preparedstmt=con.prepareStatement(query);
            rs=preparedstmt.executeQuery();
            categorytable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void selectData(){
        int rows=categorytable.getSelectedRow();
        
        String cid = categorytable.getValueAt(rows, 0).toString();
        String cname =categorytable.getValueAt(rows, 1).toString();
        String cdesc=categorytable.getValueAt(rows, 2).toString();
        
        cidbox.setText(cid);
        cnamebox.setText(cname);
        cdescbox.setText(cdesc);
        
    }
    public void reset(){
        cidbox.setText("");
        cnamebox.setText("");
        cdescbox.setText("");
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            
            stmt=con.createStatement();
            
            int cid=Integer.parseInt(cidbox.getText());
            String cname =cnamebox.getText();
            String cdisc=cdescbox.getText();
            
            String query ="INSERT INTO category(ca_id,ca_name,ca_description) VALUES(?,?,?)";
            
            preparedstmt=con.prepareStatement(query);
            
            preparedstmt.setInt(1, cid);
            preparedstmt.setString(2, cname);
            preparedstmt.setString(3, cdisc);
            
            preparedstmt.execute();
            JOptionPane.showMessageDialog(null, "Add successful");
            reset();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        dataLoad();
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            stmt=con.createStatement();
            
            int cid=Integer.parseInt(cidbox.getText());
            
            String query="DELETE FROM category WHERE ca_id='"+cid+"'";
            
            stmt.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Delete successful");
            reset();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        dataLoad();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            
            stmt=con.createStatement();
            
            int cid=Integer.parseInt(cidbox.getText());
            
            String cname =cnamebox.getText();
            String cdesc=cdescbox.getText();
            
            String query ="UPDATE category SET ca_name=?,ca_description=? WHERE ca_id=?";
            
            preparedstmt=con.prepareStatement(query);
            
            preparedstmt.setString(1, cname);
            preparedstmt.setString(2, cdesc);
            preparedstmt.setInt(3, cid);
            
            preparedstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update successful");
            reset();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        dataLoad();
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        reset();
    }//GEN-LAST:event_clearActionPerformed

    private void categorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorytableMouseClicked
        selectData();
    }//GEN-LAST:event_categorytableMouseClicked

    private void categorytableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorytableKeyPressed
        selectData();
    }//GEN-LAST:event_categorytableKeyPressed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        setVisible(false);
        ManageProduct view=new ManageProduct();
        view.setVisible(true);
    }//GEN-LAST:event_productActionPerformed

    private void cashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierActionPerformed
        setVisible(false);
        ManageCashier view=new ManageCashier();
        view.setVisible(true);
    }//GEN-LAST:event_cashierActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        setVisible(false);
        SalesPage view=new SalesPage();
        view.setVisible(true);
    }//GEN-LAST:event_salesActionPerformed

    private void incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeActionPerformed
        setVisible(false);
        Income view=new Income();
        view.setVisible(true);
    }//GEN-LAST:event_incomeActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cashier;
    private javax.swing.JTable categorytable;
    private javax.swing.JTextField cdescbox;
    private javax.swing.JTextField cidbox;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cnamebox;
    private javax.swing.JButton delete;
    private javax.swing.JButton income;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton product;
    private javax.swing.JButton sales;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
