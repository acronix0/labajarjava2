/*    */ package IOSystem;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.SwingUtilities;
/*    */ import javax.swing.UIManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Main
/*    */ {
/*    */   public static void main(String[] args) {
/*    */     try {
/* 24 */       String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
/* 25 */       UIManager.setLookAndFeel(systemLookAndFeelClassName);
/* 26 */     } catch (Exception e) {
/* 27 */       JOptionPane.showMessageDialog(null, "Данный LAF не поддерживается");
/*    */     } 
/*    */     
/* 30 */     UIManager.put("FormattedTextField.inactiveBackground", Color.white);
/* 31 */     UIManager.put("Slider.focus", UIManager.get("Slider.background"));
/*    */     
/* 33 */     SplashFrame ss = new SplashFrame();
/* 34 */     ss.setVisible(true);
/*    */     
/*    */     try {
/* 37 */       for (int i = 0; i <= 100; i++) {
/* 38 */         Thread.sleep(18L);
/* 39 */         ss.percent_lable.setText(Integer.toString(i) + " %");
/* 40 */         if (i == 100) {
/* 41 */           ss.dispose();
/*    */         }
/*    */       } 
/* 44 */     } catch (Exception e) {
/* 45 */       System.out.println("Error");
/*    */     } 
/*    */     
/* 48 */     SwingUtilities.invokeLater(new Runnable()
/*    */         {
/*    */           public void run() {
/* 51 */             MainFrame mf = new MainFrame();
/* 52 */             mf.setVisible(true);
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Acronix\Desktop\АСВТ_2022_2023\Лаб_1\IOSystem.jar!\IOSystem\Main.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */