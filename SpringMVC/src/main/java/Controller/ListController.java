package Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DTO.Employee;

@Controller
public class ListController{
	
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Aravinth");
		employee1.setSalary(100000);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Aravinth");
		employee2.setSalary(100000);

		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Aravinth");
		employee3.setSalary(100000);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		modelAndView.addObject("employee",employees);
		return modelAndView ;
	}

}
