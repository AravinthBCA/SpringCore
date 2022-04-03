package Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("Map/setconfig.xml");
		Customer object = (Customer) context.getBean("customer");
		System.out.println(object);
	}

}
