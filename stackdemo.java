public class stackdemo{
int arr[];

int topofstack;
//////  create constructor
stackdemo(int size){
arr=new int[size];
topofstack=-1;
System.out.println("Stack created with size ="+size);
}
/////////// isempty function to check stack is empty or not
public boolean isempty(){
  if(topofstack==-1){

    System.out.println("it is empty");
    return true;
  }
  else{

    System.out.println("it is not empty");
    return false;
  }
}
/////////////// isfull function to check stack is full or not
public boolean isfull(){
    if(topofstack ==arr.length-1){
        return true;
    }
    else{
        return false;
    }
}
/////////////// push function is used to insert value
 public void push(int value){
    if(isfull()){
       System.out.println("Stack is full");
       return;
    }
    else{
       arr[topofstack+1]=value;
       topofstack++;
       System.out.println("the value inserted is " +value);
    }
 }
 /////////////// pop function is used to delete value
 public int pop(){
	   if(isempty()){
		      System.out.println("stack is empty");
		      return -1;
		   }else{
			    int topstack=arr[topofstack];
			    topofstack--;
			    System.out.println("the deleted value is "+topstack);
			    return topstack;
			    }
	 }
	/////////// peek function show topmost value of the stack
	  public int peek(){
	 	   if(isempty()){
	 		      System.out.println("stack is empty");
	 		      return -1;
		   }else{
			   System.out.println(arr[topofstack]);
			   return arr[topofstack];
			   }
}
///////////// delete function delete all over data
    public void delete()
    {
		arr=null;
		System.out.println("Stack deleted successfully");
		}
 public static void main(String[]args)
 {
    stackdemo ob=new stackdemo(4);
    ob.isempty();
    ob.push(32);
    ob.push(12);
    ob.push(34);
    ob.push(10);
    System.out.println(ob.pop());
    ob.peek();
    ob.delete();


 }
}