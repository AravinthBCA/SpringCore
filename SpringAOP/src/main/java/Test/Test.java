package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aravinth.spring.SpringAOP.ProductService;
import com.aravinth.spring.SpringAOP.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Test/config.xml");
	    ProductService obj = (ProductService) context.getBean("productService");
	    System.out.println(obj.multiply(4, 5));
	}

}
