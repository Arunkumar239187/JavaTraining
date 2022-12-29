package streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PF {

	public static void main(String[] args) {
		List<EmpModel> list= new ArrayList();
		List<EmpModel> list1= new ArrayList();
		
		list.add(new EmpModel(100,"Arun","Chennai",10000));
		list.add(new EmpModel(102,"Ravi","Tvm",20000));
		list.add(new EmpModel(101,"Mani","Chennai",10000));
		list.add(new EmpModel(103,"Sathish","Chennai",10000));
		list.add(new EmpModel(104,"vinith","Hyd",10000));
		int netpay;
		int pfdeduct;
	//	list.sort((a,b)-> ((Integer)a.getId()).compareTo(b.getId()));
		System.out.println(list.stream().collect(Collectors.groupingBy(l->l.getSalary())));
	//	System.out.println(stream);
		System.out.println(list);
		for(EmpModel i:list)
		{
			calc(i);
		}
		System.out.println(list1);
	}

	private static void calc(EmpModel e) {
		if(e.getSalary()<=25000)
		{
			Function<Integer, Double> pfamount=(sal) -> sal*0.05;
			double pf=pfamount.apply(e.getSalary());
			System.out.println("ID  "+e.getId()+" Name "+e.getName()+" PFAmount "+ pf+"Total amount  "+(e.getSalary()-pf));
		}else if(e.getSalary()<=25000)
		{

			Function<Integer, Double> pfamount=(sal) -> sal*0.05;
			double pf=pfamount.apply(e.getSalary());
			System.out.println("ID  "+e.getId()+" Name "+e.getName()+" PFAmount "+ pf+"Total amount  "+(e.getSalary()-pf));
		}
		
	}

}
