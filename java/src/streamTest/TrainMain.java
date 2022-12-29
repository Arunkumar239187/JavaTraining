package streamTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainMain {

	public static void main(String[] args) {
		
		int price=5;
		List<TrainModel> passenger=new ArrayList();
		
		passenger.add(new TrainModel(1,"Arun","tvrm","che",800));
		passenger.add(new TrainModel(2,"Mohan","ban","che",300));
		
		
		passenger.stream().forEach(null);
		passenger.forEach(p -> System.out.println("ID  "+p.getId()+" Name "+p.getName()+" Source "+p.getSource()+" destination "
		+p.getDestination()+" km "+p.getDistance()+" price "+p.getDistance()*price));

	}

}
