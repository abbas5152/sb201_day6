package onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo2 {
   
	public static void main(String[] args) {
		EntityManager em= Persistence.createEntityManagerFactory("clientUnit").createEntityManager();
		
		Query q= em.createQuery("select student from Collage where collageId=1");
		System.out.println(q);
		List<Student> s= q.getResultList();
		
		System.out.println(s);
		
		
		Query q1= em.createQuery("select collage from Student where studentRoll=2");
		System.out.println(q1);
		Collage  c= (Collage) q1.getSingleResult();
		
		System.out.println(c);
		
	}
}
