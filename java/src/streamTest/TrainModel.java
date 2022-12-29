package streamTest;

public class TrainModel {

	private int id;
	private String Name;
	private String source;
	private String destination;
	private int distance;
	
	public TrainModel(int id, String name, String source, String destination, int distance) {
	
		this.id = id;
		Name = name;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "TrainModel [id=" + id + ", Name=" + Name + ", source=" + source + ", destination=" + destination
				+ ", distance=" + distance + "]";
	}
	
	
	}
