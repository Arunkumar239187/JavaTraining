package streamTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class EmpMain {
	public static void main(String[] args) {
		List<EmpModel> list=new ArrayList();
		//list.add(new EmpModel(100,"Arun","Chennai",10000));
		//list.add(new EmpModel(101,"Ravi","Tvm",20000));
		//list.add(new EmpModel(102,"Mani","Chennai",10000));
	//	list.add(new EmpModel(103,"Sathish","Chennai",10000));
		//list.add(new EmpModel(104,"vinith","Hyd",10000));
		Optional<List<EmpModel>> CheckNull= Optional.ofNullable(list);
		if(CheckNull.isPresent())
		{
			System.out.println("it is present");
		}
		else
		{
		System.out.println("it is null");
		}
		
		}

}
