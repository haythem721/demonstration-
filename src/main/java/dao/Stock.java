package dao;

import java.util.ArrayList;
import java.util.List;

import entities.Produit;

public class Stock {
	
	private static List<Produit>liste=new ArrayList<>(); 
	public static List<Produit> getListe() {
		return liste;
	}
	public static void setListe(List<Produit> liste) {
		Stock.liste = liste;
	}
	static {
		liste.add(new Produit(1, "aaaa", 10, 10.5));
		liste.add(new Produit(2, "bbbb", 120, 100.5));
		liste.add(new Produit(3, "cccc", 150, 120.5));
		liste.add(new Produit(4, "dddd", 190, 190.5));
	}

}
