package service;

import dao.IApplicationDao;

public class ApplicationManager implements IApplicationService{
	private IApplicationDao database;
	
	public ApplicationManager(IApplicationDao database) {
		this.database = database;
	}

	@Override
	public void create() {
		System.out.println("New App creating...");
		database.add();	
	}

}
