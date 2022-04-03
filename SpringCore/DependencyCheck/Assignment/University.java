package Assignment;

import org.springframework.beans.factory.annotation.Required;

public class University {
	
	private int id;
	private String location;
	private String name;
	
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "University [id=" + id + ", location=" + location + ", name=" + name + "]";
	}
	
}
