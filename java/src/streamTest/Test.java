package streamTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		List<EmpModel> list= new ArrayList();
		List<EmpModel> list1= new ArrayList();
		
		list.add(new EmpModel(100,"Arun","Chennai",10000));
		list.add(new EmpModel(101,"Ravi","Tvm",20000));
		list.add(new EmpModel(102,"Mani","Chennai",10000));
		list.add(new EmpModel(103,"Sathish","Chennai",10000));
		list.add(new EmpModel(104,"vinith","Hyd",10000));
		int count;
		int count1;
		//list.forEach(l->(l.equals()));
		for(EmpModel i:list)
		{
			count=0;
			count1=0;
			for(EmpModel j:list)
			{
				if(i.getSalary()==j.getSalary())
				{ 
					count+=j.getSalary();
					//System.out.println(count+","+j.getSalary());
					if((i.getId()==j.getId())&&(count==i.getSalary()))
					{
						count1++;
						
					}
					System.out.println(count1);
				}
			}
			if(count1==1)
			{
             i.setSalary(count);	
             list1.add(i);
			}
			
		}
		System.out.println(list1);
	}
}
