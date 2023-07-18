import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Creators extends JFrame {
    public Creators() {
        super("CREATORS");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("creator.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1380, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1380, 850);
        add(l3);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("bennlogo.png"));
        JLabel l1 = new JLabel(i4);
        l1.setBounds(480, 30, 400, 136);
        l3.add(l1);

        JLabel l2 = new JLabel("<html>FROM THE DESK OF CREATORS</html>");
        l2.setFont(new Font("Raleway", Font.BOLD, 46));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(340, -40, 1000, 600);
        l3.add(l2);

        JLabel l0 = new JLabel("<html>WE here are providing the services which in future will not be limited to just \"ROOM CLEANING\" but will be related to many real-life problems. People face many issues in there real life and they think \"Kaash ye hota to mein ise asani se kr leta\".WE promise them to have much more in the future time. The users are highly appreciated to use the resources provided by us. WE shall be more than happy to invite more users to use our platform.</html>");
        l0.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l0.setForeground(Color.WHITE);
        l0.setBounds(190, 70, 1000, 600);
        l3.add(l0);

        JLabel l4 = new JLabel("~YASH GUPTA");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setForeground(Color.cyan);
        l4.setBounds(1090, 450, 300, 40);
        l3.add(l4);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(1170, 650, 150, 50);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        l3.add(backButton);

// Add an ActionListener to handle button clicks
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the Admin window and close the current window
                new LoginPage().setVisible(true);
                setVisible(false);
            }
        });
        JLabel l5 = new JLabel("~KAUSHAL SURANA");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(1090, 480, 300, 40);
        l5.setForeground(Color.cyan);
        l3.add(l5);

        JLabel l6 = new JLabel("~SHUBHOMKAR");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(1090, 510, 300, 40);
        l6.setForeground(Color.cyan);
        l3.add(l6);

    }

    public static void main(String[] args) {
        new Creators().setVisible(true);
    }
}