/*Copy Array in Java*/
class ten{
public static void main(String[]args){
  int org[]={5,9,1,3,4};
  int len=org.length;
  int cpy[]=new int[len];
       System.out.println("orignal array");
  for(int i=0;i<org.length;i++)
    	     {

    	        System.out.println(org[i]);
             }
             System.out.println("copy of array");
  for(int i=0;i<org.length;i++)
  	     {
  	        cpy[i]=org[i];
  	        System.out.println(cpy[i]);
             }

}
}