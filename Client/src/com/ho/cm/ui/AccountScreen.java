
package com.ho.cm.ui;

import com.ho.cm.bao.BaoFactory;
import com.ho.cm.bao.UserBao;

import javax.swing.JOptionPane;

/**
 *
 * @author h.omar
 */
public class AccountScreen extends javax.swing.JPanel {

    // business object 
    UserBao userBaoObj = new BaoFactory().createUserBao();
   
   
    /** Creates new form AccountScreen */
    public AccountScreen() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phoneErrorLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("UserName");

        username.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        phoneErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }//GEN-END:initComponents

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
         // avoid empty data using if 
         if ((password.getPassword().toString()!= null )&&(username.getText()!=null))
         {           if (userBaoObj.updatePassword(new String (password.getPassword())))
               JOptionPane.showMessageDialog(this, "Password Updated Successfully");
               else 
            JOptionPane.showMessageDialog(this, "there are an error in update password");
           
           if (userBaoObj.updateUsername(username.getText()))
            JOptionPane.showMessageDialog(this, "Username Updated Successfully");
            else 
           JOptionPane.showMessageDialog(this, "there are an error in update Username");}
         else 
        
        JOptionPane.showMessageDialog(this, "You should enter data to  update ");  
        
        
       /* if(userBaoObj.usernameCheck(username.getText()))
            JOptionPane.showMessageDialog(this, "user tmam");
        
         
        if(userBaoObj.passwordChecke(password.getPassword().toString()))
            JOptionPane.showMessageDialog(this, "pass tmam");
       */
           
    }//GEN-LAST:event_saveBtnMouseClicked

    private void itemsComboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsComboMouseExited
        
        //billContTable.setValueAt(itemsCombo.getSelectedObjects(), billContTable.getRowCount(), 0);    
        
        
        
    }//GEN-LAST:event_itemsComboMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel phoneErrorLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables


}


