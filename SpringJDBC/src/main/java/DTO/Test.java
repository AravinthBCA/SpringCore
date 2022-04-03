package DTO;

import java.util.*;
import java.io.*;
import java.sql.ResultSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.xdevapi.Statement;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("DTO/config.xml");
		EmployeeDAOImpl dao = (EmployeeDAOImpl) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Ruban");
		employee.setLastName("Kaliyamoorthy");
		
//		int result = dao.create(employee);
//		System.out.println("Numer of records inserted : "+result);

//		int result = dao.update(employee);
//		System.out.println("Numer of records updated : "+result);

//		String sql = "update employee set firstname=?,lastname=? where id=?";
//		int result = dao.delete(1);
//		System.out.println("Numer of records delete : "+result);
		
		Employee employee1 = dao.read(1);
		System.out.println("Employee Record : "+employee1);
		
//		List<Employee> result = dao.read();
//		System.out.println("Employee Record : "+result);

	}

}
