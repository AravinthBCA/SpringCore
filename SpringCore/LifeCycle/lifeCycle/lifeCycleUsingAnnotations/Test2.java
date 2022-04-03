package lifeCycleUsingAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleUsingAnnotations/config.xml");	
		Patient2 obj = (Patient2) context.getBean("patient2");
		System.out.println(obj);
		if(context instanceof ConfigurableApplicationContext) {
			((AbstractApplicationContext) context).registerShutdownHook(); // use for shutdown or destroy
		}
	}
}