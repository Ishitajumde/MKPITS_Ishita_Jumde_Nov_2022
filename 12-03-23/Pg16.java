/* Division of elements of two matrix in 2D array. */

class Pg16
{
  public static void main(String [] args)
  {
    int a[][] = {{10,16,19},{4,12,15}};

    int b[][] = {{5,2,6},{1,3,5}};

    int div[][] = new int[3][3];

    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[0].length;j++)
      {
        div[i][j] = a[i][j]/b[i][j];
      }
    }
    for(int i=0;i<a.length;i++)
        {
          for(int j=0;j<a[0].length;j++)
          {
            System.out.print(div[i][j]+" ");
          }
          System.out.println(" ");
    }
  }
}