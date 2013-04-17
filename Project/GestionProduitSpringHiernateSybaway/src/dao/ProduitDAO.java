package dao;

import java.util.List;

public interface ProduitDAO {
	
	public void addProduit(Produit p);
	public void deleteProduit(Long id);
	public Produit getProduitById(Long id);
	public List<Produit> getAllProduits();
	public void updateProduit(Produit p);
	
}

