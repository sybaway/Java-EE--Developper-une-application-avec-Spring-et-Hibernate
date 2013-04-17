package services;

import java.util.List;

import dao.Produit;
import dao.ProduitDAO;

public class ProduitImplMetier implements ProduitMetier {
	
	private ProduitDAO dao;
	
	public void addProduit(Produit p) {
		dao.addProduit(p);
	}

	public void deleteProduit(Long id) {
		dao.deleteProduit(id);
	}

	public List<Produit> getAllProduits() {
		return dao.getAllProduits();
	}

	public Produit getProduitById(Long id) {
		return dao.getProduitById(id);
	}

	public void setDao(ProduitDAO dao) {
		this.dao = dao;
	}
	
	
}
