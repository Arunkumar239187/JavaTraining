package streamTest;

public class EmpModel {
	private int id;
	private String name;
	private String location;
	private int salary;
	public EmpModel(int id, String name, String location, int salary) {
		
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
public EmpModel() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
	return "EmpModel [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
}

}
