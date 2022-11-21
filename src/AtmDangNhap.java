
import bean.taikhoanbean;
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AtmDangNhap extends javax.swing.JFrame {

    public static ITinhToan tt;
    public AtmDangNhap() {
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

        jLabel1 = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        edtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        edtUn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("User Name");

        lblPass.setText("Password");

        edtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPassActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        edtUn.setText("abc");
        edtUn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(edtUn)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                        .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtUn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPass)
                .addGap(8, 8, 8)
                .addComponent(edtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnLogin)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPassActionPerformed
    ArrayList<String> ds = new ArrayList<String>();
    ArrayList<Integer> sl = new ArrayList<Integer>();
    int i=0;
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            
            taikhoanbean tk = tt.ktdn(edtUn.getText(), edtPass.getText());
            
            for(int i=0;i<ds.size();i++){
                if(ds.get(i).equals(edtUn)){
                    sl.set(i,sl.get(i)+1);
                }
                else{
                    ds.add(edtUn.getText());
                    sl.add(1);
                }
            }
            
            if(tk!=null){
                dispose();
                AtmClient Client = new AtmClient(tk);
                Client.setVisible(true);
            }
            else{
                for(int i=0;i<ds.size();i++){
                    if(ds.get(i).equals(edtUn)){
                        if(sl.get(i)==3){
                            JOptionPane.showMessageDialog(rootPane,  "Nhập sai quá 3 lần khóa");
                            edtPass.hide();
                        }
                    }
                }
                JOptionPane.showMessageDialog(rootPane,  "Ten hoac mat khau sai");
                i++;
                if(i==3){
                    edtPass.hide();
                    lblPass.setText("Sai nhiều lần trong khi dùng ATM quá, khóa nha");
                }
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void edtUnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtUnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            tt= (ITinhToan)Naming.lookup("rmi://localhost:1099/TinhToan");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AtmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField edtPass;
    private javax.swing.JTextField edtUn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPass;
    // End of variables declaration//GEN-END:variables
}
