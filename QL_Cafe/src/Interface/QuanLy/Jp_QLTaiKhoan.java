/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.Run;
import Models.TaiKhoan;
import Mysql.ConnectSQL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jp_QLTaiKhoan extends javax.swing.JPanel {
    ConnectSQL cn = new ConnectSQL();
    /**
     * Creates new form Jp_QLNhanVien
     */
    public static Jp_QLTaiKhoan tk;
    public Jp_QLTaiKhoan() {
        initComponents();
        tk = this;
        FillTable();
    }
    public void FillTable() {
        ArrayList<TaiKhoan> arrTable = cn.GetTaiKhoan();
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("ID");
        tbmodel.addColumn("Tên tài khoản");
        tbmodel.addColumn("Mật khẩu");
         

        if (arrTable != null) {
            int soban = 0;
            for (TaiKhoan b : arrTable) {
                soban++;
                tbmodel.addRow(new Object[]{b.GetID(), b.GetUsername(), b.GetPassword()});
            }
            lblthongtin_01.setText(String.valueOf(soban)+" tài khoản");
        } else {
            JOptionPane.showMessageDialog(null, "Không có tài khoản !");
        }
        tbBan_01.setModel(tbmodel);
        for(int i = 0; i < tbBan_01.getColumnCount();i++){
            Class<?> col = tbBan_01.getColumnClass(i);
            tbBan_01.setDefaultEditor(col, null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan_01 = new javax.swing.JTable();
        bntThem_01 = new javax.swing.JButton();
        bntSua_01 = new javax.swing.JButton();
        bntXoa_01 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblthongtin_01 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        tbBan_01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBan_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBan_01MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBan_01);

        bntThem_01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntThem_01.setForeground(new java.awt.Color(51, 51, 0));
        bntThem_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/file_add.png"))); // NOI18N
        bntThem_01.setText("Thêm");
        bntThem_01.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntThem_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThem_01ActionPerformed(evt);
            }
        });

        bntSua_01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntSua_01.setForeground(new java.awt.Color(51, 51, 0));
        bntSua_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/document_edit.png"))); // NOI18N
        bntSua_01.setText("Sửa");
        bntSua_01.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntSua_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSua_01ActionPerformed(evt);
            }
        });

        bntXoa_01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntXoa_01.setForeground(new java.awt.Color(51, 51, 0));
        bntXoa_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/file_delete.png"))); // NOI18N
        bntXoa_01.setText("Xóa");
        bntXoa_01.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntXoa_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoa_01ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Quản lý tài khoản");

        lblthongtin_01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblthongtin_01.setForeground(new java.awt.Color(153, 0, 0));
        lblthongtin_01.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Tổng số tài khoản");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblthongtin_01))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntThem_01, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntSua_01, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntXoa_01, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntThem_01, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntSua_01, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntXoa_01, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblthongtin_01)))
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbBan_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBan_01MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbBan_01MouseClicked

    private void bntThem_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThem_01ActionPerformed
        DL_Them_TaiKhoan ban = new DL_Them_TaiKhoan(Run.QlCafe, true);
        ban.setVisible(true);
    }//GEN-LAST:event_bntThem_01ActionPerformed

    private void bntSua_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_01ActionPerformed
        int select=tbBan_01.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn !");
        }else{
            int MaBan = (int) tbBan_01.getValueAt(select, 0);
            DL_Sua_TaiKhoan sua = new DL_Sua_TaiKhoan(Run.QlCafe, true, MaBan);
            sua.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_bntSua_01ActionPerformed

    private void bntXoa_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoa_01ActionPerformed
        int[] selectedRows = tbBan_01.getSelectedRows();

        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa tài khoản !");
        } else {
            ArrayList<Integer> ListMaBan = new ArrayList<Integer>();
            String sp = "";
            for (int i : selectedRows) {
                int ma = (int) tbBan_01.getValueAt(i, 0);
                ListMaBan.add(ma);
                String tenban = (String) tbBan_01.getValueAt(i, 1);

                sp += tenban + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Xóa tài khoản: \n " + sp, "Xóa tài khoản", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean xoa = cn.DeleteTaiKhoan(ListMaBan);

                if (xoa == true) {
                    FillTable();
 
                }else
                JOptionPane.showMessageDialog(null, "Không xóa được tài khoản !");

            }
        }
    }//GEN-LAST:event_bntXoa_01ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua_01;
    private javax.swing.JButton bntThem_01;
    private javax.swing.JButton bntXoa_01;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblthongtin_01;
    private javax.swing.JTable tbBan_01;
    // End of variables declaration//GEN-END:variables
}
