package check;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Arun");
		list.add("Anbu");
		list.sort(null);
		
		list.sort((a,b)->a.compareTo(b));
		System.out.println(list);
		Funct f=(a,b)->a+b;
System.out.println(f.display(1,2));

	}

}
