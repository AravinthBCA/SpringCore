package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("Assignment/config.xml");
		ShoppingCart obj = (ShoppingCart) content.getBean("shoppingcart");
		System.out.println(obj.toString());
	}

}
