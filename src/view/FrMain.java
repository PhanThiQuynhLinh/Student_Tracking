/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Navigator;
import dto.MenuDto;
import java.awt.BorderLayout;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author QuynhLinh
 */
public class FrMain extends javax.swing.JFrame {

    /**
     * Creates new form FrMain
     */
//    private final List<MenuDto> menudtos = new ArrayList<>();
    public FrMain() {
        initComponents();
        this. setTitle("Student_Tracking");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lbLogo.setIcon(new ImageIcon(getClass().getResource("/images/icon_logo_bkcit.png")));
        
        Navigator navigator = new Navigator(pnCenter); 
        navigator.setStart();
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
        pnLeft = new javax.swing.JPanel();
        pnApp = new javax.swing.JPanel();
        lbApp = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        pnHomePage = new javax.swing.JPanel();
        lbHomePage = new javax.swing.JLabel();
        pnStudentMan = new javax.swing.JPanel();
        lbStudentMan = new javax.swing.JLabel();
        pnCourseMan = new javax.swing.JPanel();
        lbCourseMan = new javax.swing.JLabel();
        pn = new javax.swing.JPanel();
        lbCourseMan1 = new javax.swing.JLabel();
        pnCourseMan2 = new javax.swing.JPanel();
        lbCourseMan2 = new javax.swing.JLabel();
        pnLogo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        pnCenter = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnLeft.setBackground(new java.awt.Color(0, 0, 0));

        pnApp.setBackground(new java.awt.Color(204, 0, 0));
        pnApp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 20));
        pnApp.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        lbApp.setBackground(new java.awt.Color(204, 0, 0));
        lbApp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbApp.setForeground(new java.awt.Color(255, 255, 255));
        lbApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_ung_dung_white_24dp.png"))); // NOI18N
        lbApp.setText("Quản Lý Học Viên");
        pnApp.add(lbApp);

        pnMenu.setBackground(new java.awt.Color(0, 0, 0));
        pnMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 12));
        pnMenu.setLayout(new java.awt.GridLayout(5, 1, 0, 8));

        pnHomePage.setBackground(new java.awt.Color(96, 100, 191));
        pnHomePage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnHomePage.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbHomePage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbHomePage.setForeground(new java.awt.Color(255, 255, 255));
        lbHomePage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu0_white_24dp.png"))); // NOI18N
        lbHomePage.setText("Màn Hình Chính");
        pnHomePage.add(lbHomePage);

        pnMenu.add(pnHomePage);

        pnStudentMan.setBackground(new java.awt.Color(76, 175, 80));
        pnStudentMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnStudentMan.setToolTipText("");
        pnStudentMan.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbStudentMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbStudentMan.setForeground(new java.awt.Color(255, 255, 255));
        lbStudentMan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbStudentMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu1_white_24dp.png"))); // NOI18N
        lbStudentMan.setText("Quản Lý Học Viên");
        pnStudentMan.add(lbStudentMan);

        pnMenu.add(pnStudentMan);

        pnCourseMan.setBackground(new java.awt.Color(76, 175, 80));
        pnCourseMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnCourseMan.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCourseMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCourseMan.setForeground(new java.awt.Color(255, 255, 255));
        lbCourseMan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCourseMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu2_white_24dp.png"))); // NOI18N
        lbCourseMan.setText("Quản Lý Khóa Học");
        pnCourseMan.add(lbCourseMan);

        pnMenu.add(pnCourseMan);

        pn.setBackground(new java.awt.Color(76, 175, 80));
        pn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCourseMan1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCourseMan1.setForeground(new java.awt.Color(255, 255, 255));
        lbCourseMan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCourseMan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu3_white_24dp.png"))); // NOI18N
        lbCourseMan1.setText("Quản Lý Lớp Học");
        pn.add(lbCourseMan1);

        pnMenu.add(pn);

        pnCourseMan2.setBackground(new java.awt.Color(76, 175, 80));
        pnCourseMan2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnCourseMan2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCourseMan2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCourseMan2.setForeground(new java.awt.Color(255, 255, 255));
        lbCourseMan2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCourseMan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu4_white_24dp.png"))); // NOI18N
        lbCourseMan2.setText("Thống Kê Dữ Liệu");
        pnCourseMan2.add(lbCourseMan2);

        pnMenu.add(pnCourseMan2);

        pnLogo.setBackground(new java.awt.Color(0, 0, 0));

        lbLogo.setText("jLabel1");
        pnLogo.add(lbLogo);

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnLeftLayout.setVerticalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addComponent(pnApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnLeft, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbApp;
    private javax.swing.JLabel lbCourseMan;
    private javax.swing.JLabel lbCourseMan1;
    private javax.swing.JLabel lbCourseMan2;
    private javax.swing.JLabel lbHomePage;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbStudentMan;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnApp;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCourseMan;
    private javax.swing.JPanel pnCourseMan2;
    private javax.swing.JPanel pnHomePage;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnStudentMan;
    // End of variables declaration//GEN-END:variables
}