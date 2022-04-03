package Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("Properties/setconfig.xml");
		CountriesAndLanguages object = (CountriesAndLanguages) context.getBean("country");
		System.out.println(object);
	}

}
