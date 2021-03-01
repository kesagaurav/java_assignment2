import com.example.Controller.ClassController;

import com.example.project.ProjectDaoImpl;

import io.javalin.Javalin;


public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin app=Javalin.create();
		
		app.start(9009);
		
		app.get("/clients", ClassController.CLIENTGET);
		app.post("/clients", ClassController.CLIENTPOST);
		app.get("/clients/:id", ClassController.CLIENTGET2);
		app.put("/clients/:id", ClassController.PUT);
		app.delete("/clients/:id", ClassController.DELETE);
		//app.post("/clients/:id/accounts", ClassController.POST2);	
		//app.get("/accounts", ClassController.GET);
		app.put("/clients/:id/accounts/:id", ClassController.PUT1);
		app.delete("/clients/:id/accounts/:id", ClassController.DELETE1);
		
		app.get("/clients/:id/accounts",ClassController.GET5);
		
		app.get("/accounts",ClassController.GET2);
		
	}

}
