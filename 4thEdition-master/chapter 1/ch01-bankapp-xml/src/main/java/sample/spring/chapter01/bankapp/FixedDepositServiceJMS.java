package sample.spring.chapter01.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

// JMS(Java Message Service: 자바 메시지 서비스)
// MyBank 애플리케이션에서 고객이 자신의 정기 예금 상세 정보를 전자우편으로 받고 싶다는 요청을 보내면
// FixedDepositService는 요청의 상세정보를 JMS 메시징 미들웨어에 보낸다.
// 이렇게 보내진 요청은 나중에 메시지 리스너로 처리한다.
// 스프링은 추상화 계층을 제공해서 JMS 제공자와의 상호 작용을 간단하게 만들어준다.

// 애플리케이션간의 통신을 메시지 기반으로 수행하기 위한 Java API를 정의

public class FixedDepositServiceJMS {
	
	@Autowired
	private transient JmsTemplate jmsTemplate;
//		public boolean submitRequest(Request request) { // 어떤 request를 import해야 할지모르겠음
//			jmsTemplate.convertAndSend(request);
//		}
	
}
