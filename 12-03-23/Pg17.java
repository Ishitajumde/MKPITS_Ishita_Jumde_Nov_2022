/* Mod of elements of two matrix in 2D array. */

class Pg17
{
  public static void main(String [] args)
  {
    int a[][] = {{10,16,19},{4,12,15}};

    int b[][] = {{5,3,6},{1,3,7}};

    int mod[][] = new int[3][3];

    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[0].length;j++)
      {
        mod[i][j] = a[i][j]%b[i][j];
      }
    }
    for(int i=0;i<a.length;i++)
        {
          for(int j=0;j<a[0].length;j++)
          {
            System.out.print(mod[i][j]+" ");
          }
          System.out.println(" ");
    }
  }
}