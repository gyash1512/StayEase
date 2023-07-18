
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignupPage extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton facultyButton, studentButton, adminButton, btn4;

    public SignupPage() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        // Set the layout
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("signup.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1380, 850);
        add(l3);

        JLabel signupLabel = new JLabel("SIGNUP");
        signupLabel.setFont(new Font("Osward", Font.BOLD, 60));
        signupLabel.setForeground(Color.ORANGE);
        signupLabel.setBounds(600, 270, 300, 70);
        l3.add(signupLabel);

        JLabel usernameLabel = new JLabel("USERNAME");
        usernameLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setBounds(470, 400, 200, 30);
        l3.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(700, 400, 230, 30);
        l3.add(usernameField);

        JLabel passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(470, 470, 200, 30);
        l3.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(700, 470, 230, 30);
        l3.add(passwordField);

        facultyButton = new JButton("SIGNUP As Faculty");
        facultyButton.setBackground(Color.BLACK);
        facultyButton.setForeground(Color.WHITE);
        facultyButton.setBounds(470, 600, 200, 45);
        facultyButton.addActionListener(this);
        l3.add(facultyButton);
        studentButton = new JButton("SIGNUP As Student");
        studentButton.setBackground(Color.BLACK);
        studentButton.setForeground(Color.WHITE);
        studentButton.setBounds(720, 600, 200, 45);
        studentButton.addActionListener(this);
        l3.add(studentButton);

        adminButton = new JButton("SIGNUP As ADMIN");
        adminButton.setBackground(Color.BLACK);
        adminButton.setForeground(Color.WHITE);
        adminButton.setBounds(870, 600, 200, 45);
        adminButton.addActionListener(this);
        //l3.add(adminButton);
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
        btn4 = new JButton("LOGIN");
        btn4.setBackground(Color.BLUE);
        btn4.setForeground(Color.YELLOW);
        btn4.setBounds(1150, 700, 130, 30);
        l3.add(btn4);
        btn4.addActionListener(this);


        JLabel logo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("bennlogo.png")));
        logo.setBounds(480, 30, 400, 136);
        l3.add(logo);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String table = "";
        String message = "";

        if (ae.getSource() == facultyButton) {
            table = "Credentialsfac";
            message = "SUCCESSFULLY SIGNUP AS FACULTY";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "root");
                Statement st = con.createStatement();
                String query = "INSERT INTO " + table + " VALUES('" + username + "', '" + password + "')";
                st.executeUpdate(query);

                JOptionPane.showMessageDialog(null, message);

                new LoginPage();
                setVisible(false);

                con.close();
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == studentButton) {
            table = "CredentialsStu";
            message = "SUCCESSFULLY SIGNUP AS STUDENT";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "tiger");
                Statement st = con.createStatement();
                String query = "INSERT INTO " + table + " VALUES('" + username + "', '" + password + "')";
                st.executeUpdate(query);

                JOptionPane.showMessageDialog(null, message);

                new LoginPage();
                setVisible(false);

                con.close();
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == adminButton) {
            table = "Credentialsadm";
            message = "SUCCESSFULLY SIGNUP AS ADMIN";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "tiger");
                Statement st = con.createStatement();
                String query = "INSERT INTO " + table + " VALUES('" + username + "', '" + password + "')";
                st.executeUpdate(query);

                JOptionPane.showMessageDialog(null, message);

                new LoginPage();
                setVisible(false);

                con.close();
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == btn4) {
            // Run Signup.java file
            try{
            new LoginPage().setVisible(true);
            setVisible(false);}
            catch(Exception e){
                System.out.println();
            }
        }


    }

    public static void main(String[] args) {
        new SignupPage();
    }
}