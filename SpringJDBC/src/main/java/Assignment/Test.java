package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Assignment/config.xml");
		PassengerDAO passdao = (PassengerDAO) context.getBean("passenger");
		Passenger pass = new Passenger();
		pass.setId(3);
		pass.setFirstName("Aravinth");
		pass.setLastName("Annakamu");
		passdao.insert(pass);
		
		passdao.read();
		
		pass.setLastName("Kaliyamoorthy");
		passdao.update(pass);
		
		passdao.delete(3);
		
		passdao.read();
	}

}
