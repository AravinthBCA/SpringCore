package Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import Qualifier.Address;

public class Employee {
	
	@Autowired
	@Qualifier("address")
	private Address address;
	
	Employee(Address address){
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id="+ ", address=" + address + "]";
	}

}
