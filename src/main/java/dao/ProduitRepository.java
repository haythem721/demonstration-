package dao;

import java.util.List;

import entities.Categorie;
import entities.Produit;

public interface ProduitRepository {
	public void save(Produit p,int idcat);
	public Produit getProduit(int id);
	public List<Produit>getProduitsParMC(String mc);
	public List<Produit>getallProduits();
	public List<Produit>getProduitsParCategorie(int id);
	
}
