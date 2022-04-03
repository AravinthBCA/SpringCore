package ValueAnnotationUsingExperssion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Instructor {
	
//	@Value("#{10+10}")
//	@Value("#{T(java.lang.Math).abs(-99)}") //convert negative to positive numbers using Math library
//	@Value("#{new Integer(88)}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	int id=5;
	
//	@Value("Aravinth")
//	@Value("#{'Aravinth'.toUpperCase()}")
	@Value("#{new java.lang.String('Aravinth')}")
	String name;
	
//	@Value("False")
	@Value("#{2>4?true:false}")
	private boolean active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + "]";
	}
	
}
