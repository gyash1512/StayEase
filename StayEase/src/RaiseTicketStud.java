
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RaiseTicketStud extends JFrame implements ActionListener {

    JButton raiseTicketButton, deleteTicketButton;

    public RaiseTicketStud() {
        // Set the size of the window to full screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        // Set the layout
        setLayout(null);
        JLabel logo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("bennlogo.png")));
        logo.setBounds(480, 30, 400, 136);
        add(logo);

        // Set the title
        JLabel title = new JLabel("SELECT THE ACTION");
        title.setFont(new Font("Raleway", Font.BOLD, 50));
        title.setForeground(Color.WHITE);
        title.setBounds(450, 200, 600, 80);
        add(title);
// Create the "Raise Ticket" button
        raiseTicketButton = new JButton("Raise Ticket");
        raiseTicketButton.setBackground(Color.BLACK);
        raiseTicketButton.setForeground(Color.WHITE);
        raiseTicketButton.setFont(new Font("Raleway", Font.BOLD, 40)); // Set the font size of the label
        raiseTicketButton.setBounds(400, 450, 300, 75); // Set the size of the button
        raiseTicketButton.addActionListener(this);
        add(raiseTicketButton);

// Create the "Delete Ticket" button
        deleteTicketButton = new JButton("Delete Ticket");
        deleteTicketButton.setBackground(Color.BLACK);
        deleteTicketButton.setForeground(Color.WHITE);
        deleteTicketButton.setFont(new Font("Raleway", Font.BOLD, 40)); // Set the font size of the label
        deleteTicketButton.setBounds(720, 450, 300, 75); // Set the size of the button
        deleteTicketButton.addActionListener(this);
        add(deleteTicketButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(1170, 650, 150, 50);
        add(backButton);

// Add an ActionListener to handle button clicks
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the Admin window and close the current window
                new LoginPage().setVisible(true);
                setVisible(false);
            }
        });

        // Set the background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("raiseticket.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1380,850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1380, 850);
        add(l3);

        getContentPane().setBackground(Color.WHITE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == raiseTicketButton) {
            // Run RoomCleaningServicesFac.java when "Raise Ticket" button is clicked
            new RoomCleaningServicesStu().setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == deleteTicketButton) {

            new DeleteRecordStud().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new RaiseTicketStud().setVisible(true);
    }
}