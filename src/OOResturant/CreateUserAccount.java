/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOResturant;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CreateUserAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateUserAccount
     */
    public CreateUserAccount() {
        initComponents();
        setIconImage();
        jlabErrorFirst.setVisible(false);
        jlabErrorLast.setVisible(false);
        jlabErrorName.setVisible(false);
        jlabErrorPass.setVisible(false);
        jlabErrorRePass.setVisible(false);
        setSize(436, 725);
        setLocationRelativeTo(null);
        jlablessPass.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        Gender = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jpanTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtFirstName = new javax.swing.JTextField();
        jtxtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jtxtRePass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaAddress = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jtxtImage = new javax.swing.JTextField();
        jbtnLogin = new javax.swing.JButton();
        jbtnCreate1 = new javax.swing.JButton();
        jlabErrorRePass = new javax.swing.JLabel();
        jlabErrorName = new javax.swing.JLabel();
        jlabErrorPass = new javax.swing.JLabel();
        jlabErrorFirst = new javax.swing.JLabel();
        jlabErrorLast = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jlablessPass = new javax.swing.JLabel();

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jPasswordField1.setText("sa");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jPasswordField2.setText("jPasswordField2");

        jLabel11.setText("jLabel11");

        jLabel16.setText("The Address Must Be");

        jLabel15.setText("Attintion:");

        jLabel17.setText("Less than 80 Characters");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Acount Screen");
        setPreferredSize(new java.awt.Dimension(436, 700));
        getContentPane().setLayout(null);

        jpanTitle.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Register");

        javax.swing.GroupLayout jpanTitleLayout = new javax.swing.GroupLayout(jpanTitle);
        jpanTitle.setLayout(jpanTitleLayout);
        jpanTitleLayout.setHorizontalGroup(
            jpanTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanTitleLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        jpanTitleLayout.setVerticalGroup(
            jpanTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jpanTitle);
        jpanTitle.setBounds(0, 0, 420, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setText("LastName:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 170, 140, 30);

        jtxtLastName.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jtxtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtLastNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtLastNameKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtLastName);
        jtxtLastName.setBounds(220, 170, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel3.setText("FirstName:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 140, 30);

        jtxtFirstName.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jtxtFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFirstNameActionPerformed(evt);
            }
        });
        jtxtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtFirstNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFirstNameKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtFirstName);
        jtxtFirstName.setBounds(220, 120, 170, 30);

        jtxtUserName.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jtxtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtUserNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtUserNameKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtUserName);
        jtxtUserName.setBounds(220, 220, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel5.setText("YourImage:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 580, 150, 34);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setText("UserName:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 220, 140, 30);

        jtxtPassword.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jtxtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtPassword);
        jtxtPassword.setBounds(220, 270, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel7.setText("Retype Pasword:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 310, 210, 40);

        jtxtRePass.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jtxtRePass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtRePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtRePassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtRePassKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtRePass);
        jtxtRePass.setBounds(220, 320, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel8.setText("Password:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 270, 140, 30);

        Gender.add(jrbMale);
        jrbMale.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jrbMale.setText("Male");
        jrbMale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jrbMale);
        jrbMale.setBounds(180, 370, 87, 30);

        Gender.add(jrbFemale);
        jrbFemale.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jrbFemale.setText("Female");
        jrbFemale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jrbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(jrbFemale);
        jrbFemale.setBounds(300, 370, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 370, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel10.setText("BirthDate:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 410, 130, 34);

        jtxtAreaAddress.setColumns(20);
        jtxtAreaAddress.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxtAreaAddress.setRows(5);
        jtxtAreaAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtAreaAddressKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtxtAreaAddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 470, 240, 100);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel12.setText("Address:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 470, 130, 34);

        jtxtImage.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jtxtImage);
        jtxtImage.setBounds(169, 580, 240, 40);

        jbtnLogin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnLogin.setText("Login");
        jbtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnLoginMouseClicked(evt);
            }
        });
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jbtnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnLoginKeyPressed(evt);
            }
        });
        getContentPane().add(jbtnLogin);
        jbtnLogin.setBounds(50, 640, 130, 30);

        jbtnCreate1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnCreate1.setText("Create");
        jbtnCreate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCreate1MouseClicked(evt);
            }
        });
        jbtnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreate1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCreate1);
        jbtnCreate1.setBounds(240, 640, 130, 30);

        jlabErrorRePass.setForeground(new java.awt.Color(255, 0, 0));
        jlabErrorRePass.setText("You Must Be Confirm Password");
        getContentPane().add(jlabErrorRePass);
        jlabErrorRePass.setBounds(220, 350, 160, 14);

        jlabErrorName.setForeground(new java.awt.Color(255, 0, 0));
        jlabErrorName.setText("You Must Be Enter User Name");
        getContentPane().add(jlabErrorName);
        jlabErrorName.setBounds(220, 250, 150, 14);

        jlabErrorPass.setForeground(new java.awt.Color(255, 0, 0));
        jlabErrorPass.setText("You Must Be Enter Password");
        getContentPane().add(jlabErrorPass);
        jlabErrorPass.setBounds(220, 300, 170, 14);

        jlabErrorFirst.setForeground(new java.awt.Color(255, 0, 0));
        jlabErrorFirst.setText("You Must Be Enter First Name");
        getContentPane().add(jlabErrorFirst);
        jlabErrorFirst.setBounds(220, 150, 150, 14);

        jlabErrorLast.setForeground(new java.awt.Color(255, 0, 0));
        jlabErrorLast.setText("You Must Be Enter Last Name");
        getContentPane().add(jlabErrorLast);
        jlabErrorLast.setBounds(220, 200, 150, 14);

        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("Attintion");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(30, 510, 50, 14);

        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("The Address Must Be");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(30, 530, 130, 14);

        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("Less than 80 Characters");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(30, 550, 140, 14);

        jlablessPass.setForeground(new java.awt.Color(255, 51, 51));
        jlablessPass.setText("Pass Must Be More Than 8 Digit");
        jlablessPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlablessPassMouseClicked(evt);
            }
        });
        getContentPane().add(jlablessPass);
        jlablessPass.setBounds(220, 300, 190, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jrbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFemaleActionPerformed

    private void jtxtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFirstNameActionPerformed

    }//GEN-LAST:event_jtxtFirstNameActionPerformed

    private void jtxtFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFirstNameKeyTyped
        Characters(evt);
    }//GEN-LAST:event_jtxtFirstNameKeyTyped

    private void jtxtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtLastNameKeyTyped
        Characters(evt);
    }//GEN-LAST:event_jtxtLastNameKeyTyped

    private void jtxtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUserNameKeyTyped
        Characters(evt);
    }//GEN-LAST:event_jtxtUserNameKeyTyped

    private void jtxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPasswordKeyTyped

    }//GEN-LAST:event_jtxtPasswordKeyTyped

    private void jtxtRePassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRePassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRePassKeyTyped
    private void Characters(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE))) {
            evt.consume();
            getToolkit().beep();
        }
    }
    private void jbtnCreate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCreate1MouseClicked
        if (jtxtFirstName.getText().equals("")) {
            jlabErrorFirst.setVisible(true);
        } else if (jtxtLastName.getText().equals("")) {
            jlabErrorLast.setVisible(true);
        } else if (jtxtUserName.getText().equals("")) {
            jlabErrorName.setVisible(true);
        } else if (new String(jtxtPassword.getPassword()).equals("")) {
            jlabErrorPass.setVisible(true);
        } else if (new String(jtxtRePass.getPassword()).equals("")) {
            jlabErrorRePass.setVisible(true);
        } else if (jtxtPassword.getPassword().length < 8) {
            jlablessPass.setVisible(true);
        } else if ((jtxtPassword.getText()).equals(jtxtRePass.getText())) {
            jrbMale.setActionCommand("Male");
            jrbMale.setActionCommand("Female");
            String firstName = jtxtFirstName.getText();
            String lastName = jtxtLastName.getText();
            String userName = jtxtUserName.getText();
            String password = new String(jtxtPassword.getPassword());
            String gender = Gender.getSelection().getActionCommand();
            String birthDate = ((JTextField) jdcBirthDate.getDateEditor().getUiComponent()).getText();
            String address = jtxtAreaAddress.getText();
            String image = jtxtImage.getText();
            new Account(firstName, lastName, userName, password, gender, birthDate, address, image).setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Congratulation " + firstName + "\nYou Are In Your Email Now", "Login System", JOptionPane.INFORMATION_MESSAGE);
        } else {
            jlabErrorRePass.setVisible(true);
            JOptionPane.showMessageDialog(null, "Password Does Not Match!\nPleace Inter Identical Password", "Login System", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnCreate1MouseClicked

    private void jbtnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreate1ActionPerformed

    }//GEN-LAST:event_jbtnCreate1ActionPerformed

    private void jtxtFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFirstNameKeyPressed
        jlabErrorFirst.setVisible(false);
    }//GEN-LAST:event_jtxtFirstNameKeyPressed

    private void jtxtLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtLastNameKeyPressed
        jlabErrorLast.setVisible(false);
    }//GEN-LAST:event_jtxtLastNameKeyPressed

    private void jtxtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUserNameKeyPressed
        jlabErrorName.setVisible(false);
    }//GEN-LAST:event_jtxtUserNameKeyPressed

    private void jtxtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPasswordKeyPressed
        jlabErrorPass.setVisible(false);
        jlablessPass.setVisible(false);
    }//GEN-LAST:event_jtxtPasswordKeyPressed

    private void jtxtRePassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRePassKeyPressed
        jlabErrorRePass.setVisible(false);
    }//GEN-LAST:event_jtxtRePassKeyPressed

    private void jbtnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnLoginKeyPressed

    }//GEN-LAST:event_jbtnLoginKeyPressed

    private void jbtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnLoginMouseClicked
        new Login_System().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnLoginMouseClicked
    private int count = 0;
    private void jtxtAreaAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAreaAddressKeyPressed
        char c = evt.getKeyChar();
        if (c != KeyEvent.VK_BACK_SPACE) {
            if (++count > 10) {
                jtxtAreaAddress.setEnabled(false);
                getToolkit().beep();
            }
        } else {
            count--;
            jtxtAreaAddress.setEnabled(true);
        }
        
    }//GEN-LAST:event_jtxtAreaAddressKeyPressed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jlablessPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlablessPassMouseClicked

    }//GEN-LAST:event_jlablessPassMouseClicked

    /**
     * @param args the command line arguments
     */
    public void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("login.png")));
    }
    
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
            java.util.logging.Logger.getLogger(CreateUserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateUserAccount().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCreate1;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JLabel jlabErrorFirst;
    private javax.swing.JLabel jlabErrorLast;
    private javax.swing.JLabel jlabErrorName;
    private javax.swing.JLabel jlabErrorPass;
    private javax.swing.JLabel jlabErrorRePass;
    private javax.swing.JLabel jlablessPass;
    private javax.swing.JPanel jpanTitle;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JTextArea jtxtAreaAddress;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtImage;
    private javax.swing.JTextField jtxtLastName;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JPasswordField jtxtRePass;
    private javax.swing.JTextField jtxtUserName;
    // End of variables declaration//GEN-END:variables
}
