import java.util.Scanner;
class prg13_1feb{
public static void main(String[]args)
{
   int math,phy,chem,sum=0,sub=0;
   Scanner val = new Scanner(System.in);
   System.out.println("enter the marks of three subject");
   math=val.nextInt();
   phy=val.nextInt();
   chem=val.nextInt();

   if(math>65 && math==65)
   {
       System.out.println("marks"+math);
   }
       if(phy>55 && phy==55)
        {
            System.out.println("marks"+phy);
        }
             if(chem>50 && chem==50)
              {
                 System.out.println("marks"+chem);
               }
                   sum=phy+math+chem;
                   sub=phy+chem;
                   if(sum>180 && sum==180 || math>140 && math==140 && sub>140 && sub==140)
                   {
                        System.out.println(" eligible for admission in professional course");
                   }
                   else{
                     System.out.println(" not eligible for admission in professional course");
                   }
}
}