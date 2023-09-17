package constructor.refrence;

public class Main {
    public static void main(String[] args) {
        //used for parametrized constructor
//          InfoStudent infoStudent =Student::new;
//        Student student=infoStudent.getDetail("pavan", "100");
//        System.out.println(student.getName());
//        System.out.println(student.getMarks());

        //use for default constructor
        InfoStudent infoStudent =Student::new;
          Student student=infoStudent.getDetail();
          student.setName("ishita");
          student.setMarks("50");

        System.out.println(student.getName());
        System.out.println(student.getMarks());
    }
}
