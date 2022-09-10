package onetomany;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import EagerLoading.Address;

public class Demo {
	public static void main(String[] args) {
		
		EntityManager em= Persistence.createEntityManagerFactory("clientUnit").createEntityManager();
		
		 Collage c=new Collage();
		 c.setCollageName("msu");
		 c.setCollageAddress("jam");
		 
		 
		 Student s1=new Student();
		 s1.setStudentName("abbas");
		 s1.setMobileNumber("4856476648");
		 s1.setEmail("ffu@gmail.com");
		 s1.setCollage(c);
		 
		 Student s2=new Student();
		 s2.setStudentName("jay");
		 s2.setMobileNumber("48565756648");
		 s2.setEmail("fgtyu@gmail.com");
		 s2.setCollage(c);
		 
		 c.getStudent().add(s1);
		 c.getStudent().add(s2);
		 
		 em.getTransaction().begin();
		 em.persist(c);
		
		 
		 em.getTransaction().commit();
		 
		 em.close();
		 
		 System.out.println("done");
	}

}
