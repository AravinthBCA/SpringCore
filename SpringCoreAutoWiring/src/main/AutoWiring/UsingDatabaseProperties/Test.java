package UsingDatabaseProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("UsingDatabaseProperties/config.xml");
		MyDAO obj = (MyDAO) context.getBean("mydao");
		System.out.println(obj);
		
	}
}
