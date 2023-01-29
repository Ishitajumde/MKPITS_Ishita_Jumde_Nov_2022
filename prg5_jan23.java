class prg5_jan23{
  public static void main(String[]args)
  {
      int a1[]={1,2,3,4,5};
     int a2[]={a1[3],a1[4],a1[5]};
     int a3=a2.length;
     System.out.println(a3);
      for(int i=0;i<a3;i++)
      {
         System.out.print(" "+a2[i]);
      }

  }
}