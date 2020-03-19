package controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategorieRepositoryImpl;
import dao.ProduitRepository;
import dao.ProduitRepositoryImpl;
import dao.Stock;
import entities.Produit;

/**
 * Servlet implementation class ServletControleur
 */

public class ServletControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitRepository produitRepository = new ProduitRepositoryImpl();
	/*
	 * public void init() { produitRepository=new ProduitRepositoryImpl(); }
	 */

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletControleur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		List<Produit> ll = null;
		String action = request.getParameter("action");
		if (action == null)
			ll = produitRepository.getallProduits();

		else {
			if (action.equals("ajout")) {
				String nom = request.getParameter("nom");
				int qt = Integer.parseInt(request.getParameter("qt"));
				double prix = Double.parseDouble(request.getParameter("prix"));
				Produit p = new Produit(0, nom, qt, prix);
				produitRepository.save(p,Integer.parseInt(request.getParameter("c")));
				ll = produitRepository.getallProduits();
			}
			if (action.equals("rechercher")) {
				String nom = request.getParameter("mc");
				ll=produitRepository.getProduitsParMC(nom);

			}

		}

		request.setAttribute("liste", ll);
		request.setAttribute("categories", new CategorieRepositoryImpl().getAllCategories());
		System.out.println(ll);
		request.getRequestDispatcher("/vues/listeProduit.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
