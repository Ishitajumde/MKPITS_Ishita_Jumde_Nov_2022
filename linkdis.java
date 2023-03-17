class Node{
     int value;
     Node next;
}
public class linkdis{
Node head;
Node tail;
int size;
///////////create node
public void createSll(int nodeValue){
   Node newNode=new Node();
   newNode.value=nodeValue;
   newNode.next=null;
   head=newNode;
   tail=newNode;
   size=1;
}
/////////////insert node
public void insertSll(int nodeValue){
   Node newNode=new Node();
   newNode.value=nodeValue;
   newNode.next=null;
   tail.next=newNode;
   tail=newNode;
   size++;
   }
/////////////travarsal
   public void travarsal(){
      Node tempNode=head;
      for(int i=0;i<size;i++){
          System.out.print(tempNode.value);
          if(i!=size -1){
           System.out.print(" -> ");
          }
          tempNode=tempNode.next;
          }
          System.out.println("\n");
      }
  ///////////////search
     boolean searchnode(int nodeValue)
     {
		 if(head!=null)
		 {
			Node tempnode=head;
			for(int i=0;i<size;i++)
			{
				if(tempnode.value==nodeValue)
				{
					System.out.println("it is found at position "+i);
					return true;
					}
					tempnode=tempnode.next;
				}
				}
				System.out.println("it is not found");
				return false;
		 }
   ///////////delete
   public void delete(int location)
   {
	   if(head==null)
	    {
		   System.out.println("the sll is deleted ");
		}
		else if(location==0)
		{
			head= head.next;
			size--;

			if(size==0)
			{
				tail=null;
				}
			}
			else if(location>=size){
				Node tempnode=head;
				for(int i=0;i<size;i++)
				{
					tempnode=tempnode.next;
					}

					if(tempnode==head)
					{
						tail=head=null;
						size--;
						return;
						}
				tempnode.next=null;
			    tail=tempnode;
			    size--;
				}
				else{
					Node tempnode=head;
					for(int i=0;i<location-1;i++)
					{
						tempnode=tempnode.next;
						}
						tempnode.next=tempnode.next.next;
						size--;
					}
	   }
    public static void main(String[]args){
		///////object create of main class
      linkdis ob=new linkdis();
      ob.createSll(2);
      ///////insert value
      ob.insertSll(12);
      ob.insertSll(22);
      ob.insertSll(32);
      //////check each node
      ob.travarsal();
      //////search element
      ob.searchnode(22);
      //////////delete element
      ob.delete(2);
      ob.travarsal();
      }
   }
