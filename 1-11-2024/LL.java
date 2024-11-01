//insert and delete operation on linked list//reverse
class LL
{
    Node head;
	private int size=0;
	class Node{             //create a node class
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
			size++;
		}
	}

	// add first
	public void addFirst(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		
		newnode.next=head;
	

	}


	//add last
	public void addlast(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node currnode=head;
		while(currnode.next!=null)
		{
			currnode=currnode.next;
		}
		currnode.next=newnode;
		
	}


	//delete first
	public void deletefirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		head=head.next;
	}


	//delete last
	public void deletelast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.next==null)
		{
			head=null;
			return;
		}
		Node secondlast=head;
		Node lastnode =head.next;
		if(lastnode.next!=null)
		{
			lastnode=lastnode.next;
			secondlast=secondlast.next;	
		}
		secondlast.next=null;
	}


	//reverse a linked list
	public void reverseIterate()
	{
		if(head==null || head.next==null)
		{
			return;
		}
		Node prevnode=head;
		Node currnode=head.next;
		while(currnode!=null)
		{
			Node nextnode=currnode.next;
			currnode.next=prevnode;

			//update
			prevnode=currnode;
			currnode=nextnode;
		
	    } 
		head.next=null;
		head=prevnode;
	}

	//print linked list
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
	public int getsize(){
		return size;
	}
	public static void main(String arg[])
	{
		LL list=new LL();
		list.addFirst(1223);
		//list.addFirst("kode");
		list.printList();
		list.addlast(566);
		list.addlast(66);
		list.printList();
		//list.deletefirst();

		//list.printList();
		//list.deletelast();
		list.printList();
		//System.out.println(list.getsize());
		list.reverseIterate();
		list.printList();
	
		

		

	}

}