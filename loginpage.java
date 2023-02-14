import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginpage {
    private JTextField tf1;
    private JTextField textField2;
    private JButton LOGINButton;
    private JPanel main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("loginpage");
        frame.setContentPane(new loginpage().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
     Connection con;
       void connect(){
           try{
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println("driver loaded sucessfully");
               con= DriverManager.getConnection("jdbc:mysql://localhost:3306/logdb","root","i123");
               System.out.println("driver connected sucessfully");

       }catch(Exception e){
           }
       }
    public loginpage() {
         connect();
    LOGINButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("run sucessfully");
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery();
            }catch(Exception ex){

            }
        }
    });
}
}
