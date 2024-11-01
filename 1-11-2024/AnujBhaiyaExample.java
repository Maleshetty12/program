
//insert and delete operation on linked list//reverse

class AnujBhaiyaExample
{
    Node head; 
   class Node{            //create a node class
     int data;
     Node next;
     Node(int data)
{
   this.data=data;
   this.next=null;
   
}
}
public void add()
{
    Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null; 
}

    public void printList()
	{
		
		if(head==null)
		{
			System.out.println("list is empty:");	
			return;
		}
		Node currnode=head;
		while(currnode!=null)
		{
			System.out.print(currnode.data+"->");
			 currnode=currnode.next;
		}
		System.out.println("null");

		
	}
	public static void main(String ar[])
	{
        AnujBhaiyaExample x=new AnujBhaiyaExample();
        x.add();
        x.printList();
      

    }
}