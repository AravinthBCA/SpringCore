package ScopeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ScopeAnnotation/config.xml");
		
		Instructor obj = (Instructor) context.getBean("instructor");
		System.out.println(obj.hashCode());
		
		Instructor obj1 = (Instructor) context.getBean("instructor");
		System.out.println(obj1.hashCode());
	}

}
