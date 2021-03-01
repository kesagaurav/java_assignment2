
public class Client {

	private int id;
	private String name;
	private int accno;
	private String branch;
	public Client(int id, String name, int accno, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.accno = accno;
		this.branch = branch;
	}
	public int getId() {
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", accno=" + accno + ", branch=" + branch + "]";
	}
	
	
	
}




class ClientThread extends Thread{
	private Client client;

	public ClientThread(Client client) {
		super();
		this.client = client;
	}
	
	public void run() {
		client.getClass();
	}
	
	
	
}
