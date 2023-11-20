package mycalculator;

import java.awt.event.KeyEvent;

public class Calculator extends javax.swing.JFrame {

    private String msave; //Memory save variable
    byte operator;  //operator variable
    private double numbers[] = new double[100];    //M+ data insert array
    private int index = 0;  //index of number array
    private double summation;   //Get M+ values summation(array summation)
    private String data;    //use for RCL button

    private boolean zerodisplay;    //zero condition check variable
    private boolean decimaldisplay;     //Desimal condition check variable

    private double input1;  //first number save variable
    private double input2;  //second number save variable
    private double output;  //operation result save variable

    private String Memory;  //Temparally save the operation results

    public Calculator() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinas = new javax.swing.JButton();
        btnMulty = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMplus = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        btnModule = new javax.swing.JButton();
        btnNegative = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnRCL = new javax.swing.JButton();
        btnDesimal = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        btnCos = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setName("Scientific Calculator"); // NOI18N
        setResizable(false);

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setPreferredSize(new java.awt.Dimension(60, 60));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setPreferredSize(new java.awt.Dimension(60, 60));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 102));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setPreferredSize(new java.awt.Dimension(60, 60));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 102));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setPreferredSize(new java.awt.Dimension(60, 60));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 102));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setPreferredSize(new java.awt.Dimension(60, 60));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 102));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setPreferredSize(new java.awt.Dimension(60, 60));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 102));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setPreferredSize(new java.awt.Dimension(60, 60));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 102));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setPreferredSize(new java.awt.Dimension(60, 60));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 102));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setPreferredSize(new java.awt.Dimension(60, 60));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 102));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setPreferredSize(new java.awt.Dimension(60, 60));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEqual.setText("=");
        btnEqual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEqual.setPreferredSize(new java.awt.Dimension(60, 60));
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus.setPreferredSize(new java.awt.Dimension(60, 60));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnMinas.setText("-");
        btnMinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinas.setPreferredSize(new java.awt.Dimension(60, 60));
        btnMinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinasActionPerformed(evt);
            }
        });

        btnMulty.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnMulty.setText("*");
        btnMulty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMulty.setPreferredSize(new java.awt.Dimension(60, 60));
        btnMulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultyActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiv.setPreferredSize(new java.awt.Dimension(60, 60));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMplus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMplus.setText("M+");
        btnMplus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMplusActionPerformed(evt);
            }
        });

        btnMC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMC.setText("MC");
        btnMC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnCE.setBackground(new java.awt.Color(153, 0, 0));
        btnCE.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnCE.setForeground(new java.awt.Color(255, 255, 255));
        btnCE.setText("CE");
        btnCE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCE.setMaximumSize(new java.awt.Dimension(60, 60));
        btnCE.setMinimumSize(new java.awt.Dimension(60, 60));
        btnCE.setPreferredSize(new java.awt.Dimension(60, 60));
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(153, 0, 0));
        btnC.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnMS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMS.setText("MS");
        btnMS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnMR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMR.setText("MR");
        btnMR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnSquare.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSquare.setText("x^2");
        btnSquare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        btnModule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnModule.setText("%");
        btnModule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuleActionPerformed(evt);
            }
        });

        btnNegative.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnNegative.setText("+/-");
        btnNegative.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNegative.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativeActionPerformed(evt);
            }
        });

        btnSqrt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSqrt.setText("√");
        btnSqrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnRCL.setBackground(new java.awt.Color(153, 0, 0));
        btnRCL.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnRCL.setForeground(new java.awt.Color(255, 255, 255));
        btnRCL.setText("RCL");
        btnRCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRCL.setPreferredSize(new java.awt.Dimension(60, 60));
        btnRCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCLActionPerformed(evt);
            }
        });

        btnDesimal.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnDesimal.setText(".");
        btnDesimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesimal.setPreferredSize(new java.awt.Dimension(60, 60));
        btnDesimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesimalActionPerformed(evt);
            }
        });

        txtResult.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultKeyTyped(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCos.setText("Cos");
        btnCos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnSin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSin.setText("Sin");
        btnSin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnTan.setText("Tan");
        btnTan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnRCL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMinas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMulty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDesimal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnModule, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNegative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModule, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtResult.setText("0");
        zerodisplay = false;
        decimaldisplay = false;
        input1 = 0;
        input2 = 0;
        output = 0;
        Memory = "";
        summation = 0;
        index = 0;
        
        
        
    }//GEN-LAST:event_btnCEActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "1");   
        zerodisplay = true;
    }//GEN-LAST:event_btn1ActionPerformed

    private void txtResultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtResultKeyTyped

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "2");
        zerodisplay = true;

    }//GEN-LAST:event_btn2ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        String bsh = null;
        if (txtResult.getText().length() > 0) {
            StringBuilder strb = new StringBuilder(txtResult.getText());
            strb.deleteCharAt(txtResult.getText().length() - 1);
            bsh = strb.toString();
            txtResult.setText(bsh);
        }
        
        zerodisplay = false;
        decimaldisplay = false;
    }//GEN-LAST:event_btnCActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        msave = txtResult.getText();
        txtResult.setText("");
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        txtResult.setText(msave);

    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        msave = "";

    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMplusActionPerformed
        numbers[index] = Double.parseDouble(txtResult.getText());
        index++;
        txtResult.setText("");
    }//GEN-LAST:event_btnMplusActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "3");
        zerodisplay = true;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "4");
        zerodisplay = true;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "5");
        zerodisplay = true;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "6");
        zerodisplay = true;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "7");
        zerodisplay = true;
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "8");
        zerodisplay = true;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "9");
        zerodisplay = true;
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (!zerodisplay && !decimaldisplay) {
            txtResult.setText(null);
        }
        txtResult.setText(txtResult.getText() + "0");

    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        output = input2 * input2;
        if (output > - 1000000000 && output < 1000000000) {
            txtResult.setText(String.valueOf(output));
        } else {
            txtResult.setText("Error");
        }
        txtResult.setText(String.valueOf(output));
        output = 0;
        operator = 0;
    }//GEN-LAST:event_btnSquareActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed

            if (operator == 0) {
                input1 = Double.parseDouble(String.valueOf(txtResult.getText()));
            } else {
                input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
            }
            if (operator == 1) {    //1 for + operator
                input1 = input1 + input2;
            }
            if (operator == 2) {    //2 for - operator
                input1 = input1 - input2;
            }
            if (operator == 3) {    //3 for multiply operator
                input1 = input1 * input2;
            }
            if (operator == 4) {    //4 for devide operator
                input1 = input1 / input2;
            }
            if (operator == 5) {    //5 for module operator
                input1 = input1 % input2;
            }
            txtResult.setText("0");
            Memory = String.valueOf(input2);
            operator = 1;
            zerodisplay = false;
            decimaldisplay = false;
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinasActionPerformed

        if (operator == 0) {
            input1 = Double.parseDouble(String.valueOf(txtResult.getText()));
        } else {
            input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        }
        if (operator == 1) {
            input1 = input1 + input2;
        }
        if (operator == 2) {
            input1 = input1 - input2;
        }
        if (operator == 3) {
            input1 = input1 * input2;
        }
        if (operator == 4) {
            input1 = input1 / input2;
        }
        if (operator == 5) {
            input1 = input1 % input2;
        }
        txtResult.setText("0");
        Memory = String.valueOf(input2);
        operator = 2;
        zerodisplay = false;
        decimaldisplay = false;
    }//GEN-LAST:event_btnMinasActionPerformed

    private void btnMultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultyActionPerformed

        if (operator == 0) {
            input1 = Double.parseDouble(String.valueOf(txtResult.getText()));
        } else {
            input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        }
        if (operator == 1) {
            input1 = input1 + input2;
        }
        if (operator == 2) {
            input1 = input1 - input2;
        }
        if (operator == 3) {
            input1 = input1 * input2;
        }
        if (operator == 4) {
            input1 = input1 / input2;
        }
        if (operator == 5) {
            input1 = input1 % input2;
        }
        txtResult.setText("0");
        Memory = String.valueOf(input2);
        operator = 3;
        zerodisplay = false;
        decimaldisplay = false;
    }//GEN-LAST:event_btnMultyActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed

        if (operator == 0) {
            input1 = Double.parseDouble(String.valueOf(txtResult.getText()));
        } else {
            input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        }
        if (operator == 1) {
            input1 = input1 + input2;
        }
        if (operator == 2) {
            input1 = input1 - input2;
        }
        if (operator == 3) {
            input1 = input1 * input2;
        }
        if (operator == 4) {
            input1 = input1 / input2;
        }
        if (operator == 5) {
            input1 = input1 % input2;
        }
        txtResult.setText("0");
        Memory = String.valueOf(input2);
        operator = 4;
        zerodisplay = false;
        decimaldisplay = false;
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        input2 = Double.parseDouble(String.valueOf(txtResult.getText()));

        if (operator == 0) {
            output = input2;
            Memory = String.valueOf(input2);
        }
        if (operator == 1) {
            output = input1 + input2;
            Memory = Memory + String.valueOf(input2);
        }
        if (operator == 2) {
            output = input1 - input2;
            Memory = Memory + String.valueOf(input2);
        }
        if (operator == 3) {
            output = input1 * input2;
            Memory = Memory + String.valueOf(input2);
        }
        if (operator == 4) {
            output = input1 / input2;
            Memory = Memory + String.valueOf(input2);
        }
        if (operator == 5) {
            output = input1 % input2;
            Memory = Memory + String.valueOf(input2) + ")";
        }
        if (output > -100000000 && output < 100000000) {
            txtResult.setText(String.valueOf(output));
        } else {
            txtResult.setText("Error");
        }
        input1 = 0;
        input2 = 0;
        output = 0;
        operator = 0;
        decimaldisplay = false;
        zerodisplay = false;

    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuleActionPerformed
        if (operator == 0) {
            input1 = Double.parseDouble(String.valueOf(txtResult.getText()));
        } else {
            input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        }
        if (operator == 1) {
            input1 = input1 + input2;
        }
        if (operator == 2) {
            input1 = input1 - input2;
        }
        if (operator == 3) {
            input1 = input1 * input2;
        }
        if (operator == 4) {
            input1 = input1 / input2;
        }
        if (operator == 5) {
            input1 = input1 % input2;
        }
        txtResult.setText("0");
        Memory = String.valueOf(input2);
        operator = 5;
        zerodisplay = false;
        decimaldisplay = false;
    }//GEN-LAST:event_btnModuleActionPerformed

    private void btnDesimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesimalActionPerformed
        if (!decimaldisplay) {
            txtResult.setText(txtResult.getText() + ".");
            decimaldisplay = true;
        }
    }//GEN-LAST:event_btnDesimalActionPerformed

    private void btnNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativeActionPerformed
        input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        output = input2 * -1;

        if (output > - 1000000000 && output < 1000000000) {
            txtResult.setText(String.valueOf(output));
        } else {
            txtResult.setText("Error");
        }
        decimaldisplay = true;
        output = 0;

    }//GEN-LAST:event_btnNegativeActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        output = Math.sqrt(input2);

        txtResult.setText(String.valueOf(output));
        output = 0;
        operator = 0;
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnRCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCLActionPerformed
          if (data == null) {
            for (int i = 0; i < index; i++) {
                double s = numbers[i];
                summation += s;
            }
            txtResult.setText(String.valueOf(summation));
            data = "A";
        } else {
            summation = 0;
            for (int i = 0; i < index; i++) {
                double s = numbers[i];
                summation += s;
            }
            txtResult.setText(String.valueOf(summation));
        }
    }//GEN-LAST:event_btnRCLActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        Memory = "tan(" + String.valueOf(input2) + ")";
        input2 = input2 * 0.0174532925;
        output = Math.tan(input2);
        txtResult.setText(String.valueOf(output));
        output = 0;
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
         input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        Memory = "sin(" + String.valueOf(input2) + ")";
        input2 = input2 * 0.0174532925;
        output = Math.sin(input2);
        txtResult.setText(String.valueOf(output));
        output = 0;
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
       input2 = Double.parseDouble(String.valueOf(txtResult.getText()));
        Memory = "tan(" + String.valueOf(input2) + ")";
        input2 = input2 * 0.0174532925;
        output = Math.tan(input2);
        txtResult.setText(String.valueOf(output));
        output = 0;
    }//GEN-LAST:event_btnTanActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDesimal;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMinas;
    private javax.swing.JButton btnModule;
    private javax.swing.JButton btnMplus;
    private javax.swing.JButton btnMulty;
    private javax.swing.JButton btnNegative;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnRCL;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnTan;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
