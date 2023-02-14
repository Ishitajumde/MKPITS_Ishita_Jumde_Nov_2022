class prg_4jan23{
  public static void main(String[]args)
  {
      int a[]={1,3,5,7};
       int temp;
      temp=a[0];
      a[0]=a[3];
      a[3]=temp;

      for(int i=0;i<a.length;i++)
      {
          System.out.print(" "+a[i]);
      }
  }
}