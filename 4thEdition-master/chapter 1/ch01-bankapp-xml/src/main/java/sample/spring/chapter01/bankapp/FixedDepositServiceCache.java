package sample.spring.chapter01.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jms.core.JmsTemplate;

// @Cacheable
// getFixedDepositDetails 메서드가 반환하는
// 정기 예금 정보를 캐시에 저장한다.
// 다시 같은 인수값을 사용해 getFixedDepositDetails 메서드를 호출하면
// getFixedDepositDetails 메서드는 실행되지 않고,
// 캐시로부터 정기 예금 정보가 반환된다.


public class FixedDepositServiceCache {
	@Cacheable("fixedDeposits")
	public FixedDepositDetails getFixedDepositDetails() {
		return null;}
	public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		return false;}
}
