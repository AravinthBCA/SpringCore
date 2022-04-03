package InsertRow;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("InsertRow/config.xml");
		JdbcTemplate bean = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		System.out.println("Enter your FirstName : ");
		String firstName = in.next();
		System.out.println("Enter your LastName : ");
		String lastName = in.next();
		int result = bean.update(sql,new Integer(1),firstName,lastName);
		System.out.println("Numer of records inserted : "+result);
	}

}
