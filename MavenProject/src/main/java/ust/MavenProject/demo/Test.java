package ust.MavenProject.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BussinessPerson bussinessPerson = (BussinessPerson) context.getBean("bp");
				
		Employee emp=  (Employee) context.getBean("employee");
		emp.name();
		emp.exeperince();
		
		bussinessPerson.name();
		bussinessPerson.exeperince();
//		System.out.println("i am in Bussiness name method");
	}

}
