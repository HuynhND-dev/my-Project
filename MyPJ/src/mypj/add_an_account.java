/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyPJ;

/**
 *
 * @author lynnd
 */
public class add_an_account extends javax.swing.JFrame {

    /**
     * Creates new form add_an_account
     */
    public add_an_account() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB1_04 = new javax.swing.JLabel();
        txtUsername_04 = new javax.swing.JTextField();
        txtPass_04 = new javax.swing.JPasswordField();
        txtName_04 = new javax.swing.JTextField();
        jLabel2_04 = new javax.swing.JLabel();
        txtRePass_04 = new javax.swing.JPasswordField();
        jLabel3_04 = new javax.swing.JLabel();
        jLabel4_04 = new javax.swing.JLabel();
        jLabel5_04 = new javax.swing.JLabel();
        jScrollPane1_04 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd_04 = new javax.swing.JButton();
        btnDelete_04 = new javax.swing.JButton();
        btnUpdate_04 = new javax.swing.JButton();
        jLabel6_04 = new javax.swing.JLabel();
        jLabel7_04 = new javax.swing.JLabel();
        jLabel8_04 = new javax.swing.JLabel();
        jButton1_04 = new javax.swing.JButton();
        jLabel9_04 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LB1_04.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LB1_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nhanvien.png"))); // NOI18N
        LB1_04.setText("Quản lý tài khoản");

        txtUsername_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPass_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtName_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2_04.setText("Họ và Tên:");

        txtRePass_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3_04.setText("Tài khoản:");

        jLabel4_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4_04.setText("Mật khẩu:");

        jLabel5_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5_04.setText("Xác nhận mật khẩu:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Họ tên", "Tài Khoản"
            }
        ));
        jScrollPane1_04.setViewportView(jTable1);

        btnAdd_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnAdd_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_04ActionPerformed(evt);
            }
        });

        btnDelete_04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_delete.png"))); // NOI18N
        btnDelete_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_04ActionPerformed(evt);
            }
        });

        btnUpdate_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        btnUpdate_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_04ActionPerformed(evt);
            }
        });

        jLabel6_04.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6_04.setText("Thêm mới");

        jLabel7_04.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7_04.setText("Xóa tài khoản");

        jLabel8_04.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8_04.setText("Cập nhật");

        jButton1_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jButton1_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_04ActionPerformed(evt);
            }
        });

        jLabel9_04.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9_04.setText("Thoát");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4_04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5_04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3_04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2_04, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName_04)
                                    .addComponent(txtUsername_04)
                                    .addComponent(txtPass_04)
                                    .addComponent(txtRePass_04, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd_04, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel6_04, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete_04, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(btnUpdate_04, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7_04)
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel8_04)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(LB1_04, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1_04, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9_04, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB1_04)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2_04))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3_04)
                            .addComponent(txtUsername_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4_04)
                            .addComponent(txtPass_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5_04)
                            .addComponent(txtRePass_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd_04, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate_04, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete_04, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_04)
                            .addComponent(jLabel7_04)
                            .addComponent(jLabel8_04)))
                    .addComponent(jScrollPane1_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_04)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9_04)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_04ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnAdd_04ActionPerformed

    private void btnDelete_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_04ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDelete_04ActionPerformed

    private void btnUpdate_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_04ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnUpdate_04ActionPerformed

    private void jButton1_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_04ActionPerformed
        Home home=new Home();
            home.setVisible(true);
            this.dispose(); 
        
    }//GEN-LAST:event_jButton1_04ActionPerformed

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
            java.util.logging.Logger.getLogger(add_an_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_an_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_an_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_an_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_an_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB1_04;
    private javax.swing.JButton btnAdd_04;
    private javax.swing.JButton btnDelete_04;
    private javax.swing.JButton btnUpdate_04;
    private javax.swing.JButton jButton1_04;
    private javax.swing.JLabel jLabel2_04;
    private javax.swing.JLabel jLabel3_04;
    private javax.swing.JLabel jLabel4_04;
    private javax.swing.JLabel jLabel5_04;
    private javax.swing.JLabel jLabel6_04;
    private javax.swing.JLabel jLabel7_04;
    private javax.swing.JLabel jLabel8_04;
    private javax.swing.JLabel jLabel9_04;
    private javax.swing.JScrollPane jScrollPane1_04;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtName_04;
    private javax.swing.JPasswordField txtPass_04;
    private javax.swing.JPasswordField txtRePass_04;
    private javax.swing.JTextField txtUsername_04;
    // End of variables declaration//GEN-END:variables
}
