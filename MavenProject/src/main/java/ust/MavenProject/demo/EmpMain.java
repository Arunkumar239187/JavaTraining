package ust.MavenProject.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
  ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmpModel emp =  context.getBean("em",EmpModel.class);
				
		System.out.println(emp.display());
		

	}

}
