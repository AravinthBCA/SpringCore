package Assignment;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("passengerDao")
public class PassengerDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insert(Passenger passenger) {
		hibernateTemplate.save(passenger);
	}
	
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}
	
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}
	
	@Transactional
	public Passenger find(int id) {
		Passenger pass = hibernateTemplate.get(Passenger.class,id);
		return pass;
	}
	
	@Transactional
	public List<Passenger> findAll(){
		List<Passenger> list = hibernateTemplate.loadAll(Passenger.class);
		return list;
	}
}
