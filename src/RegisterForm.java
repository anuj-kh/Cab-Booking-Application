
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
public class RegisterForm extends javax.swing.JFrame {

    private DriverDatabase ddb=new DriverDatabase();
    private CustomerDatabase cdb=new CustomerDatabase();
    public RegisterForm(CustomerDatabase cdb,DriverDatabase ddb) {
        initComponents();
        this.cdb=cdb;
        this.ddb=ddb;
        this.setResizable(false);
        this.setLocationRelativeTo(null);  //to center it or to the screen
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        signup_panel = new javax.swing.JPanel();
        signup_header = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        password_text = new javax.swing.JPasswordField();
        signup_button = new javax.swing.JButton();
        login = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        phone_text = new javax.swing.JTextField();
        userid = new javax.swing.JLabel();
        userid_text = new javax.swing.JTextField();
        retype_password_text = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signup_panel.setBackground(new java.awt.Color(0,0,0));
        signup_panel.setPreferredSize(new java.awt.Dimension(615, 96));

        signup_header.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        signup_header.setForeground(new java.awt.Color(255, 255, 255));
        signup_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_header.setText("SIGNUP");

        javax.swing.GroupLayout signup_panelLayout = new javax.swing.GroupLayout(signup_panel);
        signup_panel.setLayout(signup_panelLayout);
        signup_panelLayout.setHorizontalGroup(
            signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signup_panelLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(signup_header)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        signup_panelLayout.setVerticalGroup(
            signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signup_panelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(signup_header)
                .addGap(18, 18, 18))
        );

        panel2.setBackground(new java.awt.Color(0,0,0));
        panel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N

        name.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Name:");

        password.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("Password:");

        name_text.setBackground(new java.awt.Color(200, 212, 217));
        name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textActionPerformed(evt);
            }
        });

        password_text.setBackground(new java.awt.Color(200, 212, 217));
        password_text.setToolTipText("Password should be at least 6 characters long.");

        signup_button.setBackground(new java.awt.Color(34, 137, 240));
        signup_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signup_button.setText("SIGNUP");
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Already have an account? Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("Email:");

        email_text.setBackground(new java.awt.Color(200, 212, 217));
        email_text.setToolTipText("Enter a valid Email-ID");
        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        phone.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phone.setText("Phone:");

        phone_text.setBackground(new java.awt.Color(200, 212, 217));
        phone_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_textActionPerformed(evt);
            }
        });

        userid.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        userid.setForeground(new java.awt.Color(255, 255, 255));
        userid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userid.setText("UserID:");

        userid_text.setBackground(new java.awt.Color(200, 212, 217));
        userid_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userid_textActionPerformed(evt);
            }
        });

        retype_password_text.setBackground(new java.awt.Color(200, 212, 217));
        retype_password_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retype_password_textActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Retype ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Password:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email)
                            .addComponent(name)
                            .addComponent(phone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(userid)
                        .addGap(18, 18, 18)
                        .addComponent(userid_text, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(password))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel10)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)))
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retype_password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(signup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(16, 16, 16)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone))
                        .addGap(47, 47, 47))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userid)
                        .addComponent(userid_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(retype_password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(login)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signup_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void name_textActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        DataBase conn = new DataBase();
        if(name_text.getText().isEmpty()||password_text.getText().isEmpty()||retype_password_text.getText().isEmpty()||phone_text.getText().isEmpty()||email_text.getText().isEmpty() || userid_text.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All the fields are not present");
        }
        else
        {
            if (conn.popup_message(userid_text.getText()) != 1) 
            {
                if(password_text.getText().equals(retype_password_text.getText())==false)
                {
                    JOptionPane.showMessageDialog(null, "password are not same");
                }
                else
                {    
                    if(email_text.getText().indexOf("@")==-1 || email_text.getText().indexOf(".")==-1)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Email ID");
                    }
                    else if(phone_text.getText().length()!=10)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid phone number(wrong format or size is not equal to 10)");
                    }
                    else
                    {
                        int row=conn.rows()+1;
                        System.out.println(row);
                        conn.insert_customer("INSERT INTO customerdata(name,email,phonenumber,username,password,wallet,userid) VALUES ('"+name_text.getText()+"','"+email_text.getText()+"','"+phone_text.getText()+"','"+userid_text.getText()+"','"+password_text.getText()+"',0.0,"+row+")");
                        this.setVisible(false);
                        this.dispose();        
                        new LoginForm(cdb,ddb).setVisible(true);
                    }
                }
            }
        }
    }                                             

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        LoginForm lgf=new LoginForm(cdb,ddb);
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        this.dispose();
    }                                  

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void phone_textActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void userid_textActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void retype_password_textActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify                     
    private javax.swing.JLabel email;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel login;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_text;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phone_text;
    private javax.swing.JPasswordField retype_password_text;
    private javax.swing.JButton signup_button;
    private javax.swing.JLabel signup_header;
    private javax.swing.JPanel signup_panel;
    private javax.swing.JLabel userid;
    private javax.swing.JTextField userid_text;
    // End of variables declaration                   
}
