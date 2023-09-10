/*    */ package IOSystem;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Font;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JTable;
/*    */ import javax.swing.table.TableCellRenderer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SetHeaderRenderer
/*    */   extends JLabel
/*    */   implements TableCellRenderer
/*    */ {
/*    */   public SetHeaderRenderer() {
/* 23 */     setOpaque(true);
/* 24 */     setForeground(new Color(0, 120, 215));
/* 25 */     setBackground(Color.WHITE);
/* 26 */     setBorder(BorderFactory.createEtchedBorder());
/* 27 */     setFont(new Font("Century Gothic", 1, 14));
/* 28 */     setHorizontalAlignment(0);
/*    */   }
/*    */ 
/*    */   
/*    */   public SetHeaderRenderer(int k) {
/* 33 */     setOpaque(true);
/* 34 */     setForeground(new Color(232, 17, 35));
/* 35 */     setBackground(Color.WHITE);
/* 36 */     setBorder(BorderFactory.createEtchedBorder());
/* 37 */     setFont(new Font("Century Gothic", 1, 14));
/* 38 */     setHorizontalAlignment(0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
/* 44 */     setText(value.toString());
/* 45 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Acronix\Desktop\АСВТ_2022_2023\Лаб_1\IOSystem.jar!\IOSystem\SetHeaderRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */