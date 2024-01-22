package ipawn;

import javax.swing.JOptionPane;

public class PhoneFrame extends javax.swing.JFrame {
    
    public PhoneFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        term = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        item = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        value = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iPAWN");
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel10.setText("LOAN DETAILS");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 30, 150, 23);

        jLabel14.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("emai address: ipawnphi@gmail.com");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(80, 70, 190, 30);

        receipt.setBackground(new java.awt.Color(242, 242, 242));
        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        receipt.setRows(5);
        receipt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(receipt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 320, 430);

        jLabel16.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Wait for our approval through email address");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(60, 50, 240, 30);

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DONE TRANSACTING");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(80, 580, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 360, 640);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Ebrima", 0, 10)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(40, 27, 60, 20);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setText("iPAWN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(660, 20, 100, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\63963\\OneDrive\\Documents\\BPSU(S2)-1ST SEM\\DSA\\20240113_152142.png")); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(620, 20, 30, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\63963\\OneDrive\\Documents\\BPSU(S2)-1ST SEM\\DSA\\head.jpg")); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(0, 0, 930, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(380, 10, 790, 70);

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BRAND");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(800, 120, 50, 30);

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTACT #");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(800, 190, 90, 30);

        term.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "90 Days", "3 Months", "4 Months", "5 Months", "6 Months", "7 Months", "8 Months" }));
        term.setBorder(null);
        term.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(term);
        term.setBounds(560, 470, 560, 30);

        contact.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        contact.setText("  ");
        contact.setBorder(null);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact);
        contact.setBounds(890, 190, 230, 30);

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ITEM");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 120, 32, 30);

        brand.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        brand.setText("Smartphone");
        brand.setBorder(null);
        getContentPane().add(brand);
        brand.setBounds(510, 120, 230, 30);

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(980, 260, 60, 30);

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAME");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 190, 50, 30);

        name.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        name.setText("  ");
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(510, 190, 230, 30);

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LOAN TERM");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 470, 90, 30);

        jSpinner1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(20, 20, 70, 1));
        jSpinner1.setBorder(null);
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(890, 260, 60, 30);

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AGE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(800, 260, 90, 30);

        jComboBox1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "LGBTQ" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(1050, 260, 72, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(380, 340, 790, 10);

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EMAIL");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 260, 50, 30);

        email.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(510, 260, 230, 30);

        item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iPhone", "Samsung", "Xiaomi/POCO", "Infinix", "Itel", "Realme", "Vivo", "Oppo", "Techno", "ASUS ROG Phone" }));
        item.setBorder(null);
        item.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });
        getContentPane().add(item);
        item.setBounds(890, 120, 230, 30);

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ITEM VALUE");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 410, 90, 30);

        value.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "₱ 500-1,000", "₱ 1,000-2,000", "₱ 2,000-3,000", "₱ 3,000-4,000", "₱ 4,000-5,000", "₱ 5,000-6,000", "₱ 6,000-7,000", "₱ 7,000-8,000", "₱ 8,000-9,000", "₱ 9,000-10,000", "₱ 10,000-above" }));
        value.setBorder(null);
        value.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(value);
        value.setBounds(560, 410, 560, 30);

        jButton2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton2.setText("RESET");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 560, 110, 30);

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PAWN NOW");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(980, 560, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\63963\\OneDrive\\Documents\\BPSU(S2)-1ST SEM\\DSA\\bgipawn.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, -4, 1220, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(
        this, "THANK YOU FOR CHOOSING US!");
        JOptionPane.showMessageDialog(
        this, "iPAWN only serves one at a time. We will return you to the main screen. We are looking forward to having you back soon!");
        Log gyu = new
        Log();
           gyu.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Items gyu = new
        Items();
        gyu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        brand.setText("  ");
        name.setText("  ");
        contact.setText("  ");
        email.setText("  ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        receipt.setText("\n");
        receipt.setText(receipt.getText() + "\n");
        receipt.setText(receipt.getText() + "     =================================   \n");
        receipt.setText(receipt.getText() + "     HELLO , USER :D   |   WELCOME  TO \n");
        receipt.setText(receipt.getText() + "     ======= iPAWN PHILIPPINES =======   \n");
        receipt.setText(receipt.getText() + "\n");
        receipt.setText(receipt.getText() + "     ITEM     :   " + item.getSelectedItem().toString() + "\n");
        receipt.setText(receipt.getText() + "     BRAND    :   " + brand.getText() + "\n");
        receipt.setText(receipt.getText() + "     FROM     :   " + name.getText() + "\n");
        receipt.setText(receipt.getText() + "     CONTACT# :   " + contact.getText() + "\n");
        receipt.setText(receipt.getText() + "     EMAIL ADD:   " + email.getText() + "\n");
        receipt.setText(receipt.getText() + "     ITEM     :   " + value.getSelectedItem().toString() + "\n");
        receipt.setText(receipt.getText() + "     VALUE \n");
        receipt.setText(receipt.getText() + "     LOAN TERM:   " + term.getSelectedItem().toString() + "\n");
        receipt.setText(receipt.getText() + "\n");
        receipt.setText(receipt.getText() + "     =================================   \n");
        receipt.setText(receipt.getText() + "\n");
        receipt.setText(receipt.getText() + "     Please save or screenshot this!!!   \n");
        receipt.setText(receipt.getText() + "   We will wait for your loan, Thank You!\n");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PhoneFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea receipt;
    private javax.swing.JComboBox<String> term;
    private javax.swing.JComboBox<String> value;
    // End of variables declaration//GEN-END:variables
}
