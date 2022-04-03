package ReferenceClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("ReferenceClass/config.xml");
		Student object = (Student) context.getBean("student");
		System.out.println(object);

	}

}
