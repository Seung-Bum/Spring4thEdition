package sample.spring.chapter02.bankapp.dao;

import sample.spring.chapter02.bankapp.domain.FixedDepositDetails;

public class FixedDepositJdbcDao {
	
	private DatabaseInfo databaseInfo;

	public FixedDepositJdbcDao() {}
	
	public void setDatabaseInfo(DatabaseInfo databaseInfo) {
		this.databaseInfo = databaseInfo;
	}

}
