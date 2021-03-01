import java.util.Scanner;

public class Dll {

	static class Node
	{
		
		int data;
		Node prev;
		Node next;
	
	
	
	public  Node(int data)
	{
		this.data=data;
	}
	
	}
	
	static Node head=null;
	static Node tail=null;
	
	
	public static   void add(int data)
	{
		Node newnode= new Node(data);
		
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	
	public static   void display()
	{
		  Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	}
	        System.out.println("Nodes of doubly linked list: ");  
	        while(current != null) {  
	            //Prints each node by incrementing the pointer.  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }
	}       
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dll dl=new Dll();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.display();
//		
//		int ch;
//		System.out.println("\n 0.exit");
//		System.out.println("\n 1.add");
//		System.out.println("\n 2.display");
//		Scanner sc=new Scanner(System.in);
//		ch=sc.nextInt();
//		while(ch!=0)
//		{
//			if(ch==1)
//				add();
//			else if(ch==2)
//				display();
//		}
		
		
		
		
	}

}
