package sample.spring.chapter01.bankapp;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;


// JMX
//

public class FixedDepositService3 {
	
	private boolean active;
	
	public FixedDepositDetails getFixedDepositDetails() {
		if(active) {}
		return null;
	}
	
	public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		if(active) {}
		return active;
	}
	
	@ManagedOperation
	public void activateService() { active = true; }
	
	@ManagedOperation
	public void deactivateService() { active = false; }
	
}
