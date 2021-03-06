package com.journaldev.spring.di.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.journaldev.spring.di.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Sumita", "Sumita@abc.com");
		
		//app.sendMessage("Hi Sumita", "Sumita@abc.com");
		
		// close the context
		context.close();
	}


	}

