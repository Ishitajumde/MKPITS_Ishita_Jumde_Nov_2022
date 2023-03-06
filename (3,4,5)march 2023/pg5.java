import java.util.Scanner;

class pg5{
  public static void main(String[]args)
  {
  int a[][]=new int[2][2];
  int b[][]=new int[2][2];
  int sub[][]=new int[2][2];
  Scanner val=new Scanner (System.in);
  System.out.println("Enter the value of matrix1");
  for(int i=0;i<2;i++)
  {
      for(int j=0;j<2;j++)
      {
            a[i][j]=val.nextInt();
      }
  }
  System.out.println("Enter the value of matrix2");
  for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
         b[i][j]=val.nextInt();
        }
    }

    System.out.println(" matrix1 ");
	      for(int i=0;i<2;i++)
	        {
	            for(int j=0;j<2;j++)
	            {
	               System.out.print(a[i][j]+"  ");
	            }
	        System.out.println("\n");
    }
    System.out.println(" matrix2 ");
      for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               System.out.print(b[i][j]+"  ");
            }
        System.out.println("\n");
    }

    System.out.println("Subtraction of two matrix");
		      for(int i=0;i<2;i++)
		        {
		            for(int j=0;j<2;j++)
		            {
		             sub[i][j]=a[i][j]-b[i][j];
		             System.out.print(sub[i][j]+"  ");
		            }
		        System.out.println("\n");
    }

  }
}