/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.BanHang.jpThucDon;
import Interface.Run;
import Models.Loai;
import Models.ThucDon;
import Mysql.ConnectSQL;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jp_QLThucDon extends javax.swing.JPanel {
    ConnectSQL cn = new ConnectSQL();
    
    /**
     * Creates new form Jp_QLThucDon
     */
    public static Jp_QLThucDon td;
    public Jp_QLThucDon() {
        td = this;
        initComponents();
        Fillcbb();
        FillTable(null);
    }
    public void Fillcbb() {
        Vector Vcbb = cn.GetNhomMon();

        if (Vcbb != null) {
            DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel(Vcbb);
            cbbNhomMon_04.setModel(cbbmodel);
        } else {
            JOptionPane.showMessageDialog(null, "Không có nhóm nào !");
        }

    }    
    public void FillTable(String nhom) {
        ArrayList<ThucDon> arrTable = cn.GetThucDon(nhom);
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("Mã món");
        tbmodel.addColumn("Tên món");
        tbmodel.addColumn("Mã loại");
        tbmodel.addColumn("Đơn giá");
        tbmodel.addColumn("ĐVT");

        if (arrTable != null) {
            int somon = 0;
            for (ThucDon td : arrTable) {
                somon++;
                tbmodel.addRow(new Object[]{td.GetMaMon(), td.GetTenMon(), td.GetMaLoai(), td.GetDonGia(), td.GetDVT()});
            }
            lblThongTin_04.setText(String.valueOf(somon)+" món");

        } else {
            JOptionPane.showMessageDialog(null, "Không có thực đơn !");
        }
        tbBan.setModel(tbmodel);
        for(int i = 0; i < tbBan.getColumnCount();i++){
            Class<?> col = tbBan.getColumnClass(i);
            tbBan.setDefaultEditor(col, null);
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
        bntXoa_04 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bntThem_04 = new javax.swing.JButton();
        cbbNhomMon_04 = new javax.swing.JComboBox<>();
        lblThongTin_04 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bntSuaMon_04 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTim_04 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        bntXoa_04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntXoa_04.setForeground(new java.awt.Color(51, 0, 51));
        bntXoa_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/file_delete.png"))); // NOI18N
        bntXoa_04.setText("Xóa");
        bntXoa_04.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntXoa_04.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntXoa_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoa_04ActionPerformed(evt);
            }
        });

        tbBan.setForeground(new java.awt.Color(51, 0, 51));
        tbBan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBan);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Nhóm món:");

        bntThem_04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntThem_04.setForeground(new java.awt.Color(51, 0, 51));
        bntThem_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/file_add.png"))); // NOI18N
        bntThem_04.setText("Thêm");
        bntThem_04.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntThem_04.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntThem_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThem_04ActionPerformed(evt);
            }
        });

        cbbNhomMon_04.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbNhomMon_04.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbNhomMon_04ItemStateChanged(evt);
            }
        });

        lblThongTin_04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblThongTin_04.setForeground(new java.awt.Color(153, 0, 0));
        lblThongTin_04.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Tổng số món:");

        bntSuaMon_04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntSuaMon_04.setForeground(new java.awt.Color(51, 0, 51));
        bntSuaMon_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/document_edit.png"))); // NOI18N
        bntSuaMon_04.setText("Sửa");
        bntSuaMon_04.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntSuaMon_04.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntSuaMon_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSuaMon_04ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Quản lý thực đơn");

        txtTim_04.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTim_04KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tìm món:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbNhomMon_04, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTim_04, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntThem_04, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntSuaMon_04, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntXoa_04, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThongTin_04, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbNhomMon_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTim_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntThem_04, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntSuaMon_04, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntXoa_04, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblThongTin_04)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void tbBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbBanMouseClicked

    private void bntThem_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThem_04ActionPerformed
        Dl_Them_ThucDon td = new Dl_Them_ThucDon(Run.QlCafe, true);
        td.setVisible(true);
    }//GEN-LAST:event_bntThem_04ActionPerformed

    private void bntSuaMon_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaMon_04ActionPerformed
        int select=tbBan.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn món nào !");
        }else{
            String mamon = (String) tbBan.getValueAt(select, 0);
            Dl_Sua_ThucDon sua = new Dl_Sua_ThucDon(Run.QlCafe, true, mamon);
            sua.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_bntSuaMon_04ActionPerformed

    private void bntXoa_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoa_04ActionPerformed
        int[] selectedRows = tbBan.getSelectedRows();

        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn món nào !");
        } else {
            ArrayList<String> ListMaBan = new ArrayList<String>();
            String sp = "";
            for (int i : selectedRows) {
                String ma = (String) tbBan.getValueAt(i, 0);
                ListMaBan.add(ma);
                String tenban = (String) tbBan.getValueAt(i, 1);

                sp += tenban + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Xóa món: \n " + sp, "Xóa món", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean xoa = cn.DeleteThucDon(ListMaBan);
                if (xoa == true) {
                    FillTable(null);
                    try{
                        jpThucDon.td.FillLoai();
                        jpThucDon.td.updateUI();
                    }catch(Exception e){

                    }
                }else
                    JOptionPane.showMessageDialog(null, "Không xóa được món !");
            }
        }
    }//GEN-LAST:event_bntXoa_04ActionPerformed

    private void cbbNhomMon_04ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbNhomMon_04ItemStateChanged
        Loai selected = (Loai) cbbNhomMon_04.getSelectedItem();
        FillTable(selected.GetMaLoai());
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNhomMon_04ItemStateChanged

    private void txtTim_04KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTim_04KeyReleased
        
        ArrayList<ThucDon> arrTable = cn.SearchMon(txtTim_04.getText());
        if(arrTable != null){
            DefaultTableModel tbmodel = new DefaultTableModel();

            tbmodel.addColumn("Mã món");
            tbmodel.addColumn("Tên món");
            tbmodel.addColumn("Mã loại");
            tbmodel.addColumn("Đơn giá");
            tbmodel.addColumn("ĐVT");

            int somon = 0;
            for (ThucDon td : arrTable) {
                somon++;
                tbmodel.addRow(new Object[]{td.GetMaMon(), td.GetTenMon(), td.GetMaLoai(), td.GetDonGia(), td.GetDVT()});
                lblThongTin_04.setText(String.valueOf(somon)+" món");
            }
            tbBan.setModel(tbmodel);
            for(int i = 0; i < tbBan.getColumnCount();i++){
                Class<?> col = tbBan.getColumnClass(i);
                tbBan.setDefaultEditor(col, null);
            }
        }
    }//GEN-LAST:event_txtTim_04KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSuaMon_04;
    private javax.swing.JButton bntThem_04;
    private javax.swing.JButton bntXoa_04;
    private javax.swing.JComboBox<String> cbbNhomMon_04;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblThongTin_04;
    private javax.swing.JTable tbBan;
    private javax.swing.JTextField txtTim_04;
    // End of variables declaration//GEN-END:variables
}
