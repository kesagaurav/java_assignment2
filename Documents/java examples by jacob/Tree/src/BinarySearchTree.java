import java.util.Scanner;

public class BinarySearchTree {

	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	
	public static Node root;
	public Node news;
	public Node temp;
	
public BinarySearchTree() {
	root=null;
}
	
	
	 void insert() {
		int data;
		// news =new Node(data);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("\n enter data");
		 data=sc.nextInt();
		 news =new Node(data);
		 news.left=null;
		 news.data=data;
		 news.right=null;
		if(root==null) {
			root=news;
			
		}else {
			root=insert_node(root,news);
			
		}
	
		
	}
	
public Node  insert_node(Node root,Node news) {
		if(news.data<root.data) {
			if(root.left==null) {
				root.left=news;
			}else {
				 insert_node(root.left,news);
			}
		}
			
			if(news.data>root.data) {
				if(root.right==null) {
					root.right=news;
				}else {
					insert_node(root.right,news);
				}
			}
		
		//return news;
		return root;
	
	}


		public Node find_min(Node root) {
			if(root.left!=null) {
				return find_min(root.left);
			}else {
				return root;
			}
		}


		
		public void delete() {
			int value;
			System.out.println("\n enter the value for the deletion");
			Scanner sc=new Scanner(System.in);
			value=sc.nextInt();
			root=delete(root,value);
		}
		
	
		public Node delete(Node root,int value) {
			if(root==null)
				return root;
			else if(value<root.data) 
				root.left=delete(root.left,value);
			else if(value>root.data) 
				root.right=delete(root.right,value);
			
			
			else {
				if(root.left==null && root.right==null) {
					root=null;
				}
				
				else if(root.left==null) {
					temp=root;
					root=root.right;
					temp=null;
				}
				
				else if(root.right==null) {
					temp=root;
					root=root.left;
					temp=null;
				}
				else {
					temp=find_min(root.right);
					root.data=temp.data;
					root.right=delete(root.right,temp.data);
				}
			}
			return root;
			
		}
		
		
		public boolean search() {
			int key;
			System.out.println("\n enter the value for searching a key");
			Scanner sc=new Scanner(System.in);
			key=sc.nextInt();
			root=Search(root,key);
			if(root!=null) {
				return true;
			}else {
				return false;
			}
		
		}
		
		
		public Node Search(Node root,int key) {
			if(root==null) {
				return root;
			}else if(key==root.data) {
				return root;
			}else if(key<root.data) {
				Search(root.left,key);
			}else if(key>root.data) {
				Search(root.right,key);
			}
			return root;
		}
		
		
		
		
		
		
		
		
	public void inorderTransversal(Node node) {
		  if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTransversal(node.left);  
              System.out.println(node.data + " ");  
              if(node.right!= null)  
                  inorderTransversal(node.right);  
  
          }  
      }  
	
	
	
	
	
	
	
	public static void main(String[] args) {

		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n 0.exit");
		System.out.println("\n 1.insert");
		System.out.println("\n 2.delete");
		System.out.println("\n 3.search");
		System.out.println("\n 4.inorder");
		BinarySearchTree bt=new BinarySearchTree();
		System.out.println("\n enter Ur choice");
		ch=sc.nextInt();
		while(ch!=0) {
			if(ch==1) {
				bt.insert();
			}
			
			else if(ch==2) {
				bt.delete();
				  System.out.println("\nBinary search tree after deleting node :");  
			        bt.inorderTransversal(bt.root);  
			}
			
			else if(ch==3) {
				//bt.search();
				boolean ret_value=bt.search();
				System.out.println("\n the element is found at:" + ret_value);
				bt.inorderTransversal(bt.root);
			}
			
			
			else if(ch==4) {
				bt.inorderTransversal(root);
			}
			
			System.out.println("\n enter Ur choice");
			ch=sc.nextInt();
			
		}
		
		
		
		//
		
//		bt.create(1);
//		bt.create(2);
//		bt.create(3);
//		bt.create(4);
		
//		
//		bt.insert(1);
//		bt.insert(2);
//		bt.insert(3);
//		bt.insert(4);
//
//		bt.insert(5);
//		bt.insert(6);
//		bt.insert(7);
//		bt.insert(8);
		
//		bt.insert(9);
//		bt.insert(10);
//		bt.insert(11);
//		bt.insert(12
//				);
		
		
		
		
		System.out.println("after the values");
		bt.inorderTransversal(bt.root);
		
		

//        Node deletedNode = null;  
//        //Deletes node 90 which has no child  
//        deletedNode = bt.delete(bt.root, 90);  
//      1
		
	}

}
