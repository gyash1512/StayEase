
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Admin extends JFrame {
    public Admin() {
        super("Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);


        // Set the layout
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("adback.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1380, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1380, 850);
        add(l3);
        JLabel logo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("bennlogo.png")));
        logo.setBounds(480, 30, 400, 136);
        l3.add(logo);

        JLabel label = new JLabel("SELECT TO OPEN RECORDS");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(425, 250, 600, 60);
        label.setForeground(Color.YELLOW);
        l3.add(label);

        JButton facultyButton = new JButton("FACULTY");
        facultyButton.setFont(new Font("Releway", Font.BOLD, 20));
        facultyButton.setBounds(525, 400, 150, 50);
        facultyButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    new Facrecords().setVisible(true);
                    setVisible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        l3.add(facultyButton);

        JButton studentButton = new JButton("STUDENTS");
        studentButton.setFont(new Font("Raleway", Font.BOLD, 20));
        studentButton.setBounds(725, 400, 150, 50);
        studentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new Sturecords().setVisible(true);
                    setVisible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        l3.add(studentButton);

        setLayout(null);
        JButton backButton = new JButton("BACK");
        backButton.setBounds(1170, 650, 150, 50);
        l3.add(backButton);

// Add an ActionListener to handle button clicks
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the Admin window and close the current window
                new LoginPage().setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setVisible(true);
    }
}
