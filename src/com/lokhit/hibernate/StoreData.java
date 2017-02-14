package com.lokhit.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class StoreData {

	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction txn = session.beginTransaction();
		Person p1 = new Person();
		p1.setAge(10);
		p1.setpName("lokesh");
		
		Person p2 = new Person();
		p2.setAge(10);
		p2.setpName("priyank");
		
		Person p3 = new Person();
		p3.setAge(23);
		p3.setpName("hitesh");
		
		Address address1 = new Address();
		address1.setDistrict("Barmer");
		address1.setState("Rajasthan");
		address1.setPinCode(344001);
		
		Address address2 = new Address();
		address2.setDistrict("Gurgaon");
		address2.setState("Haryana");
		address2.setPinCode(12545);
		
		Address address3 = new Address();
		address3.setDistrict("Agra");
		address3.setState("UP");
		address3.setPinCode(15454);
		
		Address address4 = new Address();
		address4.setDistrict("Jodhpur");
		address4.setState("Rajasthan");
		address4.setPinCode(15454);
		
		Address address5 = new Address();
		address5.setDistrict("Lucknow");
		address5.setState("UP");
		address5.setPinCode(15454);
		
		Address address6 = new Address();
		address6.setDistrict("Ambala");
		address6.setState("Haryana");
		address6.setPinCode(58648);
		
//		List<Address> list1 = new ArrayList<Address>();
//		list1.add(address1);
//		list1.add(address2);
//		list1.add(address3);
//		list1.add(address6);
//		
//		p1.setAddress(list1);
//		
//		List<Address> list2 = new ArrayList<Address>();
//		list2.add(address4);
//		p2.setAddress(list2);
//		
//		List<Address> list3 = new ArrayList<Address>();
//		list3.add(address5);
//		p3.setAddress(list3);
		
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		txn.commit();
//		session.flush();

//		Criteria criteria = session.createCriteria(Person.class);
//		criteria.createCriteria("address","addr");//inner joins internally 
//		criteria.add(Restrictions.eq("addr.pinCode", 344001l));
//		criteria.addOrder(Order.asc("name"));
//		criteria.add(Restrictions.like("name","%L%"));
//		criteria.setFirstResult(1);
//		criteria.setMaxResults(10);
//		criteria.setProjection(Projections.property("name"));
	
//		@SuppressWarnings("unchecked")
//		List<Person> result = criteria.list();
//		for (Person person : result) {
//			System.out.println(person.getpName());
//		}
		
//		String query = "select p.name from Person p inner join p.address and p.address.pinCode="+344001;
//		Query q = session.createQuery(query);
		
//		Query query = session.createQuery("From Person");
//		List<Person> list1 = query.list();
//		List<Address> list2 = new ArrayList<Address>();
		 
//		for (Person address : list1) {
//			
//			list2 = address.getAddress();
//			for(Address addr : list2)
//			{
//				System.out.println(addr.getDistrict());
//			}
//		}
		
		session.flush();
		session.close();
		System.out.println("Successfully Saved");
		
		
		
//		System.out.println("Successfully Saved");
		
		
		
		
		
		
		
		
	}
	
}
