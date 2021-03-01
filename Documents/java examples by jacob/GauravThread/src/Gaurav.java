
public class Gaurav  {

private int id;
private String name;
private int accno;
public Gaurav(int id, String name, int accno) {
	super();
	this.id = id;
	this.name = name;
	this.accno = accno;
}
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
@Override
public String toString() {
	return "Gaurav [id=" + id + ", name=" + name + ", accno=" + accno + "]";
}
}
class gaurav1 extends Thread{
	private Gaurav gaurav;

	public gaurav1(Gaurav gaurav) {
		super();
		this.gaurav = gaurav;
	}
	
	public void run() {
		gaurav.getClass();
	}
	
	
}
