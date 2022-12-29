package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"arun");
		map.put(2,"mani");
		map.put(3,"arul");
		map.put(4,"ashok");
		map.put(5,"anbu");
		for(Entry<Integer,String> e:map.entrySet())
		{
			if(e.getValue().charAt(0)=='a'||e.getValue().charAt(0)=='A')
			{
				System.out.println("key :" +e.getKey()+"   value :"+e.getValue());
			}
		}
			
		}

		

}
