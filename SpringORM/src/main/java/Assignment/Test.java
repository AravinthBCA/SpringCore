package Assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Assignment/config.xml");
		PassengerDao bean = (PassengerDao) context.getBean("passengerDao");
		Passenger obj = new Passenger();
		obj.setId(2);
		obj.setFirstname("Ruban");
		obj.setLastname("Kaliya");
//		bean.insert(obj);
//		bean.update(obj);
//		bean.delete(obj);
//		System.out.println(bean.find(1));
		List<Passenger> findAll = bean.findAll();
		System.out.println(findAll);
	}

}
