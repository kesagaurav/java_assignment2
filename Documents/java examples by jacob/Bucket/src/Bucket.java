import java.util.Scanner;

public  class Bucket {

	int buckets;
	Node ht[];
	class Node{
		int data;
		Node next;
	
	
	
	
	}
	
	 class dictionary{
		
		
		public dictionary(int s)
		{
			buckets=s;
			ht=new Node[buckets];
		
		for(int i=0;i<s;i++)
		{
			ht[i].data=0;
		}
		
	}
//	abstract int hashfunc(int x);
//	abstract void init();
//	abstract void insert();
//	abstract void display();
	}
	
		
	public int hashfunc(int x)
	{
		int i=x%5;
		return i;
	}
	
	public void init()
	  {
		 
		for(int i=0;i<buckets;i++) {
			  ht[i].data=0;
			  ht[i].next=null;
		  }
	  }

	 public  void insert(int x) 
	 {
		 int i=hashfunc(x);
		 Node newnode,last;
		 newnode=new Node();
		 newnode.data=x;
		 newnode.next=null;
		 if(ht[i].data==0)
		 {
			 ht[i].data=0;
			 ht[i].next=newnode;
		 }
		 else
		 {
			 last=ht[i].next;
			 while(last.next.data!=0)
			 {
				 last=last.next;
			 }
			 last.next=newnode;
		 }
		 
	 }
		
	 
	 public void display()
	 {
		 Node temp,last;
		 for(int i=0;i<buckets;i++)
		 {
			 temp=ht[i].next;
			 while(temp.data!=0)
			 {
				 System.out.println("\n" + temp.data);
				 temp=temp.next;
			 }
		 }
	 }
		 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//dictionary(5);
		int n;
		int x=1;
		
		while(x!=0)
		{
			System.out.println("\n 0.exit");
			System.out.println("\n 1.insert");
			System.out.println("\n 2.display");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
		
		switch(n)
		{
		case 1 :
			System.out.println("\n enter element to be inserted");
			x=sc.nextInt();
			Bucket s = null;
			s.insert(x);
		case 2:
			Bucket s1=null;
			s1.display();
		
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

//	private static void dictionary(int i) {
//		// TODO Auto-generated method stub
//		
//	}

}
