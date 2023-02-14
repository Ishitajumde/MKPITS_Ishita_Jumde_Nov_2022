<<<<<<< HEAD
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class stud_form {
    private JTextField t2;
    private JTextField t3;
    private JButton insert;
    private JButton UPDATEButton;
    private JButton DELETEButton;
    private JButton SHOWButton;
    private JTextField t1;
    private JPanel mainpannel;
    Connection con;
    void joda()

    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded sucessfully");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "i123");
            System.out.println("driver connected sucessfully");
            Statement st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("stud_form");
        frame.setContentPane(new stud_form().mainpannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public stud_form() {
        joda();
    insert.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         int n1=Integer.parseInt(t1.getText());
         String unam= t2.getText();
         String upass= t3.getText();
            try {
                Statement st=con.createStatement();
                int r1= st.executeUpdate("INSERT INTO studinfo values ("+n1+",'"+unam+"','"+upass+"')");
            } catch (Exception ex) {
            }
         JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"insert data");
        }
    });
}
}
=======
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class stud_form {
    private JTextField t2;
    private JTextField t3;
    private JButton insert;
    private JButton UPDATEButton;
    private JButton DELETEButton;
    private JButton SHOWButton;
    private JTextField t1;
    private JPanel mainpannel;
    Connection con;
    void joda()

    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded sucessfully");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "i123");
            System.out.println("driver connected sucessfully");
            Statement st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("stud_form");
        frame.setContentPane(new stud_form().mainpannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public stud_form() {
        joda();
    insert.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         int n1=Integer.parseInt(t1.getText());
         String unam= t2.getText();
         String upass= t3.getText();
            try {
                Statement st=con.createStatement();
                int r1= st.executeUpdate("INSERT INTO studinfo values ("+n1+",'"+unam+"','"+upass+"')");
            } catch (Exception ex) {
            }
         JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"insert data");
        }
    });
        
        UPDATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(t1.getText());
                String unam= t2.getText();
                String upass= t3.getText();
                try {
                    Statement st=con.createStatement();
                    int r2= st.executeUpdate("UPDATE studinfo SET StudName='"+unam+"',Course='"+upass+"' WHERE Rollno="+id+"");
                } catch (Exception e1) {
                    System.out.println(e1);
                }
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"update data");
            }
        });
    }
}
>>>>>>> 7e4c3ec2aebdbe430c072f5d73440350a6cbca44
