
public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st=new Student("gaurav",31,"warangal",123,9000.00);
		Student st1=new Student("sri",16,"warangal",1223,92000.00);
		Student st2=new Student("sai",05,"hanamkonda",12233,90030.00);
		Student st3=new Student("akhil",56,"postoffice",1234,91000.00);
		System.out.println(st.getAmount() + " " +  st.getCity());
		System.out.println(st1.getCity() +" " + st1.getMoney());
		System.out.println(st2.getMoney() + " " + st2.getCity());
		System.out.println(st3.getName() + " " + st3.getRollno());
		
		
		
	}

}
