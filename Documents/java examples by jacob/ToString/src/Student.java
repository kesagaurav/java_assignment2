
public class Student {

	private String name;
	private int rollno;
	private String city;
	private float amount;
	private double money;
	
	public Student(String name, int rollno, String city, float amount, double money) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
		this.amount = amount;
		this.money = money;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", city=" + city + ", amount=" + amount + ", money="
				+ money + "]";
	}

	
	
	
	
}
