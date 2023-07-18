import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.optionalusertools.TimeChangeListener;
import com.github.lgooddatepicker.zinternaltools.TimeChangeEvent;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import com.toedter.calendar.*;
import java.text.SimpleDateFormat;


public class RoomCleaningServicesFac extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6;
    Choice c1,c2;
    JCheckBox c3,c4,c5,c6;
    JButton b1,b2;
    String services = "";

    RoomCleaningServicesFac(){
        super("ROOM CLEANING SERVICES");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        // Set the layout
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Roomclean.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1380, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1380, 850);
        add(l3);

        JLabel l1 = new JLabel("Room Cleaning Services");
        l1.setFont(new Font("Raleway",Font.BOLD,55));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(400,30,650,65);
        l3.add(l1);

        JLabel l2 = new JLabel("Select the timing when you are available!!!");
        l2.setFont(new Font("Raleway",Font.BOLD,30));
        l2.setBounds(50,130,650,50);
        l2.setForeground(Color.cyan);
        l3.add(l2);

        JLabel l4 = new JLabel("Date (From)");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(65,200,150,30);
        l4.setForeground(Color.PINK);
        l3.add(l4);

        t1 = new JTextField();
        t1.setBounds(50,240,150,30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        l3.add(t1);
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(50,280,150,30);
        l3.add(dateChooser);

        dateChooser.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("date")) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    t1.setText(format.format(dateChooser.getDate()));
                }
            }
        });

        JLabel l5 = new JLabel("Date (To)");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(235,200,150,30);
        l5.setForeground(Color.pink);
        l3.add(l5);

        t2 = new JTextField();
        t2.setBounds(220,240,150,30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        l3.add(t2);
        JDateChooser dateChooser1 = new JDateChooser();
        dateChooser1.setBounds(220,280,150,30);
        l3.add(dateChooser1);

        dateChooser1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("date")) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    t2.setText(format.format(dateChooser.getDate()));
                }
            }
        });

        JLabel l6 = new JLabel("Time (From)");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(405,200,150,30);
        l6.setForeground(Color.PINK);
        l3.add(l6);

        t3 = new JTextField();
        t3.setBounds(390,240,150,30);
        t3.setBorder(BorderFactory.createEmptyBorder());
        l3.add(t3);
        TimePicker timePicker = new TimePicker();
        timePicker.setBounds(390,280,150,30);
        l3.add(timePicker);

        timePicker.addTimeChangeListener(new TimeChangeListener() {
            @Override
            public void timeChanged(TimeChangeEvent event) {
                t3.setText(event.getNewTime().toString());
            }
        });

        JLabel l7 = new JLabel("Time (To)");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(575,200,150,30);
        l7.setForeground(Color.PINK);
        l3.add(l7);

        t4 = new JTextField();
        t4.setBounds(560,240,150,30);
        t4.setBorder(BorderFactory.createEmptyBorder());
        l3.add(t4);
        TimePicker timePicker1 = new TimePicker();
        timePicker1.setBounds(560,280,150,30);
        l3.add(timePicker1);

        timePicker1.addTimeChangeListener(new TimeChangeListener() {
            @Override
            public void timeChanged(TimeChangeEvent event) {
                t4.setText(event.getNewTime().toString());
            }
        });

        JLabel l8 = new JLabel("Select the facilities you want to have...");
        l8.setFont(new Font("Raleway",Font.BOLD,30));
        l8.setBounds(50,310,550,45);
        l8.setForeground(Color.cyan);
        l3.add(l8);

        c3 = new JCheckBox("Mosquito Repellent");
        c3.setBackground(Color.WHITE);
        c3.setBounds(50,360,200,30);
        l3.add(c3);

        c4 = new JCheckBox("Dusting");
        c4.setBackground(Color.WHITE);
        c4.setBounds(50,390,200,30);
        l3.add(c4);

        c5 = new JCheckBox("Web Cleaning");
        c5.setBackground(Color.WHITE);
        c5.setBounds(50,420,200,30);
        l3.add(c5);

        c6 = new JCheckBox("Sweeping");
        c6.setBackground(Color.WHITE);
        c6.setBounds(50,450,200,30);
        l3.add(c6);

        JLabel l9 = new JLabel("Bennett ID");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(70,550,150,30);
        l9.setForeground(Color.PINK);
        l3.add(l9);

        t5 = new JTextField();
        t5.setBounds(50,600,150,30);
        t5.setBorder(BorderFactory.createEmptyBorder());
        l3.add(t5);

        JLabel l10 = new JLabel("Room No.");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(240,550,150,30);
        l10.setForeground(Color.PINK);
        l3.add(l10);

        t6 = new JTextField();
        t6.setBounds(220,600,150,30);
        t6.setBorder(BorderFactory.createEmptyBorder());
        l3.add(t6);

        b1 = new JButton("SUBMIT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(70,680,150,30);
        b1.addActionListener(this);
        l3.add(b1);
        JButton backButton = new JButton("BACK");
        backButton.setBounds(1170, 650, 150, 50);
        l3.add(backButton);

// Add an ActionListener to handle button clicks
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the Admin window and close the current window
                new RaiseTicketFac().setVisible(true);
                setVisible(false);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String dateFrom = t1.getText();
            String dateTo = t2.getText();
            String timeFrom = t3.getText();
            String timeTo = t4.getText();
            String enroll = t5.getText();
            String room = t6.getText();

            if(c3.isSelected()){
                services = services + "Mosquito Repellent, ";
            }
            if(c4.isSelected()){
                services = services + "Dusting, ";
            }
            if(c5.isSelected()){
                services = services + "Web Cleaning, ";
            }
            if(c6.isSelected()){
                services = services + "Sweeping";
            }

            conn c = new conn();
            try{
                String str = "insert into ticketfac values('"+enroll+"','"+dateFrom+"','"+dateTo+"','"+timeFrom+"','"+timeTo+"','"+room+"','"+services+"')";
                c.s.executeUpdate(str);

                services = "";
                JOptionPane.showMessageDialog(null,"Your Ticket Has Been Raised Successfully!!!");


            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        new RoomCleaningServicesFac().setVisible(true);
    }
}
class conn{
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///tickets","root","root");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}