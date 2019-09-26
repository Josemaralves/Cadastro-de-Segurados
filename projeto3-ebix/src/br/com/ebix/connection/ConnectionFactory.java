package br.com.ebix.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("segurado");
	
	public static EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
}
