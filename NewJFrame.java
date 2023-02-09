import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
     
    public NewJFrame() {
        initComponents();
        
        sign.setVisible(false);
        updateSign.setVisible(false);
        btnUpdate.setVisible(false);
        labelNew.setVisible(false);
        txtNew.setVisible(false);
        panelSrch.setVisible(false);
        srchSign.setVisible(false);
        signDlt.setVisible(false);
        txtDltValue.setVisible(false);
        dltLabel.setVisible(false);
        dltBtn.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGender = new javax.swing.ButtonGroup();
        btngUpdate = new javax.swing.ButtonGroup();
        dltBtnGrp = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        srchBtnGrp = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLast = new javax.swing.JTextField();
        txtFirst = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAdd = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOther = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        sign = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        labelFname = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        labelFname1 = new javax.swing.JLabel();
        checkFirst = new javax.swing.JCheckBox();
        checkLast = new javax.swing.JCheckBox();
        checkNum = new javax.swing.JCheckBox();
        checkAddress = new javax.swing.JCheckBox();
        checkGender = new javax.swing.JCheckBox();
        checkEmail = new javax.swing.JCheckBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        labelNew = new javax.swing.JLabel();
        txtNew = new javax.swing.JTextField();
        updateSign = new javax.swing.JLabel();
        panelBase = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        srchFname = new javax.swing.JCheckBox();
        srchNumber = new javax.swing.JCheckBox();
        srchEmail = new javax.swing.JCheckBox();
        newvalue = new javax.swing.JLabel();
        txtsrch = new javax.swing.JTextField();
        btnSrch = new javax.swing.JButton();
        panelSrch = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        Fname = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Pnum = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        srchSign = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        View = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dltFname = new javax.swing.JCheckBox();
        dltLname = new javax.swing.JCheckBox();
        dltNumber = new javax.swing.JCheckBox();
        dltEmail = new javax.swing.JCheckBox();
        dltGender = new javax.swing.JCheckBox();
        dltAddress = new javax.swing.JCheckBox();
        dltLabel = new javax.swing.JLabel();
        txtDltValue = new javax.swing.JTextField();
        nxtBtn = new javax.swing.JButton();
        dltBtn = new javax.swing.JButton();
        signDlt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("First name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Last name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Phone no.:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Gender   :");

        txtLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastActionPerformed(evt);
            }
        });

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        txtAreaAdd.setColumns(20);
        txtAreaAdd.setRows(5);
        jScrollPane1.setViewportView(txtAreaAdd);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Address   :");

        btngGender.add(radioMale);
        radioMale.setText("Male");

        btngGender.add(radioFemale);
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        btngGender.add(radioOther);
        radioOther.setText("Other");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email      :");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        sign.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        sign.setText("Contact Created....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnReset)
                            .addGap(131, 131, 131)
                            .addComponent(btnSave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                    .addComponent(txtLast)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioOther, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)))))
                    .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(radioOther))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sign)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("ADD CONTACT", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        btnNext.setText("Next ->");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        labelFname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFname.setText("First Name:");

        labelFname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFname1.setText("   Update:");

        btngUpdate.add(checkFirst);
        checkFirst.setText("First Name");

        btngUpdate.add(checkLast);
        checkLast.setText("Last Name");

        btngUpdate.add(checkNum);
        checkNum.setText("Phone no.");

        btngUpdate.add(checkAddress);
        checkAddress.setText("Address");

        btngUpdate.add(checkGender);
        checkGender.setText("Gender");

        btngUpdate.add(checkEmail);
        checkEmail.setText("Email");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        labelNew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNew.setText("New Value:");

        updateSign.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        updateSign.setText("Contact updated...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(checkGender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(checkEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(checkLast, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(104, 104, 104)
                                                .addComponent(checkNum, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(labelFname1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                        .addComponent(btnNext)))
                                .addGap(74, 74, 74))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(labelFname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkFirst, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(labelNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtNew)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateSign, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelFname)
                        .addGap(35, 35, 35)))
                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelFname1)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFirst)
                    .addComponent(checkLast)
                    .addComponent(checkNum))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAddress)
                    .addComponent(checkGender)
                    .addComponent(checkEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNew)
                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateSign)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("UPDATE CONTACT", jPanel2);

        panelBase.setBackground(new java.awt.Color(204, 255, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("    Search basis :");

        srchBtnGrp.add(srchFname);
        srchFname.setText("First Name");

        srchBtnGrp.add(srchNumber);
        srchNumber.setText("Phone no.");

        srchBtnGrp.add(srchEmail);
        srchEmail.setText("Email");

        newvalue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newvalue.setText("Value: ");

        btnSrch.setText("Search");
        btnSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrchActionPerformed(evt);
            }
        });

        panelSrch.setBackground(new java.awt.Color(204, 255, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("--------DETAILS--------");

        jLabel11.setText("First name:");

        jLabel12.setText("Last name:");

        jLabel13.setText("Ph. Number:");

        jLabel14.setText("Address:");

        jLabel15.setText("Gender:");

        jLabel16.setText("Email:");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        Fname.setText("first name");

        Lname.setText("last name");

        Pnum.setText("phone num");

        Address.setText("address");

        Gender.setText("gender");

        Email.setText("mail");

        javax.swing.GroupLayout panelSrchLayout = new javax.swing.GroupLayout(panelSrch);
        panelSrch.setLayout(panelSrchLayout);
        panelSrchLayout.setHorizontalGroup(
            panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSrchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addGap(46, 46, 46))
            .addGroup(panelSrchLayout.createSequentialGroup()
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSrchLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSrchLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(panelSrchLayout.createSequentialGroup()
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSrchLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSrchLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSrchLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(panelSrchLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSrchLayout.setVerticalGroup(
            panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSrchLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Fname))
                .addGap(44, 44, 44)
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Lname))
                .addGap(46, 46, 46)
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Pnum))
                .addGap(51, 51, 51)
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Address))
                .addGap(53, 53, 53)
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Gender))
                .addGap(53, 53, 53)
                .addGroup(panelSrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addGap(30, 30, 30))
        );

        srchSign.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        srchSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        srchSign.setText("Contact not found...");

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(srchNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(srchFname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(srchEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnSrch))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newvalue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsrch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(srchSign, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(panelSrch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(srchFname)
                .addGap(38, 38, 38)
                .addComponent(srchNumber)
                .addGap(38, 38, 38)
                .addComponent(srchEmail)
                .addGap(51, 51, 51)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newvalue)
                    .addComponent(txtsrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnSrch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(srchSign)
                .addContainerGap())
            .addComponent(panelSrch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("SEARCH CONTACT", panelBase);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        jTable2.setBackground(new java.awt.Color(0, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FirstName", "LastName", "PhoneNumber", "Address", "Gender", "Email"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(View)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(View)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ALL CONTACTS", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Delete contact on the basis of:");

        dltBtnGrp.add(dltFname);
        dltFname.setText("First Name");

        dltBtnGrp.add(dltLname);
        dltLname.setText("Last Name");

        dltBtnGrp.add(dltNumber);
        dltNumber.setText("Phone no.");

        dltBtnGrp.add(dltEmail);
        dltEmail.setText("Email");

        dltBtnGrp.add(dltGender);
        dltGender.setText("Gender");

        dltBtnGrp.add(dltAddress);
        dltAddress.setText("Address");

        dltLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dltLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dltLabel.setText("Value :");

        nxtBtn.setText("Next->");
        nxtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtBtnActionPerformed(evt);
            }
        });

        dltBtn.setBackground(new java.awt.Color(255, 51, 51));
        dltBtn.setText("Delete");
        dltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBtnActionPerformed(evt);
            }
        });

        signDlt.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        signDlt.setText("Contact deleted...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(nxtBtn)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(dltBtn)
                        .addGap(253, 253, 253))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dltLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dltAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDltValue, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(dltFname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(dltLname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dltGender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dltNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dltEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(signDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dltLname)
                    .addComponent(dltFname)
                    .addComponent(dltNumber))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dltAddress)
                    .addComponent(dltGender)
                    .addComponent(dltEmail))
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dltLabel)
                    .addComponent(txtDltValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(dltBtn)
                .addGap(5, 5, 5)
                .addComponent(nxtBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signDlt)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("DELETE CONTACT", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String fname, updateCol, newValue;
        Long newPhn;
        fname = txtFname.getText();
        if(checkFirst.isSelected()){
            updateCol = "FirstName";
        }
        else if (checkLast.isSelected())
        updateCol = "LastName";
        else if(checkNum.isSelected())
        updateCol = "PhoneNumber";
        else if(checkAddress.isSelected())
        updateCol = "Address";
        else if(checkGender.isSelected())
        updateCol = "Gender";
        else if(checkEmail.isSelected())
        updateCol = "Email";
        else
        updateCol = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root", "");
            String sql = "";
            if (updateCol.equals("FirstName")){
                sql = "{call updateFname(?, ?)}";
            }
            else if (updateCol.equals("LastName")){
                sql = "{call updateLname(?, ?)}";
            }
            else if (updateCol.equals("PhoneNumber")){
                sql = "{call updateNumber(?, ?)}";
            }
            else if (updateCol.equals("Address")){
                sql = "{call updateAddress(?, ?)}";
            }
            else if (updateCol.equals("Gender")){
                sql = "{call updateGender(?, ?)}";
            }
            else if (updateCol.equals("Email")){
                sql = "{call updateEmail(?, ?)}";
            }
            else{}

            CallableStatement stmt = con.prepareCall(sql);
            if(updateCol.equals("PhoneNumber")){
                newPhn = Long.valueOf(txtNew.getText());
                stmt.setLong(1, newPhn);
            }
            else{
                newValue = txtNew.getText();
                stmt.setString(1, newValue);
            }
            stmt.setString(2, fname);
            boolean res = stmt.execute();
            if (res == false){
                updateSign.setVisible(true);
            }
            else
            updateSign.setText("Unable to update..");

            
        }catch(Exception e) {}
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        btnNext.setVisible(false);
        btnUpdate.setVisible(true);
        labelNew.setVisible(true);
        txtNew.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtFirst.setText("");
        txtLast.setText("");
        txtNumber.setText("");
        txtAreaAdd.setText("");
        btngGender.clearSelection();
        txtEmail.setText("");
        sign.setVisible(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String fname, lname, address, email, gender;
        long phn;
        fname = txtFirst.getText();
        lname = txtLast.getText();
        address = txtAreaAdd.getText();
        email = txtEmail.getText();
        if(radioMale.isSelected())
        gender = "Male";
        else if(radioFemale.isSelected())
        gender = "Female";
        else if(radioOther.isSelected())
        gender = "Other";
        else
        gender = "Prefered not to say";
        phn = Long.parseLong(txtNumber.getText());

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into contact values(?,?,?,?,?,?)");
            stmt.setString(1,fname);
            stmt.setString(2,lname);
            stmt.setLong(3, phn);
            stmt.setString(4,address);
            stmt.setString(5,gender);
            stmt.setString(6,email);
            int result = stmt.executeUpdate();
            if (result == 1){
                sign.setVisible(true);

            }
            else{
                sign.setText("Unable to create contact...");
                sign.setVisible(true);
            }

        }catch(Exception e){}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastActionPerformed

    private void btnSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrchActionPerformed
        // TODO add your handling code here:
        String sql = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root", "");
            if(srchFname.isSelected()){
                sql = "select * from contact where FirstName = ?";
            }
            else if(srchNumber.isSelected()){
                sql = "select * from contact where PhoneNumber = ?";
            }
            else if(srchEmail.isSelected()){
                sql = "select * from contact where Email = ?";
            }
            PreparedStatement stmt = con.prepareStatement(sql);
            if (srchNumber.isSelected()){
                long value = Long.parseLong(txtsrch.getText());
                stmt.setLong(1, value);
            }
            else{
               String value = txtsrch.getText();
               stmt.setString(1, value);
            }
            ResultSet res = stmt.executeQuery();
            
            if (res.next() ){
                panelSrch.setVisible(true);
                String fname = res.getString(1);
                String lname = res.getString(2);
                //String pnum = res.getString(3);
                String addr = res.getString(4);
                String gend = res.getString(5);
                String mail = res.getString(6);
                System.out.print(fname);
                Fname.setText(fname);
                Lname.setText(lname);
                Pnum.setText("9876543221");
                Address.setText(addr);
                Gender.setText(gend);
                Email.setText(mail);
            }
            else
                srchSign.setVisible(true);
            stmt.close();
         con.close();  
        }catch(Exception e){}
    }//GEN-LAST:event_btnSrchActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnOkActionPerformed

    private void nxtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtnActionPerformed
        // TODO add your handling code here:
        nxtBtn.setVisible(false);
        dltBtn.setVisible(true);
        dltLabel.setVisible(true);
        txtDltValue.setVisible(true);
    }//GEN-LAST:event_nxtBtnActionPerformed

    private void dltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBtnActionPerformed
        // TODO add your handling code here:
        String sql ="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root", "");
            if(dltFname.isSelected()){
                sql = "delete from contact where FirstName = ?";
            }
            else if(dltLname.isSelected()){
                sql = "delete from contact where LastName = ?";
            }
            else if(dltNumber.isSelected()){
                sql = "delete from contact where PhoneNumber = ?";
            }
            else if(dltAddress.isSelected()){
                sql = "delete from contact where Address = ?";
            }
            else if(dltGender.isSelected()){
                sql = "delete from contact where Gender = ?";
            }
            else if(dltEmail.isSelected()){
                sql = "delete from contact where Email = ?";
            }
            PreparedStatement stmt = con.prepareStatement(sql);
            if(dltNumber.isSelected()){
                Long num = Long.valueOf(txtDltValue.getText());
                stmt.setLong(1, num);
            }
            else{
                String value = txtDltValue.getText();
                stmt.setString(1, value);
            }
            int res = stmt.executeUpdate();
            if(res>0){
                signDlt.setVisible(true);
            }
            else{
                signDlt.setText("Unable to delete...");
                signDlt.setVisible(true);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_dltBtnActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        try{
            String fname, lname, add, gend, mail;
            Long phn;
            DefaultTableModel model = new DefaultTableModel();
            jTable2.setModel(model);
            String[] column = {"FirstName", "LastName", "PhoneNumber", "Address", "Gender", "Email"};
            model.setColumnIdentifiers(column);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root", "");
            String sql = "select * from contact";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            int i = 0;
            while(res.next()){
                 fname = res.getString("FirstName");
                 lname = res.getString("LastName");
                 phn = Long.valueOf(res.getString("PhoneNumber"));
                 add = res.getString("Address");
                 gend = res.getString("Gender");
                 mail = res.getString("Email");
                 model.addRow(new Object[] {fname, lname, phn, add, gend, mail});
                 i++;
            }
        }catch(Exception e){}
        
    }//GEN-LAST:event_ViewActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Pnum;
    private javax.swing.JButton View;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSrch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup btngGender;
    private javax.swing.ButtonGroup btngUpdate;
    private javax.swing.JCheckBox checkAddress;
    private javax.swing.JCheckBox checkEmail;
    private javax.swing.JCheckBox checkFirst;
    private javax.swing.JCheckBox checkGender;
    private javax.swing.JCheckBox checkLast;
    private javax.swing.JCheckBox checkNum;
    private javax.swing.JCheckBox dltAddress;
    private javax.swing.JButton dltBtn;
    private javax.swing.ButtonGroup dltBtnGrp;
    private javax.swing.JCheckBox dltEmail;
    private javax.swing.JCheckBox dltFname;
    private javax.swing.JCheckBox dltGender;
    private javax.swing.JLabel dltLabel;
    private javax.swing.JCheckBox dltLname;
    private javax.swing.JCheckBox dltNumber;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelFname;
    private javax.swing.JLabel labelFname1;
    private javax.swing.JLabel labelNew;
    private javax.swing.JLabel newvalue;
    private javax.swing.JButton nxtBtn;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelSrch;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    private javax.swing.JLabel sign;
    private javax.swing.JLabel signDlt;
    private javax.swing.ButtonGroup srchBtnGrp;
    private javax.swing.JCheckBox srchEmail;
    private javax.swing.JCheckBox srchFname;
    private javax.swing.JCheckBox srchNumber;
    private javax.swing.JLabel srchSign;
    private javax.swing.JTextArea txtAreaAdd;
    private javax.swing.JTextField txtDltValue;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtNew;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtsrch;
    private javax.swing.JLabel updateSign;
    // End of variables declaration//GEN-END:variables
}
