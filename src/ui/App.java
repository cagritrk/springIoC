package ui;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.IApplicationDao;
import service.ApplicationManager;

public class App {

	public static void main(String[] args) {
		
		String database = "MySql"; //Oracle, MySql or MsSql
		
		//Read appContext file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		//Get database bean from context.
		ApplicationManager app = new ApplicationManager(context.getBean(database, IApplicationDao.class));
		
		app.create();
	}

}
