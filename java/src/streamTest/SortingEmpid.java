package streamTest;

import java.util.ArrayList;
import java.util.List;

public class SortingEmpid {


public static void main(String[] args) {
	List<EmpModel> list=new ArrayList();
	EmpModel emp=new EmpModel();
	list.add(new EmpModel(105,"Arun","Chennai",10000));
	list.add(new EmpModel(101,"Ravi","Tvm",20000));
	list.add(new EmpModel(103,"Mani","Chennai",10000));
    list.add(new EmpModel(103,"Sathish","Chennai",10000));
	list.add(new EmpModel(102,"vinith","Hyd",10000));
	int count=list.size();
		
			 for(int i=0; i < count; i++){  
                 for(int j=1; j < (count-i); j++){  
                          if(list.get(j-1).getId() >list.get(j).getId()){  
                             
                                 list.add(j+1, list.get(j-1)); 
                                 list.remove(j-1);                             
                                 
                          }
                 }  
         }  
			 System.out.println(list);
		}
	}
	

