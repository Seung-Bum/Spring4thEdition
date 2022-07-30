package sample.spring.chapter01.bankapp;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;


// JMX(Java Management Extension: 자바 관리 확장)
// 스프링의 JMX 지원을 사용하면 애플리케이션에 쉽게 JMX기술을 덧붙일 수 있다.
// MyBank 애플리케이션은 정기 예금 관련 기능을 매일 오전 9:00부터 오후 6:00 사이에만 사용할 수 있다고 가정하자.
// 이 요구 사항을 처리하기 위해 정기 예금 서비스가 활성화 상태인지 표현하는 플래그를 FixedDepositService에 추가한다.
// 다음 예제는 플래그를 추가한 FixedDepositService를 보여준다.
//
// FixedDepositService 클래스가 자신의 인스턴스를 MBean 서버에 등록한다.
// JMX API를 직접 사용하지 않고도 자신의 메서드를 JMX 연산으로 노출시킬 수 있다는 사실을 알 수 있다. 

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
