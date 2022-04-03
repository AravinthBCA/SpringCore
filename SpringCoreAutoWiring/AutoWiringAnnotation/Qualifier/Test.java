package Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Qualifier.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Qualifier/config.xml");
		Employee obj = (Employee) context.getBean("employee");
		System.out.println(obj);
	}

}
