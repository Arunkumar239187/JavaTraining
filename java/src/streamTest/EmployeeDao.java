package streamTest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public List<EmpModel> getEmpModel(){
		
	

	List<EmpModel> list=new ArrayList();
	list.add(new EmpModel(100,"Arun","Chennai",10000));
	list.add(new EmpModel(101,"Ravi","Tvm",20000));
	list.add(new EmpModel(102,"Mani","Chennai",10000));
	list.add(new EmpModel(103,"Sathish","Chennai",10000));
	list.add(new EmpModel(104,"vinith","Hyd",10000));
	
	return list;
	}
}
