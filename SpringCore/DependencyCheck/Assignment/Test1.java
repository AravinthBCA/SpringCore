package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Assignment/config.xml");
		University obj = (University) context.getBean("university");
		System.out.println(obj);
		System.out.println(obj.hashCode());
		University obj1 = (University) context.getBean("university");
		System.out.println(obj1.hashCode());
	}

}
