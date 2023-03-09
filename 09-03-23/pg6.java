import java.util.Scanner;
class pg6{
public static void main(String[]args)
{
   Scanner val=new Scanner(System.in);
   System.out.println("enter the length");
   int len=val.nextInt();
   int arr[]=new int[len];
   int arr2[]=new int[arr.length];
   int count=0;
   for(int i=0;i<len;i++)
   {
      arr[i]=val.nextInt();
   }
   for(int i=0;i<len;i++)
      {
          if(arr[i]==0)
          {
               arr2[count]=arr[i];
               count++;
          }
      }
    for(int i=0;i<len;i++)
          {
              if(arr[i]!=0)
              {
                   arr2[count]=arr[i];
                   count++;
             }
      }
      for(int i=0;i<count;i++)
      {
	     System.out.print(arr2[i]+" ");
      }
}
}




