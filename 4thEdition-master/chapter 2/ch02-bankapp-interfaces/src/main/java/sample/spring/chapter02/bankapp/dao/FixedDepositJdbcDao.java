package sample.spring.chapter02.bankapp.dao;

import sample.spring.chapter02.bankapp.domain.FixedDepositDetails;

public class FixedDepositJdbcDao implements FixedDepositDao {
	
	private DatabaseInfo databaseInfo;

	public FixedDepositJdbcDao() {}
	
	public void setDatabaseInfo(DatabaseInfo databaseInfo) {
		this.databaseInfo = databaseInfo;
	}

	@Override
	public FixedDepositDetails getFixedDepositDetails(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// TODO Auto-generated method stub
		return false;
	}

}
