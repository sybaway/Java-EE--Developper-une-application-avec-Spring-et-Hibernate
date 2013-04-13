package services;

import java.util.List;

import dao.Produit;

public interface ProduitMetier {
	
	public void addProduit(Produit p);
	public void deleteProduit(Long id);
	public List<Produit> getAllProduits();
	public Produit getProduitById(Long id);


}
