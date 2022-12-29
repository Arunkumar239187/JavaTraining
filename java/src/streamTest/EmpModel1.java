package streamTest;

public class EmpModel1 {
	
		private int id;
		private String name;
		private String location;
		private String pan;
		public EmpModel1(int id, String name, String location, String pan) {
			
			this.id = id;
			this.name = name;
			this.location = location;
			this.pan = pan;
		}

	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getLocation() {
		return location;
	}
	private void setLocation(String location) {
		this.location = location;
	}
	String getPan() {
		return pan;
	}
	private void setpan(String pan) {
		this.pan = pan;
	}

	public String toString() {
		return "EmpModel [id=" + id + ", name=" + name + ", location=" + location + ", pan=" + pan + "]";
	}

	}



