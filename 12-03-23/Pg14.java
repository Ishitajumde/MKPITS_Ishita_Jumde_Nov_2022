/* substract of elements of two matrix in 2D array. */

class Pg14
{
  public static void main(String [] args)
  {
    int a[][] = {{6,5,8},{6,5,2}};

    int b[][] = {{2,3,5},{4,7,9}};

    int sub[][] = new int[3][3];

    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[0].length;j++)
      {
        sub[i][j] = a[i][j]-b[i][j];
      }
    }
    for(int i=0;i<a.length;i++)
        {
          for(int j=0;j<a[0].length;j++)
          {
            System.out.print(sub[i][j]+" ");
          }
          System.out.println(" ");
    }
  }
}