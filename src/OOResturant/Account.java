package OOResturant;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Account extends javax.swing.JFrame {

    String firstName, lastName, userName, password, gender, birthDate, address, image;

    public Account(String firstName, String lastName, String userName, String password, String gender, String birthDate, String address, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.image = image;
        initAllComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initAllComponents() {
        jLabel1 = new javax.swing.JLabel();
        jlabImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlabTitle = new javax.swing.JLabel();
        jlabIcon2 = new javax.swing.JLabel();
        jlabIcon1 = new javax.swing.JLabel();
        jlabUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jlabGo = new javax.swing.JLabel();
        jlabShow = new javax.swing.JLabel();
        jlabSetting = new javax.swing.JLabel();
        jlabLogin = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resturant System");
        getContentPane().setLayout(null);

        jlabImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabImage.setIcon(new javax.swing.ImageIcon(image)); // NOI18N
        jlabImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabImageMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabImageMouseExited(evt);
            }
        });
        getContentPane().add(jlabImage);
        jlabImage.setBounds(240, 120, 190, 180);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jlabTitle.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jlabTitle.setForeground(new java.awt.Color(0, 51, 51));
        jlabTitle.setText("Your Profile");
        jlabTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 4));

        jlabIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdulHameed Mohamed\\Downloads\\user.png")); // NOI18N

        jlabIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdulHameed Mohamed\\Downloads\\user.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(116, Short.MAX_VALUE)
                        .addComponent(jlabIcon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabIcon2)
                        .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlabIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlabTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlabIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 100);

        jlabUserName.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jlabUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabUserName.setText(userName);
        getContentPane().add(jlabUserName);
        jlabUserName.setBounds(90, 330, 500, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 2, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(address);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEnabled(false);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 410, 370, 120);

        jlabGo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlabGo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabGo.setText("Go to Resturant");
        jlabGo.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabGoMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabGoMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabGoMouseExited(evt);
            }
        });
        getContentPane().add(jlabGo);
        jlabGo.setBounds(0, 560, 320, 50);

        jlabShow.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlabShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabShow.setText("Show Your Data");
        jlabShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabShowMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabShowMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabShowMouseExited(evt);
            }
        });
        getContentPane().add(jlabShow);
        jlabShow.setBounds(340, 560, 330, 50);

        jlabSetting.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlabSetting.setText("Setting");
        jlabSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabSettingMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabSettingMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabSettingMouseExited(evt);
            }
        });
        getContentPane().add(jlabSetting);
        jlabSetting.setBounds(10, 100, 140, 50);
        
        jlabLogin.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlabLogin.setText("Sign Out");
        jlabLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabLoginMouseExited(evt);
            }
        });
        getContentPane().add(jlabLogin);
        jlabLogin.setBounds(500, 100, 170, 50);

        pack();
        setSize(685, 665);
        setLocationRelativeTo(null);
        setTitle("Resturant System");
    }// </editor-fold>

    /**
     * // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlabImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlabTitle = new javax.swing.JLabel();
        jlabIcon2 = new javax.swing.JLabel();
        jlabIcon1 = new javax.swing.JLabel();
        jlabUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jlabGo = new javax.swing.JLabel();
        jlabShow = new javax.swing.JLabel();
        jlabSetting = new javax.swing.JLabel();
        jlabLogin = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setText("Sign Out");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resturant System");
        getContentPane().setLayout(null);

        jlabImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdulHameed Mohamed\\Downloads\\user.png")); // NOI18N
        jlabImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabImageMouseExited(evt);
            }
        });
        getContentPane().add(jlabImage);
        jlabImage.setBounds(240, 120, 190, 180);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jlabTitle.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jlabTitle.setForeground(new java.awt.Color(0, 51, 51));
        jlabTitle.setText("Your Profile");
        jlabTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 4));

        jlabIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdulHameed Mohamed\\Downloads\\user.png")); // NOI18N

        jlabIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdulHameed Mohamed\\Downloads\\user.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jlabIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabIcon2)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 100);

        jlabUserName.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        jlabUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabUserName.setText("AbdulHameed Mohamed");
        getContentPane().add(jlabUserName);
        jlabUserName.setBounds(90, 330, 510, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 2, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("I live In Obour City \nI always Like Eating \nI like Football\nI like Swimming");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 410, 370, 120);

        jlabGo.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlabGo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabGo.setText("Go to Resturant");
        jlabGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabGoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabGoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabGoMouseExited(evt);
            }
        });
        getContentPane().add(jlabGo);
        jlabGo.setBounds(0, 560, 320, 50);

        jlabShow.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlabShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabShow.setText("Show Your Data");
        jlabShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabShowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabShowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabShowMouseExited(evt);
            }
        });
        getContentPane().add(jlabShow);
        jlabShow.setBounds(340, 560, 330, 50);

        jlabSetting.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlabSetting.setText("Setting");
        jlabSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabSettingMouseExited(evt);
            }
        });
        getContentPane().add(jlabSetting);
        jlabSetting.setBounds(10, 100, 140, 50);

        jlabLogin.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlabLogin.setText("Sign Out");
        jlabLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabLoginMouseExited(evt);
            }
        });
        getContentPane().add(jlabLogin);
        jlabLogin.setBounds(500, 100, 170, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents
*/
    private void jlabShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabShowMouseClicked
        JOptionPane.showMessageDialog(null, "Your Data:\n"
                + "Name is " + firstName.concat(" ").concat(lastName)
                + "\nUserName is " + userName
                + "\nPassword is " + password
                + "\nBirthDate is " + birthDate
                + "\nGender is " + gender, "Show Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jlabShowMouseClicked

    private void jlabGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabGoMouseClicked
        new Resturant(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlabGoMouseClicked

    private void jlabSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabSettingMouseClicked
        this.dispose();
        new Setting(this);
        JOptionPane.showMessageDialog(null, "Note: Enter the Data Which You Are Need To Change It", "Account System", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jlabSettingMouseClicked

    private void jlabSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabSettingMouseEntered
        jlabSetting.setForeground(new Color(0, 25, 94));
        jlabSetting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 49, 118), 3));
    }//GEN-LAST:event_jlabSettingMouseEntered

    private void jlabSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabSettingMouseExited
        jlabSetting.setForeground(Color.BLACK);
        jlabSetting.setBorder(null);
    }//GEN-LAST:event_jlabSettingMouseExited

    private void jlabGoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabGoMouseEntered
        jlabGo.setForeground(new Color(0, 25, 94));
        jlabGo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 49, 118), 3));
    }//GEN-LAST:event_jlabGoMouseEntered

    private void jlabGoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabGoMouseExited
        jlabGo.setForeground(Color.BLACK);
        jlabGo.setBorder(null);
    }//GEN-LAST:event_jlabGoMouseExited

    private void jlabShowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabShowMouseEntered
        jlabShow.setForeground(new Color(0, 25, 94));
        jlabShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 49, 118), 3));
    }//GEN-LAST:event_jlabShowMouseEntered

    private void jlabShowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabShowMouseExited
        jlabShow.setForeground(Color.BLACK);
        jlabShow.setBorder(null);
    }//GEN-LAST:event_jlabShowMouseExited

    private void jlabImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabImageMouseEntered
        jlabImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 25, 94), 3));
    }//GEN-LAST:event_jlabImageMouseEntered

    private void jlabImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabImageMouseExited
        jlabImage.setBorder(null);
    }//GEN-LAST:event_jlabImageMouseExited

    private void jlabLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabLoginMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Are You Sure To Exit Your Account?"
                + "\nConfirm If You Want To Exit", "Resturant Login System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            new Login_System(firstName, password);
            this.dispose();
        }
        
    }//GEN-LAST:event_jlabLoginMouseClicked

    private void jlabLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabLoginMouseEntered
        jlabLogin.setForeground(new Color(0, 25, 94));
        jlabLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 49, 118), 3));
    }//GEN-LAST:event_jlabLoginMouseEntered

    private void jlabLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabLoginMouseExited
        jlabLogin.setForeground(Color.BLACK);
        jlabLogin.setBorder(null);
    }//GEN-LAST:event_jlabLoginMouseExited

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new Account();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlabGo;
    private javax.swing.JLabel jlabIcon1;
    private javax.swing.JLabel jlabIcon2;
    private javax.swing.JLabel jlabImage;
    private javax.swing.JLabel jlabLogin;
    private javax.swing.JLabel jlabSetting;
    private javax.swing.JLabel jlabShow;
    private javax.swing.JLabel jlabTitle;
    private javax.swing.JLabel jlabUserName;
    // End of variables declaration//GEN-END:variables
}
