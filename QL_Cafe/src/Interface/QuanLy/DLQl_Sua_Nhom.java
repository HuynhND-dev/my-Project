/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.BanHang.jpThucDon;
import Models.Loai;
import Mysql.ConnectSQL;
import javax.swing.JOptionPane;



public class DLQl_Sua_Nhom extends javax.swing.JDialog {
    ConnectSQL cn = new ConnectSQL();
    String mausac, MaNhom;
    public DLQl_Sua_Nhom(java.awt.Frame parent, boolean modal, String manhom) {
        super(parent, modal);
        initComponents();
        MaNhom = manhom;
        Loai l = cn.GetLoaiByMa(manhom);
        txtTen_04.setText(l.GetTenLoai());
        lblten.setText("Sửa nhóm - "+l.GetTenLoai());      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblten = new javax.swing.JLabel();
        btnCancer_04 = new javax.swing.JButton();
        txtTen_04 = new javax.swing.JTextField();
        btnOk_04 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tên loại:");

        lblten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblten.setForeground(new java.awt.Color(51, 0, 51));
        lblten.setText("Sửa nhóm");

        btnCancer_04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancer_04.setForeground(new java.awt.Color(51, 0, 51));
        btnCancer_04.setText("Hủy bỏ");
        btnCancer_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancer_04ActionPerformed(evt);
            }
        });

        btnOk_04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOk_04.setForeground(new java.awt.Color(51, 0, 51));
        btnOk_04.setText("Xác nhận");
        btnOk_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk_04ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnOk_04)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancer_04, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTen_04, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblten)))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblten)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk_04, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancer_04, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancer_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancer_04ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancer_04ActionPerformed

    private void btnOk_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk_04ActionPerformed
        if(txtTen_04.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tên loại không được để trống !");
            txtTen_04.requestFocus();
            return;
        }
        
        Loai loai = new Loai();
        loai.SetTenLoai(txtTen_04.getText());
        loai.SetMaLoai(MaNhom);
        int update = cn.UpdateLoai(loai);
        if(update > 0){
            Jp_QLNhomMon.nhom.FillTable();
            Jp_QLNhomMon.nhom.updateUI();
            try{
                Jp_QLThucDon.td.Fillcbb();
                Jp_QLThucDon.td.FillTable(null);
                Jp_QLThucDon.td.updateUI();
                jpThucDon.td.FillLoai();
                jpThucDon.td.updateUI();
            }catch(Exception e){

            }
            this.dispose();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnOk_04ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancer_04;
    private javax.swing.JButton btnOk_04;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblten;
    private javax.swing.JTextField txtTen_04;
    // End of variables declaration//GEN-END:variables
}
