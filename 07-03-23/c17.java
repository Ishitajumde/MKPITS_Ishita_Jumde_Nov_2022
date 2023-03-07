 class employee{

 void emp()
 {
    System.out.println("employee of company");
 }
 }
 class manager extends employee
 {

    void man()
    {

        System.out.println("i am a manager");
    }



 }
 class devloper extends manager
 {

    void dev()
    {
        System.out.println("i am a devloper");
    }
 }
 class c17{
 public static void main(String[]args)
 {
   devloper ob=new devloper();
     ob.emp();
      ob.man();
       ob.dev();


     }
 }
