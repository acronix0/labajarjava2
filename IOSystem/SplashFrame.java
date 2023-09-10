/*    */ package IOSystem;
/*    */ import java.awt.*;
/*    */ import javax.swing.*;
/*    */
/*    */

/*    */
/*    */ public class SplashFrame extends JFrame {
/*    */   public SplashFrame() {
/*  9 */     initComponents();
/* 10 */     setLocationRelativeTo((Component)null);
/*    */   }
/*    */   
/*    */   private JLabel load_lable;
/*    */   protected JLabel percent_lable;
/*    */   private JPanel sspanel;
/*    */   
/*    */   private void initComponents() {
/* 18 */     this.sspanel = new JPanel();
/* 19 */     this.load_lable = new JLabel();
/* 20 */     this.percent_lable = new JLabel();
/*    */     
/* 22 */     setDefaultCloseOperation(3);
/* 23 */     setCursor(new Cursor(3));
/* 24 */     setName("ssframe");
/* 25 */     setUndecorated(true);
/* 26 */     setResizable(false);
/*    */     
/* 28 */     this.sspanel.setBackground(new Color(255, 255, 255));
/* 29 */     this.sspanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(153, 206, 230)));
/* 30 */     this.sspanel.setPreferredSize(new Dimension(300, 300));
/*    */     
/* 32 */     this.load_lable.setBackground(new Color(255, 255, 255));
/* 33 */     this.load_lable.setFont(new Font("Century Gothic", 0, 23));
/* 34 */     this.load_lable.setHorizontalAlignment(0);
/* 35 */     this.load_lable.setText("Загрузка...");
/*    */     
/* 37 */     this.percent_lable.setFont(new Font("Century Gothic", 0, 20));
/* 38 */     this.percent_lable.setHorizontalAlignment(0);
/* 39 */     this.percent_lable.setIcon(new ImageIcon(getClass().getResource("/img/load.gif")));
/* 40 */     this.percent_lable.setText("jLabel2");
/* 41 */     this.percent_lable.setHorizontalTextPosition(0);
/*    */     
/* 43 */     GroupLayout sspanelLayout = new GroupLayout(this.sspanel);
/* 44 */     this.sspanel.setLayout(sspanelLayout);
/* 45 */     sspanelLayout.setHorizontalGroup(sspanelLayout
/* 46 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 47 */         .addComponent(this.load_lable, -1, -1, 32767)
/* 48 */         .addGroup(sspanelLayout.createSequentialGroup()
/* 49 */           .addGap(0, 1, 32767)
/* 50 */           .addComponent(this.percent_lable, -2, 295, -2)));
/*    */     
/* 52 */     sspanelLayout.setVerticalGroup(sspanelLayout
/* 53 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 54 */         .addGroup(sspanelLayout.createSequentialGroup()
/* 55 */           .addContainerGap(-1, 32767)
/* 56 */           .addComponent(this.load_lable)
/* 57 */           .addGap(27, 27, 27)
/* 58 */           .addComponent(this.percent_lable)));
/*    */ 
/*    */     
/* 61 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 62 */     getContentPane().setLayout(layout);
/* 63 */     layout.setHorizontalGroup(layout
/* 64 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 65 */         .addComponent(this.sspanel, -1, -1, -2));
/*    */     
/* 67 */     layout.setVerticalGroup(layout
/* 68 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 69 */         .addComponent(this.sspanel, -1, 318, 32767));
/*    */ 
/*    */     
/* 72 */     setBounds(0, 0, 300, 318);
/*    */   }
/*    */ }


/* Location:              C:\Users\Acronix\Desktop\АСВТ_2022_2023\Лаб_1\IOSystem.jar!\IOSystem\SplashFrame.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */