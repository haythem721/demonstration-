package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Singleton {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static  EntityTransaction et;
	static {
		
		  emf=Persistence.createEntityManagerFactory("gestion");
		  em=emf.createEntityManager();
		  et=em.getTransaction();
	}
	public static EntityManager getEm() {
		return em;
	}
	public static EntityTransaction getEt() {
		//if(et.isActive())
		//	et.
		return et;
	}
	
	

}
