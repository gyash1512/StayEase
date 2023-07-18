import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DeleteRecordStud extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;

    DeleteRecordStud(){
        super("Delete Record");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        JLabel logo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("bennlogo.png")));
        logo.setBounds(480, 30, 400, 136);
        add(logo);

        JLabel title = new JLabel("DELETE RECORD");
        title.setFont(new Font("Raleway", Font.BOLD, 60));
        title.setForeground(Color.YELLOW);
        title.setBounds(450, 200, 650, 90);
        add(title);

        // Set the layout
        setLayout(null);
        l1 = new JLabel("Enrollment No.");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(550,370,150,30);
        l1.setForeground(Color.BLACK);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(700,370,150,30);
        add(t1);

        l2 = new JLabel("Room No.");
        l2.setBounds(550,445,150,30);
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(700,445,150,30);
        add(t2);

        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(575,525,100,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(725,525,100,30);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("delrec.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1380, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l3 = new JLabel(i3);
        l3.setBounds(-10, -10, 1380, 850);
        add(l3);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(500,200,1000,500);
        JButton backButton = new JButton("BACK");
        backButton.setBounds(1170, 650, 150, 50);
        l3.add(backButton);

// Add an ActionListener to handle button clicks
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the Admin window and close the current window
                new RaiseTicketStud().setVisible(true);
                setVisible(false);
            }
        });
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String enrollment = t1.getText();
            String room = t2.getText();
            conn c = new conn();


            try{
                String str = "delete from ticketstu where EnrollmentNumber = '"+enrollment+"' AND RoomNo = '"+room+"'";
                c.s.executeUpdate(str);

                JOptionPane.showMessageDialog(null,"Successfully Deleted");

            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource()==b2){
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new DeleteRecordStud().setVisible(true);;
    }
}

