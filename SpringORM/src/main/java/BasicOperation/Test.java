package BasicOperation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BasicOperation/config.xml");
		ProductDao obj =  (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(9);
		product.setName("IPhone");
		product.setDesc("Its awesome!!!");
		product.setPrice(1000);
		obj.create(product);
		product.setId(10);
		product.setName("IPhone");
		product.setDesc("Its awesome!!!");
		product.setPrice(1000);
		obj.create(product);
//		obj.update(product);
//		obj.delete(product);
//		Product find = obj.find(1);
//		List<Product> findAll = obj.findAll();
//		System.out.println(findAll);
	}

}
