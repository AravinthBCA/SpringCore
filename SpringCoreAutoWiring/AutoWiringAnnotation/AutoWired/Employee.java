package AutoWired;

import org.springframework.beans.factory.annotation.Autowired;

import AutoWired.Address;

public class Employee {
	
	@Autowired
	private Address address;
	
//	@Autowired
	Employee(Address address){
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
//	@Autowired   you can mention object declaration, settermethod, if you use constructor in that 
//	             constructor declare object means you can mention @Autowired also
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id="+ ", address=" + address + "]";
	}

}
