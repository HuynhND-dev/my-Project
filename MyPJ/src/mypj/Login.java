/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyPJ;

import javax.swing.JOptionPane;


/**
 *
 * @author lynnd
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        txtpass_04 = new javax.swing.JPasswordField();
        btnlogin_04 = new javax.swing.JButton();
        btncancel_04 = new javax.swing.JButton();
        lb2_04 = new javax.swing.JLabel();
        lb1_04 = new javax.swing.JLabel();
        lb3_04 = new javax.swing.JLabel();
        txtuser_04 = new javax.swing.JTextField();
        Anhnen_04 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtpass_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 230, 40));

        btnlogin_04.setBackground(new java.awt.Color(51, 0, 255));
        btnlogin_04.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlogin_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        btnlogin_04.setText("Login");
        btnlogin_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 130, 40));

        btncancel_04.setBackground(new java.awt.Color(51, 0, 255));
        btncancel_04.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncancel_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        btncancel_04.setText("Cancel");
        btncancel_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel_04ActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 130, 40));

        lb2_04.setBackground(new java.awt.Color(0, 0, 0));
        lb2_04.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb2_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        lb2_04.setText("Username :");
        getContentPane().add(lb2_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, 40));

        lb1_04.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb1_04.setForeground(new java.awt.Color(153, 0, 153));
        lb1_04.setText("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ QUÁN CAFE");
        getContentPane().add(lb1_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 70));

        lb3_04.setBackground(new java.awt.Color(0, 0, 0));
        lb3_04.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb3_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/key.png"))); // NOI18N
        lb3_04.setText("Password :");
        getContentPane().add(lb3_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, 40));
        getContentPane().add(txtuser_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 230, 40));

        Anhnen_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cafe-cuoi-tuan-Taihinhanh-Vn (30).jpg"))); // NOI18N
        getContentPane().add(Anhnen_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 815, 666));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogin_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_04ActionPerformed
        if(txtuser_04.getText().equals("admin")&& txtpass_04.getText().equals("admin")){
            JOptionPane.showMessageDialog(this,"Xin chào quản lý!");
            this.dispose();
            Home home=new Home();
            home.setVisible(true);
        }
        else if(txtuser_04.getText().equals("")|| txtpass_04.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Tài khoản hoặc mật khẩu chưa nhập!");
    }                                       
        else {
            JOptionPane.showMessageDialog(this,"Tài khoản hoặc mật khẩu nhập sai. Nhập lại!");
        }
    }//GEN-LAST:event_btnlogin_04ActionPerformed

    private void btncancel_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel_04ActionPerformed
        JOptionPane.showMessageDialog(this,"Tạm Biệt!");
        this.dispose();              
    }//GEN-LAST:event_btncancel_04ActionPerformed

    /**
     * @param args the command line arguments
     */
    
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anhnen_04;
    private javax.swing.JButton btncancel_04;
    private javax.swing.JButton btnlogin_04;
    private javax.swing.JLabel lb1_04;
    private javax.swing.JLabel lb2_04;
    private javax.swing.JLabel lb3_04;
    private javax.swing.JPasswordField txtpass_04;
    private javax.swing.JTextField txtuser_04;
    // End of variables declaration//GEN-END:variables
}
