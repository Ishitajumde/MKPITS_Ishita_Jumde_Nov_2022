import java.util.Scanner;

class pg3{
  public static void main(String[]args)
  {
  int a[][]=new int[3][3];
  Scanner val=new Scanner (System.in);
  System.out.println("Enter the value of matrix");
  for(int i=0;i<3;i++)
  {
      for(int j=0;j<3;j++)
      {
            a[i][j]=val.nextInt();
      }
  }
  System.out.println("The matrix is");
  for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
          System.out.print(a[i][j]+"  ");
        }
    System.out.print("\n");
  }
  }
}