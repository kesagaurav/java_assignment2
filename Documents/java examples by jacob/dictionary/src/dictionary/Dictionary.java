package dictionary;

public class Dictionary {
		int buckets;
		Node[] ht;
		public Dictionary(int s) {
		// TODO Auto-generated constructor stub
		buckets=s;
		ht=new Node[buckets];
	}
	}
	 public class Node
	{
		int data;
		Node next;
	
	
	
	 public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
