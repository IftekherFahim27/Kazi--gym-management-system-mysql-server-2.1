/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_trial;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MN
 */
public class RegLog extends javax.swing.JFrame {

    /**
     * Creates new form RegLog
     */
    public RegLog() {
        initComponents();
    }
    public Connection database;
    public Connection database2;
    int flag = 0;
    
    public boolean checkpass(String str) {
        int upper = 0, lower = 0, number = 0, special = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }
        if (upper >= 1 && lower >= 1 && number >= 1 && special == 0) {
            return true;
        } else {
            return false;
            
        }
    }
    
    public boolean checkemail(String str) {
        int upper = 0, lower = 0, number = 0, special1 = 0, special2 = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
            if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
            if (ch >= '0' && ch <= '9') {
                number++;
            }
            if (ch == '@') {
                special1++;
            }
            if (ch == '.') {
                special2++;
            }
        }
        if (special1 == 1 && special2 == 1 && upper == 0 && number >= 1 && lower >= 1) {
            return true;
        } else {
            return false;
            
        }
    }
    
    public boolean checkuser(String str) {
        int upper = 0, lower = 0, number = 0, special = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }
        if (special == 0 && upper >= 1 && number >= 1 && lower >= 1) {
            return true;
        } else {
            return false;
            
        }
    }
    
    public boolean checkblood(String str) {
        int upper = 0, lower = 0, number = 0, special = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'O' || ch == 'B') {
                upper++;
            }
            if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
            if (ch >= '0' && ch <= '9') {
                number++;
            }
            if (ch == '+' || ch == '-') {
                special++;
            }
        }
        if ((special == 1 && upper == 1 && number == 0 && lower == 0) || (str.equals("AB+")) || (str.equals("AB-"))) {
            return true;
        } else {
            return false;
            
        }
    }
    
    public boolean checkmobile(String str) {
        int upper = 0, lower = 0, number = 0, special = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }
        if (special == 0 && upper == 0 && number == 11 && lower == 0) {
            return true;
        } else {
            return false;
            
        }
    }
    
    public boolean checknid(String str) {
        int upper = 0, lower = 0, number = 0, special = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }
        if (special == 0 && upper == 0 && number == 10 && lower == 0) {
            return true;
        } else {
            return false;
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l_name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        bg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Admin_regBtn = new javax.swing.JButton();
        Trainer_regBtn = new javax.swing.JButton();
        Member_regBtn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();
        nilab = new javax.swing.JLabel();
        palab = new javax.swing.JLabel();
        unlab = new javax.swing.JLabel();
        moblab = new javax.swing.JLabel();
        bglab = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        Attach_btn = new javax.swing.JButton();
        pic_path = new javax.swing.JTextField();
        pic_info = new javax.swing.JLabel();
        acc_info = new javax.swing.JLabel();
        pack = new javax.swing.JComboBox<>();
        pac_info = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration ");
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 107, 31));

        l_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(l_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 200, 31));

        age.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, -1));

        gender.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 200, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Gender (M/F)");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Height(cm)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Weight(kg)");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        height.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        height.setToolTipText("");
        getContentPane().add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, 29));

        weight.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 200, 29));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Blood Group");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 55, -1));

        mobile.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobileMouseExited(evt);
            }
        });
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 200, 30));

        bg.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        bg.setToolTipText("");
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bgMouseExited(evt);
            }
        });
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 200, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        email.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailMouseExited(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 210, 28));

        nid.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nidMouseExited(evt);
            }
        });
        getContentPane().add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 220, 28));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UserName");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        user.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 200, 30));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        Admin_regBtn.setBackground(new java.awt.Color(255, 204, 204));
        Admin_regBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Admin_regBtn.setText("Admin");
        Admin_regBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Admin_regBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Admin_regBtnMouseExited(evt);
            }
        });
        Admin_regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_regBtnActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_regBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));

        Trainer_regBtn.setBackground(new java.awt.Color(204, 255, 204));
        Trainer_regBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Trainer_regBtn.setText("Trainer");
        Trainer_regBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Trainer_regBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Trainer_regBtnMouseExited(evt);
            }
        });
        Trainer_regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trainer_regBtnActionPerformed(evt);
            }
        });
        getContentPane().add(Trainer_regBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, -1, -1));

        Member_regBtn.setBackground(new java.awt.Color(255, 255, 204));
        Member_regBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Member_regBtn.setText("Member");
        Member_regBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Member_regBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Member_regBtnMouseExited(evt);
            }
        });
        Member_regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Member_regBtnActionPerformed(evt);
            }
        });
        getContentPane().add(Member_regBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, -1, -1));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Niagara Engraved", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("<<<");
        back.setActionCommand("");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 110, 40));

        pass.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passMouseExited(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 220, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Profile Type");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, -1));

        elab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        elab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(elab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 260, 30));

        nilab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nilab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(nilab, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 220, 30));

        palab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        palab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(palab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 350, 50));

        unlab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        unlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(unlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 290, 30));

        moblab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        moblab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(moblab, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 210, 30));

        bglab.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bglab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(bglab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 240, 30));

        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 250, 240));

        Attach_btn.setBackground(new java.awt.Color(255, 255, 204));
        Attach_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Attach_btn.setText("Attach");
        Attach_btn.setToolTipText("");
        Attach_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Attach_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Attach_btnMouseExited(evt);
            }
        });
        Attach_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attach_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Attach_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 80, 30));

        pic_path.setEditable(false);
        pic_path.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pic_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pic_pathActionPerformed(evt);
            }
        });
        getContentPane().add(pic_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 280, 30));

        pic_info.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pic_info.setForeground(new java.awt.Color(255, 51, 51));
        pic_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pic_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 240, 50));

        acc_info.setForeground(new java.awt.Color(255, 0, 51));
        acc_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(acc_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 380, 30));

        pack.setBackground(new java.awt.Color(255, 51, 255));
        pack.setForeground(new java.awt.Color(0, 0, 255));
        pack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Happy Member", "Super Saver", "Elite Member", "Holiday Member", "Female Member" }));
        pack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                packMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                packMouseExited(evt);
            }
        });
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        getContentPane().add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        pac_info.setForeground(new java.awt.Color(255, 0, 0));
        pac_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pac_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 180, 40));

        f_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 200, 30));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PIN :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 70, -1));

        pin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pin.setForeground(new java.awt.Color(255, 0, 0));
        pin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pinMouseExited(evt);
            }
        });
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        getContentPane().add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 110, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_trial/Pic/1000X550(bg4).png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Choose1 ch = new Choose1();
        ch.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void Admin_regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_regBtnActionPerformed
        
        String apin = new String(pin.getPassword());
        
        String fname = f_name.getText();
        String lname = l_name.getText();
        String ag = age.getText();
        String gen = gender.getText();
        String ht = height.getText();
        String wt = weight.getText();
        String bl = bg.getText();
        String mob = mobile.getText();
        String mail = email.getText();
        String nd = nid.getText();
        String us = user.getText();
        String pa = new String(pass.getPassword());
        
        if (apin.equals("")) {
            JOptionPane.showMessageDialog(null, "Opps!! Enter the Pin", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (apin.equals("2021")) {
            JOptionPane.showMessageDialog(null, "Correct Pin", "Success", JOptionPane.INFORMATION_MESSAGE);
            try {
                
                if (fname.equals("") || lname.equals("") || ag.equals("") || gen.equals("") || ht.equals("") || wt.equals("") || bl.equals("") || mob.equals("") || mail.equals("") || nd.equals("") || us.equals("") || pa.equals("")) {
                    JOptionPane.showMessageDialog(null, "Opps!! Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection databse = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "insert into admin_info (firstname,lastname,age,gender,height,weight,bg,mobile,email,nid,username,password,picture) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement p = (PreparedStatement) databse.prepareStatement(sql);
                    p.setString(1, fname);
                    p.setString(2, lname);
                    p.setString(3, ag);
                    p.setString(4, gen);
                    p.setString(5, ht);
                    p.setString(6, wt);
                    p.setString(7, bl);
                    p.setString(8, mob);
                    p.setString(9, mail);
                    p.setString(10, nd);
                    p.setString(11, us);
                    p.setString(12, pa);
                    p.setString(13, pic_path.getText());
                    
                    boolean tpass = checkpass(pa);
                    boolean temail = checkemail(mail);
                    boolean tuser = checkuser(us);
                    boolean tblood = checkblood(bl);
                    boolean tphone = checkmobile(mob);
                    boolean tid = checknid(nd);
                    
                    if (!pic_path.getText().equals("") && (tphone) && (tid) && (gen.equals("M")) || (gen.equals("F")) && (tpass) && (temail) && (tuser) && (tblood) && pa.length() == 8) {
                        p.executeUpdate();
                        dispose();
                        databse.close();
                        JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);
                        
                        AdminLog al = new AdminLog();
                        al.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opps!! Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Opps!! Wrong  Pin", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_Admin_regBtnActionPerformed

    private void Trainer_regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trainer_regBtnActionPerformed
        String apin = new String(pin.getPassword());
        
        String fname = f_name.getText();
        String lname = l_name.getText();
        String ag = age.getText();
        String gen = gender.getText();
        String ht = height.getText();
        String wt = weight.getText();
        String bl = bg.getText();
        String mob = mobile.getText();
        String mail = email.getText();
        String nd = nid.getText();
        String us = user.getText();
        String pa = new String(pass.getPassword());
        
        if (apin.equals("")) {
            JOptionPane.showMessageDialog(null, "Opps!! Enter the Pin", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (apin.equals("2020")) {
            JOptionPane.showMessageDialog(null, "Correct Pin", "Success", JOptionPane.INFORMATION_MESSAGE);
            try {
                
                if (fname.equals("") || lname.equals("") || ag.equals("") || gen.equals("") || ht.equals("") || wt.equals("") || bl.equals("") || mob.equals("") || mail.equals("") || nd.equals("") || us.equals("") || pa.equals("")) {
                    JOptionPane.showMessageDialog(null, "Opps!! Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection databse = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "insert into trainer_info (firstname,lastname,age,gender,height,weight,bg,mobile,email,nid,username,password,picture) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement p = (PreparedStatement) databse.prepareStatement(sql);
                    p.setString(1, fname);
                    p.setString(2, lname);
                    p.setString(3, ag);
                    p.setString(4, gen);
                    p.setString(5, ht);
                    p.setString(6, wt);
                    p.setString(7, bl);
                    p.setString(8, mob);
                    p.setString(9, mail);
                    p.setString(10, nd);
                    p.setString(11, us);
                    p.setString(12, pa);
                    p.setString(13, pic_path.getText());
                    
                    boolean tpass = checkpass(pa);
                    boolean temail = checkemail(mail);
                    boolean tuser = checkuser(us);
                    boolean tblood = checkblood(bl);
                    boolean tphone = checkmobile(mob);
                    boolean tid = checknid(nd);
                    
                    if (!pic_path.getText().equals("") && (tphone) && (tid) && (gen.equals("M")) || (gen.equals("F")) && (tpass) && (temail) && (tuser) && (tblood) && pa.length() == 8) {
                        p.executeUpdate();
                        dispose();
                        databse.close();
                        JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);
                        TrainerLog tl = new TrainerLog();
                        tl.setVisible(true);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Opps!! Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Opps!! Wrong  Pin", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_Trainer_regBtnActionPerformed

    private void Member_regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Member_regBtnActionPerformed
        
        String fname = f_name.getText();
        String lname = l_name.getText();
        String ag = age.getText();
        String gen = gender.getText();
        String ht = height.getText();
        String wt = weight.getText();
        String bl = bg.getText();
        String mob = mobile.getText();
        String mail = email.getText();
        String nd = nid.getText();
        String us = user.getText();
        String pa = new String(pass.getPassword());
        String pac = null;
        String tr_name = null;
        String bill = null;
        if (flag == 1) {
            pac = "Happy Member";
            tr_name = "Mr. Manik Azad";
            bill = "3200";
        }  if (flag == 2) {
            pac = "Super Saver";
            tr_name = "Mr.Rabbi";
            bill = "3500";
        }  if (flag == 3) {
            pac = "Elite Member";
            tr_name = "Mr. Asadul Islam Milon";
            bill = "4000";
        }  if (flag == 4) {
            pac = "Holiday Member";
            tr_name = "Mr.Shahin ";
            bill = "3000";
        }  if (flag == 5) {
            pac = "Female Member";
            tr_name = "Ms. Nighat Sultana";
            bill = "3200";
        }
        
        Random rand = new Random();
        int id = rand.nextInt(1000);
        if (id < 0) {
            id *= -1;
        }
        if (id == 0) {
            id += 1;
        }
        String gym_id = f_name.getText() + Integer.toString(id);
        
        try {
            if (fname.equals("") || lname.equals("") || ag.equals("") || gen.equals("") || ht.equals("") || wt.equals("") || bl.equals("") || mob.equals("") || mail.equals("") || nd.equals("") || us.equals("") || pa.equals("") || flag == 0) {
                JOptionPane.showMessageDialog(null, "Opps!! Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                Class.forName("com.mysql.jdbc.Driver");
                Connection databse = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                String sql = "insert into member_info (firstname,lastname,age,gender,height,weight,bg,mobile,email,nid,username,password,picture,package,id,bill,tr_name,Jan,Feb,Mar,April,May,June,July,Aug,Sept,Oct,Nov,Decm) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement p = (PreparedStatement) databse.prepareStatement(sql);
                p.setString(1, fname);
                p.setString(2, lname);
                p.setString(3, ag);
                p.setString(4, gen);
                p.setString(5, ht);
                p.setString(6, wt);
                p.setString(7, bl);
                p.setString(8, mob);
                p.setString(9, mail);
                p.setString(10, nd);
                p.setString(11, us);
                p.setString(12, pa);
                p.setString(13, pic_path.getText());
                p.setString(14, pac);
                p.setString(15, gym_id);
                p.setString(16, bill);
                p.setString(17, tr_name);
                p.setString(18, "");
                p.setString(19, "");
                p.setString(20, "");
                p.setString(21, "");
                p.setString(22, "");
                p.setString(23, "");
                p.setString(24, "");
                p.setString(25, "");
                p.setString(26, "");
                p.setString(27, "");
                p.setString(28, "");
                p.setString(29, "");
                
                boolean mpass = checkpass(pa);
                boolean memail = checkemail(mail);
                boolean muser = checkuser(us);
                boolean mblood = checkblood(bl);
                boolean mphone = checkmobile(mob);
                boolean mid = checknid(nd);
                
                if (!pic_path.getText().equals("") && (mphone) && (mid) && (gen.equals("M")) || (gen.equals("F")) && (mpass) && (memail) && (muser) && (mblood) && pa.length() == 8) {
                    p.executeUpdate();
                    dispose();
                    databse.close();
                    JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);
                    
                    MemberLog ml = new MemberLog();
                    ml.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Opps!! Try Again", "Warning", JOptionPane.ERROR_MESSAGE);
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Member_regBtnActionPerformed

    private void bgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseEntered
        bglab.setText("*A/B/O/AB (+/-)");
    }//GEN-LAST:event_bgMouseEntered

    private void bgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseExited
        bglab.setText("");
    }//GEN-LAST:event_bgMouseExited

    private void mobileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseEntered
        moblab.setText("*Must be 11 digits");
    }//GEN-LAST:event_mobileMouseEntered

    private void mobileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseExited
        moblab.setText("");
    }//GEN-LAST:event_mobileMouseExited

    private void emailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseEntered
        elab.setText("*Must contain Small letter, Number, @, ' .'");
    }//GEN-LAST:event_emailMouseEntered

    private void emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseExited
        elab.setText("");
    }//GEN-LAST:event_emailMouseExited

    private void nidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseEntered
        nilab.setText("*Must contain 10 digits");
    }//GEN-LAST:event_nidMouseEntered

    private void nidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseExited
        nilab.setText("");
    }//GEN-LAST:event_nidMouseExited

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        unlab.setText("*Must contain Capital letter & Number");
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        unlab.setText("");
    }//GEN-LAST:event_userMouseExited

    private void passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseEntered
        palab.setText("*Must be 8 characters (At least 1 Capital Letter & 1 Number)");
    }//GEN-LAST:event_passMouseEntered

    private void passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseExited
        palab.setText("");
    }//GEN-LAST:event_passMouseExited

    private void Attach_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attach_btnActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            pic_path.setText(filename);
            Image getAbsolutePath = null;
            ImageIcon icon = new ImageIcon(filename);
            Image image = icon.getImage().getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
            pic.setIcon(icon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_Attach_btnActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void Attach_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attach_btnMouseEntered
        pic_info.setText("*Pic must be 250px X 240px");
    }//GEN-LAST:event_Attach_btnMouseEntered

    private void Attach_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attach_btnMouseExited
        pic_info.setText("");
    }//GEN-LAST:event_Attach_btnMouseExited

    private void Admin_regBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admin_regBtnMouseEntered
        acc_info.setText("*Registering as An Admin");
        Admin_regBtn.setBackground(new Color(153,0,61));
    }//GEN-LAST:event_Admin_regBtnMouseEntered

    private void Admin_regBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admin_regBtnMouseExited
        acc_info.setText("");
        Admin_regBtn.setBackground(new Color(255,153,194));
    }//GEN-LAST:event_Admin_regBtnMouseExited

    private void Trainer_regBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Trainer_regBtnMouseEntered
        acc_info.setText("*Registering As a Trainer");
        Trainer_regBtn.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_Trainer_regBtnMouseEntered

    private void Trainer_regBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Trainer_regBtnMouseExited
        acc_info.setText("");
        Trainer_regBtn.setBackground(new Color(179,255,179));
    }//GEN-LAST:event_Trainer_regBtnMouseExited

    private void Member_regBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Member_regBtnMouseEntered
        acc_info.setText("*Registering as a Member");
        Member_regBtn.setBackground(new Color(230,230,0));
    }//GEN-LAST:event_Member_regBtnMouseEntered

    private void Member_regBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Member_regBtnMouseExited
        acc_info.setText("");
        Member_regBtn.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_Member_regBtnMouseExited

    private void pic_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pic_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pic_pathActionPerformed

    private void packMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packMouseEntered
        pac_info.setText("*Only For Members");
    }//GEN-LAST:event_packMouseEntered

    private void packMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packMouseExited
        pac_info.setText("");
    }//GEN-LAST:event_packMouseExited

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
        
        if (pack.getSelectedIndex() == 0) {
            flag = 1;
        } else if (pack.getSelectedIndex() == 1) {
            flag = 2;
        } else if (pack.getSelectedIndex() == 2) {
            flag = 3;
        } else if (pack.getSelectedIndex() == 3) {
            flag = 4;
        } else if (pack.getSelectedIndex() == 4) {
            flag = 5;
        }

    }//GEN-LAST:event_packActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void pinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinMouseEntered
        acc_info.setText("*Not for member");
    }//GEN-LAST:event_pinMouseEntered

    private void pinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinMouseExited
        acc_info.setText("");
    }//GEN-LAST:event_pinMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setForeground(Color.white);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setForeground(Color.red);
    }//GEN-LAST:event_backMouseExited
    
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
            java.util.logging.Logger.getLogger(RegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_regBtn;
    private javax.swing.JButton Attach_btn;
    private javax.swing.JButton Member_regBtn;
    private javax.swing.JButton Trainer_regBtn;
    private javax.swing.JLabel acc_info;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JTextField bg;
    private javax.swing.JLabel bglab;
    private javax.swing.JLabel elab;
    private javax.swing.JTextField email;
    private javax.swing.JTextField f_name;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField height;
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
    private javax.swing.JTextField l_name;
    private javax.swing.JTextField mobile;
    private javax.swing.JLabel moblab;
    private javax.swing.JTextField nid;
    private javax.swing.JLabel nilab;
    private javax.swing.JLabel pac_info;
    private javax.swing.JComboBox<String> pack;
    private javax.swing.JLabel palab;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel pic_info;
    private javax.swing.JTextField pic_path;
    private javax.swing.JPasswordField pin;
    private javax.swing.JLabel unlab;
    private javax.swing.JTextField user;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
