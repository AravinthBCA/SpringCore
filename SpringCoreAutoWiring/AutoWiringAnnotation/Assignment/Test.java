package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Assignment.Customer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Assignment/config.xml");
		Customer obj = (Customer) context.getBean("customer");
		System.out.println(obj);
	}

}
