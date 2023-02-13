import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class switchdb {
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","i123");
            System.out.println("driver connected sucessfully");
            Statement st= con.createStatement();

            Scanner val=new Scanner(System.in);
            System.out.println("enter the case 1:INSERT 2:UPDATE 3:DELETE");
            int demo=val.nextInt();

            switch (demo){
                case 1:
                    System.out.println("Enter Roll no");
                    int rn= val.nextInt();
                    System.out.println("Enter Student name");
                    String n1= val.next();
                    System.out.println("Enter Courses");
                    String n2= val.next();

                    int r1= st.executeUpdate("INSERT INTO studinfo values ("+rn+",'"+n1+"','"+n2+"')");
                    System.out.println("The detail are inserted in record");
                    break;
                case 2:
                    System.out.println("Enter roll no to change");
                    int crn= val.nextInt();
                    System.out.println("Enter Roll no");
                    int rn1= val.nextInt();
                    System.out.println("Enter Student name");
                    String n3= val.next();
                    System.out.println("Enter Courses");
                    String n4= val.next();

                    int r2= st.executeUpdate("UPDATE studinfo SET Rollno="+rn1+" ,StudName='"+n3+"',Course='"+n4+"' WHERE Rollno="+crn+"");
                    System.out.println("The detail is updated in record");
                    break;
               case 3:
                    System.out.println("Enter roll no to delete");
                    int crn1= val.nextInt();

                    int r3= st.executeUpdate("DELETE FROM studinfo WHERE Rollno="+crn1+" ");
                    System.out.println(" deleted unnecessary record");

                    break;

                default:
                    System.out.println("Your missing some where");
                    break;
            }



        }catch (Exception e){

            System.out.println(e);

        }
    }
}
