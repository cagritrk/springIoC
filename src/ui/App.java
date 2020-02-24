package ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IApplicationService;

public class App {

	public static void main(String[] args) {
		
		//Read appContext file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		//Get database bean from context.
		IApplicationService app = context.getBean("service", IApplicationService.class);
		
		app.create();
	}

}
