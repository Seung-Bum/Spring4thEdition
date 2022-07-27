package sample.spring.chapter01.bankapp;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.access.annotation.Secured;

// 선언적 트랜잭션 관리
// 스프링을 사용하면 트랜잭션을 선언적으로 관리할 수 있다.
// 메서드에 @Transactional 애너테이션을 설정하면 스프링이 트랜잭션을 관리한다.
//
public class FixedDepositService2 {
	
	public FixedDepositDetails getFixedDepositDetails() {return null;}
	
	@Transactional
	@Secured({ "SAVING_ACCOUNT_CUSTOMER", "APPLICATION_ADMIN" })
	public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		return false;
	}
	
}
