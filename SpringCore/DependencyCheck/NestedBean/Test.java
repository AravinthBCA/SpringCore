package NestedBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("NestedBean/config.xml");
		Employee obj = (Employee) context.getBean("employee");
		System.out.println(obj);
		System.out.println(obj.hashCode());
		Employee obj1 = (Employee) context.getBean("employee");
		System.out.println(obj1.hashCode());
	}

}
