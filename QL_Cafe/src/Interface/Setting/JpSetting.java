/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Setting;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class JpSetting extends javax.swing.JPanel {

    /**
     * Creates new form JpSetting
     */
    public JpSetting() {
        initComponents();
        JpThongTin tt = new JpThongTin();
        JpPaneSetting.removeAll();
        JpPaneSetting.add(tt);
        JpPaneSetting.revalidate();
        
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
        btnThongTin_01 = new javax.swing.JButton();
        btnCapNhat_01 = new javax.swing.JButton();
        JpPaneSetting = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1255, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(1255, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThongTin_01.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnThongTin_01.setForeground(new java.awt.Color(51, 0, 51));
        btnThongTin_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/info.png"))); // NOI18N
        btnThongTin_01.setText("THÔNG TIN");
        btnThongTin_01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTin_01.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongTin_01.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTin_01.setIconTextGap(7);
        btnThongTin_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTin_01ActionPerformed(evt);
            }
        });

        btnCapNhat_01.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCapNhat_01.setForeground(new java.awt.Color(51, 0, 51));
        btnCapNhat_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/update.png"))); // NOI18N
        btnCapNhat_01.setText("ĐỔI MẬT KHẨU");
        btnCapNhat_01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhat_01.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCapNhat_01.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCapNhat_01.setIconTextGap(7);
        btnCapNhat_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhat_01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCapNhat_01, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThongTin_01, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnCapNhat_01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTin_01)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        JpPaneSetting.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JpPaneSetting.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpPaneSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpPaneSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongTin_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTin_01ActionPerformed
        JpThongTin tt = new JpThongTin();
            JpPaneSetting.removeAll();
            JpPaneSetting.add(tt);
            JpPaneSetting.revalidate();
            
    }//GEN-LAST:event_btnThongTin_01ActionPerformed

    private void btnCapNhat_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhat_01ActionPerformed
        JpDoiMk dmk = new JpDoiMk();
        JpPaneSetting.removeAll();
        JpPaneSetting.add(dmk);
        JpPaneSetting.updateUI();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhat_01ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpPaneSetting;
    private javax.swing.JButton btnCapNhat_01;
    private javax.swing.JButton btnThongTin_01;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}