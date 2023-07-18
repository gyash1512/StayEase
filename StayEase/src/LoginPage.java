import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField tf1;
    JPasswordField pf2;
    JButton btn1, btn2, btn3, btn4;
    JPanel panel;
    ImageIcon i1, i3;
    Image i2;

    LoginPage() {
        super("LOGIN");
        // Set the background image
        i1 = new ImageIcon(ClassLoader.getSystemResource("Login.jpg"));
        i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        i3 = new ImageIcon(i2);
        l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1380, 850);
        add(l3);

        // Set the logo
        JLabel logo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("bennlogo.png")));
        logo.setBounds(480, 30, 400, 136);
        l3.add(logo);

        // Set the title
        l1 = new JLabel("LOGIN");
        l1.setFont(new Font("Osward", Font.BOLD, 60));
        l1.setForeground(Color.orange);

        // Set the username label and text field
        l2 = new JLabel("USERNAME");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setForeground(Color.WHITE);
        tf1 = new JTextField(15);

        // Set the password label and password field
        l4 = new JLabel("PASSWORD");
        l4.setFont(new Font("Raleway", Font.BOLD, 28));
        l4.setForeground(Color.WHITE);
        pf2 = new JPasswordField(15);

        // Set the login buttons
        btn1 = new JButton("LOGIN As Faculty");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);

        btn2 = new JButton("LOGIN As Student");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        btn3 = new JButton("LOGIN As ADMIN");
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);

        btn4 = new JButton("SIGNUP");
        btn4.setBackground(Color.BLUE);
        btn4.setForeground(Color.YELLOW);
        // Set the layout and add components
        setLayout(null);
        l1.setBounds(620, 270, 300, 70);
        l3.add(l1);

        l2.setBounds(470, 400, 200, 30);
        l3.add(l2);

        tf1.setBounds(700, 400, 230, 30);
        l3.add(tf1);

        l4.setBounds(470, 470, 200, 30);
        l3.add(l4);

        pf2.setBounds(700, 470, 230, 30);
        l3.add(pf2);

        btn1.setBounds(370, 600, 200, 50);
        l3.add(btn1);

        btn2.setBounds(620, 600, 200, 50);
        l3.add(btn2);

        btn3.setBounds(870, 600, 200, 50);
        l3.add(btn3);

        btn4.setBounds(1150, 700, 130, 30);
        l3.add(btn4);

        JButton creatorsButton = new JButton("CREATORS");
        creatorsButton.setBounds(50, 700, 150, 50);
        creatorsButton.setBackground(Color.BLACK);
        creatorsButton.setForeground(Color.WHITE);
        l3.add(creatorsButton);

        creatorsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new Creators().setVisible(true);
                    setVisible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        // Set frame properties
        setSize(1920,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {

            String username = tf1.getText();
            String password = pf2.getText();
            String host = "localhost";
            String dbUsername = "root";
            String dbPassword = "root";
            String dbName = "Login";
            String tableName = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + dbName + "?characterEncoding=latin1", dbUsername, dbPassword);
            Statement stmt = con.createStatement();
            if (ae.getSource() == btn1) {
                tableName = "Credentialsfac";
                ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " WHERE username='" + username + "' AND password='" + password + "'");
                if (rs.next()) {
                    // Run RoomCleaningServicesFac.java file
                    setVisible(false);
                    new RaiseTicketFac().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                    tf1.setText("");
                    pf2.setText("");
                }
            } else if (ae.getSource() == btn2) {
                tableName = "CredentialsStu";
                ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " WHERE username='" + username + "' AND password='" + password + "'");
                if (rs.next()) {
                    // Run RoomCleaningServicesFac.java file
                    setVisible(false);
                    new RaiseTicketStud().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                    tf1.setText("");
                    pf2.setText("");
                }
            } else if (ae.getSource() == btn3) {
                tableName = "Credentialsadm";
                ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " WHERE username='" + username + "' AND password='" + password + "'");
                if (rs.next()) {
                    // Run RoomCleaningServicesFac.java file
                    setVisible(false);
                    new Admin().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                    tf1.setText("");
                    pf2.setText("");
                }
            }
            else if(ae.getSource() == btn4) {
                    // Run Signup.java file
                    new SignupPage().setVisible(true);
                    setVisible(false);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}