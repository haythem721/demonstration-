package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entities.Categorie;

public class CategorieRepositoryImpl implements CategorieRepository {
	 EntityManager em=Singleton.getEm();
	@Override
	public void addCategorie(Categorie c) {
		// TODO Auto-generated method stub
		Singleton.getEt().begin();
		em.persist(c);
		Singleton.getEt().commit();
	}

	@Override
	public Categorie getCategorie(int id) {
		// TODO Auto-generated method stub
		return em.find(Categorie.class,id);
	}

	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		javax.persistence.Query q=em.createQuery("select c from Categorie c");
		return q.getResultList();
	}

}
