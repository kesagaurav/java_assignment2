package choiceinjava;

import java.util.Scanner;

public class Choice {
	
	public void  add() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a no");
		a=sc.nextInt();
		System.out.println("\n enter b no");
		b=sc.nextInt();
		c=a+b;
		System.out.println("\n the c is " + c);
	}
	 public void sub() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a no");
		a=sc.nextInt();
		System.out.println("\n enter b no");
		b=sc.nextInt();
		c=a-b;
		System.out.println("\n the c is " + c);
	}
	 public void mul()  {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a no");
		a=sc.nextInt();
		System.out.println("\n enter b no");
		b=sc.nextInt();
		c=a*b;
		System.out.println("\n the c is " + c);
	}
	 public void div() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a no");
		a=sc.nextInt();
		System.out.println("\n enter b no");
		b=sc.nextInt();
		c=a/b;
		System.out.println("\n the c is " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n 0.exit");
		System.out.println("\n 1.add");
		System.out.println("\n 2.sub");
		System.out.println("\n 3.mul");
		System.out.println("\n 4.div");
		System.out.println("\n enter UR choice");
		ch=sc.nextInt();
		Choice ch1=new Choice();
		while(ch!=0)
		{
			if(ch==1)
				ch1.add();
			else if(ch==2)
				ch1.sub();
			else if(ch==3)
				ch1.mul();
			else if(ch==4)
				ch1.div();
			System.out.println("\n enter UR choice");
			ch=sc.nextInt();
			
		}
	
}

}
