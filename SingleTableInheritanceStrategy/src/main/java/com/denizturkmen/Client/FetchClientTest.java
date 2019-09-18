package com.denizturkmen.Client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Entity.Person;
import com.denizturkmen.Entity.Student;
import com.denizturkmen.Util.HibernateUtil;

public class FetchClientTest {
	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Person person = session.get(Person.class, 3);
			//1 de person ait bilgileri getirir
			//2 de student ait bilgileri getirir
			//3 de employee ait bilgileri getirir
			if(person instanceof Person && !(person instanceof Employee) && !(person instanceof Student)) {
				System.out.println(person);
			}
			else if((person instanceof Person)  && (person instanceof Employee)) {
	    		Employee employee = (Employee) person;
	    		System.out.println(employee);
	    	}
	    	else if((person instanceof Person)  && (person instanceof Student) ) {
	    		Student student = (Student) person;
	    		System.out.println(student);
	    	}
			
		}
		catch (HibernateException e) {
			
		}
	}

}
