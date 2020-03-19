package dao;

import java.util.List;

import entities.Categorie;

public interface CategorieRepository {
	public void addCategorie(Categorie c);
	public Categorie getCategorie(int id);
	public List<Categorie> getAllCategories();
	

}
