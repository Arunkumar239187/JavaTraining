package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PanTest {

		public static void main(String[] args) {
			List<EmpModel1> list=new ArrayList();
			list.add(new EmpModel1(100,"Arun","Chennai","BQPAF1013K"));
			list.add(new EmpModel1(101,"Ravi","Tvm","ABCDF87327"));
			list.add(new EmpModel1(102,"Mani","Chennai","BQPAF1013K"));
			list.add(new EmpModel1(103,"Sathish","Chennai","BQPAF1013K"));
			list.add(new EmpModel1(104,"vinith","Hyd","BQPAF1013K"));
			for(EmpModel1 em:list)
			{
				int count=0;
				if(em.getPan().length()==10)
				{
					for(int i=0;i<=9;i++)
					{
						
						if((em.getPan().charAt(i)>=65&&em.getPan().charAt(i)<=90&&(i<=4||i==9)))// ||((em.getPan().charAt(i)>=0&&em.getPan().charAt(i)<=9&&(i>5&&i<9))))
							{
								count++;
							}
						}
					}
					
				
				if(count==10)
				{
				System.out.println(em);
				}
			}
			
			}

	
}


