
public class SingleLinkedList {

	class Node{
		int data;
		Node next;
		

		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	
	public void insertAtBeg(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;	
		}
		
	}
	
	
	public void delete(int data) {
		
	}
	
	
	
	
	
	
	
	
	
	public void display()
	{
		Node temp=head;

        System.out.println("Nodes of singly linked list: ");   
		while(temp!=null)
		{
			System.out.println(temp.data + "");
			temp=temp.next;
		}
			System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedList sll=new SingleLinkedList();
		
		
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(3);
		sll.addNode(4);
		
		sll.insertAtBeg(3);
		sll.insertAtBeg(2);
		sll.insertAtBeg(1);
		
		
		sll.display();
		
		
	}

}
