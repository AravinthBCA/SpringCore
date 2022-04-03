

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("config.xml");
		ProductsList obj = (ProductsList) context.getBean("productsList");
		System.out.println(obj);
		System.out.println(obj.getProductName().getClass());
	}

}
