package List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("List/listconfig.xml");
		Hospital object = (Hospital) context.getBean("hospital");
		System.out.println(object.getName());
		System.out.println(object.getModels());
		System.out.println(object.getModels().getClass());
	}

}
