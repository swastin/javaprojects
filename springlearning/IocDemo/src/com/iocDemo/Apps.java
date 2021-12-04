package com.iocDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iocDemo.collectionInjection.CollectionInjectionDemo;

public class Apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
CollectionInjectionDemo  cid= (CollectionInjectionDemo)context.getBean("collectionDemo");
System.out.println(cid);
	}
}
