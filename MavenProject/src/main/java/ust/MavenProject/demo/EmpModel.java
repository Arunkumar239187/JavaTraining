package ust.MavenProject.demo;

public class EmpModel {
	private String id;
	private String name;
	private String location;

	
	public EmpModel(String id, String name, String location) {
	
		this.id = id;
		this.name = name;
		this.location = location;
	}
	



	public String display() {
		return "EmpModel [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}
