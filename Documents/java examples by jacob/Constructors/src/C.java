
public class C {
	
	private int acount_number;
	private double balance;
	private String email;
	private String customer;
	private String phonenumber;
	
	
	public void depositfunds(double balance) {
		this.balance=balance;
		if(balance!=0) {
			balance++;
		}else {
			System.out.println("\n deposit is full");
		}
	}
	
	
	
	public void withdrawAmount(double balace) {
		this.balance=balance;
		if(balance!=0) {
			balance--;
		}else {
			System.out.println("\n withdrawl is done");
		}
	}
	
	
	
	
	
	
	
	
	

	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		C obj=new C();
		obj.depositfunds(90.00);
		System.out.println(obj);
	//System.out.println(obj.withdrawAmount(0)  +  "" + "\n=" + obj.getBalance());
	

	}

}
