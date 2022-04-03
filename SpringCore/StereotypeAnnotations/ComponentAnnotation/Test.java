package ComponentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ComponentAnnotation/config.xml");
		Instructor obj = (Instructor) context.getBean("instructor");
		System.out.println(obj);
	}

}
