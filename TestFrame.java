
import java.awt.Color;
import java.text.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author erjon
 */
public class TestFrame extends javax.swing.JFrame {

    /**
     * Calling class Calculator with constructor
     */
    Calculator calc = new Calculator();
    NumberFormat formatter = NumberFormat.getInstance();
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    /**
     * Creates new form TestFrame
     */
    public TestFrame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChangeAccountNameJDialog = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        EnterNameJDialog = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        EnterSurnameJDialog = new javax.swing.JTextField();
        ConfirmAccountChangeJDialog = new javax.swing.JButton();
        InvalidInputLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AccountPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AccountInfoLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TotalBalance = new javax.swing.JLabel();
        AccountWithdrawButton = new javax.swing.JButton();
        AccountTransferButton = new javax.swing.JButton();
        SuccessfulTransaction = new javax.swing.JLabel();
        AccountDepositButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        DepositSlider = new javax.swing.JSlider();
        DepositAmount = new javax.swing.JTextField();
        CompleteDeposit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        WithdrawalSlider = new javax.swing.JSlider();
        WithdrawalAmount = new javax.swing.JTextField();
        CompleteWithdrawal = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        TransferSlider = new javax.swing.JSlider();
        TransferAmount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TransferNumber = new javax.swing.JTextField();
        CompleteTransfer = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        LoanPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LoanAmountTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        LoanYearsTextField = new javax.swing.JTextField();
        LoanMonthsTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        LoanInterestRateTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        LoanCompoundingComboBox = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        LoanPayBackComboBox = new javax.swing.JComboBox<>();
        LoanClearButton = new javax.swing.JButton();
        LoanCalculateButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LoanPaymentLabel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        LoanPaymentEveryMonthLabel = new javax.swing.JLabel();
        LoanTotalPaymentsLabel = new javax.swing.JLabel();
        LoanTotalInterestLabel = new javax.swing.JLabel();
        SavingsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SavingsStartingBalanceTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SavingsDepositAmountTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SavingsFrequencyComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SavingsYearsTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SavingsInterestRateTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SavingsCompoundingComboBox = new javax.swing.JComboBox<>();
        SavingsClearButton = new javax.swing.JButton();
        SavingsCalculateButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        FutureSavingsLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        ChangeAccountNameJDialog.setMinimumSize(new java.awt.Dimension(310, 180));
        ChangeAccountNameJDialog.setResizable(false);
        ChangeAccountNameJDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeAccountNameJDialogMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Enter your name:");

        EnterNameJDialog.setForeground(new java.awt.Color(102, 102, 102));
        EnterNameJDialog.setText("Name");
        EnterNameJDialog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EnterNameJDialogFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EnterNameJDialogFocusLost(evt);
            }
        });
        EnterNameJDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterNameJDialogKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Enter your surname:");

        EnterSurnameJDialog.setForeground(new java.awt.Color(102, 102, 102));
        EnterSurnameJDialog.setText("Surname");
        EnterSurnameJDialog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EnterSurnameJDialogFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EnterSurnameJDialogFocusLost(evt);
            }
        });
        EnterSurnameJDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterSurnameJDialogKeyReleased(evt);
            }
        });

        ConfirmAccountChangeJDialog.setText("Confirm");
        ConfirmAccountChangeJDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmAccountChangeJDialogActionPerformed(evt);
            }
        });

        InvalidInputLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InvalidInputLabel.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout ChangeAccountNameJDialogLayout = new javax.swing.GroupLayout(ChangeAccountNameJDialog.getContentPane());
        ChangeAccountNameJDialog.getContentPane().setLayout(ChangeAccountNameJDialogLayout);
        ChangeAccountNameJDialogLayout.setHorizontalGroup(
            ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeAccountNameJDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ChangeAccountNameJDialogLayout.createSequentialGroup()
                        .addComponent(InvalidInputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmAccountChangeJDialog))
                    .addGroup(ChangeAccountNameJDialogLayout.createSequentialGroup()
                        .addGroup(ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterSurnameJDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterNameJDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        ChangeAccountNameJDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel12, jLabel14});

        ChangeAccountNameJDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EnterNameJDialog, EnterSurnameJDialog});

        ChangeAccountNameJDialogLayout.setVerticalGroup(
            ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeAccountNameJDialogLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(EnterNameJDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(EnterSurnameJDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChangeAccountNameJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmAccountChangeJDialog)
                    .addComponent(InvalidInputLabel))
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(405, 456));

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));
        jTabbedPane1.setToolTipText("");

        AccountPanel.setBackground(new java.awt.Color(255, 255, 255));
        AccountPanel.setMinimumSize(new java.awt.Dimension(405, 425));
        AccountPanel.setPreferredSize(new java.awt.Dimension(405, 425));
        AccountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountPanelMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Account");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/woman avatar 80x80.jpg"))); // NOI18N

        AccountInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AccountInfoLabel.setText("Name Surname");

        jLabel11.setText("Totale Balance:");

        TotalBalance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalBalance.setText("$0.00");

        AccountWithdrawButton.setText("Withdraw");
        AccountWithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountWithdrawButtonActionPerformed(evt);
            }
        });

        AccountTransferButton.setText("Transfer");
        AccountTransferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountTransferButtonActionPerformed(evt);
            }
        });

        SuccessfulTransaction.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AccountDepositButton.setText("Deposit");
        AccountDepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountDepositButtonActionPerformed(evt);
            }
        });

        jPanel9.setMinimumSize(new java.awt.Dimension(332, 151));
        jPanel9.setLayout(new java.awt.CardLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(312, 169));

        jLabel17.setText("Amount of Deposit: $");

        DepositSlider.setMaximum(100000);
        DepositSlider.setMinimum(10);
        DepositSlider.setValue(50000);
        DepositSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DepositSliderStateChanged(evt);
            }
        });

        DepositAmount.setText("$50,000");
        DepositAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DepositAmountKeyReleased(evt);
            }
        });

        CompleteDeposit.setText("Complete");
        CompleteDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteDepositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(DepositSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CompleteDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(CompleteDeposit)
                .addGap(18, 18, 18))
        );

        jPanel10.setVisible(true);

        jPanel9.add(jPanel10, "card3");

        jPanel6.setPreferredSize(new java.awt.Dimension(312, 169));

        jLabel13.setText("Amount of Withdrawal: $");

        WithdrawalSlider.setMaximum(100000);
        WithdrawalSlider.setMinimum(10);
        WithdrawalSlider.setValue(50000);
        WithdrawalSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                WithdrawalSliderStateChanged(evt);
            }
        });

        WithdrawalAmount.setText("$50,000");
        WithdrawalAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WithdrawalAmountKeyReleased(evt);
            }
        });

        CompleteWithdrawal.setText("Complete");
        CompleteWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteWithdrawalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(WithdrawalSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CompleteWithdrawal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WithdrawalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawalSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WithdrawalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(CompleteWithdrawal)
                .addGap(18, 18, 18))
        );

        jPanel6.setVisible(false);

        jPanel9.add(jPanel6, "card2");

        jLabel22.setText("Amount of Transfer: $");

        TransferSlider.setMaximum(100000);
        TransferSlider.setMinimum(10);
        TransferSlider.setValue(50000);
        TransferSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TransferSliderStateChanged(evt);
            }
        });

        TransferAmount.setText("$50,000");
        TransferAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TransferAmountKeyReleased(evt);
            }
        });

        jLabel23.setText("Transfer Account Number:");

        TransferNumber.setText("1234 5678 9012 3456");

        CompleteTransfer.setText("Complete");
        CompleteTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteTransferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(TransferNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(TransferSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CompleteTransfer)
                            .addComponent(TransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CompleteTransfer, TransferAmount});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransferSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TransferNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(CompleteTransfer)
                .addGap(18, 18, 18))
        );

        jPanel14.setVisible(false);

        jPanel9.add(jPanel14, "card3");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit-button 20x20.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(SuccessfulTransaction))
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(TotalBalance)
                            .addGroup(AccountPanelLayout.createSequentialGroup()
                                .addComponent(AccountInfoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(AccountDepositButton)
                        .addGap(18, 18, 18)
                        .addComponent(AccountWithdrawButton)
                        .addGap(18, 18, 18)
                        .addComponent(AccountTransferButton))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        AccountPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AccountDepositButton, AccountTransferButton, AccountWithdrawButton});

        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(AccountPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountInfoLabel)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TotalBalance)))
                .addGap(24, 24, 24)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountWithdrawButton)
                    .addComponent(AccountTransferButton)
                    .addComponent(AccountDepositButton))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SuccessfulTransaction))
        );

        jTabbedPane1.addTab("Home", AccountPanel);

        LoanPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoanPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoanPanelMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Loan Calculator");

        jLabel19.setText("Loan Amount:");
        jLabel19.setPreferredSize(new java.awt.Dimension(97, 16));

        LoanAmountTextField.setForeground(new java.awt.Color(102, 102, 102));
        LoanAmountTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        LoanAmountTextField.setText("$500");
        LoanAmountTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        LoanAmountTextField.setMaximumSize(new java.awt.Dimension(500, 500));
        LoanAmountTextField.setName(""); // NOI18N
        LoanAmountTextField.setPreferredSize(new java.awt.Dimension(143, 22));
        LoanAmountTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoanAmountTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoanAmountTextFieldFocusLost(evt);
            }
        });
        LoanAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LoanAmountTextFieldKeyReleased(evt);
            }
        });

        jLabel20.setText("Loan Term:");

        LoanYearsTextField.setForeground(new java.awt.Color(102, 102, 102));
        LoanYearsTextField.setText("Years");
        LoanYearsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoanYearsTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoanYearsTextFieldFocusLost(evt);
            }
        });
        LoanYearsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LoanYearsTextFieldKeyReleased(evt);
            }
        });

        LoanMonthsTextField.setForeground(new java.awt.Color(102, 102, 102));
        LoanMonthsTextField.setText("Months");
        LoanMonthsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoanMonthsTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoanMonthsTextFieldFocusLost(evt);
            }
        });
        LoanMonthsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LoanMonthsTextFieldKeyReleased(evt);
            }
        });

        jLabel21.setText("Interest Rate: ");

        LoanInterestRateTextField.setForeground(new java.awt.Color(102, 102, 102));
        LoanInterestRateTextField.setText("%");
        LoanInterestRateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoanInterestRateTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoanInterestRateTextFieldFocusLost(evt);
            }
        });
        LoanInterestRateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LoanInterestRateTextFieldKeyReleased(evt);
            }
        });

        jLabel24.setText("Compounding:");

        LoanCompoundingComboBox.setForeground(new java.awt.Color(102, 102, 102));
        LoanCompoundingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily (365/Yr)", "Weekly (52/Yr)", "Bi-Weekly (26/Yr)", "Semi-Monthy (24/Yr)", "Monthly (12/Yr)", "Bi-Monthly (6/Yr)", "Quaterly (4/Yr)", "Semi-Annually (2/Yr)", "Annually (1/Yr)" }));
        LoanCompoundingComboBox.setSelectedIndex(4);
        LoanCompoundingComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoanCompoundingComboBoxFocusGained(evt);
            }
        });

        jLabel25.setText("Pay Back:");

        LoanPayBackComboBox.setForeground(new java.awt.Color(102, 102, 102));
        LoanPayBackComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Every Day", "Every Week", "Every 2 Weeks", "Every Half-Month", "Every Month", "Every Quarter", "Every 6 Months", "Every Year" }));
        LoanPayBackComboBox.setSelectedIndex(4);
        LoanPayBackComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoanPayBackComboBoxFocusGained(evt);
            }
        });

        LoanClearButton.setText("Clear");
        LoanClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanClearButtonActionPerformed(evt);
            }
        });

        LoanCalculateButton.setText("Calculate");
        LoanCalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanCalculateButtonActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel26.setText("Results:");

        LoanPaymentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoanPaymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LoanPaymentLabel.setText("Payment Every Month:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Total of Payments:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Total Interest:");

        LoanPaymentEveryMonthLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoanPaymentEveryMonthLabel.setText("$0.00");

        LoanTotalPaymentsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoanTotalPaymentsLabel.setText("$0.00");

        LoanTotalInterestLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoanTotalInterestLabel.setText("$0.00");

        javax.swing.GroupLayout LoanPanelLayout = new javax.swing.GroupLayout(LoanPanel);
        LoanPanel.setLayout(LoanPanelLayout);
        LoanPanelLayout.setHorizontalGroup(
            LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoanPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                    .addGroup(LoanPanelLayout.createSequentialGroup()
                        .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoanPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(25, 25, 25)
                                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(LoanPanelLayout.createSequentialGroup()
                                        .addComponent(LoanYearsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(LoanMonthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LoanAmountTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LoanCompoundingComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LoanPayBackComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LoanInterestRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(LoanPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(LoanClearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LoanCalculateButton))
                            .addGroup(LoanPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel26)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoanPaymentLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoanTotalPaymentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoanTotalInterestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoanPaymentEveryMonthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LoanPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LoanMonthsTextField, LoanYearsTextField});

        LoanPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LoanCalculateButton, LoanClearButton});

        LoanPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel19, jLabel20, jLabel21, jLabel24, jLabel25});

        LoanPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LoanPaymentLabel, jLabel28, jLabel29});

        LoanPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LoanPaymentEveryMonthLabel, LoanTotalInterestLabel, LoanTotalPaymentsLabel});

        LoanPanelLayout.setVerticalGroup(
            LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel18)
                .addGap(12, 12, 12)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoanAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(LoanYearsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoanMonthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(LoanInterestRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(LoanCompoundingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(LoanPayBackComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LoanClearButton)
                    .addComponent(LoanCalculateButton))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addGap(25, 25, 25)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoanPaymentLabel)
                    .addComponent(LoanPaymentEveryMonthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(LoanTotalPaymentsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoanTotalInterestLabel)
                    .addComponent(jLabel29))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Loan", LoanPanel);

        SavingsPanel.setBackground(new java.awt.Color(255, 255, 255));
        SavingsPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        SavingsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavingsPanelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Savings Calculator");

        jLabel2.setText("Starting Balance: $");

        SavingsStartingBalanceTextField.setForeground(new java.awt.Color(102, 102, 102));
        SavingsStartingBalanceTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SavingsStartingBalanceTextField.setText("$500");
        SavingsStartingBalanceTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        SavingsStartingBalanceTextField.setMaximumSize(new java.awt.Dimension(500, 500));
        SavingsStartingBalanceTextField.setName(""); // NOI18N
        SavingsStartingBalanceTextField.setPreferredSize(new java.awt.Dimension(143, 22));
        SavingsStartingBalanceTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SavingsStartingBalanceTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SavingsStartingBalanceTextFieldFocusLost(evt);
            }
        });
        SavingsStartingBalanceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SavingsStartingBalanceTextFieldKeyReleased(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Deposits"));
        jPanel5.setPreferredSize(new java.awt.Dimension(312, 145));

        jLabel3.setText("Amount: $");

        SavingsDepositAmountTextField.setForeground(new java.awt.Color(102, 102, 102));
        SavingsDepositAmountTextField.setText("Deposit");
        SavingsDepositAmountTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SavingsDepositAmountTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SavingsDepositAmountTextFieldFocusLost(evt);
            }
        });
        SavingsDepositAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SavingsDepositAmountTextFieldKeyReleased(evt);
            }
        });

        jLabel4.setText("Frequency:");

        SavingsFrequencyComboBox.setForeground(new java.awt.Color(102, 102, 102));
        SavingsFrequencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weekly (52/Yr)", "Bi-Weekly (26/Yr)", "Semi-Monthy (24/Yr)", "Monthly (12/Yr)", "Bi-Monthly (6/Yr)", "Quaterly (4/Yr)", "Semi-Annually (2/Yr)", "Annually (1/Yr)", " " }));
        SavingsFrequencyComboBox.setSelectedIndex(3);
        SavingsFrequencyComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SavingsFrequencyComboBoxItemStateChanged(evt);
            }
        });
        SavingsFrequencyComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SavingsFrequencyComboBoxFocusGained(evt);
            }
        });

        jLabel5.setText("For how long:");

        SavingsYearsTextField.setForeground(new java.awt.Color(102, 102, 102));
        SavingsYearsTextField.setText("Years");
        SavingsYearsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SavingsYearsTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SavingsYearsTextFieldFocusLost(evt);
            }
        });
        SavingsYearsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SavingsYearsTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SavingsFrequencyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SavingsYearsTextField)
                    .addComponent(SavingsDepositAmountTextField))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SavingsDepositAmountTextField))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SavingsFrequencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SavingsYearsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Interest Rate: %");

        SavingsInterestRateTextField.setForeground(new java.awt.Color(102, 102, 102));
        SavingsInterestRateTextField.setText("%");
        SavingsInterestRateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SavingsInterestRateTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SavingsInterestRateTextFieldFocusLost(evt);
            }
        });
        SavingsInterestRateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SavingsInterestRateTextFieldKeyReleased(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Coumpounding:");

        SavingsCompoundingComboBox.setForeground(new java.awt.Color(102, 102, 102));
        SavingsCompoundingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily (365/Yr)", "Weekly (52/Yr)", "Bi-Weekly (26/Yr)", "Semi-Monthy (24/Yr)", "Monthly (12/Yr)", "Bi-Monthly (6/Yr)", "Quaterly (4/Yr)", "Semi-Annually (2/Yr)", "Annually (1/Yr)" }));
        SavingsCompoundingComboBox.setSelectedIndex(4);
        SavingsCompoundingComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SavingsCompoundingComboBoxFocusGained(evt);
            }
        });

        SavingsClearButton.setText("Clear");
        SavingsClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingsClearButtonActionPerformed(evt);
            }
        });

        SavingsCalculateButton.setText("Calculate");
        SavingsCalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingsCalculateButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Future Savings:");

        FutureSavingsLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        FutureSavingsLabel.setText("$ 0,00");

        javax.swing.GroupLayout SavingsPanelLayout = new javax.swing.GroupLayout(SavingsPanel);
        SavingsPanel.setLayout(SavingsPanelLayout);
        SavingsPanelLayout.setHorizontalGroup(
            SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(SavingsPanelLayout.createSequentialGroup()
                .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SavingsPanelLayout.createSequentialGroup()
                        .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SavingsPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SavingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SavingsInterestRateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(SavingsCompoundingComboBox, 0, 1, Short.MAX_VALUE)))
                    .addGroup(SavingsPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SavingsStartingBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SavingsPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(SavingsClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SavingsCalculateButton))
                    .addGroup(SavingsPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FutureSavingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SavingsPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        SavingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SavingsCalculateButton, SavingsClearButton});

        SavingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel6, jLabel7});

        SavingsPanelLayout.setVerticalGroup(
            SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SavingsPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SavingsStartingBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SavingsInterestRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SavingsCompoundingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SavingsCalculateButton)
                    .addComponent(SavingsClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SavingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(FutureSavingsLabel))
                .addGap(20, 20, 20))
        );

        SavingsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel6, jLabel7});

        SavingsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SavingsInterestRateTextField, SavingsStartingBalanceTextField});

        jTabbedPane1.addTab("Savings", SavingsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SavingsFrequencyComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SavingsFrequencyComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SavingsFrequencyComboBoxItemStateChanged

    private void SavingsStartingBalanceTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsStartingBalanceTextFieldFocusLost
        if (SavingsStartingBalanceTextField.getText().isBlank()) {
            SavingsStartingBalanceTextField.setText("$500");
            SavingsStartingBalanceTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_SavingsStartingBalanceTextFieldFocusLost

    private void SavingsStartingBalanceTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsStartingBalanceTextFieldFocusGained
        SavingsStartingBalanceTextField.setText("");
        SavingsStartingBalanceTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_SavingsStartingBalanceTextFieldFocusGained

    private void LoanCalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanCalculateButtonActionPerformed
        double Compounding = calc.compoundingValue(LoanCompoundingComboBox.getSelectedItem().toString());
        double PayBack = calc.compoundingValue((String) LoanPayBackComboBox.getSelectedItem());
        if(calc.getLoanAmount() == 0){
            LoanAmountTextField.setForeground(Color.RED);
            LoanAmountTextField.setText("Enter a value!");
        } else{
            double MonthlyPayment = Double.parseDouble(decimalFormat.format(calc.getMonthlyPayment(PayBack, Compounding)));
            double TotalPayment = Double.parseDouble(decimalFormat.format(calc.getTotalPayment(PayBack)));
            double TotalInterest = Double.parseDouble(decimalFormat.format(calc.getTotalInterest()));
            LoanPaymentEveryMonthLabel.setText("$" + formatter.format(MonthlyPayment));
            LoanTotalPaymentsLabel.setText("$" + formatter.format(TotalPayment));
            LoanTotalInterestLabel.setText("$" + formatter.format(TotalInterest));
            LoanPaymentLabel.setText("Payment " + LoanPayBackComboBox.getSelectedItem().toString());
        }
    }//GEN-LAST:event_LoanCalculateButtonActionPerformed

    private void LoanAmountTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanAmountTextFieldFocusLost
        if (LoanAmountTextField.getText().isBlank()) {
            LoanAmountTextField.setText("$500");
            LoanAmountTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_LoanAmountTextFieldFocusLost

    private void LoanAmountTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanAmountTextFieldFocusGained
        LoanAmountTextField.setText("");
        LoanAmountTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoanAmountTextFieldFocusGained

    private void AccountDepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountDepositButtonActionPerformed
        jPanel10.setVisible(true);
        jPanel6.setVisible(false);
        jPanel14.setVisible(false);
    }//GEN-LAST:event_AccountDepositButtonActionPerformed

    private void AccountTransferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountTransferButtonActionPerformed
        jPanel10.setVisible(false);
        jPanel6.setVisible(false);
        jPanel14.setVisible(true);
    }//GEN-LAST:event_AccountTransferButtonActionPerformed

    private void AccountWithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountWithdrawButtonActionPerformed
        jPanel10.setVisible(false);
        jPanel6.setVisible(true);
        jPanel14.setVisible(false);
    }//GEN-LAST:event_AccountWithdrawButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ChangeAccountNameJDialog.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void CompleteTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteTransferActionPerformed
        int Value;
        int CurrentValue = Integer.parseInt(TotalBalance.getText().replaceAll("[$,.]", ""));
        if (TransferAmount.getText().isBlank()) {
            SuccessfulTransaction.setForeground(Color.RED);
            SuccessfulTransaction.setText("Insert a value!");
            return;
        }
        Value = Integer.parseInt(TransferAmount.getText().replaceAll("[$,.]", ""));
        if (CurrentValue == -500 || CurrentValue - Value < -500) {
            SuccessfulTransaction.setForeground(Color.RED);
            SuccessfulTransaction.setText("Innsufiecient funds!");
            return;
        }
        int TotalValue = CurrentValue - Value;
        TotalBalance.setText("$" + formatter.format(TotalValue));
        SuccessfulTransaction.setForeground(Color.GREEN);
        SuccessfulTransaction.setText("The transfer was successful");
    }//GEN-LAST:event_CompleteTransferActionPerformed

    private void CompleteWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteWithdrawalActionPerformed
        int Value;
        int CurrentValue = Integer.parseInt(TotalBalance.getText().replaceAll("[$,.]", ""));
        if (WithdrawalAmount.getText().isBlank()) {
            SuccessfulTransaction.setForeground(Color.RED);
            SuccessfulTransaction.setText("Insert a value!");
            return;
        }
        Value = Integer.parseInt(WithdrawalAmount.getText().replaceAll("[$,.]", ""));
        if (CurrentValue == -500 || CurrentValue - Value < -500) {
            SuccessfulTransaction.setText("Innsufiecient funds!");
            SuccessfulTransaction.setForeground(Color.RED);
            return;
        }
        int TotalValue = CurrentValue - Value;
        TotalBalance.setText("$" + formatter.format(TotalValue));
        SuccessfulTransaction.setForeground(Color.GREEN);
        SuccessfulTransaction.setText("The withdrawal was successful");
    }//GEN-LAST:event_CompleteWithdrawalActionPerformed

    private void CompleteDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteDepositActionPerformed
        int Value;
        if (DepositAmount.getText().isBlank()) {
            SuccessfulTransaction.setForeground(Color.RED);
            SuccessfulTransaction.setText("Insert a value!");
            return;
        }
        Value = Integer.parseInt(DepositAmount.getText().replaceAll("[$,.]", ""));
        int CurrentValue = Integer.parseInt(TotalBalance.getText().replaceAll("[$,.]", ""));
        int TotalValue = Value + CurrentValue;
        TotalBalance.setText("$" + formatter.format(TotalValue));
        SuccessfulTransaction.setForeground(Color.GREEN);
        SuccessfulTransaction.setText("The deposit was successful");
    }//GEN-LAST:event_CompleteDepositActionPerformed

    private void DepositSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DepositSliderStateChanged
        int ValueFromSlider = DepositSlider.getValue();
        DepositAmount.setText("$" + formatter.format(ValueFromSlider));
    }//GEN-LAST:event_DepositSliderStateChanged

    private void DepositAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepositAmountKeyReleased
        int value;
        String typed = DepositAmount.getText().replaceAll("[$,]", "");
        DepositSlider.setValue(0);
        if (typed.equals("")) {
            return;
        }
        try {
            value = Integer.parseInt(typed);
        } catch (NumberFormatException e) {
            DepositSlider.setValue(50000);
            SuccessfulTransaction.setForeground(Color.RED);
            SuccessfulTransaction.setText("Invalid input!");
            return;
        }
        DepositSlider.setValue(value);
    }//GEN-LAST:event_DepositAmountKeyReleased

    private void WithdrawalSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_WithdrawalSliderStateChanged
        int ValueFromSlider = WithdrawalSlider.getValue();
        WithdrawalAmount.setText("$" + formatter.format(ValueFromSlider));
    }//GEN-LAST:event_WithdrawalSliderStateChanged

    private void WithdrawalAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WithdrawalAmountKeyReleased
        String typed = WithdrawalAmount.getText().replaceAll("[$,]", "");
        int value;
        WithdrawalSlider.setValue(0);
        if (typed.equals("")) {
            return;
        }
        try {
            value = Integer.parseInt(typed);
        } catch (NumberFormatException e) {
            WithdrawalSlider.setValue(50000);
            SuccessfulTransaction.setForeground(Color.RED);
            SuccessfulTransaction.setText("Invalid input!");
            return;
        }
        WithdrawalSlider.setValue(value);
    }//GEN-LAST:event_WithdrawalAmountKeyReleased

    private void TransferSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TransferSliderStateChanged
        int ValueFromSlider = TransferSlider.getValue();
        TransferAmount.setText("$" + formatter.format(ValueFromSlider));
    }//GEN-LAST:event_TransferSliderStateChanged

    private void TransferAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TransferAmountKeyReleased
        int value;
        String typed = TransferAmount.getText().replaceAll("[$,]", "");
        TransferSlider.setValue(0);
        if (typed.equals("")) {
            return;
        }
        try {
            value = Integer.parseInt(typed);
        } catch (NumberFormatException e) {
            TransferSlider.setValue(50000);
            SuccessfulTransaction.setForeground(Color.RED);
            SuccessfulTransaction.setText("Invalid input!");
            return;
        }
        TransferSlider.setValue(value);
    }//GEN-LAST:event_TransferAmountKeyReleased

    private void LoanYearsTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanYearsTextFieldFocusGained
        LoanYearsTextField.setText("");
        LoanYearsTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoanYearsTextFieldFocusGained

    private void LoanYearsTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanYearsTextFieldFocusLost
        if (LoanYearsTextField.getText().isBlank()) {
            LoanYearsTextField.setText("Years");
            LoanYearsTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_LoanYearsTextFieldFocusLost

    private void LoanMonthsTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanMonthsTextFieldFocusGained
        LoanMonthsTextField.setText("");
        LoanMonthsTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoanMonthsTextFieldFocusGained

    private void LoanMonthsTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanMonthsTextFieldFocusLost
        if (LoanMonthsTextField.getText().isBlank()) {
            LoanMonthsTextField.setText("Months");
            LoanMonthsTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_LoanMonthsTextFieldFocusLost

    private void LoanInterestRateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanInterestRateTextFieldFocusLost
        if (LoanInterestRateTextField.getText().isBlank()) {
            LoanInterestRateTextField.setText("%");
            LoanInterestRateTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_LoanInterestRateTextFieldFocusLost

    private void LoanInterestRateTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanInterestRateTextFieldFocusGained
        LoanInterestRateTextField.setText("");
        LoanInterestRateTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoanInterestRateTextFieldFocusGained

    private void LoanCompoundingComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanCompoundingComboBoxFocusGained
        LoanCompoundingComboBox.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoanCompoundingComboBoxFocusGained

    private void LoanPayBackComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanPayBackComboBoxFocusGained
        LoanPayBackComboBox.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoanPayBackComboBoxFocusGained

    private void LoanClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanClearButtonActionPerformed
        LoanAmountTextField.setText("$500");
        LoanAmountTextField.setForeground(Color.GRAY);
        LoanYearsTextField.setText("Years");
        LoanYearsTextField.setForeground(Color.GRAY);
        LoanMonthsTextField.setText("Months");
        LoanMonthsTextField.setForeground(Color.GRAY);
        LoanInterestRateTextField.setText("%");
        LoanInterestRateTextField.setForeground(Color.GRAY);
        LoanCompoundingComboBox.setForeground(Color.GRAY);
        LoanPayBackComboBox.setForeground(Color.GRAY);
        LoanCompoundingComboBox.setSelectedIndex(8);
        LoanPayBackComboBox.setSelectedIndex(4);
        LoanPaymentEveryMonthLabel.setText("$0");
        LoanTotalPaymentsLabel.setText("$0");
        LoanTotalInterestLabel.setText("$0");
    }//GEN-LAST:event_LoanClearButtonActionPerformed

    private void LoanAmountTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoanAmountTextFieldKeyReleased
        double value;
        String NumericValue = LoanAmountTextField.getText().replaceAll("[$,]", "");
        if (NumericValue.matches("\\d+")) {
            value = Double.parseDouble(NumericValue);
            calc.setLoanAmount(value);
            LoanAmountTextField.setText("$" + formatter.format(value));
        } else {
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if (NumericValue.isBlank()) {
                LoanAmountTextField.setText("");
            } else {
                value = Double.parseDouble(NumericValue);
                calc.setLoanAmount(value);
                LoanAmountTextField.setText("$" + formatter.format(value));
            }

        }
    }//GEN-LAST:event_LoanAmountTextFieldKeyReleased

    private void SavingsStartingBalanceTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SavingsStartingBalanceTextFieldKeyReleased
        double value;
        String NumericValue = SavingsStartingBalanceTextField.getText().replaceAll("[$,]", "");
        if (NumericValue.matches("\\d+")) {
            value = Double.parseDouble(NumericValue);
            calc.setSavingsBalance(value);
            SavingsStartingBalanceTextField.setText("$" + formatter.format(value));
        } else {
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if (NumericValue.isBlank()) {
                SavingsStartingBalanceTextField.setText("");
            } else {
                value = Double.parseDouble(NumericValue);
                calc.setSavingsBalance(value);
                SavingsStartingBalanceTextField.setText("$" + formatter.format(value));
            }

        }
    }//GEN-LAST:event_SavingsStartingBalanceTextFieldKeyReleased

    private void SavingsDepositAmountTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsDepositAmountTextFieldFocusGained
        SavingsDepositAmountTextField.setText("");
        SavingsDepositAmountTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_SavingsDepositAmountTextFieldFocusGained

    private void SavingsDepositAmountTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsDepositAmountTextFieldFocusLost
        if (SavingsDepositAmountTextField.getText().isBlank()) {
            SavingsDepositAmountTextField.setText("Deposit");
            SavingsDepositAmountTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_SavingsDepositAmountTextFieldFocusLost

    private void SavingsDepositAmountTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SavingsDepositAmountTextFieldKeyReleased
        double value;
        String NumericValue = SavingsDepositAmountTextField.getText().replaceAll("[$,]", "");
        if (NumericValue.matches("\\d+")) {
            value = Double.parseDouble(NumericValue);
            calc.setDepositAmount(value);
            SavingsDepositAmountTextField.setText("$" + formatter.format(value));
        } else {
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if (NumericValue.isBlank()) {
                SavingsDepositAmountTextField.setText("");
            } else {
                value = Double.parseDouble(NumericValue);
                calc.setDepositAmount(value);
                SavingsDepositAmountTextField.setText("$" + formatter.format(value));
            }
        }
    }//GEN-LAST:event_SavingsDepositAmountTextFieldKeyReleased

    private void SavingsFrequencyComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsFrequencyComboBoxFocusGained
        SavingsFrequencyComboBox.setForeground(Color.BLACK);
    }//GEN-LAST:event_SavingsFrequencyComboBoxFocusGained

    private void SavingsCompoundingComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsCompoundingComboBoxFocusGained
        SavingsCompoundingComboBox.setForeground(Color.BLACK);
    }//GEN-LAST:event_SavingsCompoundingComboBoxFocusGained

    private void SavingsYearsTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsYearsTextFieldFocusGained
        SavingsYearsTextField.setText("");
        SavingsYearsTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_SavingsYearsTextFieldFocusGained

    private void SavingsYearsTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsYearsTextFieldFocusLost
        if (SavingsYearsTextField.getText().isBlank()) {
            SavingsYearsTextField.setText("Years");
            SavingsYearsTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_SavingsYearsTextFieldFocusLost

    private void LoanYearsTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoanYearsTextFieldKeyReleased
        int value;
        String NumericValue = LoanYearsTextField.getText();
        if (NumericValue.matches("\\d+")) {
            value = Integer.parseInt(NumericValue);
            calc.setNumberOfYears(value);
            LoanYearsTextField.setText("" + value);
        } else {
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if (NumericValue.isBlank()) {
                LoanYearsTextField.setText("");
            } else {
                value = Integer.parseInt(NumericValue);
                calc.setNumberOfYears(value);
                LoanYearsTextField.setText(NumericValue);
            }

        }
    }//GEN-LAST:event_LoanYearsTextFieldKeyReleased

    private void LoanMonthsTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoanMonthsTextFieldKeyReleased
        int value;
        String NumericValue = LoanMonthsTextField.getText();
        if (NumericValue.matches("\\d+")) {
            value = Integer.parseInt(NumericValue);
            calc.setNumberOfMonths(value);
            LoanMonthsTextField.setText("" + value);
        } else {
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if (NumericValue.isBlank()) {
                LoanMonthsTextField.setText("");
            } else {
                value = Integer.parseInt(NumericValue);
                calc.setNumberOfMonths(value);
                LoanMonthsTextField.setText(NumericValue);
            }
        }
    }//GEN-LAST:event_LoanMonthsTextFieldKeyReleased

    private void LoanInterestRateTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoanInterestRateTextFieldKeyReleased
        double value;
        String NumericValue = LoanInterestRateTextField.getText();
        if(NumericValue.matches("\\d+")){
            value = Double.parseDouble(NumericValue);
            calc.setAnnualInterestRate(value);
        } else{
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if(NumericValue.isBlank()){
                LoanInterestRateTextField.setText("");
            } else{
                value = Double.parseDouble(NumericValue);
                calc.setAnnualInterestRate(value);
                LoanInterestRateTextField.setText(NumericValue);
            }
        }
    }//GEN-LAST:event_LoanInterestRateTextFieldKeyReleased

    private void SavingsYearsTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SavingsYearsTextFieldKeyReleased
        int value;
        String NumericValue = SavingsYearsTextField.getText();
        if (NumericValue.matches("\\d+")) {
            value = Integer.parseInt(NumericValue);
            calc.setNumberOfYears(value);
            SavingsYearsTextField.setText("" + value);
        } else {
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if (NumericValue.isBlank()) {
                SavingsYearsTextField.setText("");
            } else {
                value = Integer.parseInt(NumericValue);
                calc.setNumberOfYears(value);
                SavingsYearsTextField.setText(NumericValue);
            }

        }
    }//GEN-LAST:event_SavingsYearsTextFieldKeyReleased

    private void SavingsInterestRateTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsInterestRateTextFieldFocusGained
        SavingsInterestRateTextField.setText("");
        SavingsInterestRateTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_SavingsInterestRateTextFieldFocusGained

    private void SavingsInterestRateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavingsInterestRateTextFieldFocusLost
        if (SavingsInterestRateTextField.getText().isBlank()) {
            SavingsInterestRateTextField.setText("Months");
            SavingsInterestRateTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_SavingsInterestRateTextFieldFocusLost

    private void SavingsClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingsClearButtonActionPerformed
        SavingsStartingBalanceTextField.setText("$500");
        SavingsStartingBalanceTextField.setForeground(Color.GRAY);
        SavingsDepositAmountTextField.setText("Deposit");
        SavingsDepositAmountTextField.setForeground(Color.GRAY);
        SavingsYearsTextField.setText("Years");
        SavingsYearsTextField.setForeground(Color.GRAY);
        SavingsInterestRateTextField.setText("%");
        SavingsInterestRateTextField.setForeground(Color.GRAY);
        SavingsFrequencyComboBox.setForeground(Color.GRAY);
        SavingsCompoundingComboBox.setForeground(Color.GRAY);
        SavingsFrequencyComboBox.setSelectedIndex(3);
        SavingsCompoundingComboBox.setSelectedIndex(4);
        FutureSavingsLabel.setText("$0");
    }//GEN-LAST:event_SavingsClearButtonActionPerformed

    private void SavingsCalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingsCalculateButtonActionPerformed
        double Frequency = calc.compoundingValue((String) SavingsFrequencyComboBox.getSelectedItem());
        double Compounding = calc.compoundingValue((String) SavingsCompoundingComboBox.getSelectedItem());
        double FutureSavings = Double.parseDouble(decimalFormat.format(calc.calculateSavings(Frequency, Compounding)));
        FutureSavingsLabel.setText("$" + formatter.format(FutureSavings));
    }//GEN-LAST:event_SavingsCalculateButtonActionPerformed

    private void LoanPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoanPanelMouseClicked
        LoanPanel.requestFocusInWindow();
    }//GEN-LAST:event_LoanPanelMouseClicked

    private void SavingsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavingsPanelMouseClicked
        SavingsPanel.requestFocusInWindow();
    }//GEN-LAST:event_SavingsPanelMouseClicked

    private void EnterNameJDialogFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EnterNameJDialogFocusGained
        EnterNameJDialog.setForeground(Color.BLACK);
        EnterNameJDialog.setText("");
    }//GEN-LAST:event_EnterNameJDialogFocusGained

    private void EnterNameJDialogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EnterNameJDialogFocusLost
        if (EnterNameJDialog.getText().isBlank()) {
            EnterNameJDialog.setForeground(Color.GRAY);
            EnterNameJDialog.setText("Name");
        }
    }//GEN-LAST:event_EnterNameJDialogFocusLost

    private void ChangeAccountNameJDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeAccountNameJDialogMouseClicked
        ChangeAccountNameJDialog.requestFocusInWindow();
    }//GEN-LAST:event_ChangeAccountNameJDialogMouseClicked

    private void EnterSurnameJDialogFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EnterSurnameJDialogFocusGained
        EnterSurnameJDialog.setForeground(Color.BLACK);
        EnterSurnameJDialog.setText("");
    }//GEN-LAST:event_EnterSurnameJDialogFocusGained

    private void EnterSurnameJDialogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EnterSurnameJDialogFocusLost
        if (EnterSurnameJDialog.getText().isBlank()) {
            EnterSurnameJDialog.setForeground(Color.GRAY);
            EnterSurnameJDialog.setText("Surname");
        }
    }//GEN-LAST:event_EnterSurnameJDialogFocusLost

    private void EnterNameJDialogKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterNameJDialogKeyReleased
        String Name = EnterNameJDialog.getText();
        if (Name.matches(".*[^a-zA-Z].*")) {
            InvalidInputLabel.setText("Invalid Input!");
            EnterNameJDialog.setText(Name.substring(0, Name.length() - 1));
        } else {
            InvalidInputLabel.setText("");
            calc.setUserName(Name);
            EnterNameJDialog.setText(calc.getAccountInfo(0));
        }
    }//GEN-LAST:event_EnterNameJDialogKeyReleased

    private void EnterSurnameJDialogKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterSurnameJDialogKeyReleased
        String Surname = EnterSurnameJDialog.getText();
        if (Surname.matches(".*[^a-zA-Z].*")) {
            InvalidInputLabel.setText("Invalid Input!");
            EnterSurnameJDialog.setText(Surname.substring(0, Surname.length() - 1));
        } else {
            InvalidInputLabel.setText("");
            calc.setUserSurname(Surname);
            EnterSurnameJDialog.setText(calc.getAccountInfo(1));
        }
    }//GEN-LAST:event_EnterSurnameJDialogKeyReleased

    private void ConfirmAccountChangeJDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmAccountChangeJDialogActionPerformed
        AccountInfoLabel.setText(calc.getAccountInfo(2));
        ChangeAccountNameJDialog.dispose();
    }//GEN-LAST:event_ConfirmAccountChangeJDialogActionPerformed

    private void AccountPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountPanelMouseClicked
        AccountPanel.requestFocusInWindow();
    }//GEN-LAST:event_AccountPanelMouseClicked

    private void SavingsInterestRateTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SavingsInterestRateTextFieldKeyReleased
        double value;
        String NumericValue = SavingsInterestRateTextField.getText();
        if(NumericValue.matches("\\d+")){
            value = Double.parseDouble(NumericValue);
            calc.setAnnualInterestRate(value);
        } else{
            if(NumericValue.length() > 1)
                NumericValue = NumericValue.substring(0, NumericValue.length() - 1);
            if(NumericValue.isBlank()){
                SavingsInterestRateTextField.setText("");
            } else{
                value = Double.parseDouble(NumericValue);
                calc.setAnnualInterestRate(value);
                SavingsInterestRateTextField.setText(NumericValue);
            }
        }
    }//GEN-LAST:event_SavingsInterestRateTextFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountDepositButton;
    private javax.swing.JLabel AccountInfoLabel;
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JButton AccountTransferButton;
    private javax.swing.JButton AccountWithdrawButton;
    private javax.swing.JDialog ChangeAccountNameJDialog;
    private javax.swing.JButton CompleteDeposit;
    private javax.swing.JButton CompleteTransfer;
    private javax.swing.JButton CompleteWithdrawal;
    private javax.swing.JButton ConfirmAccountChangeJDialog;
    private javax.swing.JTextField DepositAmount;
    private javax.swing.JSlider DepositSlider;
    private javax.swing.JTextField EnterNameJDialog;
    private javax.swing.JTextField EnterSurnameJDialog;
    private javax.swing.JLabel FutureSavingsLabel;
    private javax.swing.JLabel InvalidInputLabel;
    private javax.swing.JTextField LoanAmountTextField;
    private javax.swing.JButton LoanCalculateButton;
    private javax.swing.JButton LoanClearButton;
    private javax.swing.JComboBox<String> LoanCompoundingComboBox;
    private javax.swing.JTextField LoanInterestRateTextField;
    private javax.swing.JTextField LoanMonthsTextField;
    private javax.swing.JPanel LoanPanel;
    private javax.swing.JComboBox<String> LoanPayBackComboBox;
    private javax.swing.JLabel LoanPaymentEveryMonthLabel;
    private javax.swing.JLabel LoanPaymentLabel;
    private javax.swing.JLabel LoanTotalInterestLabel;
    private javax.swing.JLabel LoanTotalPaymentsLabel;
    private javax.swing.JTextField LoanYearsTextField;
    private javax.swing.JButton SavingsCalculateButton;
    private javax.swing.JButton SavingsClearButton;
    private javax.swing.JComboBox<String> SavingsCompoundingComboBox;
    private javax.swing.JTextField SavingsDepositAmountTextField;
    private javax.swing.JComboBox<String> SavingsFrequencyComboBox;
    private javax.swing.JTextField SavingsInterestRateTextField;
    private javax.swing.JPanel SavingsPanel;
    private javax.swing.JTextField SavingsStartingBalanceTextField;
    private javax.swing.JTextField SavingsYearsTextField;
    private javax.swing.JLabel SuccessfulTransaction;
    private javax.swing.JLabel TotalBalance;
    private javax.swing.JTextField TransferAmount;
    private javax.swing.JTextField TransferNumber;
    private javax.swing.JSlider TransferSlider;
    private javax.swing.JTextField WithdrawalAmount;
    private javax.swing.JSlider WithdrawalSlider;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
