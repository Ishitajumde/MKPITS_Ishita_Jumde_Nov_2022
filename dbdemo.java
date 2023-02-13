import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class dbdemo {
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","i123");
            System.out.println("driver connected sucessfully");
            Statement st= con.createStatement();
            Scanner val=new Scanner(System.in);
            System.out.println("Enter roll no to change");
            int crn= val.nextInt();
            System.out.println("Enter Roll no");
            int rn= val.nextInt();
            System.out.println("Enter Student name");
            String n1= val.next();
            System.out.println("Enter Courses");
            String n2= val.next();
            int r1= st.executeUpdate("INSERT INTO studinfo values ("+rn+",'"+n1+"','"+n2+"')");
           int r2= st.executeUpdate("UPDATE studinfo SET Rollno="+rn+" ,StudName='"+n1+"',Course='"+n2+"' WHERE Rollno="+crn+"");
            int r3= st.executeUpdate("DELETE FROM studinfo WHERE Rollno="+crn+" ");
        }catch (Exception e){

        }
    }
}
