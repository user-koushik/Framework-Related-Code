package com.api.hiber.mainFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.api.hiber.helpers.Factoryhelper;
import com.api.hiber.models.Yodlee_Employee;
import com.api.hiber.models.Yodlee_Event;

public class App {
	
	// Adding the Data
	public static void addEvent(Yodlee_Event event){
		SessionFactory sessionFactory = Factoryhelper.getConnection();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		try {
			session.save(event);
			transaction.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	// Retrieving the Data
	public static void read(){
		Session session = Factoryhelper.getConnection().openSession();
		List<Yodlee_Event> eventList = session.createQuery("from Yodlee_Event").list();
		
		for(Yodlee_Event event : eventList){
			System.out.println(event.getName()); 
		}
	}
	
	
	// Get data by ID
	public static Yodlee_Event getEventbyId(int id){
		Session session = Factoryhelper.getConnection().openSession();
		Yodlee_Event evnt = (Yodlee_Event) session.get(Yodlee_Event.class, id);
		return evnt;
	}
	
	//Update the event
	public static void updateEvent(Date date , int id){
		Session session = Factoryhelper.getConnection().openSession();
		Yodlee_Event evnt = (Yodlee_Event) session.get(Yodlee_Event.class, id);
		evnt.setEventDate(date); 
		
		Transaction trans = session.beginTransaction();
		try {
			session.update(evnt);
			trans.commit();
		} catch (HibernateException heb) {
			heb.printStackTrace();
		}
	}
	
	// Delete the event
	public static void deleteEvent(int id){
		Session session = Factoryhelper.getConnection().openSession();
		Yodlee_Event evnt = (Yodlee_Event) session.get(Yodlee_Event.class, id);
		
		evnt.getEventId();
		
		Transaction transDet = session.beginTransaction();
		try {
			session.delete(evnt);
			transDet.commit();
		} catch (HibernateException hebt) {
			hebt.printStackTrace();
		}
	}
	
	public static void detachedObject(){
		Session session = Factoryhelper.getConnection().openSession();
		Yodlee_Event event1 = (Yodlee_Event) session.get(Yodlee_Event.class, 2);
		Yodlee_Event event2 = (Yodlee_Event) session.get(Yodlee_Event.class, 3);
		
		Transaction transDet = session.beginTransaction();
		
		session.evict(event2); // Detaching the Object
		
		event1.setLocation("London"); 
		event2.setLocation("Brisbane"); 
		
		session.getTransaction().commit();
	}
	
	
	// Adding Employees data which is Fireign Key relationship with Event entity
	public static void addEmployee(List<Yodlee_Employee> employeeList){
		Session session = Factoryhelper.getConnection().openSession();
		Yodlee_Event event = (Yodlee_Event) session.get(Yodlee_Event.class, 2);
		event.setEmployeeList(employeeList);
		Transaction transaction = session.beginTransaction();
		
		try {
			session.getTransaction().commit();
		} catch (HibernateException hib) {
			hib.printStackTrace();
			transaction.rollback();
		}
		finally {
			session.close();
		}
	}
	
	public static void main(String[] args) {
		
		/*Yodlee_Event event = new Yodlee_Event();
		event.setName("Hibernate Annotation Demo");
		event.setEventDate(new Date(118,9,4));
		event.setLocation("Bangalore");
		
		addEvent(event);*/ 
		
		//read();
		
		//System.out.println(getEventbyId(1).getName()); 
		
		//updateEvent(new Date(118,12,29), 2);
		
		//deleteEvent(1); 
		
		//detachedObject();
		
		List<Yodlee_Employee> empList = new ArrayList<Yodlee_Employee>();
		Yodlee_Employee empData = new Yodlee_Employee();
		empData.setEmpId(234);
		empData.setEmpName("Brown");
		
		empList.add(empData);
		
		addEmployee(empList); 
		
	}

}
