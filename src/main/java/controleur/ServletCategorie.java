package controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategorieRepository;
import dao.CategorieRepositoryImpl;
import entities.Categorie;
import entities.Produit;

/**
 * Servlet implementation class ServletCategorie
 */
public class ServletCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CategorieRepository categorie=new CategorieRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCategorie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Categorie> ll = null;
		String action = request.getParameter("action");
		//if (action == null)
			


			if (action!= null && action.equals("add")) {
				String nom = request.getParameter("nom");
				
				Categorie c=new Categorie();
				c.setNom(nom);
				categorie.addCategorie(c);

			}
			

		ll = categorie.getAllCategories();
		request.setAttribute("liste", ll);
		System.out.println(ll);
		request.getRequestDispatcher("/addCategorie.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
