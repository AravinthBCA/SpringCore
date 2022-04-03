package Assignment;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PassengerDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insert(Passenger passenger) {
		String sql = "insert into passenger values(?,?,?)";
		int result = jdbcTemplate.update(sql,passenger.getId(),passenger.getFirstName(),passenger.getLastName());
		if(result != 0) {
			System.out.println("Record Inserted Successfully....");
		}
		else {
			System.out.println("Record Not Inserted Result : "+result);
		}
	}
	
	public void read() {
		String sql = "select * from passenger";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		List<Passenger> passengerList = jdbcTemplate.query(sql, rowMapper);
		System.out.println(passengerList);
	}
	
	public void update(Passenger passenger) {
		String sql = "update passenger set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql,passenger.getFirstName(),passenger.getLastName(),passenger.getId());
		if(result != 0) {
			System.out.println("Record Updated Successfully....");
		}
		else {
			System.out.println("Record Not Updated Result : "+result);
		}
	}
	
	public void delete(int id) {
		String sql = "delete from passenger where id = ?";
		int result = jdbcTemplate.update(sql,id);
		if(result != 0) {
			System.out.println("Record Deleted Successfully....");
		}
		else {
			System.out.println("Record Not Deleted Result : "+result);
		}
	}
}









