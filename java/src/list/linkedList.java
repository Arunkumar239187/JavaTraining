package list;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList();
		list.add("arun");
		list.add("mani");
		list.add("arul");
		list.add("ashok");
		list.add("anbu");
		for(String s:list)
		{
			if(s.charAt(0)=='a'||s.charAt(0)=='A')
			{
				System.out.println(s);
			}
			
		}
		
		
		
	}

}
