package dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;

import entities.Categorie;
import entities.Produit;

public class ProduitRepositoryImpl implements ProduitRepository {
	 EntityManager em=Singleton.getEm();

	@Override
	public void save(Produit p,int idcat) {
		// TODO Auto-generated method stub
		p.setCategorie(em.find(Categorie.class, idcat));
		Singleton.getEt().begin();
		em.persist(p);
		Singleton.getEt().commit();
		
	}

	@Override
	public Produit getProduit(int id) {
		// TODO Auto-generated method stub
		return em.find(Produit.class,id);
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		javax.persistence.Query q=em.createQuery("select p from Produit p where p.nom like :x");
		q.setParameter("x","%"+mc+"%");
		return q.getResultList();
	}

	@Override
	public List<Produit> getallProduits() {
		// TODO Auto-generated method stub
		javax.persistence.Query q=em.createQuery("select p from Produit p");
		return q.getResultList();
	}

	@Override
	public List<Produit> getProduitsParCategorie(int id) {
		// TODO Auto-generated method stub
		Categorie c=em.find(Categorie.class,id);
		javax.persistence.Query q=em.createQuery("select p from Produit p where p.categorie=:x");
		q.setParameter("x",c);
		return q.getResultList();
	}

}
