/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_trial;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author MN
 */
public class TrainerMain extends javax.swing.JFrame {

    /**
     * Creates new form TrainerMain
     */
    public TrainerMain() {
        initComponents();
    }
    public Connection database;
    int ts = 0;
    int button = 0;
    int button2 = 0;
    int show = 0;

    private void updateTable1() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select work,sets,reps,day  from trainer_manik";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            wopt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable2() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select work,sets,reps,day  from trainer_milon";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            wopt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable3() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select work,sets,reps,day  from trainer_sahin";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            wopt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable4() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select work,sets,reps,day  from trainer_rabbi";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            wopt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable5() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select work,sets,reps,day  from trainer_nighat";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            wopt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable1_1() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select month,member  from trainer_manik_mem";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            amt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable2_2() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select month,member from trainer_milon_mem";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            amt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable3_3() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select month,member from trainer_sahin_mem";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            amt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable4_4() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select month,member from trainer_rabbi_mem";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            amt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateTable5_5() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

            String sql = "select month,member  from trainer_nighat_mem";
            PreparedStatement p = database.prepareStatement(sql);
            ResultSet ans = p.executeQuery();
            amt.setModel(DbUtils.resultSetToTableModel(ans));
            ans.close();
            p.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private String SelectMonth() {
        String m = null;

        if (month.getMonth() == 0) {
            m = "January";
        }
        if (month.getMonth() == 1) {
            m = "February";
        }
        if (month.getMonth() == 2) {
            m = "March";
        }
        if (month.getMonth() == 3) {
            m = "April";
        }
        if (month.getMonth() == 4) {
            m = "May";
        }
        if (month.getMonth() == 5) {
            m = "June";
        }
        if (month.getMonth() == 6) {
            m = "July";
        }
        if (month.getMonth() == 7) {
            m = "August";
        }
        if (month.getMonth() == 8) {
            m = "September";
        }
        if (month.getMonth() == 9) {
            m = "October";
        }
        if (month.getMonth() == 10) {
            m = "November";
        }
        if (month.getMonth() == 11) {
            m = "December";
        }

        return m;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        bg = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        usertr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l_name = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        show_pr = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        show_paaa = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wopt = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        work = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        set = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        rep = new javax.swing.JTextField();
        legs = new javax.swing.JComboBox<>();
        chest = new javax.swing.JComboBox<>();
        shoulder = new javax.swing.JComboBox<>();
        triceps = new javax.swing.JComboBox<>();
        biceps = new javax.swing.JComboBox<>();
        back = new javax.swing.JComboBox<>();
        cardio = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tdate = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        tw_clr = new javax.swing.JButton();
        tw_add = new javax.swing.JButton();
        Pin = new javax.swing.JLabel();
        ver = new javax.swing.JButton();
        twpin = new javax.swing.JPasswordField();
        tw_show = new javax.swing.JButton();
        twd = new javax.swing.JTextField();
        twds_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        amt = new javax.swing.JTable();
        month = new com.toedter.calendar.JMonthChooser();
        jLabel27 = new javax.swing.JLabel();
        member = new javax.swing.JTextField();
        tram_clr_btn = new javax.swing.JButton();
        tram_up_btn = new javax.swing.JButton();
        tram_show_btn = new javax.swing.JButton();
        bar_chart = new javax.swing.JButton();
        tram_select_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trainer Desk");
        setBounds(new java.awt.Rectangle(100, 20, 1200, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Height(cm)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Blood Group");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UserName");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, 30));

        f_name.setEditable(false);
        f_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jPanel1.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 200, 30));

        age.setEditable(false);
        age.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, -1));

        height.setEditable(false);
        height.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        height.setToolTipText("");
        jPanel1.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 200, 29));

        bg.setEditable(false);
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
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 200, 30));

        email.setEditable(false);
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
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 210, 28));

        usertr.setEditable(false);
        usertr.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        usertr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usertrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usertrMouseExited(evt);
            }
        });
        jPanel1.add(usertr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 200, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 107, 31));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Gender (M/F)");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Weight(kg)");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 55, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        l_name.setEditable(false);
        l_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jPanel1.add(l_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 200, 31));

        gender.setEditable(false);
        gender.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 200, -1));

        weight.setEditable(false);
        weight.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jPanel1.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 200, 29));

        mobile.setEditable(false);
        mobile.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobileMouseExited(evt);
            }
        });
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 200, 30));

        nid.setEditable(false);
        nid.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nidMouseExited(evt);
            }
        });
        jPanel1.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 200, 28));

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
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 220, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 250, 240));

        show_pr.setBackground(new java.awt.Color(0, 0, 0));
        show_pr.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        show_pr.setForeground(new java.awt.Color(204, 255, 204));
        show_pr.setText("Show Profile");
        show_pr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                show_prMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                show_prMouseExited(evt);
            }
        });
        show_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_prActionPerformed(evt);
            }
        });
        jPanel1.add(show_pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 449, 80, 30));

        jLabel1.setFont(new java.awt.Font("Niagara Engraved", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal Info");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 270, 50));

        show_paaa.setBackground(new java.awt.Color(0, 0, 0));
        show_paaa.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        show_paaa.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(show_paaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 230, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_trial/Pic/table.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 500));

        jTabbedPane1.addTab("Profile", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wopt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        wopt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkOut Name", "Set", "Reps", "Day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wopt);
        if (wopt.getColumnModel().getColumnCount() > 0) {
            wopt.getColumnModel().getColumn(0).setResizable(false);
            wopt.getColumnModel().getColumn(1).setResizable(false);
            wopt.getColumnModel().getColumn(2).setResizable(false);
            wopt.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, 310));

        jLabel15.setFont(new java.awt.Font("Niagara Engraved", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Work Out Plan");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 250, 50));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("WorkOut Name");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        work.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        work.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(work, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Sets");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        set.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        set.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(set, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, 30));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Reps");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        rep.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(rep, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        legs.setBackground(new java.awt.Color(255, 51, 255));
        legs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free Squat", "Barbell Squat", "Leg Press", "Hack Squat", "Leg Extension", "Leg Curl", "Leg Seated  Pull Up", "Leg Stand Pull Up" }));
        legs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legsActionPerformed(evt);
            }
        });
        jPanel2.add(legs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, -1));

        chest.setBackground(new java.awt.Color(255, 51, 255));
        chest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Push Up", "Chin Up", "Flat Bench Press", "Inclined Bench Press", "Declined Bench Press", "Flat Dumbell Fly", "Inclined Dumbell Fly", "Flat Dumbell Press", "Inclined Dumbell Press", "Pec Deck Fly", "Cable Fly " }));
        chest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chestActionPerformed(evt);
            }
        });
        jPanel2.add(chest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        shoulder.setBackground(new java.awt.Color(255, 51, 255));
        shoulder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dumbell Shoulder Press", "Barbell Overhead Press", "Standing Dumbell Fly", "Trap Rise", "Military Barbell Press", "Dips", "Upright rows", " " }));
        shoulder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoulderActionPerformed(evt);
            }
        });
        jPanel2.add(shoulder, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 150, -1));

        triceps.setBackground(new java.awt.Color(255, 0, 255));
        triceps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Close Grip Bench Press", "Close Grip Floor Press", "Dips", "Machine Dips", "Kickback", "Skull-Crusher", "One hand Extension", "Cable Row" }));
        triceps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tricepsActionPerformed(evt);
            }
        });
        jPanel2.add(triceps, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        biceps.setBackground(new java.awt.Color(255, 0, 255));
        biceps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dumbell Curl", "Barbell Curl", "Hammer Curl", "Ez Bar Curl", "Concentration Curl", "Over Head Cable Curl", " " }));
        biceps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicepsActionPerformed(evt);
            }
        });
        jPanel2.add(biceps, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 150, -1));

        back.setBackground(new java.awt.Color(255, 0, 255));
        back.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Front Machine lat ", "Back Machine Lat", "DeadLift", "Pull Up", "Bent Over Row", "One Arm Dumbell row", "Standing T Bar Row" }));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 150, -1));

        cardio.setBackground(new java.awt.Color(255, 51, 255));
        cardio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TreadMill", "Cycle", "Crossfit", "Push Up", "Chin Up", "Skipping", "Twist", "Rope", "Free Squat", "Box", " " }));
        cardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioActionPerformed(evt);
            }
        });
        jPanel2.add(cardio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 120, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cardio");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 100, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Back");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Shoulder");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Biceps");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Chest");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Triceps");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Legs");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tdate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel2.add(tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 40, 30));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Date");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        tw_clr.setBackground(new java.awt.Color(0, 0, 0));
        tw_clr.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        tw_clr.setForeground(new java.awt.Color(255, 0, 51));
        tw_clr.setText("Clear");
        tw_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tw_clrActionPerformed(evt);
            }
        });
        jPanel2.add(tw_clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, 30));

        tw_add.setBackground(new java.awt.Color(0, 0, 0));
        tw_add.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        tw_add.setForeground(new java.awt.Color(51, 255, 51));
        tw_add.setText("Add");
        tw_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tw_addActionPerformed(evt);
            }
        });
        jPanel2.add(tw_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 100, 30));

        Pin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Pin.setForeground(new java.awt.Color(255, 255, 255));
        Pin.setText("PIN");
        jPanel2.add(Pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        ver.setBackground(new java.awt.Color(0, 0, 0));
        ver.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ver.setForeground(new java.awt.Color(102, 255, 204));
        ver.setText("Verify");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel2.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 80, 30));

        twpin.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jPanel2.add(twpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 110, -1));

        tw_show.setBackground(new java.awt.Color(0, 0, 0));
        tw_show.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        tw_show.setForeground(new java.awt.Color(255, 153, 255));
        tw_show.setText("Show");
        tw_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tw_showActionPerformed(evt);
            }
        });
        jPanel2.add(tw_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 100, 30));

        twd.setEditable(false);
        jPanel2.add(twd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 180, 30));

        twds_btn.setBackground(new java.awt.Color(0, 0, 0));
        twds_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        twds_btn.setForeground(new java.awt.Color(255, 204, 204));
        twds_btn.setText("Select");
        twds_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twds_btnActionPerformed(evt);
            }
        });
        jPanel2.add(twds_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 90, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 80, 30));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_trial/Pic/table.png"))); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1100, 510));

        jTabbedPane1.addTab("Routine", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        amt.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        amt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Alloted Member "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(amt);
        if (amt.getColumnModel().getColumnCount() > 0) {
            amt.getColumnModel().getColumn(0).setResizable(false);
            amt.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 400, 240));

        month.setMonth(0);
        jPanel4.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, 30));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Alloted Member ");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        member.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel4.add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 160, -1));

        tram_clr_btn.setBackground(new java.awt.Color(0, 0, 0));
        tram_clr_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tram_clr_btn.setForeground(new java.awt.Color(255, 153, 0));
        tram_clr_btn.setText("Clear");
        tram_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tram_clr_btnActionPerformed(evt);
            }
        });
        jPanel4.add(tram_clr_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 30));

        tram_up_btn.setBackground(new java.awt.Color(0, 0, 0));
        tram_up_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tram_up_btn.setForeground(new java.awt.Color(204, 204, 255));
        tram_up_btn.setText("Update");
        tram_up_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tram_up_btnActionPerformed(evt);
            }
        });
        jPanel4.add(tram_up_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 110, 30));

        tram_show_btn.setBackground(new java.awt.Color(0, 0, 0));
        tram_show_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tram_show_btn.setForeground(new java.awt.Color(255, 153, 255));
        tram_show_btn.setText("Show");
        tram_show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tram_show_btnActionPerformed(evt);
            }
        });
        jPanel4.add(tram_show_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 120, 30));

        bar_chart.setBackground(new java.awt.Color(0, 0, 0));
        bar_chart.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bar_chart.setForeground(new java.awt.Color(102, 255, 204));
        bar_chart.setText("Bar Chart");
        bar_chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bar_chartActionPerformed(evt);
            }
        });
        jPanel4.add(bar_chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 110, 30));

        tram_select_btn.setBackground(new java.awt.Color(0, 0, 0));
        tram_select_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tram_select_btn.setForeground(new java.awt.Color(255, 204, 204));
        tram_select_btn.setText("Select");
        tram_select_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tram_select_btnActionPerformed(evt);
            }
        });
        jPanel4.add(tram_select_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 100, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 439, 80, 30));

        jLabel31.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Alloted Member in One Year");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 380, 70));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_trial/Pic/table.png"))); // NOI18N
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 500));

        jTabbedPane1.addTab("Alloted Member", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 28, 1100, 530));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_trial/Pic/1200X700(backsteel).png"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseEntered

    }//GEN-LAST:event_bgMouseEntered

    private void bgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseExited

    }//GEN-LAST:event_bgMouseExited

    private void emailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseEntered

    }//GEN-LAST:event_emailMouseEntered

    private void emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseExited

    }//GEN-LAST:event_emailMouseExited

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void usertrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertrMouseEntered

    }//GEN-LAST:event_usertrMouseEntered

    private void usertrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertrMouseExited

    }//GEN-LAST:event_usertrMouseExited

    private void mobileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseEntered

    }//GEN-LAST:event_mobileMouseEntered

    private void mobileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseExited

    }//GEN-LAST:event_mobileMouseExited

    private void nidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseEntered

    }//GEN-LAST:event_nidMouseEntered

    private void nidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseExited

    }//GEN-LAST:event_nidMouseExited

    private void passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseEntered

    }//GEN-LAST:event_passMouseEntered

    private void passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseExited

    }//GEN-LAST:event_passMouseExited

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void show_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_prActionPerformed
        String adpa = new String(pass.getPassword());
        if (adpa.equals("")) {
            JOptionPane.showMessageDialog(null, " Empty Password ", "Warning !!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                String sql = "select * from trainer_info where  password = ?";
                PreparedStatement p = database.prepareStatement(sql);
                p.setString(1, adpa);
                ResultSet ans = p.executeQuery();

                if (ans.next()) {

                    String fname = ans.getString("firstname");
                    String lname = ans.getString("lastname");
                    String ag = ans.getString("age");
                    String gen = ans.getString("gender");
                    String ht = ans.getString("height");
                    String wt = ans.getString("weight");
                    String bl = ans.getString("bg");
                    String mob = ans.getString("mobile");
                    String mail = ans.getString("email");
                    String nd = ans.getString("nid");
                    String us = ans.getString("username");
                    String pa = ans.getString("password");
                    String img = ans.getString("picture");

                    f_name.setText(fname);
                    l_name.setText(lname);
                    age.setText(ag);
                    gender.setText(gen);
                    height.setText(ht);
                    weight.setText(wt);
                    bg.setText(bl);
                    mobile.setText(mob);
                    email.setText(mail);
                    nid.setText(nd);
                    usertr.setText(us);

                    ImageIcon newimage = new ImageIcon(img);
                    pic.setIcon(newimage);

                } else {
                    JOptionPane.showMessageDialog(null, " Invalid Password ", "Warning", JOptionPane.ERROR_MESSAGE);
                    pass.setText("");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_show_prActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void legsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legsActionPerformed
        if (legs.getSelectedIndex() == 0) {
            work.setText("Free Squat");
        } else if (legs.getSelectedIndex() == 1) {
            work.setText("Barbell Squat");
        } else if (legs.getSelectedIndex() == 2) {
            work.setText("Leg Press");
        } else if (legs.getSelectedIndex() == 3) {
            work.setText("Hack Squat");
        } else if (legs.getSelectedIndex() == 4) {
            work.setText("Leg Extension");
        } else if (legs.getSelectedIndex() == 5) {
            work.setText("Leg Curl");
        } else if (legs.getSelectedIndex() == 6) {
            work.setText("Leg Seated Pull Up");
        } else if (legs.getSelectedIndex() == 7) {
            work.setText("Leg Stand Pull Up");
        }
    }//GEN-LAST:event_legsActionPerformed

    private void chestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chestActionPerformed
        if (chest.getSelectedIndex() == 0) {
            work.setText("Push Up");
        } else if (chest.getSelectedIndex() == 1) {
            work.setText("Chin Up");
        } else if (chest.getSelectedIndex() == 2) {
            work.setText("Flat Bench Press");
        } else if (chest.getSelectedIndex() == 3) {
            work.setText("Inclined Bench Press");
        } else if (chest.getSelectedIndex() == 4) {
            work.setText("Declined Bench Press");
        } else if (chest.getSelectedIndex() == 5) {
            work.setText("Flat Dumbell Fly");
        } else if (chest.getSelectedIndex() == 6) {
            work.setText("Inclined Dumbell Fly");
        } else if (chest.getSelectedIndex() == 7) {
            work.setText("Flat Dumbell Press");
        } else if (chest.getSelectedIndex() == 8) {
            work.setText("Inclined Dumbell Press");
        } else if (chest.getSelectedIndex() == 9) {
            work.setText("Pec Deck Fly");
        } else if (chest.getSelectedIndex() == 10) {
            work.setText("Cable Fly");
        }

    }//GEN-LAST:event_chestActionPerformed

    private void shoulderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoulderActionPerformed
        if (shoulder.getSelectedIndex() == 0) {
            work.setText("Dumbell Shoulder Press");
        } else if (shoulder.getSelectedIndex() == 1) {
            work.setText("Barbell Overhead Press");
        } else if (shoulder.getSelectedIndex() == 2) {
            work.setText("Standing Dumbell Fly");
        } else if (shoulder.getSelectedIndex() == 3) {
            work.setText("Trap Rise");
        } else if (shoulder.getSelectedIndex() == 4) {
            work.setText("Military Barbell Press");
        } else if (shoulder.getSelectedIndex() == 5) {
            work.setText("Dips");
        } else if (shoulder.getSelectedIndex() == 6) {
            work.setText("Upright rows");
        }
    }//GEN-LAST:event_shoulderActionPerformed

    private void cardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioActionPerformed
        if (cardio.getSelectedIndex() == 0) {
            work.setText("TreadMill");
        } else if (cardio.getSelectedIndex() == 1) {
            work.setText("Cycle");
        } else if (cardio.getSelectedIndex() == 2) {
            work.setText("Crossfit");
        } else if (cardio.getSelectedIndex() == 3) {
            work.setText("Push Up");
        } else if (cardio.getSelectedIndex() == 4) {
            work.setText("Chin Up");
        } else if (cardio.getSelectedIndex() == 5) {
            work.setText("Skipping");
        } else if (cardio.getSelectedIndex() == 6) {
            work.setText("Twist");
        } else if (cardio.getSelectedIndex() == 7) {
            work.setText("Rope");
        } else if (cardio.getSelectedIndex() == 8) {
            work.setText("Free Squat");
        } else if (cardio.getSelectedIndex() == 9) {
            work.setText("Box");
        }

    }//GEN-LAST:event_cardioActionPerformed

    private void tricepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tricepsActionPerformed
        if (triceps.getSelectedIndex() == 0) {
            work.setText("Close Grip Bench Press");
        } else if (triceps.getSelectedIndex() == 1) {
            work.setText("Close Grip Floor Press");
        } else if (triceps.getSelectedIndex() == 2) {
            work.setText("Dips");
        } else if (triceps.getSelectedIndex() == 3) {
            work.setText("Machine Dips");
        } else if (triceps.getSelectedIndex() == 4) {
            work.setText("Kickbacks");
        } else if (triceps.getSelectedIndex() == 5) {
            work.setText("Skull-crusher");
        } else if (triceps.getSelectedIndex() == 6) {
            work.setText("One hand Extention");
        } else if (triceps.getSelectedIndex() == 7) {
            work.setText("Cable row");
        }
    }//GEN-LAST:event_tricepsActionPerformed

    private void bicepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicepsActionPerformed
        if (biceps.getSelectedIndex() == 0) {
            work.setText("Dumbell Curl");
        } else if (biceps.getSelectedIndex() == 1) {
            work.setText("Barbell Curl");
        } else if (biceps.getSelectedIndex() == 2) {
            work.setText("Hammer Curl");
        } else if (biceps.getSelectedIndex() == 3) {
            work.setText("Ez bar Curl");
        } else if (biceps.getSelectedIndex() == 4) {
            work.setText("Concentration Curl");
        } else if (biceps.getSelectedIndex() == 5) {
            work.setText("Over Head Cable Curl");
        }
    }//GEN-LAST:event_bicepsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (back.getSelectedIndex() == 0) {
            work.setText("Front  Machine Lat");
        } else if (back.getSelectedIndex() == 1) {
            work.setText("Back Machine Lat");
        } else if (back.getSelectedIndex() == 2) {
            work.setText("DeadLift");
        } else if (back.getSelectedIndex() == 3) {
            work.setText("Pull Up");
        } else if (back.getSelectedIndex() == 4) {
            work.setText("Bent Over row");
        } else if (back.getSelectedIndex() == 5) {
            work.setText("One Arm Dumbell row");
        } else if (back.getSelectedIndex() == 6) {
            work.setText("Standing T bar row");
        }
    }//GEN-LAST:event_backActionPerformed

    private void tw_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tw_clrActionPerformed
        work.setText("");
        set.setText("");
        rep.setText("");
        twd.setText("");
    }//GEN-LAST:event_tw_clrActionPerformed

    private void twds_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twds_btnActionPerformed
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String date = sdf.format(tdate.getDate());
            twd.setText(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Please Select The Date First ", "Missing Date", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_twds_btnActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        if (twpin.getText().equals("1234")) {
            ts = 1;
            JOptionPane.showMessageDialog(null, "Verification Successful", "Welcome Manik", JOptionPane.PLAIN_MESSAGE);
        } else if (twpin.getText().equals("2345")) {
            ts = 2;
            JOptionPane.showMessageDialog(null, "Verification Successful", "Welcome Milon", JOptionPane.PLAIN_MESSAGE);
        } else if (twpin.getText().equals("4567")) {
            ts = 3;
            JOptionPane.showMessageDialog(null, "Verification Successful", "Welcome Sahin", JOptionPane.PLAIN_MESSAGE);
        } else if (twpin.getText().equals("5678")) {
            ts = 4;
            JOptionPane.showMessageDialog(null, "Verification Successful", "Welcome Rabbi", JOptionPane.PLAIN_MESSAGE);
        } else if (twpin.getText().equals("6789")) {
            ts = 5;
            JOptionPane.showMessageDialog(null, "Verification Successful", "Welcome Nighat", JOptionPane.PLAIN_MESSAGE);
        } else {
            ts = 0;
            JOptionPane.showMessageDialog(null, " Opps!!! Invalid Pin ", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verActionPerformed

    private void tw_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tw_addActionPerformed
        String wo = work.getText();
        String se = set.getText();
        String re = rep.getText();
        String da = twd.getText();

        if (ts == 0) {
            JOptionPane.showMessageDialog(null, "Opps!! Verify First", "Warning", JOptionPane.ERROR_MESSAGE);
        }

        if (ts == 1) {
            try {

                if (wo.equals("") || se.equals("") || re.equals("") || da.equals("")) {
                    JOptionPane.showMessageDialog(null, "Opps!! Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    com.mysql.jdbc.Connection databse = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "insert into trainer_manik (work,sets,reps,day) values (?,?,?,?)";
                    com.mysql.jdbc.PreparedStatement p = (com.mysql.jdbc.PreparedStatement) databse.prepareStatement(sql);
                    p.setString(1, wo);
                    p.setString(2, se);
                    p.setString(3, re);
                    p.setString(4, da);

                    p.executeUpdate();
                    updateTable1();
                    databse.close();
                    JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);

                    work.setText("");
                    set.setText("");
                    rep.setText("");
                    twd.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 2) {
            try {

                if (wo.equals("") || se.equals("") || re.equals("") || da.equals("")) {
                    JOptionPane.showMessageDialog(null, "Opps!! Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    com.mysql.jdbc.Connection databse = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "insert into trainer_milon (work,sets,reps,day) values (?,?,?,?)";
                    com.mysql.jdbc.PreparedStatement p = (com.mysql.jdbc.PreparedStatement) databse.prepareStatement(sql);
                    p.setString(1, wo);
                    p.setString(2, se);
                    p.setString(3, re);
                    p.setString(4, da);

                    p.executeUpdate();
                    updateTable2();
                    databse.close();
                    JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);

                    work.setText("");
                    set.setText("");
                    rep.setText("");
                    twd.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 3) {
            try {

                if (wo.equals("") || se.equals("") || re.equals("") || da.equals("")) {
                    JOptionPane.showMessageDialog(null, "Opps!! Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    com.mysql.jdbc.Connection databse = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "insert into trainer_sahin (work,sets,reps,day) values (?,?,?,?)";
                    com.mysql.jdbc.PreparedStatement p = (com.mysql.jdbc.PreparedStatement) databse.prepareStatement(sql);
                    p.setString(1, wo);
                    p.setString(2, se);
                    p.setString(3, re);
                    p.setString(4, da);

                    p.executeUpdate();
                    updateTable3();
                    databse.close();
                    JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);

                    work.setText("");
                    set.setText("");
                    rep.setText("");
                    twd.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 4) {
            try {

                if (wo.equals("") || se.equals("") || re.equals("") || da.equals("")) {
                    JOptionPane.showMessageDialog(null, "Opps!! Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    com.mysql.jdbc.Connection databse = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "insert into trainer_rabbi (work,sets,reps,day) values (?,?,?,?)";
                    com.mysql.jdbc.PreparedStatement p = (com.mysql.jdbc.PreparedStatement) databse.prepareStatement(sql);
                    p.setString(1, wo);
                    p.setString(2, se);
                    p.setString(3, re);
                    p.setString(4, da);

                    p.executeUpdate();
                    updateTable4();
                    databse.close();
                    JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);

                    work.setText("");
                    set.setText("");
                    rep.setText("");
                    twd.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 5) {
            try {

                if (wo.equals("") || se.equals("") || re.equals("") || da.equals("")) {
                    JOptionPane.showMessageDialog(null, "Opps!! Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    com.mysql.jdbc.Connection databse = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "insert into trainer_nighat (work,sets,reps,day) values (?,?,?,?)";
                    com.mysql.jdbc.PreparedStatement p = (com.mysql.jdbc.PreparedStatement) databse.prepareStatement(sql);
                    p.setString(1, wo);
                    p.setString(2, se);
                    p.setString(3, re);
                    p.setString(4, da);

                    p.executeUpdate();
                    updateTable5();
                    databse.close();
                    JOptionPane.showMessageDialog(null, "Successfully Submitted", "Welcome", JOptionPane.PLAIN_MESSAGE);

                    work.setText("");
                    set.setText("");
                    rep.setText("");
                    twd.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_tw_addActionPerformed

    private void tw_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tw_showActionPerformed
        if (ts == 0) {
            JOptionPane.showMessageDialog(null, "Opps!! Verify Yourself First", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        if (ts == 1) {
            if (button == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_manik ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String work = ans.getString("work");
                        String set = ans.getString("sets");
                        String rep = ans.getString("reps");
                        String day = ans.getString("day");

                        String tbdata[] = {work, set, rep, day};
                        DefaultTableModel tm = (DefaultTableModel) wopt.getModel();
                        tm.addRow(tbdata);
                        button = 1;

                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 2) {
            if (button == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_milon ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String work = ans.getString("work");
                        String set = ans.getString("sets");
                        String rep = ans.getString("reps");
                        String day = ans.getString("day");

                        String tbdata[] = {work, set, rep, day};
                        DefaultTableModel tm = (DefaultTableModel) wopt.getModel();
                        tm.addRow(tbdata);
                        button = 1;

                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 3) {
            if (button == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_sahin ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String work = ans.getString("work");
                        String set = ans.getString("sets");
                        String rep = ans.getString("reps");
                        String day = ans.getString("day");

                        String tbdata[] = {work, set, rep, day};
                        DefaultTableModel tm = (DefaultTableModel) wopt.getModel();
                        tm.addRow(tbdata);
                        button = 1;

                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 4) {
            if (button == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_rabbi ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String work = ans.getString("work");
                        String set = ans.getString("sets");
                        String rep = ans.getString("reps");
                        String day = ans.getString("day");

                        String tbdata[] = {work, set, rep, day};
                        DefaultTableModel tm = (DefaultTableModel) wopt.getModel();
                        tm.addRow(tbdata);
                        button = 1;

                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 5) {
            if (button == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_nighat ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String work = ans.getString("work");
                        String set = ans.getString("sets");
                        String rep = ans.getString("reps");
                        String day = ans.getString("day");

                        String tbdata[] = {work, set, rep, day};
                        DefaultTableModel tm = (DefaultTableModel) wopt.getModel();
                        tm.addRow(tbdata);
                        button = 1;

                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_tw_showActionPerformed

    private void tram_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tram_clr_btnActionPerformed
        member.setText("");
       
        
    }//GEN-LAST:event_tram_clr_btnActionPerformed

    private void tram_up_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tram_up_btnActionPerformed

        String am = member.getText();
        String m = SelectMonth();

        if (ts == 0) {
            JOptionPane.showMessageDialog(null, "Opps!! Verify Yourself First", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        if (ts == 1) {
            if (am.equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

                    String sql = "update trainer_manik_mem set member=?  where month=?  ";

                    PreparedStatement p = database.prepareStatement(sql);

                    p.setString(1, am);
                    p.setString(2, m);

                    p.executeUpdate();
                    updateTable1_1();
                    button2=1;
                    show=1;
                    database.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated");
                    
                    member.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 2) {
            if (am.equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

                    String sql = "update trainer_milon_mem set member=?  where month=?  ";

                    PreparedStatement p = database.prepareStatement(sql);

                    p.setString(1, am);
                    p.setString(2, m);

                    p.executeUpdate();
                    updateTable2_2();
                    button2=1;
                    show=1;
                    database.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated");

                    member.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 3) {
            if (am.equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

                    String sql = "update trainer_sahin_mem set member=?  where month=?  ";

                    PreparedStatement p = database.prepareStatement(sql);

                    p.setString(1, am);
                    p.setString(2, m);

                    p.executeUpdate();
                    updateTable3_3();
                    button2=1;
                    show=1;
                    database.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated");

                    member.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 4) {
            if (am.equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

                    String sql = "update trainer_rabbi_mem set member=?  where month=?  ";

                    PreparedStatement p = database.prepareStatement(sql);

                    p.setString(1, am);
                    p.setString(2, m);

                    p.executeUpdate();
                    updateTable4_4();
                    button2=1;
                    show=1;
                    database.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated");

                    member.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 5) {
            if (am.equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");

                    String sql = "update trainer_nighat_mem set member=?  where month=?  ";

                    PreparedStatement p = database.prepareStatement(sql);

                    p.setString(1, am);
                    p.setString(2, m);

                    p.executeUpdate();
                    updateTable5_5();
                    button2=1;
                    show=1;
                    database.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated");

                    member.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_tram_up_btnActionPerformed

    private void tram_show_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tram_show_btnActionPerformed

        if (ts == 0) {
            JOptionPane.showMessageDialog(null, "Opps!! Verify Yourself First", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        if (ts == 1) {
            if (button2 == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_manik_mem ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String mn = ans.getString("month");
                        String me = ans.getString("member");

                        String tbdata[] = {mn, me};
                        DefaultTableModel tm = (DefaultTableModel) amt.getModel();
                        tm.addRow(tbdata);
                        button2 = 1;
                        show = 1;
                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 2) {
            if (button2 == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_milon_mem ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String mn = ans.getString("month");
                        String me = ans.getString("member");

                        String tbdata[] = {mn, me};
                        DefaultTableModel tm = (DefaultTableModel) amt.getModel();
                        tm.addRow(tbdata);
                        button2 = 1;
                        show = 1;

                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 3) {
            if (button2 == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_sahin_mem ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String mn = ans.getString("month");
                        String me = ans.getString("member");

                        String tbdata[] = {mn, me};
                        DefaultTableModel tm = (DefaultTableModel) amt.getModel();
                        tm.addRow(tbdata);
                        button2 = 1;
                        show = 1;

                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 4) {
            if (button2 == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_rabbi_mem ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String mn = ans.getString("month");
                        String me = ans.getString("member");

                        String tbdata[] = {mn, me};
                        DefaultTableModel tm = (DefaultTableModel) amt.getModel();
                        tm.addRow(tbdata);
                        button2 = 1;
                        show = 1;
                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ts == 5) {
            if (button2 == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                    String sql = "select * from trainer_nighat_mem ";
                    PreparedStatement p = database.prepareStatement(sql);
                    ResultSet ans = p.executeQuery();

                    while (ans.next()) {

                        String mn = ans.getString("month");
                        String me = ans.getString("member");

                        String tbdata[] = {mn, me};
                        DefaultTableModel tm = (DefaultTableModel) amt.getModel();
                        tm.addRow(tbdata);
                        button2 = 1;
                        show = 1;
                    }
                    database.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_tram_show_btnActionPerformed

    private void bar_chartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bar_chartActionPerformed
      if(show ==1 ){
            int row = 0, row1 = 1, row2 = 2, row3 = 3, row4 = 4, row5 = 5, row6 = 6, row7 = 7, row8 = 8, row9 = 9, row10 = 10, row11 = 11;
            int column = 1;

            String jamem = amt.getModel().getValueAt(row, column).toString();
            String febmem = amt.getModel().getValueAt(row1, column).toString();
            String mamem = amt.getModel().getValueAt(row2, column).toString();
            String apmem = amt.getModel().getValueAt(row3, column).toString();
            String maymem = amt.getModel().getValueAt(row4, column).toString();
            String jumem = amt.getModel().getValueAt(row5, column).toString();
            String julmem = amt.getModel().getValueAt(row6, column).toString();
            String aumem = amt.getModel().getValueAt(row7, column).toString();
            String sepmem = amt.getModel().getValueAt(row8, column).toString();
            String octmem = amt.getModel().getValueAt(row9, column).toString();
            String novmem = amt.getModel().getValueAt(row10, column).toString();
            String decmem = amt.getModel().getValueAt(row11, column).toString();

            if (ts == 0) {
                JOptionPane.showMessageDialog(null, "Opps!! Verify Yourself First", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            if (ts == 1) {
                DefaultCategoryDataset barchart = new DefaultCategoryDataset();
                barchart.setValue(Integer.parseInt(jamem), "Member", "January");
                barchart.setValue(Integer.parseInt(febmem), "Member", "February");
                barchart.setValue(Integer.parseInt(mamem), "Member", "March");
                barchart.setValue(Integer.parseInt(apmem), "Member", "April");
                barchart.setValue(Integer.parseInt(maymem), "Member", "May");
                barchart.setValue(Integer.parseInt(jumem), "Member", "June");
                barchart.setValue(Integer.parseInt(julmem), "Member", "July");
                barchart.setValue(Integer.parseInt(aumem), "Member", "August");
                barchart.setValue(Integer.parseInt(sepmem), "Member", "September");
                barchart.setValue(Integer.parseInt(octmem), "Member", "October");
                barchart.setValue(Integer.parseInt(novmem), "Member", "November");
                barchart.setValue(Integer.parseInt(decmem), "Member", "December");
                JFreeChart barChart = ChartFactory.createBarChart("Allotted Member Of Manik", "Monthly", "Member", barchart, PlotOrientation.VERTICAL, false, true, false);

                CategoryPlot plot = barChart.getCategoryPlot();
                plot.setRangeGridlinePaint(Color.BLACK);
                ChartFrame frame = new ChartFrame("Allotted Member", barChart, true);
                frame.setVisible(true);
                frame.setBounds(180, 30, 1000, 600);
            }
            if (ts == 2) {
                DefaultCategoryDataset barchart = new DefaultCategoryDataset();
                barchart.setValue(Integer.parseInt(jamem), "Member", "January");
                barchart.setValue(Integer.parseInt(febmem), "Member", "February");
                barchart.setValue(Integer.parseInt(mamem), "Member", "March");
                barchart.setValue(Integer.parseInt(apmem), "Member", "April");
                barchart.setValue(Integer.parseInt(maymem), "Member", "May");
                barchart.setValue(Integer.parseInt(jumem), "Member", "June");
                barchart.setValue(Integer.parseInt(julmem), "Member", "July");
                barchart.setValue(Integer.parseInt(aumem), "Member", "August");
                barchart.setValue(Integer.parseInt(sepmem), "Member", "September");
                barchart.setValue(Integer.parseInt(octmem), "Member", "October");
                barchart.setValue(Integer.parseInt(novmem), "Member", "November");
                barchart.setValue(Integer.parseInt(decmem), "Member", "December");
                JFreeChart barChart = ChartFactory.createBarChart("Allotted Member Of Milon", "Monthly", "Member", barchart, PlotOrientation.VERTICAL, false, true, false);

                CategoryPlot plot = barChart.getCategoryPlot();
                plot.setRangeGridlinePaint(Color.BLACK);
                ChartFrame frame = new ChartFrame("Allotted Member", barChart, true);
                frame.setVisible(true);
                frame.setBounds(180, 30, 1000, 600);
            }
            if (ts == 3) {
                DefaultCategoryDataset barchart = new DefaultCategoryDataset();
                barchart.setValue(Integer.parseInt(jamem), "Member", "January");
                barchart.setValue(Integer.parseInt(febmem), "Member", "February");
                barchart.setValue(Integer.parseInt(mamem), "Member", "March");
                barchart.setValue(Integer.parseInt(apmem), "Member", "April");
                barchart.setValue(Integer.parseInt(maymem), "Member", "May");
                barchart.setValue(Integer.parseInt(jumem), "Member", "June");
                barchart.setValue(Integer.parseInt(julmem), "Member", "July");
                barchart.setValue(Integer.parseInt(aumem), "Member", "August");
                barchart.setValue(Integer.parseInt(sepmem), "Member", "September");
                barchart.setValue(Integer.parseInt(octmem), "Member", "October");
                barchart.setValue(Integer.parseInt(novmem), "Member", "November");
                barchart.setValue(Integer.parseInt(decmem), "Member", "December");
                JFreeChart barChart = ChartFactory.createBarChart("Allotted Member Of Sahin", "Monthly", "Member", barchart, PlotOrientation.VERTICAL, false, true, false);

                CategoryPlot plot = barChart.getCategoryPlot();
                plot.setRangeGridlinePaint(Color.BLACK);
                ChartFrame frame = new ChartFrame("Allotted Member", barChart, true);
                frame.setVisible(true);
                frame.setBounds(180, 30, 1000, 600);
            }
            if (ts == 4) {
                DefaultCategoryDataset barchart = new DefaultCategoryDataset();
                barchart.setValue(Integer.parseInt(jamem), "Member", "January");
                barchart.setValue(Integer.parseInt(febmem), "Member", "February");
                barchart.setValue(Integer.parseInt(mamem), "Member", "March");
                barchart.setValue(Integer.parseInt(apmem), "Member", "April");
                barchart.setValue(Integer.parseInt(maymem), "Member", "May");
                barchart.setValue(Integer.parseInt(jumem), "Member", "June");
                barchart.setValue(Integer.parseInt(julmem), "Member", "July");
                barchart.setValue(Integer.parseInt(aumem), "Member", "August");
                barchart.setValue(Integer.parseInt(sepmem), "Member", "September");
                barchart.setValue(Integer.parseInt(octmem), "Member", "October");
                barchart.setValue(Integer.parseInt(novmem), "Member", "November");
                barchart.setValue(Integer.parseInt(decmem), "Member", "December");
                JFreeChart barChart = ChartFactory.createBarChart("Allotted Member Of Rabbi", "Monthly", "Member", barchart, PlotOrientation.VERTICAL, false, true, false);

                CategoryPlot plot = barChart.getCategoryPlot();
                plot.setRangeGridlinePaint(Color.BLACK);
                ChartFrame frame = new ChartFrame("Allotted Member", barChart, true);
                frame.setVisible(true);
                frame.setBounds(180, 30, 1000, 600);
            }
            if (ts == 5) {
                DefaultCategoryDataset barchart = new DefaultCategoryDataset();
                barchart.setValue(Integer.parseInt(jamem), "Member", "January");
                barchart.setValue(Integer.parseInt(febmem), "Member", "February");
                barchart.setValue(Integer.parseInt(mamem), "Member", "March");
                barchart.setValue(Integer.parseInt(apmem), "Member", "April");
                barchart.setValue(Integer.parseInt(maymem), "Member", "May");
                barchart.setValue(Integer.parseInt(jumem), "Member", "June");
                barchart.setValue(Integer.parseInt(julmem), "Member", "July");
                barchart.setValue(Integer.parseInt(aumem), "Member", "August");
                barchart.setValue(Integer.parseInt(sepmem), "Member", "September");
                barchart.setValue(Integer.parseInt(octmem), "Member", "October");
                barchart.setValue(Integer.parseInt(novmem), "Member", "November");
                barchart.setValue(Integer.parseInt(decmem), "Member", "December");
                JFreeChart barChart = ChartFactory.createBarChart("Allotted Member Of Nighat", "Monthly", "Member", barchart, PlotOrientation.VERTICAL, false, true, false);

                CategoryPlot plot = barChart.getCategoryPlot();
                plot.setRangeGridlinePaint(Color.BLACK);
                ChartFrame frame = new ChartFrame("Allotted Member", barChart, true);
                frame.setVisible(true);
                frame.setBounds(180, 30, 1000, 600);
            }
      }
      else{
           JOptionPane.showMessageDialog(null, "Empty Table", "No Data", JOptionPane.ERROR_MESSAGE);
      }
        
    }//GEN-LAST:event_bar_chartActionPerformed

    private void tram_select_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tram_select_btnActionPerformed
        if (ts == 0) {
            JOptionPane.showMessageDialog(null, "Opps!! Verify Yourself First", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        if (ts == 1) {
            String mn = SelectMonth();

            if (mn.equals("")) {
                JOptionPane.showMessageDialog(null, " Empty field ", "Warning !!!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                String sql = "select * from trainer_manik_mem where  month = ?";
                PreparedStatement p = database.prepareStatement(sql);
                p.setString(1, mn);
                ResultSet ans = p.executeQuery();

                if (ans.next()) {

                    String mem = ans.getString("member");
                    member.setText(mem);

                } else {

                    JOptionPane.showMessageDialog(null, " Invalid Month", "Warning", JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 2) {
            String mn = SelectMonth();

            if (mn.equals("")) {
                JOptionPane.showMessageDialog(null, " Empty field ", "Warning !!!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                String sql = "select * from trainer_milon_mem where  month = ?";
                PreparedStatement p = database.prepareStatement(sql);
                p.setString(1, mn);
                ResultSet ans = p.executeQuery();

                if (ans.next()) {

                    String mem = ans.getString("member");
                    member.setText(mem);

                } else {

                    JOptionPane.showMessageDialog(null, " Invalid Month", "Warning", JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 3) {
            String mn = SelectMonth();

            if (mn.equals("")) {
                JOptionPane.showMessageDialog(null, " Empty field ", "Warning !!!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                String sql = "select * from trainer_sahin_mem where  month = ?";
                PreparedStatement p = database.prepareStatement(sql);
                p.setString(1, mn);
                ResultSet ans = p.executeQuery();

                if (ans.next()) {

                    String mem = ans.getString("member");
                    member.setText(mem);

                } else {

                    JOptionPane.showMessageDialog(null, " Invalid Month", "Warning", JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 4) {
            String mn = SelectMonth();

            if (mn.equals("")) {
                JOptionPane.showMessageDialog(null, " Empty field ", "Warning !!!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                String sql = "select * from trainer_rabbi_mem where  month = ?";
                PreparedStatement p = database.prepareStatement(sql);
                p.setString(1, mn);
                ResultSet ans = p.executeQuery();

                if (ans.next()) {

                    String mem = ans.getString("member");
                    member.setText(mem);

                } else {

                    JOptionPane.showMessageDialog(null, " Invalid Month", "Warning", JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (ts == 5) {
            String mn = SelectMonth();

            if (mn.equals("")) {
                JOptionPane.showMessageDialog(null, " Empty field ", "Warning !!!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                database = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kazi_gym", "root", "");
                String sql = "select * from trainer_nighat_mem where  month = ?";
                PreparedStatement p = database.prepareStatement(sql);
                p.setString(1, mn);
                ResultSet ans = p.executeQuery();

                if (ans.next()) {

                    String mem = ans.getString("member");
                    member.setText(mem);

                } else {

                    JOptionPane.showMessageDialog(null, " Invalid Month", "Warning", JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tram_select_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void show_prMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_prMouseEntered
        show_paaa.setText("Please Enter your Password");
    }//GEN-LAST:event_show_prMouseEntered

    private void show_prMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_prMouseExited
        show_paaa.setText("");
    }//GEN-LAST:event_show_prMouseExited

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
            java.util.logging.Logger.getLogger(TrainerMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pin;
    private javax.swing.JTextField age;
    private javax.swing.JTable amt;
    private javax.swing.JComboBox<String> back;
    private javax.swing.JButton bar_chart;
    private javax.swing.JTextField bg;
    private javax.swing.JComboBox<String> biceps;
    private javax.swing.JComboBox<String> cardio;
    private javax.swing.JComboBox<String> chest;
    private javax.swing.JTextField email;
    private javax.swing.JTextField f_name;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField height;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField l_name;
    private javax.swing.JComboBox<String> legs;
    private javax.swing.JTextField member;
    private javax.swing.JTextField mobile;
    private com.toedter.calendar.JMonthChooser month;
    private javax.swing.JTextField nid;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField rep;
    private javax.swing.JTextField set;
    private javax.swing.JComboBox<String> shoulder;
    private javax.swing.JLabel show_paaa;
    private javax.swing.JButton show_pr;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JButton tram_clr_btn;
    private javax.swing.JButton tram_select_btn;
    private javax.swing.JButton tram_show_btn;
    private javax.swing.JButton tram_up_btn;
    private javax.swing.JComboBox<String> triceps;
    private javax.swing.JButton tw_add;
    private javax.swing.JButton tw_clr;
    private javax.swing.JButton tw_show;
    private javax.swing.JTextField twd;
    private javax.swing.JButton twds_btn;
    private javax.swing.JPasswordField twpin;
    private javax.swing.JTextField usertr;
    private javax.swing.JButton ver;
    private javax.swing.JTextField weight;
    private javax.swing.JTable wopt;
    private javax.swing.JTextField work;
    // End of variables declaration//GEN-END:variables
}
