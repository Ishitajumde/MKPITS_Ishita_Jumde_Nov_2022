import java.util.Arrays;
class ten{
public static void main(String[]args)
{
 int a[]={56,78,23,1};
 int largest=a[0];
Arrays.sort(a);
 for(int i=0;i<a.length;i++)
 {
    if(a[i]>largest)
    {
        largest=a[i];
    }

 }
 System.out.println("largest num is= "+largest);

 }
 }