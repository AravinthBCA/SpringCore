package DTO;

import java.util.List;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();
}
