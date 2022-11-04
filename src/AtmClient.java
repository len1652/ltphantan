
import bean.taikhoanbean;
import bo.taikhoanbo;
import java.rmi.Naming;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phucp
 */
public class AtmClient extends javax.swing.JFrame {

    /**
     * Creates new form AtmClient
     */
    taikhoanbean tk;
    public AtmClient(taikhoanbean tk) {
        initComponents();
        this.tk = tk;
    }

    private AtmClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        lblSoDu = new javax.swing.JLabel();
        btn100 = new javax.swing.JButton();
        btn1tr = new javax.swing.JButton();
        btn500 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblWelcome.setText("Welcome per");

        lblSoDu.setText("So du tai khoan: ");

        btn100.setText("100.000VNĐ");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn1tr.setText("1.000.000VNĐ");
        btn1tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1trActionPerformed(evt);
            }
        });

        btn500.setText("500.000VNĐ");
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });

        btn200.setText("200.000VNĐ");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        jButton5.setText("Hủy Giao Dịch");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Số khác");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(lblSoDu)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn500, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn100, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1tr, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoDu))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100)
                    .addComponent(btn1tr))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn200)
                    .addComponent(jButton6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn500)
                    .addComponent(jButton5))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String sotien(taikhoanbean tk){
        long tien = tk.getSoTien();
        String a="";
        String duoi=".000";
        if(tien>=1000){
            
        }
        return a;
    }
    taikhoanbo tkbo = new taikhoanbo();
    
    public static String getFormattedAmount(long amount) {
        String formatted_value = "";
        boolean isNavigate = amount < 0;
        amount = Math.abs(amount);
        while (amount > 999) {
            long du = amount % 1000;
            amount = amount / 1000;
            formatted_value = String.format(Locale.getDefault(), ".%,03d", du) + formatted_value;
        }
        if(isNavigate){
            formatted_value = String.format(Locale.getDefault(), "-%,d", amount) + formatted_value;
        } else {
            formatted_value = String.format(Locale.getDefault(), "%,d", amount) + formatted_value;
        }
        return String.format(Locale.getDefault(), "%s", formatted_value);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (tk!=null){
            lblWelcome.setText("Welcome "+tk.getHoTen());
            String du = getFormattedAmount( tk.getSoTien());
            lblSoDu.setText("Số dư: "+du+" VNĐ");
            
        }
    }//GEN-LAST:event_formWindowOpened
    
    public void ruttien(long tienrut){
        
        try {
            int response = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn?","Thông báo", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
           // AtmDangNhap ttk = new AtmDangNhap();
            tk = AtmDangNhap.tt.ruttien(tienrut,tk);
            int response2 = JOptionPane.showConfirmDialog(this, "Giao dịch thành công số dư còn lại của bạn là: "+tk.getSoTien()+", bạn muốn giao dịch tiếp?","Thông báo", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            dispose();
            if (tienrut > tk.getSoTien()){
                JOptionPane.showMessageDialog(rootPane,  "Tiền trong tài khoản không đủ thì rút cái gì?");
            }
            else if (tienrut > 5000000){
                JOptionPane.showMessageDialog(rootPane,  "Chỉ được rút tối đa 5 củ thôi");
            }
            else if(response2 == JOptionPane.YES_OPTION){
                
                AtmClient client = new AtmClient(tk);
                client.setVisible(true);
                System.out.println("số tiền trên client sau khi bị trừ: "+tk.getSoTien());
            }
            else{
                AtmDangNhap dangnhap = new AtmDangNhap();
                dangnhap.setVisible(true);
            }
            
            
        }
        else if(response == JOptionPane.NO_OPTION){
            dispose();
            AtmClient client = new AtmClient(tk);
            client.setVisible(true);
        }
        else if(response == JOptionPane.CLOSED_OPTION){
            dispose();
            AtmClient client = new AtmClient(tk);
            client.setVisible(true);
        }
        } catch (Exception e) {
        }
    }
    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        ruttien(100000);
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        ruttien(200000);
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        ruttien(500000);
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn1trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1trActionPerformed
        ruttien(1000000);
    }//GEN-LAST:event_btn1trActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        AtmDangNhap dangnhap = new AtmDangNhap();
        dangnhap.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        AtmNhapSoTienRut jumpNhap = new AtmNhapSoTienRut(tk);
        jumpNhap.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AtmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn1tr;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn500;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel lblSoDu;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables

    
}
