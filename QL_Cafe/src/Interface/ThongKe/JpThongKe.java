/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ThongKe;

import Models.Ban;
import Models.DsOrder;
import Models.HoaDon;
import Models.Loai;
import Models.TaiKhoan;
import Models.ThucDon;
import Mysql.ConnectSQL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public final class JpThongKe extends javax.swing.JPanel {
    ConnectSQL cn = new ConnectSQL();
    /**
     * Creates new form JpThongKe
     */
    NumberFormat chuyentien = new DecimalFormat("#,###,###");
    public JpThongKe() {
        initComponents();
        FillTableHD();
        FillTableMon();
        loadinfo();

        
    }
    public void loadinfo(){
        ArrayList<Ban> arrTable = cn.GetBan(0);
        if (arrTable.size()>0) {
            int soban = 0;
            for (Ban b : arrTable) {
                soban++;
            }
            lbltongban_59.setText(String.valueOf(soban));
         }
        ArrayList<Loai> loai = cn.GetLoai();
        if (arrTable.size() >0) {
            int soban = 0;
            for (Loai b : loai) {
                soban++;
            }
            lbltongloai_59.setText(String.valueOf(soban));
         }
        ArrayList<ThucDon> td = cn.GetThucDon(null);
        if (arrTable.size() >0) {
            int soban = 0;
            for (ThucDon b : td) {
                soban++;
            }
            lbltongmon.setText(String.valueOf(soban));
         }
        ArrayList<TaiKhoan> tk = cn.GetTaiKhoan();
        if (arrTable.size() >0) {
            int soban = 0;
            for (TaiKhoan b : tk) {
                soban++;
            }
            lbltaikhoan_59.setText(String.valueOf(soban));
         }        
    }
    public void FillTableHD() {
        ArrayList<HoaDon> arrTable = cn.GetDSHD();
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("Mã hóa đơn");
        tbmodel.addColumn("Thời gian");
        tbmodel.addColumn("Tiền món");
        tbmodel.addColumn("Giảm giá");
        tbmodel.addColumn("Thành tiền");
        tbmodel.addColumn("Điểm bán");
        tbmodel.addColumn("Các món");
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
        if (arrTable.size() >0) {
            int hd = 0, tongtien=0, tongtienmon =0,giam=0, tonggiam =0;
            for (HoaDon td : arrTable) {
                hd++;
                tongtien += td.GetTongTien();
                String tenban = cn.GetBan(td.GetMaBan()).get(0).GetTenBan();
                ArrayList<DsOrder> order = cn.GetDsOrder(td.GetMaHD());
                String cacmon = "";
                int tienmon =0;
                for(DsOrder ds : order){
                    tienmon += ds.GetGia() * ds.GetSoLuong();
                    cacmon += ds.GetTenMon()+"("+ds.GetSoLuong()+")"+", ";
                }
                tongtienmon += tienmon;
                   
                    String dv = "";
                    if(td.GetGiamGia() >100){
                        giam = td.GetGiamGia();
                    }
                    if(td.GetGiamGia() == 0){
                        giam = 0;
                    }
                    if(td.GetGiamGia() <=100 && td.GetGiamGia() != 0){
                        giam = td.GetGiamGia() * tienmon / 100;
                        dv = "("+String.valueOf(td.GetGiamGia())+"%)";
                    }
                    tonggiam += giam;
                tbmodel.addRow(new Object[]{td.GetMaHD(), sf.format(td.GetGioDen()), chuyentien.format(tienmon), chuyentien.format(giam)+dv , chuyentien.format(td.GetTongTien()), tenban, cacmon});
            }
//            lblgiam.setText(chuyentien.format(tonggiam)+" VNĐ");
            lblTienMon_59.setText(chuyentien.format(tongtienmon)+" VNĐ");
            lbltienthu_59.setText(chuyentien.format(tongtienmon)+" VNĐ");
            lblHD_59.setText(String.valueOf(hd)+" hóa đơn");

        }
        tbaleHD_59.setModel(tbmodel);
        for(int i = 0; i < tbaleHD_59.getColumnCount();i++){
            Class<?> col = tbaleHD_59.getColumnClass(i);
            tbaleHD_59.setDefaultEditor(col, null);
        }   
        tbaleHD_59.getColumnModel().getColumn(0).setMaxWidth(100);
        tbaleHD_59.getColumnModel().getColumn(1).setMinWidth(130);
        tbaleHD_59.getColumnModel().getColumn(1).setMaxWidth(130);
        tbaleHD_59.getColumnModel().getColumn(2).setMaxWidth(100);
        tbaleHD_59.getColumnModel().getColumn(3).setMaxWidth(100);
        tbaleHD_59.getColumnModel().getColumn(4).setMaxWidth(100);
        tbaleHD_59.getColumnModel().getColumn(5).setMaxWidth(100);
    } 
    public void FillTableMon() {
        ArrayList<ThucDon> arrTable = cn.GetChiTietMonByMa();
        
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("Tên món");
        tbmodel.addColumn("Đơn vị tính");
        tbmodel.addColumn("Số lượng");
        tbmodel.addColumn("Doanh thu");
        if (arrTable != null) {
            
            int somon = 0,tienmon=0;
            for (ThucDon td : arrTable) {
                ArrayList<DsOrder> ct = cn.GetGiaSoLuong(td.GetMaMon());
                if(cn.GetGiaSoLuong(td.GetMaMon()).size() > 0){
                    int gia =0,soluong =0;
                     for(DsOrder i : ct){
                         somon += i.GetSoLuong();
                         soluong += i.GetSoLuong();
                         gia += i.GetGia() * i.GetSoLuong();
                     }
                     tienmon += gia;
                         tbmodel.addRow(new Object[]{ct.get(0).GetTenMon(), ct.get(0).GetDVT(), soluong, chuyentien.format(gia)+" VNĐ"});
                }
            }
            lblMon_59.setText(String.valueOf(somon)+" món");

        } else {
        }
        tbMon_59.setModel(tbmodel);
        for(int i = 0; i < tbMon_59.getColumnCount();i++){
            Class<?> col = tbMon_59.getColumnClass(i);
            tbMon_59.setDefaultEditor(col, null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMon_59 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbaleHD_59 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblHD_59 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMon_59 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltienthu_59 = new javax.swing.JLabel();
        lblTienMon_59 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltongban_59 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbltongmon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbltongloai_59 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbltaikhoan_59 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setForeground(new java.awt.Color(162, 11, 11));

        tbMon_59.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên món", "Đơn vị tính", "Số lượng", "Doanh thu"
            }
        ));
        jScrollPane1.setViewportView(tbMon_59);

        tbaleHD_59.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Thời gian", "Tiền món", "Giảm giá", "Thành tiền", "Điểm bán", "Các món"
            }
        ));
        jScrollPane2.setViewportView(tbaleHD_59);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tổng số hóa đơn thanh toán:");

        lblHD_59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHD_59.setForeground(new java.awt.Color(82, 15, 172));
        lblHD_59.setText(".....");

        jLabel2.setText("Tổng số món đã bán:");

        lblMon_59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMon_59.setForeground(new java.awt.Color(10, 85, 157));
        lblMon_59.setText(".....");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tiền thu về:");

        lbltienthu_59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltienthu_59.setForeground(new java.awt.Color(162, 11, 11));
        lbltienthu_59.setText(".....");

        lblTienMon_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTienMon_59.setForeground(new java.awt.Color(162, 11, 11));
        lblTienMon_59.setText("....");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tiền món:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tổng số bàn: ");

        lbltongban_59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltongban_59.setForeground(new java.awt.Color(17, 131, 40));
        lbltongban_59.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Tổng số món:");

        lbltongmon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltongmon.setForeground(new java.awt.Color(17, 131, 40));
        lbltongmon.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tổng số loại:");

        lbltongloai_59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltongloai_59.setForeground(new java.awt.Color(17, 131, 40));
        lbltongloai_59.setText("jLabel7");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Tổng số tài khoản:");

        lbltaikhoan_59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltaikhoan_59.setForeground(new java.awt.Color(17, 131, 40));
        lbltaikhoan_59.setText("jLabel7");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(172, 0, 5));
        jLabel11.setText("Thống kê theo món");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Thống kê theo hóa đơn");

        jSeparator1.setForeground(new java.awt.Color(23, 12, 132));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblTienMon_59, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                                .addGap(44, 44, 44))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbltienthu_59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(94, 94, 94))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHD_59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltongban_59)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltongmon)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltongloai_59)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltaikhoan_59)
                                .addGap(245, 245, 245))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMon_59)
                                .addGap(335, 335, 335))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMon_59)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lblHD_59))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTienMon_59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbltienthu_59)
                    .addComponent(jLabel7)
                    .addComponent(lbltongmon)
                    .addComponent(jLabel6)
                    .addComponent(lbltongban_59)
                    .addComponent(jLabel8)
                    .addComponent(lbltongloai_59)
                    .addComponent(jLabel9)
                    .addComponent(lbltaikhoan_59))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHD_59;
    private javax.swing.JLabel lblMon_59;
    private javax.swing.JLabel lblTienMon_59;
    private javax.swing.JLabel lbltaikhoan_59;
    private javax.swing.JLabel lbltienthu_59;
    private javax.swing.JLabel lbltongban_59;
    private javax.swing.JLabel lbltongloai_59;
    private javax.swing.JLabel lbltongmon;
    private javax.swing.JTable tbMon_59;
    private javax.swing.JTable tbaleHD_59;
    // End of variables declaration//GEN-END:variables
}
