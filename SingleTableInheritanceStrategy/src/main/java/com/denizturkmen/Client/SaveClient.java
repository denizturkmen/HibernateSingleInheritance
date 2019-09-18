package com.denizturkmen.Client;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Entity.Person;
import com.denizturkmen.Entity.Student;
import com.denizturkmen.Util.HibernateUtil;

public class SaveClient {
	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			Person person = new Person();
			person.setName("Deniz Türkmen");
			person.setGender("Erkek");
			
			Employee employee = new Employee();
			employee.setBonus(new BigDecimal("256.46"));
			employee.setDeptName("ARGE");
			employee.setDoj(new Date());
			employee.setEmail("turkmen@hotmail.com");
			employee.setName("Deniz");
			employee.setSalary(41566.32);
			employee.setGender("Erkek");
			
			Student student = new Student();
			student.setName("Eren");
			student.setGender("Erkek");
			student.setFee(46546F);
			student.setSchoolName("Başkent ÜNİ");
			student.setSectionName("4...");
			
			
			
			session.beginTransaction();
			session.save(person);
			session.save(student);
			session.save(employee);
			
			session.getTransaction().commit();
			
			
			
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
