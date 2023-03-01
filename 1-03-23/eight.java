import java.util.Arrays;
class eight{
public static void main(String[]args)
{
 int a[]={12,5,3,8};
 int b[]={5,1,20};
 int len1=a.length;
 int len2=b.length;
 int c=len1+len2;
 int merg[]=new int[c];
 //int j,count=0;
System.out.println("The firt array");
Arrays.sort(a);
 for(int i=0;i<a.length;i++)
 {

     System.out.println(a[i]);
 }

 System.out.println("The second array");
 Arrays.sort(b);
	 for(int j=0;j<b.length;j++)
      {

	System.out.println(b[j]);
      }

for(int i=0;i<len1;i++)
 {
     merg[i]=a[i];
 }
for(int j=0;j<len2;j++)
 {
     merg[len1+j]=b[j];
 }
 System.out.println("Merge array is");
 Arrays.sort(merg);
 for(int i=0;i<merg.length;i++)
  {
    System.out.println(merg[i]);
 }
}
}