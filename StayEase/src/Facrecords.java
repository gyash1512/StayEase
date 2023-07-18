import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;

public class Facrecords extends JFrame {
    public Facrecords() {
        // Set up the GUI
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);

        // Add the background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("recback.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1380, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-10, -10, 1380, 850);
        add(l3);

        // Connect to the database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tickets", "root", "root");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM ticketfac";
            ResultSet rs = stmt.executeQuery(sql);

            // Create a table to display the data
            JTable table = new JTable();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(27, 23, 1300, 600);
            l3.add(scrollPane);

            // Set the font for the table headers
            table.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 14));
            // Make the table transparent
            table.setOpaque(false);
            scrollPane.setOpaque(false);
            scrollPane.getViewport().setOpaque(false);

// Set the text color to white
            table.setForeground(Color.BLACK);
            table.getTableHeader().setForeground(Color.BLACK);

            con.close();
            JButton backButton = new JButton("BACK");
            backButton.setBounds(1170, 650, 150, 50);
            l3.add(backButton);

// Add an ActionListener to handle button clicks
            backButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Open the Admin window and close the current window
                    new Admin().setVisible(true);
                    setVisible(false);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Facrecords();
    }
}