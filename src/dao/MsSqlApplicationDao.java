package dao;

import org.springframework.stereotype.Component;

@Component("MsSql")
public class MsSqlApplicationDao implements IApplicationDao{

	@Override
	public void add() {
		System.out.println("Data added to MsSql Database .");
		
	}


}
