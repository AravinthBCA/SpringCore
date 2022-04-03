package AmbiguityConstructorProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("AmbiguityConstructorProblem/config.xml");
		Addition obj = (Addition) context.getBean("addition");
		System.out.println(obj);
	}

}
