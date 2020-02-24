package dao;

import org.springframework.stereotype.Component;

@Component("MySql")
public class MySqlApplicationDao implements IApplicationDao{

	@Override
	public void add() {
		System.out.println("Data added to MySql Database .");
		
	}

}
