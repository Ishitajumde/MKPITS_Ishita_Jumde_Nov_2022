/* multiplication of elements of two matrix in 2D array. */

class Pg15
{
  public static void main(String [] args)
  {
    int a[][] = {{5,9,7},{10,15,8}};

    int b[][] = {{3,9,12},{3,5,4}};

    int multi[][] = new int[3][3];

    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[0].length;j++)
      {
        multi[i][j] = a[i][j]*b[i][j];
      }
    }
    for(int i=0;i<a.length;i++)
        {
          for(int j=0;j<a[0].length;j++)
          {
            System.out.print(multi[i][j]+" ");
          }
          System.out.println(" ");
    }
  }
}