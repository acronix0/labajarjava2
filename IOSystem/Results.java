/*     */ package IOSystem;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GradientPaint;
/*     */ import java.awt.LayoutManager;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import javax.swing.*;
/*     */
/*     */
/*     */
/*     */
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ import org.jfree.chart.ChartFactory;
/*     */ import org.jfree.chart.ChartPanel;
/*     */ import org.jfree.chart.JFreeChart;
/*     */ import org.jfree.chart.axis.CategoryAxis;
/*     */ import org.jfree.chart.axis.NumberAxis;
/*     */ import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
/*     */ import org.jfree.chart.plot.PlotOrientation;
/*     */ import org.jfree.chart.renderer.category.*;
/*     */
/*     */
/*     */
/*     */ import org.jfree.chart.title.TextTitle;
/*     */ import org.jfree.data.category.CategoryDataset;
/*     */ import org.jfree.data.category.DefaultCategoryDataset;
/*     */ import org.jfree.data.category.SlidingCategoryDataset;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class Results extends JFrame {
/*  35 */   private ArrayList<Object> mainDataSet = new ArrayList();
/*  36 */   private ArrayList<Integer> cpuDataSet = new ArrayList<>();
/*  37 */   private ArrayList<Integer> cpuCommandDataSet = new ArrayList<>();
/*  38 */   private ArrayList<Integer> vCardDataSet = new ArrayList<>();
/*  39 */   private ArrayList<Integer> keyboardDataSet = new ArrayList<>();
/*  40 */   private int width = 0;
/*  41 */   private int cpuTime = 0; private int vCardTime = 0; private int keyboardTime = 0; private int allTime = 0;
/*     */ 
/*     */ 
/*     */   
/*  45 */   private double cpuPercent = 0.0D; private double vCardPercent = 0.0D; private double keyboardPercent = 0.0D; private SlidingCategoryDataset cpuSet; private SlidingCategoryDataset vCardSet; private SlidingCategoryDataset keyboardSet; private TextTitle cpu; private TextTitle vCard; private TextTitle keyboard;
/*     */   private JFreeChart cpuChart;
/*     */   private JFreeChart vCardChart;
/*     */   private JFreeChart keyboardChart;
/*     */   private ChartPanel cpuChartPanel;
/*     */   private ChartPanel vCardChartPanel;
/*     */   private ChartPanel keyboardChartPanel;
/*     */   private int ioCount;
/*     */   private boolean output;
/*     */   private boolean input;
/*     */   
/*     */   public Results(ArrayList<Object> list, int ioSymbCount, boolean output, boolean withoutInput) {
/*  57 */     this.mainDataSet = list;
/*  58 */     this.ioCount = ioSymbCount;
/*  59 */     this.output = output;
/*  60 */     this.input = withoutInput;
/*  61 */     if (this.input) {
/*  62 */       withoutInputTakt(ioSymbCount, output);
/*     */     } else {
/*  64 */       fullTakt(ioSymbCount, output);
/*     */     } 
/*     */     
/*  67 */     initComponents();
/*     */     
/*  69 */     this.cpuSet = new SlidingCategoryDataset(createCpuDataset(), 0, this.width);
/*  70 */     this.vCardSet = new SlidingCategoryDataset(createVcardDataSet(), 0, this.width);
/*  71 */     this.keyboardSet = new SlidingCategoryDataset(createKeyboardDataSet(), 0, this.width);
/*     */     
/*  73 */     this.cpuChart = createCpuChart((CategoryDataset)this.cpuSet);
/*  74 */     this.vCardChart = createChart((CategoryDataset)this.vCardSet);
/*  75 */     this.keyboardChart = createChart((CategoryDataset)this.keyboardSet);
/*     */     
/*  77 */     this.cpuChartPanel = new ChartPanel(this.cpuChart);
/*  78 */     this.vCardChartPanel = new ChartPanel(this.vCardChart);
/*  79 */     this.keyboardChartPanel = new ChartPanel(this.keyboardChart);
/*     */     
/*  81 */     this.cpu = new TextTitle("Центральный процессор", new Font("Century Gothic", 1, 20));
/*  82 */     this.vCard = new TextTitle("Видеокарта", new Font("Century Gothic", 1, 20));
/*  83 */     this.keyboard = new TextTitle("Клавиатура", new Font("Century Gothic", 1, 20));
/*     */     
/*  85 */     this.cpuChart.setTitle(this.cpu);
/*  86 */     this.vCardChart.setTitle(this.vCard);
/*  87 */     this.keyboardChart.setTitle(this.keyboard);
/*     */     
/*  89 */     this.cpuPanel.add((Component)this.cpuChartPanel);
/*  90 */     this.vCardPanel.add((Component)this.vCardChartPanel);
/*  91 */     this.keyboardPanel.add((Component)this.keyboardChartPanel);
/*     */     
/*  93 */     this.cpuTimeValue.setText(this.cpuTime + endWord(this.cpuTime) + " (" + 
/*  94 */         String.format("%.3f", new Object[] { Double.valueOf(this.cpuPercent) }) + " %)");
/*  95 */     this.vcardTimeValue.setText(this.vCardTime + endWord(this.vCardTime) + " (" + 
/*  96 */         String.format("%.3f", new Object[] { Double.valueOf(this.vCardPercent) }) + " %)");
/*  97 */     this.keyboardTimeValue.setText(this.keyboardTime + endWord(this.keyboardTime) + " (" + 
/*  98 */         String.format("%.3f", new Object[] { Double.valueOf(this.keyboardPercent) }) + " %)");
/*  99 */     this.allTimeValue.setText(this.allTime + endWord(this.allTime));
/*     */   }
/*     */   private JLabel allTimeValue; private JPanel chartSlidePanel; private JSlider chartSlider; private JPanel cpuPanel; private JLabel cpuTimeTittle; private JLabel cpuTimeValue; private JPanel jPanel1; private JPanel jPanel2; private JPanel jPanel5; private JPanel keyboardPanel; private JLabel keyboardTimeTittle; private JLabel keyboardTimeValue; private JPanel vCardPanel; private JLabel vcardTimeTittle; private JLabel vcardTimeValue;
/*     */   
/*     */   private String endWord(int number) {
/* 104 */     StringBuilder s = new StringBuilder();
/* 105 */     if (number % 100 > 10 && number % 100 < 21) {
/* 106 */       return s.append(" секунд").toString();
/*     */     }
/* 108 */     switch (number % 10) {
/*     */       case 1:
/* 110 */         return s.append(" секунда").toString();
/*     */       case 2:
/*     */       case 3:
/*     */       case 4:
/* 114 */         return s.append(" секунды").toString();
/*     */     } 
/* 116 */     return s.append(" секунд").toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private void fullTakt(int ioSymbCount, boolean output) {
/* 121 */     for (int i = 0; i < this.mainDataSet.size(); i++) {
/* 122 */       if (this.mainDataSet.get(i) instanceof Integer) {
/* 123 */         this.cpuDataSet.add(Integer.valueOf(0));
/* 124 */         this.cpuCommandDataSet.add(Integer.valueOf(1));
/* 125 */         this.vCardDataSet.add(Integer.valueOf(0));
/* 126 */         this.keyboardDataSet.add(Integer.valueOf(0));
/* 127 */         this.cpuTime++;
/*     */       } else {
/* 129 */         for (int j = 0; j < ioSymbCount; j++) {
/* 130 */           int k; for (k = 0; k < 4; k++) {
/* 131 */             switch (k) {
/*     */               case 0:
/* 133 */                 this.keyboardDataSet.add(Integer.valueOf(1));
/* 134 */                 this.cpuDataSet.add(Integer.valueOf(0));
/* 135 */                 this.cpuCommandDataSet.add(Integer.valueOf(0));
/* 136 */                 this.vCardDataSet.add(Integer.valueOf(0));
/* 137 */                 this.keyboardTime++;
/*     */                 break;
/*     */               case 1:
/* 140 */                 this.keyboardDataSet.add(Integer.valueOf(0));
/* 141 */                 this.cpuDataSet.add(Integer.valueOf(1));
/* 142 */                 this.cpuCommandDataSet.add(Integer.valueOf(0));
/* 143 */                 this.vCardDataSet.add(Integer.valueOf(0));
/* 144 */                 this.cpuTime++;
/*     */                 break;
/*     */               case 2:
/* 147 */                 this.keyboardDataSet.add(Integer.valueOf(0));
/* 148 */                 this.cpuDataSet.add(Integer.valueOf(1));
/* 149 */                 this.cpuCommandDataSet.add(Integer.valueOf(0));
/* 150 */                 this.vCardDataSet.add(Integer.valueOf(0));
/* 151 */                 this.cpuTime++;
/*     */                 break;
/*     */               case 3:
/* 154 */                 this.keyboardDataSet.add(Integer.valueOf(0));
/* 155 */                 this.cpuDataSet.add(Integer.valueOf(1));
/* 156 */                 this.cpuCommandDataSet.add(Integer.valueOf(0));
/* 157 */                 this.vCardDataSet.add(Integer.valueOf(0));
/* 158 */                 this.cpuTime++;
/*     */                 break;
/*     */             } 
/*     */ 
/*     */           
/*     */           } 
/* 164 */           if (j == ioSymbCount - 1 && output == true) {
/* 165 */             for (k = 0; k < ioSymbCount; k++) {
/* 166 */               vCardTakt();
/*     */             }
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 173 */     this.allTime = this.cpuTime + this.vCardTime + this.keyboardTime;
/*     */     
/* 175 */     this.cpuPercent = (this.cpuTime * 100) / this.allTime;
/* 176 */     if (this.vCardTime != 0) {
/* 177 */       this.vCardPercent = (this.vCardTime * 100) / this.allTime;
/*     */     }
/* 179 */     if (this.keyboardTime != 0) {
/* 180 */       this.keyboardPercent = (this.keyboardTime * 100) / this.allTime;
/*     */     }
/*     */     
/* 183 */     widthDataset();
/*     */   }
/*     */   
/*     */   private void withoutInputTakt(int ioSymbCount, boolean output) {
/* 187 */     for (int i = 0; i < this.mainDataSet.size(); i++) {
/* 188 */       if (this.mainDataSet.get(i) instanceof Integer) {
/* 189 */         this.cpuDataSet.add(Integer.valueOf(0));
/* 190 */         this.cpuCommandDataSet.add(Integer.valueOf(1));
/* 191 */         this.vCardDataSet.add(Integer.valueOf(0));
/* 192 */         this.keyboardDataSet.add(Integer.valueOf(0));
/* 193 */         this.cpuTime++;
/*     */       } else {
/* 195 */         for (int j = 0; j < ioSymbCount; j++) {
/* 196 */           Collections.addAll(this.cpuDataSet, new Integer[] { Integer.valueOf(1), Integer.valueOf(1) });
/* 197 */           Collections.addAll(this.cpuCommandDataSet, new Integer[] { Integer.valueOf(0), Integer.valueOf(0) });
/* 198 */           Collections.addAll(this.vCardDataSet, new Integer[] { Integer.valueOf(0), Integer.valueOf(0) });
/* 199 */           Collections.addAll(this.keyboardDataSet, new Integer[] { Integer.valueOf(0), Integer.valueOf(0) });
/* 200 */           this.cpuTime += 2;
/*     */           
/* 202 */           if (j == ioSymbCount - 1 && output == true) {
/* 203 */             for (int k = 0; k < ioSymbCount; k++) {
/* 204 */               vCardTakt();
/*     */             }
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 212 */     this.allTime = this.cpuTime + this.vCardTime;
/*     */     
/* 214 */     this.cpuPercent = (this.cpuTime * 100) / this.allTime;
/* 215 */     if (this.vCardTime != 0) {
/* 216 */       this.vCardPercent = (this.vCardTime * 100) / this.allTime;
/*     */     }
/*     */     
/* 219 */     widthDataset();
/*     */   }
/*     */ 
/*     */   
/*     */   private void vCardTakt() {
/* 224 */     Collections.addAll(this.cpuDataSet, new Integer[] { Integer.valueOf(0), Integer.valueOf(0) });
/* 225 */     Collections.addAll(this.cpuCommandDataSet, new Integer[] { Integer.valueOf(0), Integer.valueOf(0) });
/* 226 */     Collections.addAll(this.keyboardDataSet, new Integer[] { Integer.valueOf(0), Integer.valueOf(0) });
/* 227 */     Collections.addAll(this.vCardDataSet, new Integer[] { Integer.valueOf(1), Integer.valueOf(1) });
/* 228 */     this.vCardTime += 2;
/*     */   }
/*     */   
/*     */   private void widthDataset() {
/* 232 */     int arrSize = this.cpuDataSet.size();
/* 233 */     if (arrSize < 25) {
/* 234 */       this.width = arrSize;
/* 235 */     } else if (arrSize >= 25 && arrSize < 1000) {
/* 236 */       this.width = 25;
/* 237 */     } else if (arrSize > 1000) {
/* 238 */       this.width = 15;
/*     */     } 
/*     */   }
/*     */   
/*     */   private CategoryDataset createCpuDataset() {
/* 243 */     DefaultCategoryDataset cpuCategoryDataset = new DefaultCategoryDataset();
/*     */     int i;
/* 245 */     for (i = 0; i < this.cpuDataSet.size(); i++) {
/* 246 */       cpuCategoryDataset.addValue(this.cpuDataSet.get(i), "CPU", "" + (i + 1));
/*     */     }
/* 248 */     for (i = 0; i < this.cpuCommandDataSet.size(); i++) {
/* 249 */       cpuCategoryDataset.addValue(this.cpuCommandDataSet.get(i), "CPU2", "" + (i + 1));
/*     */     }
/* 251 */     return (CategoryDataset)cpuCategoryDataset;
/*     */   }
/*     */   
/*     */   private CategoryDataset createVcardDataSet() {
/* 255 */     DefaultCategoryDataset vCardCategoryDataset = new DefaultCategoryDataset();
/*     */     
/* 257 */     for (int i = 0; i < this.vCardDataSet.size(); i++) {
/* 258 */       vCardCategoryDataset.addValue(this.vCardDataSet.get(i), "Videocard", "" + (i + 1));
/*     */     }
/* 260 */     return (CategoryDataset)vCardCategoryDataset;
/*     */   }
/*     */   
/*     */   private CategoryDataset createKeyboardDataSet() {
/* 264 */     DefaultCategoryDataset keyboardCategoryDataset = new DefaultCategoryDataset();
/*     */     
/* 266 */     for (int i = 0; i < this.keyboardDataSet.size(); i++) {
/* 267 */       keyboardCategoryDataset.addValue(this.keyboardDataSet.get(i), "Keyboard", "" + (i + 1));
/*     */     }
/* 269 */     return (CategoryDataset)keyboardCategoryDataset;
/*     */   }
/*     */   
/*     */   private void chartPlotConfiguration(CategoryPlot plot) {
/* 273 */     plot.setBackgroundPaint(Color.white);
/* 274 */     plot.setRangeGridlinePaint(Color.black);
/* 275 */     plot.setDomainGridlinePaint(Color.black);
/*     */     
/* 277 */     CategoryAxis resCategoryAxis = plot.getDomainAxis();
/* 278 */     resCategoryAxis.setMaximumCategoryLabelWidthRatio(0.8F);
/* 279 */     resCategoryAxis.setLowerMargin(0.01D);
/* 280 */     resCategoryAxis.setUpperMargin(0.01D);
/* 281 */     resCategoryAxis.setCategoryMargin(-0.025D);
/* 282 */     resCategoryAxis.setTickLabelFont(new Font("Century Gothic", 0, 13));
/* 283 */     resCategoryAxis.setLabelFont(new Font("Century Gothic", 1, 16));
/*     */     
/* 285 */     NumberAxis resNumberAxis = (NumberAxis)plot.getRangeAxis();
/* 286 */     resNumberAxis.setTickUnit(new NumberTickUnit(1.0D));
/* 287 */     resNumberAxis.setRange(0.0D, 1.05D);
/*     */   }
/*     */   
/*     */   private JFreeChart createChart(CategoryDataset dataset) {
/* 291 */     JFreeChart resChart = ChartFactory.createBarChart(null, "Секунды", "", dataset, PlotOrientation.VERTICAL, false, true, false);
/*     */     
/* 293 */     resChart.setAntiAlias(true);
/*     */     
/* 295 */     CategoryPlot resPlot = (CategoryPlot)resChart.getPlot();
/* 296 */     chartPlotConfiguration(resPlot);
/*     */     
/* 298 */     BarRenderer resBarRenderer = (BarRenderer)resPlot.getRenderer();
/* 299 */     resBarRenderer.setBarPainter((BarPainter)new StandardBarPainter());
/* 300 */     resBarRenderer.setDrawBarOutline(false);
/* 301 */     GradientPaint localGradientPaint = new GradientPaint(100.0F, 100.0F, new Color(156, 0, 1), 0.0F, 0.0F, new Color(254, 26, 77));
/*     */     
/* 303 */     resBarRenderer.setSeriesPaint(0, localGradientPaint);
/*     */     
/* 305 */     return resChart;
/*     */   }
/*     */   
/*     */   private JFreeChart createCpuChart(CategoryDataset dataset) {
/* 309 */     JFreeChart resChart = ChartFactory.createBarChart(null, "Секунды", "", dataset, PlotOrientation.VERTICAL, false, true, false);
/*     */     
/* 311 */     resChart.setAntiAlias(true);
/*     */     
/* 313 */     CategoryPlot resPlot = (CategoryPlot)resChart.getPlot();
/* 314 */     chartPlotConfiguration(resPlot);
/*     */     
/* 316 */     LayeredBarRenderer resBarRenderer = new LayeredBarRenderer();
/* 317 */     resBarRenderer.setItemMargin(0.0D);
/* 318 */     resBarRenderer.setSeriesBarWidth(0, 1.654D);
/* 319 */     resBarRenderer.setSeriesBarWidth(1, 1.0D);
/* 320 */     resBarRenderer.setBarPainter((BarPainter)new StandardBarPainter());
/* 321 */     resBarRenderer.setDrawBarOutline(false);
/* 322 */     GradientPaint localGradientPaintCpu = new GradientPaint(100.0F, 100.0F, new Color(1, 106, 172), 0.0F, 0.0F, new Color(0, 225, 255));
/*     */     
/* 324 */     GradientPaint localGradientPaintIo = new GradientPaint(100.0F, 100.0F, new Color(156, 0, 1), 0.0F, 0.0F, new Color(254, 26, 77));
/*     */     
/* 326 */     resBarRenderer.setSeriesPaint(0, localGradientPaintIo);
/* 327 */     resBarRenderer.setSeriesPaint(1, localGradientPaintCpu);
/* 328 */     resPlot.setRenderer((CategoryItemRenderer)resBarRenderer);
/*     */     
/* 330 */     return resChart;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/* 337 */     this.jPanel5 = new JPanel();
/* 338 */     this.chartSlidePanel = new JPanel();
/* 339 */     this.chartSlider = new JSlider();
/* 340 */     this.cpuPanel = new JPanel();
/* 341 */     this.vCardPanel = new JPanel();
/* 342 */     this.keyboardPanel = new JPanel();
/* 343 */     this.jPanel1 = new JPanel();
/* 344 */     this.cpuTimeTittle = new JLabel();
/* 345 */     this.vcardTimeTittle = new JLabel();
/* 346 */     this.keyboardTimeTittle = new JLabel();
/* 347 */     this.cpuTimeValue = new JLabel();
/* 348 */     this.vcardTimeValue = new JLabel();
/* 349 */     this.keyboardTimeValue = new JLabel();
/* 350 */     this.jPanel2 = new JPanel();
/* 351 */     this.allTimeValue = new JLabel();
/*     */     
/* 353 */     setDefaultCloseOperation(2);
/* 354 */     setTitle("Результаты моделирования");
/* 355 */     setAlwaysOnTop(true);
/* 356 */     setBackground(new Color(255, 255, 255));
/* 357 */     setResizable(false);
/* 358 */     setSize(new Dimension(1000, 625));
/*     */     
/* 360 */     this.jPanel5.setBackground(new Color(255, 255, 255));
/* 361 */     this.jPanel5.setMinimumSize(new Dimension(990, 610));
/* 362 */     this.jPanel5.setPreferredSize(new Dimension(1000, 625));
/* 363 */     this.jPanel5.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 365 */     this.chartSlidePanel.setBackground(new Color(255, 255, 255));
/* 366 */     this.chartSlidePanel.setBorder(BorderFactory.createTitledBorder(null, "Просмотр графиков", 2, 0, new Font("Century Gothic", 0, 15)));
/* 367 */     this.chartSlidePanel.setLayout((LayoutManager)null);
/*     */     
/* 369 */     this.chartSlider.setBackground(new Color(255, 255, 255));
/* 370 */     this.chartSlider.setMajorTickSpacing(this.allTime / this.width);
/* 371 */     this.chartSlider.setMaximum(this.cpuDataSet.size() - this.width);
/* 372 */     this.chartSlider.setMinorTickSpacing(this.allTime / this.width);
/* 373 */     this.chartSlider.setPaintTicks(true);
/* 374 */     this.chartSlider.setToolTipText("Просмотр");
/* 375 */     this.chartSlider.setValue(0);
/* 376 */     this.chartSlider.addChangeListener(new ChangeListener() {
/*     */           public void stateChanged(ChangeEvent evt) {
/* 378 */             Results.this.chartSliderStateChanged(evt);
/*     */           }
/*     */         });
/* 381 */     this.chartSlidePanel.add(this.chartSlider);
/* 382 */     this.chartSlider.setBounds(10, 50, 290, 31);
/*     */     
/* 384 */     this.jPanel5.add(this.chartSlidePanel, new AbsoluteConstraints(720, 210, 310, 100));
/*     */     
/* 386 */     this.cpuPanel.setBackground(new Color(255, 255, 255));
/* 387 */     this.cpuPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, new Color(153, 206, 230)));
/* 388 */     this.cpuPanel.setLayout(new BoxLayout(this.cpuPanel, 2));
/* 389 */     this.jPanel5.add(this.cpuPanel, new AbsoluteConstraints(10, 10, 700, 200));
/*     */     
/* 391 */     this.vCardPanel.setBackground(new Color(255, 255, 255));
/* 392 */     this.vCardPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, new Color(153, 206, 230)));
/* 393 */     this.vCardPanel.setLayout(new BoxLayout(this.vCardPanel, 2));
/* 394 */     this.jPanel5.add(this.vCardPanel, new AbsoluteConstraints(10, 210, 700, 200));
/*     */     
/* 396 */     this.keyboardPanel.setBackground(new Color(255, 255, 255));
/* 397 */     this.keyboardPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 206, 230)));
/* 398 */     this.keyboardPanel.setLayout(new BoxLayout(this.keyboardPanel, 2));
/* 399 */     this.jPanel5.add(this.keyboardPanel, new AbsoluteConstraints(10, 410, 700, 200));
/*     */     
/* 401 */     this.jPanel1.setBackground(new Color(255, 255, 255));
/* 402 */     this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Время работы устройств", 2, 0, new Font("Century Gothic", 0, 15)));
/* 403 */     this.jPanel1.setLayout((LayoutManager)null);
/*     */     
/* 405 */     this.cpuTimeTittle.setFont(new Font("Century Gothic", 0, 14));
/* 406 */     this.cpuTimeTittle.setHorizontalAlignment(4);
/* 407 */     this.cpuTimeTittle.setText("ЦПУ");
/* 408 */     this.jPanel1.add(this.cpuTimeTittle);
/* 409 */     this.cpuTimeTittle.setBounds(10, 40, 100, 30);
/*     */     
/* 411 */     this.vcardTimeTittle.setFont(new Font("Century Gothic", 0, 14));
/* 412 */     this.vcardTimeTittle.setHorizontalAlignment(4);
/* 413 */     this.vcardTimeTittle.setText("аыыыыы");
/* 414 */     this.jPanel1.add(this.vcardTimeTittle);
/* 415 */     this.vcardTimeTittle.setBounds(10, 80, 100, 30);
/*     */     
/* 417 */     this.keyboardTimeTittle.setFont(new Font("Century Gothic", 0, 14));
/* 418 */     this.keyboardTimeTittle.setHorizontalAlignment(4);
/* 419 */     this.keyboardTimeTittle.setText("Клавиатура");
/* 420 */     this.jPanel1.add(this.keyboardTimeTittle);
/* 421 */     this.keyboardTimeTittle.setBounds(10, 120, 100, 30);
/*     */     
/* 423 */     this.cpuTimeValue.setFont(new Font("Century Gothic", 1, 14));
/* 424 */     this.cpuTimeValue.setHorizontalAlignment(2);
/* 425 */     this.cpuTimeValue.setText("x секунд");
/* 426 */     this.jPanel1.add(this.cpuTimeValue);
/* 427 */     this.cpuTimeValue.setBounds(120, 40, 180, 30);
/*     */     
/* 429 */     this.vcardTimeValue.setFont(new Font("Century Gothic", 1, 14));
/* 430 */     this.vcardTimeValue.setHorizontalAlignment(2);
/* 431 */     this.vcardTimeValue.setText("x секунд");
/* 432 */     this.jPanel1.add(this.vcardTimeValue);
/* 433 */     this.vcardTimeValue.setBounds(120, 80, 180, 30);
/*     */     
/* 435 */     this.keyboardTimeValue.setFont(new Font("Century Gothic", 1, 14));
/* 436 */     this.keyboardTimeValue.setHorizontalAlignment(2);
/* 437 */     this.keyboardTimeValue.setText("x секунд");
/* 438 */     this.jPanel1.add(this.keyboardTimeValue);
/* 439 */     this.keyboardTimeValue.setBounds(120, 120, 180, 30);
/*     */     
/* 441 */     this.jPanel5.add(this.jPanel1, new AbsoluteConstraints(720, 310, 310, 160));
/*     */     
/* 443 */     this.jPanel2.setBackground(new Color(255, 255, 255));
/* 444 */     this.jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Общее время работы устройств", 2, 0, new Font("Century Gothic", 0, 15)));
/* 445 */     this.jPanel2.setLayout((LayoutManager)null);
/*     */     
/* 447 */     this.allTimeValue.setFont(new Font("Century Gothic", 1, 14));
/* 448 */     this.allTimeValue.setHorizontalAlignment(0);
/* 449 */     this.allTimeValue.setText("x секунд");
/* 450 */     this.jPanel2.add(this.allTimeValue);
/* 451 */     this.allTimeValue.setBounds(10, 60, 290, 30);
/*     */     
/* 453 */     this.jPanel5.add(this.jPanel2, new AbsoluteConstraints(720, 470, 310, 142));
/*     */     
/* 455 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 456 */     getContentPane().setLayout(layout);
/* 457 */     layout.setHorizontalGroup(layout
/* 458 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 459 */         .addComponent(this.jPanel5, GroupLayout.Alignment.TRAILING, -1, 1034, 32767));
/*     */     
/* 461 */     layout.setVerticalGroup(layout
/* 462 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 463 */         .addComponent(this.jPanel5, -2, -1, -2));
/*     */ 
/*     */     
/* 466 */     pack();
/* 467 */     setLocationRelativeTo(null);
/*     */   }
/*     */   
/*     */   private void chartSliderStateChanged(ChangeEvent evt) {
/* 471 */     this.cpuSet.setFirstCategoryIndex(this.chartSlider.getValue());
/* 472 */     this.vCardSet.setFirstCategoryIndex(this.chartSlider.getValue());
/* 473 */     this.keyboardSet.setFirstCategoryIndex(this.chartSlider.getValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\Acronix\Desktop\АСВТ_2022_2023\Лаб_1\IOSystem.jar!\IOSystem\Results.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */