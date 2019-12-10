/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depoyonetim.arayuz;

import com.depoyonetim.islemler.*;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class MusteriKayit extends javax.swing.JFrame {

    StringBuffer sBuffer = new StringBuffer();
    VeriIslemleri veriIslemleri = new VeriIslemleri();
    VeriTabaniBaglantisi veriTabaniBaglantisi = new VeriTabaniBaglantisi();
    String phone = "";
    String phone2 = "";

    /**
     * Creates new form MusteriKayit
     */
    public MusteriKayit() {
        this.setLocation(veriIslemleri.StartScreenLocation(this.getBounds().getSize()));
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uniqueNumberText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        phoneText = new javax.swing.JLabel();
        phone2Text = new javax.swing.JLabel();
        adressText = new javax.swing.JLabel();
        uniqueNumberTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        phone2Txt = new javax.swing.JTextField();
        adressTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        emailText = new javax.swing.JLabel();
        addCustomerBtn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Müşteri Kayıt");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        uniqueNumberText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uniqueNumberText.setText("TC / Vergi No :");

        nameText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameText.setText("Kişi / Şirket Adı :");

        phoneText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        phoneText.setText("Telefon :");

        phone2Text.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        phone2Text.setText("Telefon (Yedek) :");

        adressText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adressText.setText("Adres :");

        uniqueNumberTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uniqueNumberTxt.setForeground(new java.awt.Color(153, 153, 153));
        uniqueNumberTxt.setText("En fazla 11 karakter giriniz");
        uniqueNumberTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uniqueNumberTxtFocusGained(evt);
            }
        });
        uniqueNumberTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uniqueNumberTxtMouseClicked(evt);
            }
        });
        uniqueNumberTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uniqueNumberTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uniqueNumberTxtKeyReleased(evt);
            }
        });

        nameTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(153, 153, 153));
        nameTxt.setText("Kişi veya Şirket Adı");
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
        });
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtKeyReleased(evt);
            }
        });

        phoneTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        phoneTxt.setForeground(new java.awt.Color(153, 153, 153));
        phoneTxt.setText("0(***) *** ****");
        phoneTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTxtFocusGained(evt);
            }
        });
        phoneTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phoneTxtMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                phoneTxtMouseReleased(evt);
            }
        });
        phoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneTxtKeyReleased(evt);
            }
        });

        phone2Txt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        phone2Txt.setForeground(new java.awt.Color(153, 153, 153));
        phone2Txt.setText("0(***) *** ****");
        phone2Txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phone2TxtFocusGained(evt);
            }
        });
        phone2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone2TxtActionPerformed(evt);
            }
        });
        phone2Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phone2TxtKeyReleased(evt);
            }
        });

        adressTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adressTxt.setForeground(new java.awt.Color(153, 153, 153));
        adressTxt.setText("Mah / Cadde / Sok / İl / İlçe");
        adressTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adressTxtFocusGained(evt);
            }
        });
        adressTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adressTxtKeyReleased(evt);
            }
        });

        emailTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(153, 153, 153));
        emailTxt.setText("ornek@ornek.com");
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
        });
        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtKeyReleased(evt);
            }
        });

        emailText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailText.setText("E-Mail :");

        addCustomerBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addCustomerBtn.setText("Müşteri Ekle");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancel.setText("Kapat");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        message.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uniqueNumberTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uniqueNumberText)
                                    .addComponent(phoneText)
                                    .addComponent(adressText))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt)
                            .addComponent(phone2Txt)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailText)
                                    .addComponent(phone2Text)
                                    .addComponent(nameText))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(message)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uniqueNumberText)
                    .addComponent(nameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone2Text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uniqueNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adressText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerBtn)
                    .addComponent(cancel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phone2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2TxtActionPerformed

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        String mail = emailTxt.getText();
        if (phone.length() > 15 || phone2.length() > 15) {
            message.setText("Telefon Numaralarını Konrol Edin");
            return;
        }
        if (uniqueNumberTxt.getText().equals("En fazla 11 karakter giriniz") || nameTxt.getText().equals("Kişi veya Şirket Adı")
                || phoneTxt.getText().equals("0(***) *** ****") || adressTxt.getText().equals("Mah / Cadde / Sok / İl / İlçe")
                || emailTxt.getText().equals("ornek@ornek.com")) {
            message.setText("Lütfen Tüm Alanları Doldurun");
            return;
        } else if (uniqueNumberTxt.getText().equals("") || nameTxt.getText().equals("")
                || phoneTxt.getText().equals("") || adressTxt.getText().equals("") || emailTxt.getText().equals("")) {
            message.setText("Lütfen Tüm Alanları Doldurun");
            return;
        }
        boolean mailControl = veriIslemleri.mailControl(mail);
        if (!mailControl) {
            message.setText("Lütfen Geçerli Bir Mail Adresi Girin");
            return;
        }
        int dateInt = veriIslemleri.dateInteger();
        String phoneReplaced = veriIslemleri.phoneReturnFormat(phoneTxt.getText().toString());
        String phone2Replaced = veriIslemleri.phoneReturnFormat(phone2Txt.getText().toString());
        String daterString = veriIslemleri.dateString();
        //
        String uniqeNumber = uniqueNumberTxt.getText();
        String name = nameTxt.getText();
        phone = phoneReplaced;
        phone2 = phone2Replaced;
        String adress = adressTxt.getText();
        String email = emailTxt.getText();
        veriTabaniBaglantisi.ekle("INSERT INTO customerlist (tc_vergi_no,isim_sirket_kisi,telefon,telefon2,adres,email,date,dateCode) VALUES ("
                + "'" + uniqeNumber + "'," + "'" + name + "'," + "'" + phone + "'," + "'" + phone2 + "'," + "'" + adress + "'," + "'" + email + "','" + daterString + "','" + dateInt + "')");
        //
        message.setText("Kişi Başarıyla Eklendi");
        //
        uniqueNumberTxt.setText(""); // Bu alanda yazı alanlarının içini kayıttan sonra boşalttım.
        nameTxt.setText("");
        phoneTxt.setText("");
        phone2Txt.setText("");
        adressTxt.setText("");
        emailTxt.setText("");
    }//GEN-LAST:event_addCustomerBtnActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose(); // Bu kod pencereyi kapatır.

    }//GEN-LAST:event_cancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void uniqueNumberTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uniqueNumberTxtKeyReleased
        uniqueNumberTxt.setForeground(Color.BLACK);
        int lenght = uniqueNumberTxt.getText().length();
        if (lenght >= 12) {
            message.setText("En Fazla 11 Karakter Yazılabilir");
        }
        veriIslemleri.textMaxLimit(lenght, 11, uniqueNumberTxt);

    }//GEN-LAST:event_uniqueNumberTxtKeyReleased

    private void uniqueNumberTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uniqueNumberTxtKeyPressed
       if(uniqueNumberTxt.getText().equals("En fazla 11 karakter giriniz")){
           uniqueNumberTxt.setText("");
       }
    }//GEN-LAST:event_uniqueNumberTxtKeyPressed

    private void phoneTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTxtKeyReleased
        phoneTxt.setForeground(Color.BLACK);
        int lenght = phoneTxt.getText().length();
        veriIslemleri.phoneFormatTextField(lenght, phoneTxt, message);
        veriIslemleri.textMaxLimit(lenght, 15, phoneTxt);
    }//GEN-LAST:event_phoneTxtKeyReleased

    private void phoneTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtMouseExited

    private void phoneTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTxtMouseReleased

    }//GEN-LAST:event_phoneTxtMouseReleased

    private void phone2TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone2TxtKeyReleased
        phone2Txt.setForeground(Color.BLACK);
        int lenght = phone2Txt.getText().length();
        veriIslemleri.phoneFormatTextField(lenght, phone2Txt, message);
        veriIslemleri.textMaxLimit(lenght, 15, phone2Txt);
    }//GEN-LAST:event_phone2TxtKeyReleased

    private void nameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyReleased
        nameTxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_nameTxtKeyReleased

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased
        emailTxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_emailTxtKeyReleased

    private void adressTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adressTxtKeyReleased
        adressTxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_adressTxtKeyReleased

    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        nameTxt.setText("");
    }//GEN-LAST:event_nameTxtFocusGained

    private void phoneTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFocusGained
        phoneTxt.setText("");
    }//GEN-LAST:event_phoneTxtFocusGained

    private void phone2TxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone2TxtFocusGained
        phone2Txt.setText("");
    }//GEN-LAST:event_phone2TxtFocusGained

    private void adressTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adressTxtFocusGained
        adressTxt.setText("");
    }//GEN-LAST:event_adressTxtFocusGained

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        emailTxt.setText("");
    }//GEN-LAST:event_emailTxtFocusGained

    private void uniqueNumberTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uniqueNumberTxtMouseClicked
        uniqueNumberTxt.setText("");
    }//GEN-LAST:event_uniqueNumberTxtMouseClicked

    private void uniqueNumberTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uniqueNumberTxtFocusGained
        //uniqueNumberTxt.setText("");
    }//GEN-LAST:event_uniqueNumberTxtFocusGained

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
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriKayit().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JLabel adressText;
    private javax.swing.JTextField adressTxt;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel emailText;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel message;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel phone2Text;
    private javax.swing.JTextField phone2Txt;
    private javax.swing.JLabel phoneText;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel uniqueNumberText;
    private javax.swing.JTextField uniqueNumberTxt;
    // End of variables declaration//GEN-END:variables
}
