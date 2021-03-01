package com.example;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.model.Account;
import com.example.model.AccountType;
import com.example.model.Branch;
import com.example.model.ClientUser;
import com.example.model.Transaction;
import com.example.repository.AccountRepository;
import com.example.repository.AccountTypeRepository;
import com.example.repository.BranchRepository;
import com.example.repository.ClientUserRepository;
import com.example.repository.TransactionRepository;
import com.example.service.AccountService;
import com.example.service.TransactionService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@SpringBootApplication
public class Project2Application implements ApplicationRunner{
	
	private ClientUserRepository clientUserRepository;
	private BranchRepository branchRepository;
	private AccountTypeRepository accountTypeRepository;
	private AccountRepository accountRepository;
	private TransactionRepository tRepository;

	
	public static void main(String[] args) {
		
		SpringApplication.run(Project2Application.class, args);
	
		
		
		
		

		
	}
	
	
	public void insertInitialValues() {
		clientUserRepository.save(
		          new ClientUser("gaurav","kesa","gaurav","16-3-318",21,"kg@gmail.com","9550671038", null, null));
//		    	//branchRepository.saveAll(Arrays.asList( new Branch("Santa Clara"), new Branch("Houston"), new Branch("San Francisco")));
//		    	//accountTypeRepository.saveAll(Arrays.asList( new AccountType("checking"), new AccountType("saving")));
		    	ClientUser c = new ClientUser("gaurav1", "gaurav1","3-1-0290", "kesa", 55,"kg1@gmail.com","9849971504", null, null); 
		    	clientUserRepository.save(c); 
		 
		
		
		
		
		    AccountType at1 = new AccountType("checking");
		    AccountType at2 = new AccountType("savings");
		    accountTypeRepository.save(at1);
		    accountTypeRepository.save(at2);
		    Branch b1 =  new Branch("Santa Clara");
		    Branch b2 = new Branch("Houston");
		    Branch b3 = new Branch("San Francisco");
		    branchRepository.save(b1);
		    branchRepository.save(b2);
		    branchRepository.save(b3);
		    
		    	List<Transaction> t = new ArrayList<>();
				  Account a = new Account("132548101", 5, c, at1, b1, t); // not auto generated for account no yet.
				  accountRepository.save(a); 				  
				  Account a2 = new Account("132548102", 50000000, c, at2, b3, t); // not auto generated for account no yet. //
				  Transaction t1 = new Transaction("Payday", new Timestamp(System.currentTimeMillis()), 0, 200, a2);
				  Transaction t2 = new Transaction("Purchase of Amazing Figure", new Timestamp(System.currentTimeMillis()), 280, 0, a2);
				  t.add(t1);
				  t.add(t2);
				  accountRepository.save(a2);
				  
				  
	}
	


	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
	
		insertInitialValues();
		
	}

	




		
		
	
	
}
