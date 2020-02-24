package dao;

import org.springframework.stereotype.Component;

@Component("Oracle")
public class OracleSqlApplicationDao implements IApplicationDao {

	@Override
	public void add() {
		System.out.println("Data added to Oracle Database .");
		
	}

}
