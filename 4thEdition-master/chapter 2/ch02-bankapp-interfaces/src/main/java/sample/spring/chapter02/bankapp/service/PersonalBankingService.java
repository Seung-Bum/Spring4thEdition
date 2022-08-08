package sample.spring.chapter02.bankapp.service;

import sample.spring.chapter02.bankapp.domain.EmailMessageSender;
import sample.spring.chapter02.bankapp.domain.JmsMessageSender;
import sample.spring.chapter02.bankapp.domain.WebServiceInvoker;

public class PersonalBankingService {
	private JmsMessageSender jmsMessageSender;
	private EmailMessageSender emailMessageSender;
	private WebServiceInvoker webServiceInvoker;
	
	public PersonalBankingService(JmsMessageSender jmsMessageSender,
									EmailMessageSender emailMessageSender) {
		this.jmsMessageSender = jmsMessageSender;
		this.emailMessageSender = emailMessageSender;
	}
	
	public void setWebServiceInvoker(WebServiceInvoker webServiceInvoker) {
		this.webServiceInvoker = webServiceInvoker;
	}
}
