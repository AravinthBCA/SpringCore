package Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import Assignment.Reservation;

public class Customer {
	
	@Autowired
	@Qualifier("reserv")
	private Reservation reservation;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getAddress() {
		return reservation;
	}
	
	public void setAddress(Reservation address) {
		this.reservation = address;
	}
	
	@Override
	public String toString() {
		return "Customer [Name= "+name+" , Reservation=" + reservation + "]";
	}

}
