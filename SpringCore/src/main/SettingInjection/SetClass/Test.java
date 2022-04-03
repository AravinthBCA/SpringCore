package SetClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("SetClass/setconfig.xml");
		Car object = (Car) context.getBean("cars");
		System.out.println(object.getName());
		System.out.println(object.getModels());
		System.out.println(object.getModels().getClass());
	}

}
