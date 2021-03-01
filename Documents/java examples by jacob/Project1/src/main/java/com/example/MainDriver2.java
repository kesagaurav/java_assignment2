package com.example;
import java.io.File;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.controller.ReimbursementTypeAndStatus;
import com.example.controller.UserController;
import com.example.dao.ReimbursementDao;
import com.example.dao.ReimbursementStatusDao;
import com.example.dao.ReimbursementTypeAndReimbursementDao;
import com.example.dao.ReimbursementTypeDao;
import com.example.dao.ReimbursementUserDao;
import com.example.dao.UserDao;
import com.example.login.UserLoginPage;
import com.example.model.Reimbursement;
import com.example.model.ReimbursementStatus;
import com.example.model.ReimbursementType;
import com.example.model.ReimbursementTypeAndReimbursementStatus;
import com.example.model.ReimbursementUserRole;
import com.example.model.User;
import com.example.service.ReimbursementTypeService;
import com.example.service.UserService;

import com.example.util.HibernateUtil;

import io.javalin.Javalin;

public class MainDriver2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		File file=new File("src/main/resources/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//		WebDriver driver=new ChromeDriver();
//		
//		//driver.get("https://google.com");
//		
//		//WebElement searchBar=driver.findElement(By.name("q"));
//		//WebElement searchButton=driver.findElement(By.name("btnk"));
//		UserLoginPage page=new UserLoginPage(driver);
//		page.navigateTo();
		
		Javalin app=Javalin.create(config->{
			config.addStaticFiles("/frontend");
		});
		
		app.start(9023);

		File file=new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://google.com");
		
		//WebElement searchBar=driver.findElement(By.name("q"));
		//WebElement searchButton=driver.findElement(By.name("btnk"));
		UserLoginPage page=new UserLoginPage(driver);
		page.navigateTo();
		
		
		
		 HibernateUtil hutil=new HibernateUtil();
		 ReimbursementTypeAndReimbursementDao rtrsdao=new  ReimbursementTypeAndReimbursementDao(hutil);
		 ReimbursementDao rdao =new ReimbursementDao(hutil);
		 UserDao usdao=new UserDao(hutil);
		ReimbursementStatusDao rs=new ReimbursementStatusDao(hutil);
		ReimbursementTypeDao rydao=new ReimbursementTypeDao(hutil);
		ReimbursementUserDao rudao=new ReimbursementUserDao(hutil);
		 
		// ReimbursementTypeAndReimbursementStatus rtsdao=new ReimbursementTypeAndReimbursementStatus(hutil); 
	
		UserController uCon=new UserController(new UserService(new UserDao(hutil)));
		
		app.post("/user/login",uCon.postLogin);
		app.get("/user/session", uCon.getSessus);
//			
//			
//		
		ReimbursementTypeAndStatus uRev=new ReimbursementTypeAndStatus(new ReimbursementTypeService(new ReimbursementTypeAndReimbursementDao(hutil)));
		//ReimbursementService uRes=new ReimbursementService();
		app.post("/reimbtype/login",uRev.postLogin);
		app.get("/reimbtype/session",uRev.getSessrus);
		
		
		
		
		
		
		
		
		
		
		
		
		
		ReimbursementUserRole rus=new ReimbursementUserRole("finicial manager",null);
			ReimbursementUserRole rus1=new ReimbursementUserRole("employee",null);
			
			
		 
		 	User usdao1=new User("gaurav","12345abc","kesa","gaurav","kg@gmail.com",null,null,rus);
			User usdao2=new User("jack","12345abcd","joy","ray","jr@gmail.com",null,null,rus1);
			User usdao3=new User("anmol","12345abce","chris","rol","cr@gmail.com",null,null,rus);
			User usdao4=new User("ok","12345abcdt","hi","ok","g@gmail.com",null,null,rus1);
			User usdao5=new User("how","12345abcf","kesa1","gaurav2","kg@gmail2.com",null,null,rus);
			User usdao6=new User("gaurav3","12345abch","kesa2","gaurav3","kg@gmail4.com",null,null,rus1);
			
			
			

			ReimbursementType rtydao1=new ReimbursementType("lodging",null);
			ReimbursementType rtydao2=new ReimbursementType("travel",null);
			ReimbursementType rtydao3=new ReimbursementType("food",null);
			ReimbursementType rtydao4=new ReimbursementType("other",null);
			ReimbursementType rtydao9=new ReimbursementType("lodging",null);
			
			 ReimbursementStatus rs1=new ReimbursementStatus("approved",null); 
			 ReimbursementStatus rs2=new ReimbursementStatus("denied",null); 
			 ReimbursementStatus rs3=new ReimbursementStatus("approved",null); 
			 ReimbursementStatus rs4=new ReimbursementStatus("denied",null); 
			 ReimbursementStatus rs5=new ReimbursementStatus("approved",null); 
			
			 Reimbursement rdao1=new Reimbursement(120000,"1-1-2017","2-1-2017","ok1",usdao1,usdao2,rtydao1,rs1); 
			 Reimbursement rdao2=new Reimbursement(130000,"4-2-2017","3-2-2017","good",usdao2,usdao3,rtydao2,rs2); 
			Reimbursement rdao3=new Reimbursement(140000,"7-1-2017","5-1-2017","well",usdao3,usdao4,rtydao3,rs3); 
			Reimbursement rdao4=new Reimbursement(150000,"9-1-2017","8-1-2017","bad",usdao4,usdao5,rtydao4,rs4); 
			Reimbursement rdao5=new Reimbursement(160000,"11-1-2017","10-1-2017","not good",usdao5,usdao1,rtydao9,rs5);
		 
			
				rdao.insert(rdao1);
				rdao.insert(rdao2);
				rdao.insert(rdao3);
				rdao.insert(rdao4);
				rdao.insert(rdao5);
			
			
			List<Reimbursement> rList1=new ArrayList();
			rList1.add(rdao1);
			ReimbursementType rtydao5=new ReimbursementType("travel",rList1);
			
			rydao.insert(rtydao5);
			
			rList1=new ArrayList();
			rList1.add(rdao2);
			ReimbursementType rtydao6=new ReimbursementType("lodging",rList1);
			
			rydao.insert(rtydao6);
			
			 rList1=new ArrayList();
			rList1.add(rdao3);
			ReimbursementType rtydao7=new ReimbursementType("food",rList1);
			
			rydao.insert(rtydao7);
			
			rList1=new ArrayList();
			rList1.add(rdao4);
			ReimbursementType rtydao8=new ReimbursementType("other",rList1);
			
			rydao.insert(rtydao8);		
			
		 List<Reimbursement> rsList3=new ArrayList<>();
		 rsList3.add(rdao1);
		 ReimbursementStatus rs10=new ReimbursementStatus("approved",rsList3);
		 rsList3=new ArrayList();
		 rsList3.add(rdao2);
		 ReimbursementStatus rs11=new ReimbursementStatus("denied",rsList3);
		 rsList3=new ArrayList();
		 rsList3.add(rdao3);
		 ReimbursementStatus rs6=new ReimbursementStatus("approved",rsList3);
		 rsList3=new ArrayList();
		 rsList3.add(rdao4);
		 ReimbursementStatus rs7=new ReimbursementStatus("denied",rsList3);
		 rsList3=new ArrayList();
		 rsList3.add(rdao5);
		 ReimbursementStatus rs8=new ReimbursementStatus("approved",rsList3);
		 
		 rs.insert(rs10);
		 rs.insert(rs11);
		 rs.insert(rs6);
		 rs.insert(rs7);
		 rs.insert(rs8);
//		 
		
		 
		 
		 
		 
		 // relation for user and reimbursement
		 
		 List<Reimbursement> rList=new ArrayList<>();
			rList.add(rdao1);
			rList.add(rdao2);
			User usdao7=new User("gaurav2","1902vhj","kesa1","gaurav1","kg1@gmail.com",rList,rList,rus);
			rList=new ArrayList<>();
			rList.add(rdao3);
			rList.add(rdao4);
			User usdao8=new User("gaurav3","1902abc","kesa2","gaurav3","kg2@gmail.com",rList,rList,rus1);
			rList=new ArrayList<>();
			rList.add(rdao5);
			rList.add(rdao1);
			User usdao9=new User("gaurav4","1902abcd","kesa3","gaurav4","kg3@gmail.com",rList,rList,rus);
			
				usdao.insert(usdao8);
				usdao.insert(usdao9);
//			
		 
		
		
			
			List<User> usList=new ArrayList<>();
			usList.add(usdao1);
			ReimbursementUserRole rus2=new ReimbursementUserRole("finicial manager",usList);
			usList=new ArrayList<>();
			usList.add(usdao2);
			ReimbursementUserRole rus3=new ReimbursementUserRole("employee",usList);
	
			usList=new ArrayList<>();
			usList.add(usdao3);
			ReimbursementUserRole rus4=new ReimbursementUserRole("finicial manager",usList);
			usList=new ArrayList<>();
			usList.add(usdao4);
			ReimbursementUserRole rus5=new ReimbursementUserRole("employee",usList);
			usList=new ArrayList<>();
			usList.add(usdao5);
			ReimbursementUserRole rus6=new ReimbursementUserRole("finicial manager",usList);
//	
			rudao.insert(rus2);
			rudao.insert(rus3);
			rudao.insert(rus4);
			rudao.insert(rus5);
			rudao.insert(rus6);
//	
			

			
ReimbursementTypeAndReimbursementStatus rtsdao=new ReimbursementTypeAndReimbursementStatus(120000,"ok","approved","lodging", Timestamp.valueOf(LocalDateTime.now()) , Timestamp.valueOf(LocalDateTime.now()));

ReimbursementTypeAndReimbursementStatus rtsdao2=new ReimbursementTypeAndReimbursementStatus(1230000,"ok1","denied","travel",Timestamp.valueOf(LocalDateTime.now()) , Timestamp.valueOf(LocalDateTime.now()));
ReimbursementTypeAndReimbursementStatus rtsdao3=new ReimbursementTypeAndReimbursementStatus(120000,"ok2","approved","other",Timestamp.valueOf(LocalDateTime.now()) , Timestamp.valueOf(LocalDateTime.now()));
ReimbursementTypeAndReimbursementStatus rtsdao4=new ReimbursementTypeAndReimbursementStatus(120000,"somethingnotgood","denied","food",Timestamp.valueOf(LocalDateTime.now()) , Timestamp.valueOf(LocalDateTime.now()));
ReimbursementTypeAndReimbursementStatus rtsdao5=new ReimbursementTypeAndReimbursementStatus(120000,"ok3","deny","other",Timestamp.valueOf(LocalDateTime.now()) , Timestamp.valueOf(LocalDateTime.now()));
ReimbursementTypeAndReimbursementStatus rtsdao6=new ReimbursementTypeAndReimbursementStatus(120000,"ok5","approved","lodging",Timestamp.valueOf(LocalDateTime.now()) , Timestamp.valueOf(LocalDateTime.now()));

	
	
	rtrsdao.insert(rtsdao);
	rtrsdao.insert(rtsdao2);
	rtrsdao.insert(rtsdao3);
	rtrsdao.insert(rtsdao4);
	rtrsdao.insert(rtsdao5);
	rtrsdao.insert(rtsdao6);
			
			
			
			
	}
	
	

//	
//	
//ReimbursementTypeAndReimbursementStatus rtsdao=new ReimbursementTypeAndReimbursementStatus(120000,"ok","approved","lodging");
//
//ReimbursementTypeAndReimbursementStatus rtsdao2=new ReimbursementTypeAndReimbursementStatus(1230000,"ok1","denied","travel");
//ReimbursementTypeAndReimbursementStatus rtsdao3=new ReimbursementTypeAndReimbursementStatus(120000,"ok2","approved","other");
//ReimbursementTypeAndReimbursementStatus rtsdao4=new ReimbursementTypeAndReimbursementStatus(120000,"somethingnotgood","denied","food");
//ReimbursementTypeAndReimbursementStatus rtsdao5=new ReimbursementTypeAndReimbursementStatus(120000,"ok3","deny","other");
//ReimbursementTypeAndReimbursementStatus rtsdao6=new ReimbursementTypeAndReimbursementStatus(120000,"ok5","approved","lodging");
//
//	
//	
//	rtrsdao.insert(rtsdao);
	
	
	
//	
//UserController uCon=new UserController(new UserService(new UserDao(hutil)));
//
//app.post("/user/login",uCon.postLogin);
//app.get("/user/session", uCon.getSessus);
//	
//	
//
//ReimbursementController uRev=new ReimbursementController(new ReimbursementService(new ReimbursementDao(hutil)));
////ReimbursementService uRes=new ReimbursementService();
//app.post("/reimb/login",uRev.postLogin);
//app.get("/reimb/session",uRev.getSessrus);
		
	
	
	
	
}
