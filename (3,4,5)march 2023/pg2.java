/* Write a C program to compute the sum of the two given arrays of integers, length 3 and
find the array which has the largest sum.*/
import java.util.Scanner;
class pg2{
public static void main(String[]args){

int sum1=0;
int sum2=0;
Scanner val= new Scanner(System.in);
System.out.println("enter the length of an array");
int len1=val.nextInt();


int arr1[]=new int[len1];
int arr2[]=new int[len1];
System.out.println("enter the element of an arr1");
for(int i=0;i<arr1.length;i++)
{
    arr1[i]=val.nextInt();
   sum1=sum1+arr1[i];
}

System.out.println("enter the element of an arr2");
for(int i=0;i<arr2.length;i++)
{
   arr2[i]=val.nextInt();
   sum2=sum2+arr2[i];
}
if(sum1>sum2 )
{
	System.out.println("sum1 is greater");
	}
	else{
		    System.out.println("sum2 is greater");
		}
}
}
