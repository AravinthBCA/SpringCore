package ValueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ValueAnnotationUsingExperssion.Instructor;

public class Test {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ValueAnnotation/config.xml");
		
		Instructor obj = (Instructor) context.getBean("instructor");
		System.out.println(obj);
	}

}
