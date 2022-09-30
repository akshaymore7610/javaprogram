package com.onetomanyuniu.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import org.hibernate.query.Query;

import com.onetomanyuniu.Dao.UnivercityDao;
import com.onetomanyuniu.config.HibernateUtil;
import com.onetomanyuniu.entity.Student;
import com.onetomanyuniu.entity.University;

public class UnivercityDaoImpl  implements UnivercityDao{
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	public void addUnivercity() {
		
		University u=new University();
		u.setUname("Mumbai university");
		u.setUcity("Mumbai");
		u.setPhone(123654);
		u.setEmail("muabc@gmail.com");
		
		Student s=new Student();
		
		s.setSid(101);
		s.setSname("akshay");
		s.setSclass("BSc A");
		s.setSphone(684958);
		s.setSemail("akshayabc@gmail.com");
		
      Student s1=new Student();
		
		s1.setSid(102);
		s1.setSname("hitesh");
		s1.setSclass("CS B");
		s1.setSphone(321654);
		s1.setSemail("hitabc@gmail.com");
		
     Student s2=new Student();
		
		s2.setSid(103);
		s2.setSname("lahoo");
		s2.setSclass("BA C");
		s2.setSphone(465315);
		s2.setSemail("laacc@gmail.com");
      
		Student s3=new Student();
		
		s3.setSid(104);
		s3.setSname("saurabh");
		s3.setSclass("CA D");
		s3.setSphone(164852);
		s3.setSemail("saasc@gmail.com");
		
		
		ArrayList<Student>a1= new ArrayList<Student>();
		a1.add(s);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		u.setStudent(a1);
		session.save(u);
		t.commit();
		System.out.println("Inserted Successfully");
	}
	

	public void fetchUnivercity() {
		@SuppressWarnings({ "deprecation", "rawtypes" })
		Query q = session.createQuery(" From University ");

		// list with Citizen Entity
		@SuppressWarnings("unchecked")
		List<University> al1 = q.getResultList();

		// Transverse
		Iterator<University> itr = al1.iterator();
		while(itr.hasNext()) {
			University c1 = itr.next();
			List<Student> a23 = c1.getStudent();
			System.out.println(c1.getEmail() + " " + c1.getUname() + " " + c1.getPhone() + "" + c1.getStudent());
		}
		
	}

	
}
