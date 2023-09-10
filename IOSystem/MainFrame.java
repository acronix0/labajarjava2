/*      */ package IOSystem;
/*      */ import java.awt.*;
/*      */
/*      */
/*      */
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.util.ArrayList;
import java.util.Collections;
/*      */ import javax.swing.*;
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */ import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
/*      */ import javax.swing.event.ChangeListener;
/*      */ import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
/*      */ 
/*      */ public class MainFrame extends JFrame {
/*   24 */   private Timer animation = null;
/*   25 */   private int timerDelay = 12;
/*   26 */   private int animateX = 0;
/*   27 */   private int animateY = 0;
/*   28 */   private int taktCount = 0;
/*   29 */   private DefaultTableModel cpuTableSetModel = new DefaultTableModel();
/*   30 */   private DefaultTableModel ramTableSetModel = new DefaultTableModel();
/*   31 */   private final Point p = new Point(2147483647, 0);
/*   32 */   private ArrayList<Object> cpuCount = new ArrayList();
/*      */   private JFormattedTextField cpuPerformance;
/*   34 */   private int temp = 0; private JDialog aboutDialog; private JMenu aboutMenu; private JMenuItem aboutMenuItem; private JButton allCountShow; private JTextPane animationSpeedField; private JLabel animationSpeedLabel; private JScrollPane animationSpeedScroll; private JSlider animationSpeedSlider; private JButton cancelDialogButton; private JMenuItem clearMenuItem; private JTextPane cpuCountField; private JLabel cpuCountLabel; private JButton cpuCountShow; private JLabel cpuLabel; private JLabel cpuPerfLabel; private JLabel cpuPlaceLabel; private JSlider cpuSlider; private JScrollPane cpuTableScroll; private JTable cpuTableSet; private JPanel dialogMainPanel; private JMenuItem exitMenuItem; private JMenu fileMenu; private JButton finishButton; private JDialog finishDialog; private JLabel gmchLabel; private JLabel gmchToCpuLabel; private JLabel gmchToRamLabel; private JLabel gmchToVideoLabel; private JLabel helloLabel; private JLabel ichLabel; private JLabel ichToGmchLabel; private JLabel interruptLabel; private JTextPane ioCountField; private JLabel ioCountLabel; private JButton ioCountShow; private JSlider ioSlider; private JTextPane ioSymbCountField; private JLabel ioSymbCountLabel; private JSlider ioSymbSlider; private JButton jButton11; private JLabel jLabel1;
/*      */   
/*      */   public MainFrame() {
/*   37 */     initComponents();
/*   38 */     jButtonInit();
/*      */     
/*   40 */     this.setDialog.setLocationRelativeTo((Component)null);
/*   41 */     this.finishDialog.setLocationRelativeTo((Component)null);
/*   42 */     this.aboutDialog.setLocationRelativeTo((Component)null);
/*   43 */     this.scanLabel.setVisible(false);
/*   44 */     this.helloLabel.setVisible(false);
/*   45 */     this
/*   46 */       .cpuPerformance = ((JSpinner.DefaultEditor)this.jSpinner1.getEditor()).getTextField();
/*   47 */     this.cpuPerformance.setSelectedTextColor(Color.black);
/*   48 */     this.cpuPerformance.setSelectionColor(Color.white);
/*   49 */     this.cpuPerformance.setEditable(false);
/*      */     
/*   51 */     this.ioCountShow.setVisible(false);
/*   52 */     this.cpuCountShow.setVisible(false);
/*   53 */     this.allCountShow.setVisible(false);
/*      */     
/*   55 */     this.startMenuItem.setEnabled(false);
/*   56 */     this.clearMenuItem.setEnabled(false);
/*      */     
/*   58 */     this.animationSpeedLabel.setVisible(false);
/*   59 */     this.animationSpeedSlider.setVisible(false);
/*   60 */     this.animationSpeedScroll.setVisible(false);
/*      */     
/*   62 */     this.finishButton.setVisible(false);
/*   63 */     this.taktButton.setVisible(false);
/*      */     
/*   65 */     this.ramTableSet.setTableHeader(new JTableHeader(this.ramTableSet.getColumnModel()) {
/*      */           public Dimension getPreferredSize() {
/*   67 */             Dimension d = super.getPreferredSize();
/*   68 */             d.height = 83;
/*   69 */             return d;
/*      */           }
/*      */         });
/*   72 */     this.cpuTableSet.setTableHeader(new JTableHeader(this.cpuTableSet.getColumnModel()) {
/*      */           public Dimension getPreferredSize() {
/*   74 */             Dimension d = super.getPreferredSize();
/*   75 */             d.height = 130;
/*   76 */             return d;
/*      */           }
/*      */         });
/*      */     
/*   80 */     this.cpuTableSet.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
/*   81 */     this.cpuTableSet.getTableHeader().setReorderingAllowed(false);
/*   82 */     this.ramTableSet.getTableHeader().setReorderingAllowed(false);
/*      */   }
/*      */   private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JPanel jPanel1; private JPanel jPanel2; private JPanel jPanel3; private JPanel jPanel4; private JScrollPane jScrollPane1; private JScrollPane jScrollPane2; private JScrollPane jScrollPane4; private JSeparator jSeparator1; private JSeparator jSeparator2; private JSeparator jSeparator3; private JSeparator jSeparator4; private JSpinner jSpinner1; public JLabel kbLabel; private JLabel kbPlaceLabel; public JLabel kbToIchLabel; private JPanel mainPanel; private JMenuBar menuBar; private JLabel monLabel; private JButton okDialogButton; private JMenuItem optionsMenuItem; private JCheckBox outputMonBox; private JLabel outputMonLabel; private JRadioButtonMenuItem perpetualMenuItem; private JLabel ramLabel; private JScrollPane ramTableScroll; private JTable ramTableSet; public JLabel scanLabel; private JMenu selectModeMenu; private JDialog setDialog; private JMenuItem startMenuItem; private JButton taktButton; private JRadioButtonMenuItem taktMenuItem; private JLabel vCardLabel; private JLabel vCardToMonLabel; private JCheckBox withoutInputBox; private JLabel withoutInputLabel;
/*      */   private void jButtonInit() {
/*   86 */     Component[] jMainComp = this.mainPanel.getComponents();
/*   87 */     Component[] jDialogComp = this.dialogMainPanel.getComponents();
/*      */     
/*   89 */     for (Component jMainComp1 : jMainComp) {
/*   90 */       if (jMainComp1 instanceof JButton) {
/*   91 */         JButton button = (JButton)jMainComp1;
/*   92 */         button.setFocusPainted(false);
/*      */       } 
/*      */     } 
/*   95 */     for (Component jDialogComp1 : jDialogComp) {
/*   96 */       if (jDialogComp1 instanceof JButton) {
/*   97 */         JButton button = (JButton)jDialogComp1;
/*   98 */         button.setFocusPainted(false);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void cpuSetSort() {
/*  105 */     cpuSet();
/*      */     
/*  107 */     ArrayList<String> ioSet = new ArrayList<>();
/*  108 */     ArrayList<Integer> cpuSet = new ArrayList<>();
/*      */     
/*  110 */     for (Object obj : this.cpuCount) {
/*  111 */       if (obj instanceof String) {
/*  112 */         ioSet.add((String)obj); continue;
/*      */       } 
/*  114 */       cpuSet.add((Integer)obj);
/*      */     } 
/*      */     
/*  117 */     Collections.sort(cpuSet);
/*      */     
/*  119 */     int intIndex = 0;
/*  120 */     int strIndex = 0;
/*  121 */     for (int i = 0; i < this.cpuCount.size(); i++) {
/*  122 */       if (this.cpuCount.get(i) instanceof Integer) {
/*  123 */         this.cpuCount.set(i, cpuSet.get(intIndex++));
/*      */       } else {
/*  125 */         this.cpuCount.set(i, ioSet.get(strIndex++));
/*      */       } 
/*  127 */     }  this.cpuCount.add(0, Integer.valueOf(1));
/*  128 */     this.cpuCount.add(Integer.valueOf(cpuSet.size() + 2));
/*      */   }
/*      */   private void setColumnModel() {
/*      */     int j;
/*  132 */     for (j = 0; j < this.cpuCount.size(); j++) {
/*  133 */       this.cpuTableSetModel.addColumn(this.cpuCount.get(j));
/*      */     }
/*      */     
/*  136 */     for (j = 0; j < this.cpuCount.size(); j++) {
/*  137 */       if (this.cpuCount.get(j) instanceof Integer) {
/*  138 */         this.cpuTableSet.getColumnModel().getColumn(j)
/*  139 */           .setHeaderRenderer(new SetHeaderRenderer());
/*  140 */         this.cpuTableSet.getColumnModel().getColumn(j).setMinWidth(40);
/*  141 */         this.cpuTableSet.getColumnModel().getColumn(j).setMaxWidth(40);
/*      */       } else {
/*      */         
/*  144 */         this.cpuTableSet.getColumnModel().getColumn(j)
/*  145 */           .setHeaderRenderer(new SetHeaderRenderer(1));
/*  146 */         this.cpuTableSet.getColumnModel().getColumn(j).setMinWidth(60);
/*  147 */         this.cpuTableSet.getColumnModel().getColumn(j).setMaxWidth(60);
/*      */       } 
/*      */     } 
/*      */     
/*  151 */     this.cpuTableScroll.getViewport().setViewPosition(this.p);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private int cpuCountOps() {
/*  157 */     int cpuSetting = this.cpuSlider.getValue();
/*  158 */     int cpuPerf = Integer.parseInt(this.cpuPerformance.getText());
/*  159 */     if (cpuSetting % cpuPerf != 0)
/*  160 */       return cpuSetting / cpuPerf + 1; 
/*  161 */     return cpuSetting / cpuPerf;
/*      */   }
/*      */ 
/*      */   
/*      */   private int ioCountOps() {
/*  166 */     int ioSetting = this.ioSlider.getValue();
/*  167 */     return ioSetting;
/*      */   }
/*      */   private void cpuSet() {
/*      */     int i;
/*  171 */     for (i = 2; i <= cpuCountOps() + 1; i++) {
/*  172 */       this.cpuCount.add(Integer.valueOf(i));
/*      */     }
/*  174 */     for (i = 1; i <= ioCountOps(); i++) {
/*  175 */       this.cpuCount.add("В/В");
/*      */     }
/*      */     
/*  178 */     Collections.shuffle(this.cpuCount);
/*      */   }
/*      */   
/*      */   private void delColumn() {
/*  182 */     int columnCounts = this.cpuTableSet.getColumnCount();
/*      */     
/*  184 */     if (columnCounts > 0) {
/*  185 */       this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  186 */             .getResource("/img/cpu_back.png")));
/*  187 */       this.cpuTableSet.removeColumn(this.cpuTableSet.getColumnModel().getColumn(0));
/*  188 */       this.cpuTableScroll.getViewport().setViewPosition(this.p);
/*      */     } else {
/*      */       
/*  191 */       this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  192 */             .getResource("/img/cpu.png")));
/*  193 */       this.finishDialog.setVisible(true);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void clearIoCount() {
/*  198 */     for (int i = this.cpuTableSet.getColumnCount() - 1; i >= 0; i--) {
/*  199 */       if (this.cpuTableSet.getColumnName(i).contains("В/В")) {
/*  200 */         this.cpuTableSet.getColumnModel().getColumn(i).setMinWidth(0);
/*  201 */         this.cpuTableSet.getColumnModel().getColumn(i).setMaxWidth(0);
/*      */       } 
/*      */     } 
/*  204 */     this.cpuTableScroll.getViewport().setViewPosition(this.p);
/*      */   }
/*      */   
/*      */   private void showIoCount() {
/*  208 */     for (int i = this.cpuTableSet.getColumnCount() - 1; i >= 0; i--) {
/*  209 */       if (this.cpuTableSet.getColumnName(i).contains("В/В")) {
/*  210 */         this.cpuTableSet.getColumnModel().getColumn(i).setMinWidth(60);
/*  211 */         this.cpuTableSet.getColumnModel().getColumn(i).setMaxWidth(60);
/*      */       } 
/*      */     } 
/*  214 */     this.cpuTableScroll.getViewport().setViewPosition(this.p);
/*      */   }
/*      */   
/*      */   private void clearCpuCount() {
/*  218 */     for (int i = this.cpuTableSet.getColumnCount() - 1; i >= 0; i--) {
/*  219 */       if (!this.cpuTableSet.getColumnName(i).contains("В/В")) {
/*  220 */         this.cpuTableSet.getColumnModel().getColumn(i).setMinWidth(0);
/*  221 */         this.cpuTableSet.getColumnModel().getColumn(i).setMaxWidth(0);
/*      */       } 
/*      */     } 
/*  224 */     this.cpuTableScroll.getViewport().setViewPosition(this.p);
/*      */   }
/*      */   
/*      */   private void showCpuCount() {
/*  228 */     for (int i = this.cpuTableSet.getColumnCount() - 1; i >= 0; i--) {
/*  229 */       if (!this.cpuTableSet.getColumnName(i).contains("В/В")) {
/*  230 */         this.cpuTableSet.getColumnModel().getColumn(i).setMinWidth(40);
/*  231 */         this.cpuTableSet.getColumnModel().getColumn(i).setMaxWidth(40);
/*      */       } 
/*      */     } 
/*  234 */     this.cpuTableScroll.getViewport().setViewPosition(this.p);
/*      */   }
/*      */   
/*      */   private void clearAll() {
/*  238 */     this.cpuCount.clear();
/*  239 */     this.cpuCount.trimToSize();
/*  240 */     this.cpuTableSetModel.setColumnCount(0);
/*  241 */     this.taktCount = 0;
/*  242 */     this.temp = 0;
/*  243 */     this.ramTableSetModel.setColumnCount(0);
/*  244 */     this.scanLabel.setVisible(false);
/*  245 */     this.scanLabel.setLocation(440, 640);
/*  246 */     this.scanLabel.setIcon(new ImageIcon(getClass()
/*  247 */           .getResource("/img/scan.png")));
/*  248 */     this.kbLabel.setIcon(new ImageIcon(getClass()
/*  249 */           .getResource("/img/keyboard.png")));
/*  250 */     this.kbToIchLabel.setIcon(new ImageIcon(getClass()
/*  251 */           .getResource("/img/KBtoSB.png")));
/*  252 */     this.interruptLabel.setVisible(false);
/*  253 */     this.ichToGmchLabel.setIcon(new ImageIcon(getClass()
/*  254 */           .getResource("/img/SBtoNB.png")));
/*  255 */     this.gmchToCpuLabel.setIcon(new ImageIcon(getClass()
/*  256 */           .getResource("/img/CPUtoNB.png")));
/*  257 */     this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  258 */           .getResource("/img/cpu.png")));
/*  259 */     this.gmchToRamLabel.setIcon(new ImageIcon(getClass()
/*  260 */           .getResource("/img/NBtoRAM.png")));
/*  261 */     this.gmchToVideoLabel.setIcon(new ImageIcon(getClass()
/*  262 */           .getResource("/img/NBtoRAM.png")));
/*  263 */     this.vCardLabel.setIcon(new ImageIcon(getClass()
/*  264 */           .getResource("/img/vcard.png")));
/*  265 */     this.vCardToMonLabel.setIcon(new ImageIcon(getClass()
/*  266 */           .getResource("/img/VcardtoMon.png")));
/*  267 */     this.monLabel.setIcon(new ImageIcon(getClass()
/*  268 */           .getResource("/img/monitor.png")));
/*  269 */     this.helloLabel.setVisible(false);
/*      */     
/*  271 */     this.animationSpeedLabel.setVisible(false);
/*  272 */     this.animationSpeedScroll.setVisible(false);
/*  273 */     this.animationSpeedSlider.setVisible(false);
/*  274 */     this.taktButton.setVisible(false);
/*  275 */     this.finishButton.setVisible(false);
/*      */     
/*  277 */     this.startMenuItem.setEnabled(false);
/*  278 */     this.clearMenuItem.setEnabled(false);
/*  279 */     this.perpetualMenuItem.setSelected(false);
/*  280 */     this.taktMenuItem.setSelected(false);
/*  281 */     this.selectModeMenu.setEnabled(false);
/*  282 */     this.optionsMenuItem.setEnabled(true);
/*  283 */     this.cpuCountShow.setVisible(false);
/*  284 */     this.ioCountShow.setVisible(false);
/*  285 */     this.allCountShow.setVisible(false);
/*      */   }
/*      */ 
/*      */   
/*      */   private ActionListener kbToSouth() {
/*  290 */     ActionListener kbToSouth = new ActionListener()
/*      */       {
/*      */         public void actionPerformed(ActionEvent e)
/*      */         {
/*  294 */           MainFrame.this.taktButton.setEnabled(false);
/*  295 */           if (MainFrame.this.animateX < 151) {
/*  296 */             MainFrame.this.animateX = MainFrame.this.animateX + 6;
/*  297 */             MainFrame.this.scanLabel.setLocation(440 + MainFrame.this.animateX, 640);
/*      */           }
/*  299 */           else if (MainFrame.this.animateY < 79 && MainFrame.this.animateX == 156) {
/*  300 */             if (MainFrame.this.animateY == 0) {
/*  301 */               MainFrame.this.scanLabel.setIcon(new ImageIcon(getClass()
/*  302 */                     .getResource("/img/Scanhor.png")));
/*      */             }
/*  304 */             MainFrame.this.animateY = MainFrame.this.animateY + 6;
/*  305 */             MainFrame.this.scanLabel.setLocation(572, 640 - MainFrame.this.animateY);
/*      */           }
/*  307 */           else if (MainFrame.this.animateY == 84 && MainFrame.this.animateX == 156) {
/*  308 */             MainFrame.this.kbLabel.setIcon(new ImageIcon(getClass()
/*  309 */                   .getResource("/img/keyboard.png")));
/*  310 */             MainFrame.this.scanLabel.setLocation(572, 548);
/*  311 */             MainFrame.this.kbToIchLabel.setIcon(new ImageIcon(getClass()
/*  312 */                   .getResource("/img/KBtoSB.png")));
/*  313 */             MainFrame.this.taktButton.setEnabled(true);
/*  314 */             MainFrame.this.animation.stop();
/*      */           } 
/*      */         }
/*      */       };
/*  318 */     return kbToSouth;
/*      */   }
/*      */   
/*      */   private ActionListener interrupt() {
/*  322 */     ActionListener interrupt = new ActionListener()
/*      */       {
/*      */         public void actionPerformed(ActionEvent e)
/*      */         {
/*  326 */           MainFrame.this.taktButton.setEnabled(false);
/*  327 */           switch (MainFrame.this.animateX) {
/*      */             case 0:
/*  329 */               MainFrame.this.interruptLabel.setVisible(true);
/*  330 */               MainFrame.this.interruptLabel.setIcon(new ImageIcon(
/*  331 */                     getClass().getResource("/img/arrow1.png")));
/*      */               break;
/*      */             case 100:
/*  334 */               MainFrame.this.interruptLabel.setIcon(new ImageIcon(
/*  335 */                     getClass().getResource("/img/arrow2.png")));
/*      */               break;
/*      */             case 200:
/*  338 */               MainFrame.this.interruptLabel.setVisible(false);
/*  339 */               MainFrame.this.taktButton.setEnabled(true);
/*  340 */               MainFrame.this.animation.stop();
/*      */               break;
/*      */           } 
/*      */ 
/*      */           
/*  345 */           MainFrame.this.animateX++;
/*      */         }
/*      */       };
/*  348 */     return interrupt;
/*      */   }
/*      */   private ActionListener southToCPU() {
/*  351 */     ActionListener southToCPU = new ActionListener()
/*      */       {
/*      */         public void actionPerformed(ActionEvent e)
/*      */         {
/*  355 */           MainFrame.this.taktButton.setEnabled(false);
/*  356 */           if (MainFrame.this.animateY < 475) {
/*      */             
/*  358 */             MainFrame.this.animateY = MainFrame.this.animateY + 6;
/*  359 */             MainFrame.this.scanLabel.setLocation(572, 548 - MainFrame.this.animateY);
/*  360 */             switch (MainFrame.this.animateY) {
/*      */               case 120:
/*  362 */                 MainFrame.this.ichToGmchLabel.setIcon(new ImageIcon(
/*  363 */                       getClass()
/*  364 */                       .getResource("/img/SBtoNB_back.png")));
/*      */                 break;
/*      */               case 324:
/*  367 */                 MainFrame.this.ichToGmchLabel.setIcon(new ImageIcon(
/*  368 */                       getClass()
/*  369 */                       .getResource("/img/SBtoNB.png")));
/*      */                 break;
/*      */               case 330:
/*  372 */                 MainFrame.this.gmchToCpuLabel.setIcon(new ImageIcon(
/*  373 */                       getClass()
/*  374 */                       .getResource("/img/CPUtoNB_back.png")));
/*  375 */                 MainFrame.this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  376 */                       .getResource("/img/cpu_back.png")));
/*      */                 break;
/*      */             } 
/*      */ 
/*      */ 
/*      */           
/*  382 */           } else if (MainFrame.this.animateX < 97) {
/*  383 */             if (MainFrame.this.animateX == 0) {
/*  384 */               MainFrame.this.scanLabel.setIcon(new ImageIcon(getClass()
/*  385 */                     .getResource("/img/scan.png")));
/*      */             }
/*  387 */             MainFrame.this.animateX = MainFrame.this.animateX + 3;
/*  388 */             MainFrame.this.scanLabel.setLocation(572 - MainFrame.this.animateX, 78);
/*      */           }
/*  390 */           else if (MainFrame.this.animateX == 99) {
/*  391 */             MainFrame.this.gmchToCpuLabel.setIcon(new ImageIcon(getClass()
/*  392 */                   .getResource("/img/CPUtoNB.png")));
/*  393 */             MainFrame.this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  394 */                   .getResource("/img/cpu.png")));
/*  395 */             MainFrame.this.taktButton.setEnabled(true);
/*  396 */             MainFrame.this.animation.stop();
/*      */           } 
/*      */         }
/*      */       };
/*  400 */     return southToCPU;
/*      */   }
/*      */   
/*      */   private ActionListener cpuToRAM() {
/*  404 */     ActionListener cpuToRAM = new ActionListener()
/*      */       {
/*      */         public void actionPerformed(ActionEvent e)
/*      */         {
/*  408 */           if (MainFrame.this.animateX <= 108) {
/*  409 */             MainFrame.this.animateX = MainFrame.this.animateX + 6;
/*  410 */             MainFrame.this.scanLabel.setLocation(476 + MainFrame.this.animateX, 78);
/*      */           }
/*  412 */           else if (MainFrame.this.animateY <= 186) {
/*  413 */             if (MainFrame.this.animateY == 0) {
/*  414 */               MainFrame.this.scanLabel.setIcon(new ImageIcon(getClass()
/*  415 */                     .getResource("/img/symbcode.png")));
/*      */             }
/*  417 */             MainFrame.this.animateY = MainFrame.this.animateY + 6;
/*  418 */             MainFrame.this.scanLabel.setLocation(572, 78 + MainFrame.this.animateY);
/*      */           }
/*  420 */           else if (MainFrame.this.animateY == 192) {
/*  421 */             MainFrame.this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  422 */                   .getResource("/img/cpu.png")));
/*  423 */             MainFrame.this.gmchToCpuLabel.setIcon(new ImageIcon(getClass()
/*  424 */                   .getResource("/img/CPUtoNB.png")));
/*  425 */             MainFrame.this.animateY = MainFrame.this.animateY + 1;
/*      */           }
/*  427 */           else if (MainFrame.this.animateY >= 193 && MainFrame.this.animateY < 482) {
/*  428 */             if (MainFrame.this.animateY == 223) {
/*  429 */               MainFrame.this.gmchToRamLabel.setIcon(new ImageIcon(getClass()
/*  430 */                     .getResource("/img/NBtoRAM_back.png")));
/*  431 */               MainFrame.this.ramLabel.setIcon(new ImageIcon(getClass()
/*  432 */                     .getResource("/img/RAM_back.png")));
/*      */             } 
/*  434 */             if (MainFrame.this.animateY == 481) {
/*  435 */               MainFrame.this.gmchToRamLabel.setIcon(new ImageIcon(getClass()
/*  436 */                     .getResource("/img/NBtoRAM.png")));
/*  437 */               MainFrame.this.ramLabel.setIcon(new ImageIcon(getClass()
/*  438 */                     .getResource("/img/RAM.png")));
/*  439 */               MainFrame.this.scanLabel.setVisible(false);
/*      */             } 
/*  441 */             MainFrame.this.animateY = MainFrame.this.animateY + 6;
/*  442 */             MainFrame.this.scanLabel.setLocation(375 + MainFrame.this.animateY, 268);
/*      */           } else {
/*      */             
/*  445 */             MainFrame.this.animation.stop();
/*  446 */             MainFrame.this.taktButton.setEnabled(true);
/*  447 */             int symbSliderValue = MainFrame.this.ioSymbSlider.getValue() - 1;
/*  448 */             MainFrame.this.ramTableSetModel.addColumn(Integer.valueOf(MainFrame.this.temp + 1));
/*  449 */             for (int i = 0; i <= MainFrame.this.temp; i++) {
/*  450 */               MainFrame.this.ramTableSet.getColumnModel().getColumn(i).setMaxWidth(25);
/*  451 */               MainFrame.this.ramTableSet.getColumnModel().getColumn(i).setMinWidth(25);
/*  452 */               MainFrame.this.ramTableSet.getColumnModel().getColumn(i)
/*  453 */                 .setHeaderRenderer(new SetHeaderRenderer(1));
/*      */             } 
/*      */             
/*  456 */             MainFrame.this.ramTableScroll.getViewport().setViewPosition(MainFrame.this.p);
/*  457 */             if (MainFrame.this.temp == symbSliderValue) {
/*      */               
/*  459 */               MainFrame.this.temp = 0;
/*      */             } else {
/*      */               
/*  462 */               MainFrame.this.temp++;
/*      */             } 
/*      */           } 
/*      */         }
/*      */       };
/*      */     
/*  468 */     return cpuToRAM;
/*      */   }
/*      */   
/*      */   private ActionListener ramToVcard() {
/*  472 */     ActionListener ramToVcard = new ActionListener()
/*      */       {
/*      */         public void actionPerformed(ActionEvent e)
/*      */         {
/*  476 */           if (MainFrame.this.animateX < 547) {
/*  477 */             switch (MainFrame.this.animateX) {
/*      */               case 198:
/*  479 */                 MainFrame.this.gmchToRamLabel.setIcon(new ImageIcon(
/*  480 */                       getClass()
/*  481 */                       .getResource("/img/NBtoRAM.png")));
/*  482 */                 MainFrame.this.ramLabel.setIcon(new ImageIcon(getClass()
/*  483 */                       .getResource("/img/RAM.png")));
/*      */                 break;
/*      */               case 264:
/*  486 */                 MainFrame.this.gmchToVideoLabel.setIcon(new ImageIcon(
/*  487 */                       getClass()
/*  488 */                       .getResource("/img/NBtoRAM_back.png")));
/*  489 */                 MainFrame.this.vCardLabel.setIcon(new ImageIcon(getClass()
/*  490 */                       .getResource("/img/vcard_back.png")));
/*      */                 break;
/*      */               case 540:
/*  493 */                 MainFrame.this.gmchToVideoLabel.setIcon(new ImageIcon(
/*  494 */                       getClass()
/*  495 */                       .getResource("/img/NBtoRAM.png")));
/*      */                 break;
/*      */             } 
/*      */ 
/*      */             
/*  500 */             MainFrame.this.scanLabel.setLocation(842 - MainFrame.this.animateX, 268);
/*      */           } else {
/*      */             
/*  503 */             MainFrame.this.scanLabel.setVisible(false);
/*  504 */             MainFrame.this.scanLabel.setLocation(438, 640);
/*  505 */             MainFrame.this.animation.stop();
/*  506 */             MainFrame.this.taktButton.setEnabled(true);
/*      */           } 
/*  508 */           MainFrame.this.animateX = MainFrame.this.animateX + 6;
/*      */         }
/*      */       };
/*  511 */     return ramToVcard;
/*      */   }
/*      */   
/*      */   private ActionListener vCardToMonitor() {
/*  515 */     ActionListener vCardToMonitor = new ActionListener()
/*      */       {
/*      */         public void actionPerformed(ActionEvent e)
/*      */         {
/*  519 */           if (MainFrame.this.animateX == 108) {
/*  520 */             MainFrame.this.monLabel.setIcon(new ImageIcon(getClass()
/*  521 */                   .getResource("/img/monitor.png")));
/*  522 */             MainFrame.this.vCardLabel.setIcon(new ImageIcon(getClass()
/*  523 */                   .getResource("/img/vcard.png")));
/*  524 */             MainFrame.this.vCardToMonLabel.setIcon(new ImageIcon(getClass()
/*  525 */                   .getResource("/img/VcardtoMon.png")));
/*  526 */             MainFrame.this.helloLabel.setVisible(false);
/*  527 */             MainFrame.this.scanLabel.setIcon(new ImageIcon(getClass()
/*  528 */                   .getResource("/img/scan.png")));
/*  529 */             MainFrame.this.animation.stop();
/*  530 */             MainFrame.this.taktButton.setEnabled(true);
/*      */           } 
/*  532 */           MainFrame.this.animateX = MainFrame.this.animateX + 6;
/*      */         }
/*      */       };
/*      */     
/*  536 */     return vCardToMonitor;
/*      */   }
/*      */ 
/*      */   
/*      */   private void animateKbToSouth() {
/*  541 */     if (this.animation != null && this.animation.isRunning()) {
/*      */       return;
/*      */     }
/*  544 */     this.animateX = 0;
/*  545 */     this.animateY = 0;
/*  546 */     this.taktCount++;
/*  547 */     this.scanLabel.setLocation(440, 640);
/*  548 */     this.scanLabel.setVisible(true);
/*  549 */     this.scanLabel.setIcon(new ImageIcon(getClass()
/*  550 */           .getResource("/img/scan.png")));
/*  551 */     this.kbLabel.setIcon(new ImageIcon(getClass()
/*  552 */           .getResource("/img/keyboard_back.png")));
/*  553 */     this.kbToIchLabel.setIcon(new ImageIcon(getClass()
/*  554 */           .getResource("/img/KBtoSB_back.png")));
/*  555 */     this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  556 */           .getResource("/img/cpu.png")));
/*  557 */     this.animation = new Timer(this.timerDelay, kbToSouth());
/*  558 */     this.animation.start();
/*      */   }
/*      */   
/*      */   private void animateSouthToCpu() {
/*  562 */     if (this.animation != null && this.animation.isRunning()) {
/*      */       return;
/*      */     }
/*  565 */     this.animateX = 0;
/*  566 */     this.animateY = 0;
/*  567 */     this.taktCount++;
/*  568 */     this.scanLabel.setVisible(true);
/*  569 */     this.animation = new Timer(this.timerDelay, southToCPU());
/*  570 */     this.animation.start();
/*      */   }
/*      */ 
/*      */   
/*      */   private void animateInterrupt() {
/*  575 */     if (this.animation != null && this.animation.isRunning()) {
/*      */       return;
/*      */     }
/*  578 */     this.animateX = 0;
/*  579 */     this.taktCount++;
/*  580 */     this.animation = new Timer(10, interrupt());
/*  581 */     this.animation.start();
/*      */   }
/*      */   
/*      */   private void animateCPUtoRAM() {
/*  585 */     if (this.animation != null && this.animation.isRunning()) {
/*      */       return;
/*      */     }
/*  588 */     this.animateX = 0;
/*  589 */     this.animateY = 0;
/*  590 */     this.taktCount++;
/*  591 */     this.taktButton.setEnabled(false);
/*  592 */     this.scanLabel.setIcon(new ImageIcon(getClass()
/*  593 */           .getResource("/img/symbcode_hor.png")));
/*  594 */     this.scanLabel.setLocation(476, 78);
/*  595 */     this.scanLabel.setVisible(true);
/*  596 */     this.cpuLabel.setIcon(new ImageIcon(getClass()
/*  597 */           .getResource("/img/cpu_back.png")));
/*  598 */     this.gmchToCpuLabel.setIcon(new ImageIcon(getClass()
/*  599 */           .getResource("/img/CPUtoNB_back.png")));
/*  600 */     this.animation = new Timer(this.timerDelay, cpuToRAM());
/*  601 */     this.animation.start();
/*      */   }
/*      */   
/*      */   private void animateRAMtoVideo() {
/*  605 */     if (this.animation != null && this.animation.isRunning()) {
/*      */       return;
/*      */     }
/*  608 */     this.taktButton.setEnabled(false);
/*  609 */     this.animateX = 0;
/*  610 */     this.taktCount++;
/*  611 */     this.scanLabel.setIcon(new ImageIcon(getClass().getResource("/img/symbcodes.png")));
/*  612 */     this.ramLabel.setIcon(new ImageIcon(getClass()
/*  613 */           .getResource("/img/RAM_back.png")));
/*  614 */     this.gmchToRamLabel.setIcon(new ImageIcon(getClass()
/*  615 */           .getResource("/img/NBtoRAM_back.png")));
/*  616 */     this.scanLabel.setVisible(true);
/*  617 */     this.animation = new Timer(this.timerDelay, ramToVcard());
/*  618 */     this.animation.start();
/*      */   }
/*      */   
/*      */   private void animateVideoToMon() {
/*  622 */     if (this.animation != null && this.animation.isRunning()) {
/*      */       return;
/*      */     }
/*  625 */     this.taktButton.setEnabled(false);
/*  626 */     this.animateX = 0;
/*  627 */     this.taktCount++;
/*  628 */     this.helloLabel.setVisible(true);
/*  629 */     this.vCardToMonLabel.setIcon(new ImageIcon(getClass()
/*  630 */           .getResource("/img/VcardtoMon_back.png")));
/*  631 */     this.monLabel.setIcon(new ImageIcon(getClass()
/*  632 */           .getResource("/img/monitor_back.png")));
/*  633 */     this.animation = new Timer(this.timerDelay, vCardToMonitor());
/*  634 */     this.animation.start();
/*      */   }
/*      */   
/*      */   private void withoutInputAnimation(boolean output) {
/*  638 */     int symbSliderValue = this.ioSymbSlider.getValue() - 1;
/*  639 */     if (this.cpuTableSet.getColumnModel().getColumnCount() > 0 && this.cpuTableSet
/*  640 */       .getColumnName(0).contains("В/В")) {
/*      */       
/*  642 */       switch (this.taktCount) {
/*      */         case 0:
/*  644 */           animateCPUtoRAM();
/*  645 */           if (this.temp == symbSliderValue) {
/*  646 */             this.taktCount = 1; break;
/*      */           } 
/*  648 */           this.taktCount = 0;
/*      */           break;
/*      */         
/*      */         case 1:
/*  652 */           this.ramTableSetModel.setColumnCount(0);
/*  653 */           if (output) {
/*  654 */             animateRAMtoVideo(); break;
/*      */           } 
/*  656 */           delColumn();
/*  657 */           this.taktCount = 0;
/*      */           break;
/*      */         
/*      */         case 2:
/*  661 */           if (output) {
/*  662 */             animateVideoToMon();
/*  663 */             delColumn();
/*  664 */             this.taktCount = 0;
/*      */           } 
/*      */           break;
/*      */       } 
/*      */     } else {
/*  669 */       delColumn();
/*  670 */       this.taktCount = 0;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void fullAnimation(boolean output) {
/*  675 */     int symbSliderValue = this.ioSymbSlider.getValue() - 1;
/*  676 */     if (this.cpuTableSet.getColumnModel().getColumnCount() > 0 && this.cpuTableSet
/*  677 */       .getColumnName(0).contains("В/В")) {
/*      */       
/*  679 */       switch (this.taktCount) {
/*      */         case 0:
/*  681 */           animateKbToSouth();
/*      */           break;
/*      */         case 1:
/*  684 */           animateInterrupt();
/*      */           break;
/*      */         case 2:
/*  687 */           animateSouthToCpu();
/*      */           break;
/*      */         case 3:
/*  690 */           animateCPUtoRAM();
/*  691 */           if (this.temp == symbSliderValue) {
/*  692 */             this.taktCount = 4; break;
/*      */           } 
/*  694 */           this.taktCount = 0;
/*      */           break;
/*      */         
/*      */         case 4:
/*  698 */           this.ramTableSetModel.setColumnCount(0);
/*  699 */           if (output) {
/*  700 */             animateRAMtoVideo(); break;
/*      */           } 
/*  702 */           delColumn();
/*  703 */           this.taktCount = 0;
/*      */           break;
/*      */         
/*      */         case 5:
/*  707 */           if (output) {
/*  708 */             animateVideoToMon();
/*  709 */             delColumn();
/*  710 */             this.taktCount = 0;
/*      */           } 
/*      */           break;
/*      */       } 
/*      */     } else {
/*  715 */       delColumn();
/*  716 */       this.taktCount = 0;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void taktAnimations(boolean withoutInput, boolean output) {
/*  721 */     if (withoutInput)
/*  722 */     { withoutInputAnimation(output); }
/*  723 */     else { fullAnimation(output); }
/*      */   
/*      */   }
/*      */ 
/*      */   
/*      */   private void initComponents() {
/*  729 */     this.setDialog = new JDialog();
/*  730 */     this.dialogMainPanel = new JPanel();
/*  731 */     this.okDialogButton = new JButton();
/*  732 */     this.cancelDialogButton = new JButton();
/*  733 */     this.jPanel2 = new JPanel();
/*  734 */     this.cpuPerfLabel = new JLabel();
/*  735 */     this.jSpinner1 = new JSpinner();
/*  736 */     this.cpuCountLabel = new JLabel();
/*  737 */     this.jScrollPane1 = new JScrollPane();
/*  738 */     this.cpuCountField = new JTextPane();
/*  739 */     this.cpuSlider = new JSlider();
/*  740 */     this.jSeparator2 = new JSeparator();
/*  741 */     this.jPanel3 = new JPanel();
/*  742 */     this.ioSymbSlider = new JSlider();
/*  743 */     this.ioSymbCountLabel = new JLabel();
/*  744 */     this.jScrollPane4 = new JScrollPane();
/*  745 */     this.ioSymbCountField = new JTextPane();
/*  746 */     this.ioSlider = new JSlider();
/*  747 */     this.jScrollPane2 = new JScrollPane();
/*  748 */     this.ioCountField = new JTextPane();
/*  749 */     this.ioCountLabel = new JLabel();
/*  750 */     this.withoutInputLabel = new JLabel();
/*  751 */     this.withoutInputBox = new JCheckBox();
/*  752 */     this.outputMonLabel = new JLabel();
/*  753 */     this.outputMonBox = new JCheckBox();
/*  754 */     this.jSeparator1 = new JSeparator();
/*  755 */     this.jSeparator3 = new JSeparator();
/*  756 */     this.jSeparator4 = new JSeparator();
/*  757 */     this.finishDialog = new JDialog();
/*  758 */     this.jPanel1 = new JPanel();
/*  759 */     this.jButton11 = new JButton();
/*  760 */     this.jLabel2 = new JLabel();
/*  761 */     this.aboutDialog = new JDialog();
/*  762 */     this.jPanel4 = new JPanel();
/*  763 */     this.jLabel1 = new JLabel();
/*  764 */     this.jLabel3 = new JLabel();
/*  765 */     this.jLabel4 = new JLabel();
/*  766 */     this.jLabel5 = new JLabel();
/*  767 */     this.jLabel6 = new JLabel();
/*  768 */     this.mainPanel = new JPanel();
/*  769 */     this.cpuLabel = new JLabel();
/*  770 */     this.ramLabel = new JLabel();
/*  771 */     this.helloLabel = new JLabel();
/*  772 */     this.monLabel = new JLabel();
/*  773 */     this.vCardLabel = new JLabel();
/*  774 */     this.scanLabel = new JLabel();
/*  775 */     this.kbPlaceLabel = new JLabel();
/*  776 */     this.kbLabel = new JLabel();
/*  777 */     this.cpuTableScroll = new JScrollPane();
/*  778 */     this.cpuTableSet = new JTable();
/*  779 */     this.ichToGmchLabel = new JLabel();
/*  780 */     this.gmchLabel = new JLabel();
/*  781 */     this.ichLabel = new JLabel();
/*  782 */     this.kbToIchLabel = new JLabel();
/*  783 */     this.gmchToVideoLabel = new JLabel();
/*  784 */     this.gmchToRamLabel = new JLabel();
/*  785 */     this.vCardToMonLabel = new JLabel();
/*  786 */     this.cpuPlaceLabel = new JLabel();
/*  787 */     this.gmchToCpuLabel = new JLabel();
/*  788 */     this.taktButton = new JButton();
/*  789 */     this.animationSpeedLabel = new JLabel();
/*  790 */     this.animationSpeedSlider = new JSlider();
/*  791 */     this.finishButton = new JButton();
/*  792 */     this.animationSpeedScroll = new JScrollPane();
/*  793 */     this.animationSpeedField = new JTextPane();
/*  794 */     this.ramTableScroll = new JScrollPane();
/*  795 */     this.ramTableSet = new JTable();
/*  796 */     this.interruptLabel = new JLabel();
/*  797 */     this.ioCountShow = new JButton();
/*  798 */     this.cpuCountShow = new JButton();
/*  799 */     this.allCountShow = new JButton();
/*  800 */     this.menuBar = new JMenuBar();
/*  801 */     this.fileMenu = new JMenu();
/*  802 */     this.startMenuItem = new JMenuItem();
/*  803 */     this.clearMenuItem = new JMenuItem();
/*  804 */     this.optionsMenuItem = new JMenuItem();
/*  805 */     this.exitMenuItem = new JMenuItem();
/*  806 */     this.selectModeMenu = new JMenu();
/*  807 */     this.perpetualMenuItem = new JRadioButtonMenuItem();
/*  808 */     this.taktMenuItem = new JRadioButtonMenuItem();
/*  809 */     this.aboutMenu = new JMenu();
/*  810 */     this.aboutMenuItem = new JMenuItem();
/*      */     
/*  812 */     this.setDialog.setDefaultCloseOperation(2);
/*  813 */     this.setDialog.setTitle("Параметры моделирования");
/*  814 */     this.setDialog.setIconImage((new ImageIcon(getClass().getResource("/img/tittle.png")))
/*  815 */         .getImage());
/*  816 */     this.setDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
/*  817 */     this.setDialog.setPreferredSize(new Dimension(485, 440));
/*  818 */     this.setDialog.setResizable(false);
/*  819 */     this.setDialog.setSize(new Dimension(485, 440));
/*      */     
/*  821 */     this.dialogMainPanel.setBackground(new Color(255, 255, 255));
/*  822 */     this.dialogMainPanel.setMinimumSize(new Dimension(485, 390));
/*  823 */     this.dialogMainPanel.setName("");
/*  824 */     this.dialogMainPanel.setPreferredSize(new Dimension(485, 440));
/*  825 */     this.dialogMainPanel.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  827 */     this.okDialogButton.setFont(new Font("Century Gothic", 0, 13));
/*  828 */     this.okDialogButton.setText("ОК");
/*  829 */     this.okDialogButton.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  831 */             MainFrame.this.okDialogButtonActionPerformed(evt);
/*      */           }
/*      */         });
/*  834 */     this.dialogMainPanel.add(this.okDialogButton, new AbsoluteConstraints(140, 360, 60, 30));
/*      */     
/*  836 */     this.cancelDialogButton.setFont(new Font("Century Gothic", 0, 13));
/*  837 */     this.cancelDialogButton.setText("Отмена");
/*  838 */     this.cancelDialogButton.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  840 */             MainFrame.this.cancelDialogButtonActionPerformed(evt);
/*      */           }
/*      */         });
/*  843 */     this.dialogMainPanel.add(this.cancelDialogButton, new AbsoluteConstraints(270, 360, 85, 30));
/*      */     
/*  845 */     this.jPanel2.setBackground(new Color(255, 255, 255));
/*  846 */     this.jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Параметры ЦПУ", 2, 0, new Font("Century Gothic", 0, 14)));
/*  847 */     this.jPanel2.setLayout((LayoutManager)null);
/*      */     
/*  849 */     this.cpuPerfLabel.setFont(new Font("Century Gothic", 0, 13));
/*  850 */     this.cpuPerfLabel.setText("Быстродействие, млн оп/с");
/*  851 */     this.jPanel2.add(this.cpuPerfLabel);
/*  852 */     this.cpuPerfLabel.setBounds(10, 30, 250, 20);
/*      */     
/*  854 */     this.jSpinner1.setFont(new Font("Century Gothic", 0, 13));
/*  855 */     this.jSpinner1.setModel(new SpinnerNumberModel(10, 10, 100, 1));
/*  856 */     this.jSpinner1.setMinimumSize(new Dimension(50, 23));
/*  857 */     this.jSpinner1.setPreferredSize(new Dimension(62, 23));
/*  858 */     this.jPanel2.add(this.jSpinner1);
/*  859 */     this.jSpinner1.setBounds(280, 30, 50, 23);
/*      */     
/*  861 */     this.cpuCountLabel.setFont(new Font("Century Gothic", 0, 13));
/*  862 */     this.cpuCountLabel.setText("Количество команд, млн");
/*  863 */     this.jPanel2.add(this.cpuCountLabel);
/*  864 */     this.cpuCountLabel.setBounds(10, 80, 240, 20);
/*      */     
/*  866 */     this.cpuCountField.setEditable(false);
/*  867 */     this.cpuCountField.setFont(new Font("Century Gothic", 0, 13));
/*  868 */     this.cpuCountField.setText("100");
/*  869 */     this.cpuCountField.setSelectedTextColor(new Color(0, 0, 0));
/*  870 */     this.cpuCountField.setSelectionColor(new Color(255, 255, 255));
/*  871 */     this.jScrollPane1.setViewportView(this.cpuCountField);
/*      */     
/*  873 */     this.jPanel2.add(this.jScrollPane1);
/*  874 */     this.jScrollPane1.setBounds(280, 80, 50, 25);
/*      */     
/*  876 */     this.cpuSlider.setBackground(new Color(255, 255, 255));
/*  877 */     this.cpuSlider.setMajorTickSpacing(100);
/*  878 */     this.cpuSlider.setMaximum(1000);
/*  879 */     this.cpuSlider.setMinimum(100);
/*  880 */     this.cpuSlider.setMinorTickSpacing(50);
/*  881 */     this.cpuSlider.setPaintTicks(true);
/*  882 */     this.cpuSlider.addChangeListener(new ChangeListener() {
/*      */           public void stateChanged(ChangeEvent evt) {
/*  884 */             MainFrame.this.cpuSliderStateChanged(evt);
/*      */           }
/*      */         });
/*  887 */     this.jPanel2.add(this.cpuSlider);
/*  888 */     this.cpuSlider.setBounds(340, 80, 120, 31);
/*      */     
/*  890 */     this.jSeparator2.setForeground(new Color(204, 204, 204));
/*  891 */     this.jPanel2.add(this.jSeparator2);
/*  892 */     this.jSeparator2.setBounds(6, 64, 460, 10);
/*      */     
/*  894 */     this.dialogMainPanel.add(this.jPanel2, new AbsoluteConstraints(0, 0, 470, 130));
/*      */     
/*  896 */     this.jPanel3.setBackground(new Color(255, 255, 255));
/*  897 */     this.jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Параметры ввода/вывода", 2, 0, new Font("Century Gothic", 0, 14)));
/*  898 */     this.jPanel3.setLayout((LayoutManager)null);
/*      */     
/*  900 */     this.ioSymbSlider.setBackground(new Color(255, 255, 255));
/*  901 */     this.ioSymbSlider.setMajorTickSpacing(3);
/*  902 */     this.ioSymbSlider.setMaximum(15);
/*  903 */     this.ioSymbSlider.setMinimum(1);
/*  904 */     this.ioSymbSlider.setMinorTickSpacing(1);
/*  905 */     this.ioSymbSlider.setPaintTicks(true);
/*  906 */     this.ioSymbSlider.setValue(5);
/*  907 */     this.ioSymbSlider.setName("");
/*  908 */     this.ioSymbSlider.addChangeListener(new ChangeListener() {
/*      */           public void stateChanged(ChangeEvent evt) {
/*  910 */             MainFrame.this.ioSymbSliderStateChanged(evt);
/*      */           }
/*      */         });
/*  913 */     this.jPanel3.add(this.ioSymbSlider);
/*  914 */     this.ioSymbSlider.setBounds(340, 80, 120, 31);
/*      */     
/*  916 */     this.ioSymbCountLabel.setFont(new Font("Century Gothic", 0, 13));
/*  917 */     this.ioSymbCountLabel.setText("Количество символов");
/*  918 */     this.jPanel3.add(this.ioSymbCountLabel);
/*  919 */     this.ioSymbCountLabel.setBounds(10, 80, 142, 20);
/*      */     
/*  921 */     this.ioSymbCountField.setEditable(false);
/*  922 */     this.ioSymbCountField.setFont(new Font("Century Gothic", 0, 13));
/*  923 */     this.ioSymbCountField.setText("5");
/*  924 */     this.ioSymbCountField.setToolTipText("");
/*  925 */     this.ioSymbCountField.setSelectedTextColor(new Color(0, 0, 0));
/*  926 */     this.ioSymbCountField.setSelectionColor(UIManager.getDefaults().getColor("Button.background"));
/*  927 */     this.jScrollPane4.setViewportView(this.ioSymbCountField);
/*      */     
/*  929 */     this.jPanel3.add(this.jScrollPane4);
/*  930 */     this.jScrollPane4.setBounds(280, 80, 50, 25);
/*      */     
/*  932 */     this.ioSlider.setBackground(new Color(255, 255, 255));
/*  933 */     this.ioSlider.setMajorTickSpacing(10);
/*  934 */     this.ioSlider.setMinorTickSpacing(5);
/*  935 */     this.ioSlider.setPaintTicks(true);
/*  936 */     this.ioSlider.setValue(10);
/*  937 */     this.ioSlider.setName("");
/*  938 */     this.ioSlider.addChangeListener(new ChangeListener() {
/*      */           public void stateChanged(ChangeEvent evt) {
/*  940 */             MainFrame.this.ioSliderStateChanged(evt);
/*      */           }
/*      */         });
/*  943 */     this.jPanel3.add(this.ioSlider);
/*  944 */     this.ioSlider.setBounds(340, 30, 120, 31);
/*      */     
/*  946 */     this.ioCountField.setEditable(false);
/*  947 */     this.ioCountField.setFont(new Font("Century Gothic", 0, 13));
/*  948 */     this.ioCountField.setText("10");
/*  949 */     this.ioCountField.setToolTipText("");
/*  950 */     this.ioCountField.setSelectedTextColor(new Color(0, 0, 0));
/*  951 */     this.ioCountField.setSelectionColor(new Color(255, 255, 255));
/*  952 */     this.jScrollPane2.setViewportView(this.ioCountField);
/*      */     
/*  954 */     this.jPanel3.add(this.jScrollPane2);
/*  955 */     this.jScrollPane2.setBounds(280, 30, 50, 25);
/*      */     
/*  957 */     this.ioCountLabel.setFont(new Font("Century Gothic", 0, 13));
/*  958 */     this.ioCountLabel.setText("Количество операций");
/*  959 */     this.jPanel3.add(this.ioCountLabel);
/*  960 */     this.ioCountLabel.setBounds(10, 30, 240, 17);
/*      */     
/*  962 */     this.withoutInputLabel.setFont(new Font("Century Gothic", 0, 13));
/*  963 */     this.withoutInputLabel.setText("Режим без операций ввода");
/*  964 */     this.jPanel3.add(this.withoutInputLabel);
/*  965 */     this.withoutInputLabel.setBounds(10, 130, 184, 20);
/*      */     
/*  967 */     this.withoutInputBox.setBackground(new Color(255, 255, 255));
/*  968 */     this.withoutInputBox.setFont(new Font("Century Gothic", 0, 13));
/*  969 */     this.withoutInputBox.setHorizontalAlignment(0);
/*  970 */     this.withoutInputBox.setMargin(new Insets(0, 0, 0, 0));
/*  971 */     this.jPanel3.add(this.withoutInputBox);
/*  972 */     this.withoutInputBox.setBounds(280, 130, 50, 30);
/*      */     
/*  974 */     this.outputMonLabel.setFont(new Font("Century Gothic", 0, 13));
/*  975 */     this.outputMonLabel.setText("Вывод символов на экран");
/*  976 */     this.jPanel3.add(this.outputMonLabel);
/*  977 */     this.outputMonLabel.setBounds(10, 180, 173, 20);
/*      */     
/*  979 */     this.outputMonBox.setBackground(new Color(255, 255, 255));
/*  980 */     this.outputMonBox.setFont(new Font("Century Gothic", 0, 13));
/*  981 */     this.outputMonBox.setSelected(true);
/*  982 */     this.outputMonBox.setHorizontalAlignment(0);
/*  983 */     this.outputMonBox.setMargin(new Insets(0, 0, 0, 0));
/*  984 */     this.jPanel3.add(this.outputMonBox);
/*  985 */     this.outputMonBox.setBounds(280, 180, 50, 30);
/*      */     
/*  987 */     this.jSeparator1.setForeground(new Color(204, 204, 204));
/*  988 */     this.jPanel3.add(this.jSeparator1);
/*  989 */     this.jSeparator1.setBounds(6, 166, 460, 10);
/*      */     
/*  991 */     this.jSeparator3.setForeground(new Color(204, 204, 204));
/*  992 */     this.jPanel3.add(this.jSeparator3);
/*  993 */     this.jSeparator3.setBounds(6, 64, 460, 10);
/*      */     
/*  995 */     this.jSeparator4.setForeground(new Color(204, 204, 204));
/*  996 */     this.jPanel3.add(this.jSeparator4);
/*  997 */     this.jSeparator4.setBounds(6, 116, 460, 10);
/*      */     
/*  999 */     this.dialogMainPanel.add(this.jPanel3, new AbsoluteConstraints(0, 130, 470, 220));
/*      */     
/* 1001 */     GroupLayout setDialogLayout = new GroupLayout(this.setDialog.getContentPane());
/* 1002 */     this.setDialog.getContentPane().setLayout(setDialogLayout);
/* 1003 */     setDialogLayout.setHorizontalGroup(setDialogLayout
/* 1004 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1005 */         .addComponent(this.dialogMainPanel, -2, 485, -2));
/*      */     
/* 1007 */     setDialogLayout.setVerticalGroup(setDialogLayout
/* 1008 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1009 */         .addComponent(this.dialogMainPanel, -2, 440, -2));
/*      */ 
/*      */     
/* 1012 */     this.finishDialog.setDefaultCloseOperation(0);
/* 1013 */     this.finishDialog.setTitle("Конец");
/* 1014 */     this.finishDialog.setAlwaysOnTop(true);
/* 1015 */     this.finishDialog.setModal(true);
/* 1016 */     this.finishDialog.setResizable(false);
/* 1017 */     this.finishDialog.setSize(new Dimension(200, 220));
/* 1018 */     this.finishDialog.getContentPane().setLayout((LayoutManager)null);
/*      */     
/* 1020 */     this.jPanel1.setBackground(new Color(255, 255, 255));
/* 1021 */     this.jPanel1.setPreferredSize(new Dimension(200, 200));
/* 1022 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 1024 */     this.jButton11.setFont(new Font("Century Gothic", 0, 12));
/* 1025 */     this.jButton11.setText("ОК");
/* 1026 */     this.jButton11.setFocusable(false);
/* 1027 */     this.jButton11.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1029 */             MainFrame.this.jButton11ActionPerformed(evt);
/*      */           }
/*      */         });
/* 1032 */     this.jPanel1.add(this.jButton11, new AbsoluteConstraints(70, 150, 60, 30));
/*      */     
/* 1034 */     this.jLabel2.setFont(new Font("Century Gothic", 0, 14));
/* 1035 */     this.jLabel2.setHorizontalAlignment(0);
/* 1036 */     this.jLabel2.setText("<html><center>Моделирование закончено.<br/><br/>Для перехода к результатам<br/> нажмите \"ОК\"</center></html>");
/* 1037 */     this.jPanel1.add(this.jLabel2, new AbsoluteConstraints(10, 10, 180, 110));
/*      */     
/* 1039 */     this.finishDialog.getContentPane().add(this.jPanel1);
/* 1040 */     this.jPanel1.setBounds(0, 0, 200, 200);
/*      */     
/* 1042 */     this.aboutDialog.setDefaultCloseOperation(2);
/* 1043 */     this.aboutDialog.setTitle("О программе");
/* 1044 */     this.aboutDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
/* 1045 */     this.aboutDialog.setResizable(false);
/* 1046 */     this.aboutDialog.setSize(new Dimension(400, 400));
/*      */     
/* 1048 */     this.jPanel4.setBackground(new Color(255, 255, 255));
/* 1049 */     this.jPanel4.setBorder(BorderFactory.createTitledBorder(""));
/* 1050 */     this.jPanel4.setPreferredSize(new Dimension(400, 400));
/* 1051 */     this.jPanel4.setLayout((LayoutManager)null);
/*      */     
/* 1053 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/img/about.gif")));
/* 1054 */     this.jPanel4.add(this.jLabel1);
/* 1055 */     this.jLabel1.setBounds(175, 280, 55, 80);
/*      */     
/* 1057 */     this.jLabel3.setFont(new Font("Century Gothic", 1, 18));
/* 1058 */     this.jLabel3.setHorizontalAlignment(0);
/* 1059 */     this.jLabel3.setText("<html><center>Имитационная модель подсистемы <br> ввода-вывода компьютера");
/* 1060 */     this.jPanel4.add(this.jLabel3);
/* 1061 */     this.jLabel3.setBounds(0, 20, 400, 60);
/*      */     
/* 1063 */     this.jLabel4.setFont(new Font("Century Gothic", 0, 14));
/* 1064 */     this.jLabel4.setHorizontalAlignment(4);
/* 1065 */     this.jLabel4.setIcon(new ImageIcon(getClass().getResource("/img/computer.png")));
/* 1066 */     this.jPanel4.add(this.jLabel4);
/* 1067 */     this.jLabel4.setBounds(30, 110, 150, 120);
/*      */     
/* 1069 */     this.jLabel5.setFont(new Font("Century Gothic", 0, 14));
/* 1070 */     this.jLabel5.setText("<html>Разработал:<br/><br/>студент 2-АИТ-3М<br/><br/>Эккарт В. С.");
/* 1071 */     this.jPanel4.add(this.jLabel5);
/* 1072 */     this.jLabel5.setBounds(230, 110, 130, 110);
/*      */     
/* 1074 */     this.jLabel6.setFont(new Font("Century Gothic", 0, 14));
/* 1075 */     this.jLabel6.setHorizontalAlignment(0);
/* 1076 */     this.jLabel6.setText("Самара, 2018");
/* 1077 */     this.jPanel4.add(this.jLabel6);
/* 1078 */     this.jLabel6.setBounds(0, 250, 400, 20);
/*      */     
/* 1080 */     GroupLayout aboutDialogLayout = new GroupLayout(this.aboutDialog.getContentPane());
/* 1081 */     this.aboutDialog.getContentPane().setLayout(aboutDialogLayout);
/* 1082 */     aboutDialogLayout.setHorizontalGroup(aboutDialogLayout
/* 1083 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1084 */         .addComponent(this.jPanel4, -2, 400, -2));
/*      */     
/* 1086 */     aboutDialogLayout.setVerticalGroup(aboutDialogLayout
/* 1087 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1088 */         .addComponent(this.jPanel4, -2, 400, -2));
/*      */ 
/*      */     
/* 1091 */     setDefaultCloseOperation(3);
/* 1092 */     setTitle("Модель подсистемы ввода-вывода");
/* 1093 */     setIconImage((new ImageIcon(getClass().getResource("/img/tittle.png")))
/* 1094 */         .getImage());
/* 1095 */     setResizable(false);
/*      */     
/* 1097 */     this.mainPanel.setBackground(new Color(255, 255, 255));
/* 1098 */     this.mainPanel.setDoubleBuffered(false);
/* 1099 */     this.mainPanel.setLayout((LayoutManager)null);
/*      */     
/* 1101 */     this.cpuLabel.setIcon(new ImageIcon(getClass().getResource("/img/cpu.png")));
/* 1102 */     this.mainPanel.add(this.cpuLabel);
/* 1103 */     this.cpuLabel.setBounds(80, 10, 130, 150);
/*      */     
/* 1105 */     this.ramLabel.setIcon(new ImageIcon(getClass().getResource("/img/RAM.png")));
/* 1106 */     this.mainPanel.add(this.ramLabel);
/* 1107 */     this.ramLabel.setBounds(830, 240, 130, 130);
/*      */     
/* 1109 */     this.helloLabel.setFont(new Font("Century Gothic", 3, 16));
/* 1110 */     this.helloLabel.setText("Hello, world!");
/* 1111 */     this.mainPanel.add(this.helloLabel);
/* 1112 */     this.helloLabel.setBounds(30, 300, 100, 21);
/*      */     
/* 1114 */     this.monLabel.setIcon(new ImageIcon(getClass().getResource("/img/monitor.png")));
/* 1115 */     this.mainPanel.add(this.monLabel);
/* 1116 */     this.monLabel.setBounds(20, 270, 120, 101);
/*      */     
/* 1118 */     this.vCardLabel.setIcon(new ImageIcon(getClass().getResource("/img/vcard.png")));
/* 1119 */     this.mainPanel.add(this.vCardLabel);
/* 1120 */     this.vCardLabel.setBounds(250, 250, 150, 130);
/*      */     
/* 1122 */     this.scanLabel.setIcon(new ImageIcon(getClass().getResource("/img/scan.png")));
/* 1123 */     this.scanLabel.setCursor(new Cursor(0));
/* 1124 */     this.scanLabel.setDoubleBuffered(true);
/* 1125 */     this.scanLabel.setFocusable(false);
/* 1126 */     this.scanLabel.setHorizontalTextPosition(0);
/* 1127 */     this.mainPanel.add(this.scanLabel);
/* 1128 */     this.scanLabel.setBounds(438, 640, 80, 80);
/*      */     
/* 1130 */     this.kbPlaceLabel.setIcon(new ImageIcon(getClass().getResource("/img/KBplace.png")));
/* 1131 */     this.mainPanel.add(this.kbPlaceLabel);
/* 1132 */     this.kbPlaceLabel.setBounds(436, 638, 44, 84);
/*      */     
/* 1134 */     this.kbLabel.setIcon(new ImageIcon(getClass().getResource("/img/keyboard.png")));
/* 1135 */     this.mainPanel.add(this.kbLabel);
/* 1136 */     this.kbLabel.setBounds(212, 630, 220, 103);
/*      */     
/* 1138 */     this.cpuTableScroll.setHorizontalScrollBarPolicy(32);
/*      */     
/* 1140 */     this.cpuTableSet.setModel(this.cpuTableSetModel);
/* 1141 */     this.cpuTableSet.setAutoResizeMode(0);
/* 1142 */     this.cpuTableSet.setEnabled(false);
/* 1143 */     this.cpuTableSet.setFocusable(false);
/* 1144 */     this.cpuTableSet.setGridColor(new Color(255, 255, 255));
/* 1145 */     this.cpuTableSet.setSelectionBackground(new Color(255, 255, 255));
/* 1146 */     this.cpuTableScroll.setViewportView(this.cpuTableSet);
/*      */     
/* 1148 */     this.mainPanel.add(this.cpuTableScroll);
/* 1149 */     this.cpuTableScroll.setBounds(220, 10, 250, 150);
/*      */     
/* 1151 */     this.ichToGmchLabel.setHorizontalAlignment(0);
/* 1152 */     this.ichToGmchLabel.setIcon(new ImageIcon(getClass().getResource("/img/SBtoNB.png")));
/* 1153 */     this.mainPanel.add(this.ichToGmchLabel);
/* 1154 */     this.ichToGmchLabel.setBounds(538, 370, 150, 90);
/*      */     
/* 1156 */     this.gmchLabel.setIcon(new ImageIcon(getClass().getResource("/img/GMCH.png")));
/* 1157 */     this.mainPanel.add(this.gmchLabel);
/* 1158 */     this.gmchLabel.setBounds(538, 220, 150, 150);
/*      */     
/* 1160 */     this.ichLabel.setIcon(new ImageIcon(getClass().getResource("/img/ICH2.png")));
/* 1161 */     this.mainPanel.add(this.ichLabel);
/* 1162 */     this.ichLabel.setBounds(538, 460, 150, 150);
/*      */     
/* 1164 */     this.kbToIchLabel.setIcon(new ImageIcon(getClass().getResource("/img/KBtoSB.png")));
/* 1165 */     this.mainPanel.add(this.kbToIchLabel);
/* 1166 */     this.kbToIchLabel.setBounds(480, 610, 210, 110);
/*      */     
/* 1168 */     this.gmchToVideoLabel.setIcon(new ImageIcon(getClass().getResource("/img/NBtoRAM.png")));
/* 1169 */     this.mainPanel.add(this.gmchToVideoLabel);
/* 1170 */     this.gmchToVideoLabel.setBounds(405, 280, 132, 60);
/*      */     
/* 1172 */     this.gmchToRamLabel.setIcon(new ImageIcon(getClass().getResource("/img/NBtoRAM.png")));
/* 1173 */     this.mainPanel.add(this.gmchToRamLabel);
/* 1174 */     this.gmchToRamLabel.setBounds(690, 280, 132, 60);
/*      */     
/* 1176 */     this.vCardToMonLabel.setIcon(new ImageIcon(getClass().getResource("/img/VcardtoMon.png")));
/* 1177 */     this.mainPanel.add(this.vCardToMonLabel);
/* 1178 */     this.vCardToMonLabel.setBounds(142, 280, 110, 60);
/*      */     
/* 1180 */     this.cpuPlaceLabel.setIcon(new ImageIcon(getClass().getResource("/img/KBplace.png")));
/* 1181 */     this.mainPanel.add(this.cpuPlaceLabel);
/* 1182 */     this.cpuPlaceLabel.setBounds(471, 73, 44, 90);
/*      */     
/* 1184 */     this.gmchToCpuLabel.setIcon(new ImageIcon(getClass().getResource("/img/CPUtoNB.png")));
/* 1185 */     this.mainPanel.add(this.gmchToCpuLabel);
/* 1186 */     this.gmchToCpuLabel.setBounds(515, 80, 172, 140);
/*      */     
/* 1188 */     this.taktButton.setFont(new Font("Century Gothic", 0, 12));
/* 1189 */     this.taktButton.setText("Следующий такт");
/* 1190 */     this.taktButton.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1192 */             MainFrame.this.taktButtonActionPerformed(evt);
/*      */           }
/*      */         });
/* 1195 */     this.mainPanel.add(this.taktButton);
/* 1196 */     this.taktButton.setBounds(750, 140, 160, 25);
/*      */     
/* 1198 */     this.animationSpeedLabel.setFont(new Font("Century Gothic", 0, 13));
/* 1199 */     this.animationSpeedLabel.setHorizontalAlignment(0);
/* 1200 */     this.animationSpeedLabel.setText("Скорость анимации");
/* 1201 */     this.mainPanel.add(this.animationSpeedLabel);
/* 1202 */     this.animationSpeedLabel.setBounds(750, 80, 150, 17);
/*      */     
/* 1204 */     this.animationSpeedSlider.setBackground(new Color(255, 255, 255));
/* 1205 */     this.animationSpeedSlider.setMajorTickSpacing(20);
/* 1206 */     this.animationSpeedSlider.setMinorTickSpacing(10);
/* 1207 */     this.animationSpeedSlider.setPaintTicks(true);
/* 1208 */     this.animationSpeedSlider.setValue(76);
/* 1209 */     this.animationSpeedSlider.addChangeListener(new ChangeListener() {
/*      */           public void stateChanged(ChangeEvent evt) {
/* 1211 */             MainFrame.this.animationSpeedSliderStateChanged(evt);
/*      */           }
/*      */         });
/* 1214 */     this.mainPanel.add(this.animationSpeedSlider);
/* 1215 */     this.animationSpeedSlider.setBounds(810, 100, 100, 30);
/*      */     
/* 1217 */     this.finishButton.setFont(new Font("Century Gothic", 0, 12));
/* 1218 */     this.finishButton.setText("Результаты");
/* 1219 */     this.finishButton.setFocusable(false);
/* 1220 */     this.finishButton.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1222 */             MainFrame.this.finishButtonActionPerformed(evt);
/*      */           }
/*      */         });
/* 1225 */     this.mainPanel.add(this.finishButton);
/* 1226 */     this.finishButton.setBounds(750, 180, 160, 25);
/*      */     
/* 1228 */     this.animationSpeedField.setEditable(false);
/* 1229 */     this.animationSpeedField.setBackground(new Color(255, 255, 255));
/* 1230 */     this.animationSpeedField.setFont(new Font("Century Gothic", 0, 12));
/* 1231 */     this.animationSpeedField.setText("76 %");
/* 1232 */     this.animationSpeedField.setDisabledTextColor(new Color(0, 0, 0));
/* 1233 */     this.animationSpeedField.setEnabled(false);
/* 1234 */     this.animationSpeedScroll.setViewportView(this.animationSpeedField);
/*      */     
/* 1236 */     this.mainPanel.add(this.animationSpeedScroll);
/* 1237 */     this.animationSpeedScroll.setBounds(750, 103, 50, 24);
/*      */     
/* 1239 */     this.ramTableScroll.setHorizontalScrollBarPolicy(32);
/* 1240 */     this.ramTableScroll.setVerticalScrollBarPolicy(21);
/*      */     
/* 1242 */     this.ramTableSet.setModel(this.ramTableSetModel);
/* 1243 */     this.ramTableSet.setAutoResizeMode(0);
/* 1244 */     this.ramTableScroll.setViewportView(this.ramTableSet);
/*      */     
/* 1246 */     this.mainPanel.add(this.ramTableScroll);
/* 1247 */     this.ramTableScroll.setBounds(830, 380, 130, 100);
/*      */     
/* 1249 */     this.interruptLabel.setFocusable(false);
/* 1250 */     this.mainPanel.add(this.interruptLabel);
/* 1251 */     this.interruptLabel.setBounds(468, 8, 540, 580);
/*      */     
/* 1253 */     this.ioCountShow.setFont(new Font("Century Gothic", 0, 12));
/* 1254 */     this.ioCountShow.setText("В/В");
/* 1255 */     this.ioCountShow.setFocusable(false);
/* 1256 */     this.ioCountShow.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1258 */             MainFrame.this.ioCountShowActionPerformed(evt);
/*      */           }
/*      */         });
/* 1261 */     this.mainPanel.add(this.ioCountShow);
/* 1262 */     this.ioCountShow.setBounds(220, 170, 70, 30);
/*      */     
/* 1264 */     this.cpuCountShow.setFont(new Font("Century Gothic", 0, 11));
/* 1265 */     this.cpuCountShow.setText("ЦПУ");
/* 1266 */     this.cpuCountShow.setFocusable(false);
/* 1267 */     this.cpuCountShow.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1269 */             MainFrame.this.cpuCountShowActionPerformed(evt);
/*      */           }
/*      */         });
/* 1272 */     this.mainPanel.add(this.cpuCountShow);
/* 1273 */     this.cpuCountShow.setBounds(300, 170, 70, 30);
/*      */     
/* 1275 */     this.allCountShow.setFont(new Font("Century Gothic", 0, 12));
/* 1276 */     this.allCountShow.setText("Все");
/* 1277 */     this.allCountShow.setFocusable(false);
/* 1278 */     this.allCountShow.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1280 */             MainFrame.this.allCountShowActionPerformed(evt);
/*      */           }
/*      */         });
/* 1283 */     this.mainPanel.add(this.allCountShow);
/* 1284 */     this.allCountShow.setBounds(380, 170, 70, 30);
/*      */     
/* 1286 */     this.fileMenu.setBorder((Border)null);
/* 1287 */     this.fileMenu.setText("Файл");
/* 1288 */     this.fileMenu.setFont(new Font("Century Gothic", 0, 14));
/* 1289 */     this.fileMenu.setHorizontalAlignment(2);
/* 1290 */     this.fileMenu.setMargin(new Insets(0, 10, 0, 10));
/* 1291 */     this.fileMenu.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1293 */             MainFrame.this.fileMenuActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/* 1297 */     this.startMenuItem.setAccelerator(KeyStroke.getKeyStroke(49, 2));
/* 1298 */     this.startMenuItem.setFont(new Font("Century Gothic", 0, 14));
/* 1299 */     this.startMenuItem.setIcon(new ImageIcon(getClass().getResource("/img/icons8-воспроизведение-14.png")));
/* 1300 */     this.startMenuItem.setText("Старт");
/* 1301 */     this.startMenuItem.setEnabled(false);
/* 1302 */     this.startMenuItem.setHorizontalAlignment(2);
/* 1303 */     this.startMenuItem.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1305 */             MainFrame.this.startMenuItemActionPerformed(evt);
/*      */           }
/*      */         });
/* 1308 */     this.fileMenu.add(this.startMenuItem);
/*      */     
/* 1310 */     this.clearMenuItem.setAccelerator(KeyStroke.getKeyStroke(50, 2));
/* 1311 */     this.clearMenuItem.setFont(new Font("Century Gothic", 0, 14));
/* 1312 */     this.clearMenuItem.setIcon(new ImageIcon(getClass().getResource("/img/icons8-перезагрузка-filled-24.png")));
/* 1313 */     this.clearMenuItem.setText("Сброс");
/* 1314 */     this.clearMenuItem.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1316 */             MainFrame.this.clearMenuItemActionPerformed(evt);
/*      */           }
/*      */         });
/* 1319 */     this.fileMenu.add(this.clearMenuItem);
/*      */     
/* 1321 */     this.optionsMenuItem.setAccelerator(KeyStroke.getKeyStroke(51, 2));
/* 1322 */     this.optionsMenuItem.setFont(new Font("Century Gothic", 0, 14));
/* 1323 */     this.optionsMenuItem.setIcon(new ImageIcon(getClass().getResource("/img/icons8-меню-32.png")));
/* 1324 */     this.optionsMenuItem.setText("Параметры");
/* 1325 */     this.optionsMenuItem.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1327 */             MainFrame.this.optionsMenuItemActionPerformed(evt);
/*      */           }
/*      */         });
/* 1330 */     this.fileMenu.add(this.optionsMenuItem);
/*      */     
/* 1332 */     this.exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(69, 2));
/* 1333 */     this.exitMenuItem.setFont(new Font("Century Gothic", 0, 14));
/* 1334 */     this.exitMenuItem.setIcon(new ImageIcon(getClass().getResource("/img/icons8-выключение-системы-24.png")));
/* 1335 */     this.exitMenuItem.setText("Выход");
/* 1336 */     this.exitMenuItem.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1338 */             MainFrame.this.exitMenuItemActionPerformed(evt);
/*      */           }
/*      */         });
/* 1341 */     this.fileMenu.add(this.exitMenuItem);
/*      */     
/* 1343 */     this.menuBar.add(this.fileMenu);
/*      */     
/* 1345 */     this.selectModeMenu.setText("Режим моделирования");
/* 1346 */     this.selectModeMenu.setEnabled(false);
/* 1347 */     this.selectModeMenu.setFont(new Font("Century Gothic", 0, 14));
/* 1348 */     this.selectModeMenu.setHorizontalTextPosition(0);
/* 1349 */     this.selectModeMenu.setMargin(new Insets(0, 10, 0, 10));
/*      */     
/* 1351 */     this.perpetualMenuItem.setAccelerator(KeyStroke.getKeyStroke(52, 2));
/* 1352 */     this.perpetualMenuItem.setFont(new Font("Century Gothic", 0, 14));
/* 1353 */     this.perpetualMenuItem.setText("Непрерывный");
/* 1354 */     this.perpetualMenuItem.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1356 */             MainFrame.this.perpetualMenuItemActionPerformed(evt);
/*      */           }
/*      */         });
/* 1359 */     this.selectModeMenu.add(this.perpetualMenuItem);
/*      */     
/* 1361 */     this.taktMenuItem.setAccelerator(KeyStroke.getKeyStroke(53, 2));
/* 1362 */     this.taktMenuItem.setFont(new Font("Century Gothic", 0, 14));
/* 1363 */     this.taktMenuItem.setText("Потактовый");
/* 1364 */     this.taktMenuItem.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1366 */             MainFrame.this.taktMenuItemActionPerformed(evt);
/*      */           }
/*      */         });
/* 1369 */     this.selectModeMenu.add(this.taktMenuItem);
/*      */     
/* 1371 */     this.menuBar.add(this.selectModeMenu);
/*      */     
/* 1373 */     this.aboutMenu.setText("Справка");
/* 1374 */     this.aboutMenu.setFont(new Font("Century Gothic", 0, 14));
/* 1375 */     this.aboutMenu.setMargin(new Insets(0, 10, 0, 10));
/* 1376 */     this.aboutMenu.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1378 */             MainFrame.this.aboutMenuActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/* 1382 */     this.aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(73, 2));
/* 1383 */     this.aboutMenuItem.setFont(new Font("Century Gothic", 0, 14));
/* 1384 */     this.aboutMenuItem.setIcon(new ImageIcon(getClass().getResource("/img/icons8-информация-14.png")));
/* 1385 */     this.aboutMenuItem.setText("О программе");
/* 1386 */     this.aboutMenuItem.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 1388 */             MainFrame.this.aboutMenuItemActionPerformed(evt);
/*      */           }
/*      */         });
/* 1391 */     this.aboutMenu.add(this.aboutMenuItem);
/*      */     
/* 1393 */     this.menuBar.add(this.aboutMenu);
/*      */     
/* 1395 */     setJMenuBar(this.menuBar);
/*      */     
/* 1397 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 1398 */     getContentPane().setLayout(layout);
/* 1399 */     layout.setHorizontalGroup(layout
/* 1400 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1401 */         .addComponent(this.mainPanel, -1, -1, 32767));
/*      */     
/* 1403 */     layout.setVerticalGroup(layout
/* 1404 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1405 */         .addComponent(this.mainPanel, GroupLayout.Alignment.TRAILING, -1, 747, 32767));
/*      */ 
/*      */     
/* 1408 */     setSize(new Dimension(1040, 807));
/* 1409 */     setLocationRelativeTo((Component)null);
/*      */   }
/*      */   
/*      */   private void startMenuItemActionPerformed(ActionEvent evt) {
/* 1413 */     this.optionsMenuItem.setEnabled(false);
/* 1414 */     this.selectModeMenu.setEnabled(false);
/* 1415 */     this.startMenuItem.setEnabled(false);
/* 1416 */     if (this.perpetualMenuItem.isSelected() == true) {
/* 1417 */       Results res = new Results(this.cpuCount, this.ioSymbSlider.getValue(), this.outputMonBox.isSelected(), this.withoutInputBox.isSelected());
/* 1418 */       res.setVisible(true);
/* 1419 */       clearAll();
/* 1420 */       this.perpetualMenuItem.setSelected(false);
/* 1421 */       this.taktMenuItem.setSelected(false);
/* 1422 */     } else if (this.taktMenuItem.isSelected() == true) {
/* 1423 */       this.animationSpeedLabel.setVisible(true);
/* 1424 */       this.animationSpeedScroll.setVisible(true);
/* 1425 */       this.animationSpeedSlider.setVisible(true);
/* 1426 */       this.taktButton.setVisible(true);
/* 1427 */       this.finishButton.setVisible(true);
/* 1428 */       this.perpetualMenuItem.setSelected(false);
/* 1429 */       this.taktMenuItem.setSelected(false);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void optionsMenuItemActionPerformed(ActionEvent evt) {
/* 1434 */     this.setDialog.setVisible(true);
/*      */   }
/*      */   
/*      */   private void clearMenuItemActionPerformed(ActionEvent evt) {
/* 1438 */     clearAll();
/*      */   }
/*      */   
/*      */   private void cancelDialogButtonActionPerformed(ActionEvent evt) {
/* 1442 */     this.setDialog.dispose();
/*      */   }
/*      */   
/*      */   private void taktMenuItemActionPerformed(ActionEvent evt) {
/* 1446 */     this.perpetualMenuItem.setSelected(false);
/* 1447 */     this.taktMenuItem.setSelected(true);
/* 1448 */     this.startMenuItem.setEnabled(true);
/*      */   }
/*      */   
/*      */   private void exitMenuItemActionPerformed(ActionEvent evt) {
/* 1452 */     dispose();
/*      */   }
/*      */   
/*      */   private void okDialogButtonActionPerformed(ActionEvent evt) {
/* 1456 */     this.clearMenuItem.setEnabled(true);
/* 1457 */     this.selectModeMenu.setEnabled(true);
/* 1458 */     this.optionsMenuItem.setEnabled(false);
/* 1459 */     cpuSetSort();
/* 1460 */     setColumnModel();
/* 1461 */     this.ioCountShow.setVisible(true);
/* 1462 */     this.cpuCountShow.setVisible(true);
/* 1463 */     this.allCountShow.setVisible(true);
/* 1464 */     this.setDialog.dispose();
/*      */   }
/*      */   
/*      */   private void ioSliderStateChanged(ChangeEvent evt) {
/* 1468 */     this.ioCountField.setText(Integer.toString(this.ioSlider.getValue()));
/* 1469 */     if (this.ioSlider.getValue() > 0) {
/* 1470 */       this.ioSymbSlider.setEnabled(true);
/* 1471 */       this.ioSymbCountField.setBackground(Color.white);
/* 1472 */       this.withoutInputBox.setEnabled(true);
/* 1473 */       this.outputMonBox.setEnabled(true);
/*      */     }
/* 1475 */     else if (this.ioSlider.getValue() == 0) {
/* 1476 */       this.ioSymbSlider.setEnabled(false);
/* 1477 */       this.ioSymbCountField.setBackground(UIManager.getDefaults().getColor("Button.background"));
/* 1478 */       this.withoutInputBox.setEnabled(false);
/* 1479 */       this.outputMonBox.setEnabled(false);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void cpuSliderStateChanged(ChangeEvent evt) {
/* 1484 */     this.cpuCountField.setText(Integer.toString(this.cpuSlider.getValue()));
/*      */   }
/*      */   
/*      */   private void ioSymbSliderStateChanged(ChangeEvent evt) {
/* 1488 */     this.ioSymbCountField.setText(Integer.toString(this.ioSymbSlider.getValue()));
/*      */   }
/*      */   
/*      */   private void animationSpeedSliderStateChanged(ChangeEvent evt) {
/* 1492 */     this.animationSpeedField.setText(Integer.toString(this.animationSpeedSlider.getValue()) + " %");
/* 1493 */     this.timerDelay = (100 - this.animationSpeedSlider.getValue()) / 2;
/*      */   }
/*      */   
/*      */   private void taktButtonActionPerformed(ActionEvent evt) {
/* 1497 */     taktAnimations(this.withoutInputBox.isSelected(), this.outputMonBox.isSelected());
/*      */   }
/*      */   
/*      */   private void ioCountShowActionPerformed(ActionEvent evt) {
/* 1501 */     showIoCount();
/* 1502 */     showIoCount();
/* 1503 */     clearCpuCount();
/*      */   }
/*      */   
/*      */   private void cpuCountShowActionPerformed(ActionEvent evt) {
/* 1507 */     showCpuCount();
/* 1508 */     showCpuCount();
/* 1509 */     clearIoCount();
/*      */   }
/*      */   
/*      */   private void allCountShowActionPerformed(ActionEvent evt) {
/* 1513 */     showIoCount();
/* 1514 */     showIoCount();
/* 1515 */     showCpuCount();
/* 1516 */     showCpuCount();
/*      */   }
/*      */   
/*      */   private void finishButtonActionPerformed(ActionEvent evt) {
/* 1520 */     Results res = new Results(this.cpuCount, this.ioSymbSlider.getValue(), this.outputMonBox.isSelected(), this.withoutInputBox.isSelected());
/* 1521 */     res.setVisible(true);
/* 1522 */     clearAll();
/*      */   }
/*      */   
/*      */   private void jButton11ActionPerformed(ActionEvent evt) {
/* 1526 */     Results res = new Results(this.cpuCount, this.ioSymbSlider.getValue(), this.outputMonBox.isSelected(), this.withoutInputBox.isSelected());
/* 1527 */     res.setVisible(true);
/* 1528 */     clearAll();
/* 1529 */     this.finishDialog.dispose();
/*      */   }
/*      */   
/*      */   private void fileMenuActionPerformed(ActionEvent evt) {
/* 1533 */     this.startMenuItem.setVisible(false);
/*      */   }
/*      */   
/*      */   private void perpetualMenuItemActionPerformed(ActionEvent evt) {
/* 1537 */     this.taktMenuItem.setSelected(false);
/* 1538 */     this.perpetualMenuItem.setSelected(true);
/* 1539 */     this.startMenuItem.setEnabled(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void aboutMenuActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void aboutMenuItemActionPerformed(ActionEvent evt) {
/* 1546 */     this.aboutDialog.setVisible(true);
/*      */   }
/*      */ }


/* Location:              C:\Users\Acronix\Desktop\АСВТ_2022_2023\Лаб_1\IOSystem.jar!\IOSystem\MainFrame.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */