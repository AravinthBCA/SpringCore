package InterfaceInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("InterfaceInjections/config.xml");
		OrderBO obj = (OrderBO) context.getBean("bo");
		obj.placeOrder();
	}

}
