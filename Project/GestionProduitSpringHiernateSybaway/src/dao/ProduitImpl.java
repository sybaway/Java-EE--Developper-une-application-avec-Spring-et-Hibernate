package dao;

import java.util.ArrayList;
import java.util.List;

public class ProduitImpl implements ProduitDAO {
	
	private List<Produit> produits = new ArrayList<Produit>();
	
	public void init(){
		System.out.println("www.syabway.com !");
		
		addProduit(new Produit("PC 1","Sony vaio 1",7000.0));
		addProduit(new Produit("PC 2","Sony vaio 2",6000.0));
		addProduit(new Produit("PC 3","Sony vaio 3",4000.0));
		addProduit(new Produit("PC 4","Sony vaio 4",9000.0));
		addProduit(new Produit("PC 5","Sony vaio 5",8000.0));
		addProduit(new Produit("PC 6","Sony vaio 6",5000.0));
		addProduit(new Produit("PC 7","Sony vaio 7",3000.0));

	}
	
	public void addProduit(Produit p) {
		p.setIdProduit(new Long(produits.size() + 1));
		produits.add(p);
	}

	public void deleteProduit(Long id) {
		produits.remove(getProduitById(id));
		
		/*
		for(Produit p:produits){
			if(p.getIdProduit().equals(id)){
				produits.remove(p);
				break;
			}
		}
		*/
	}

	public Produit getProduitById(Long id) {
		Produit produit = null;
		for(Produit p:produits){
			if(p.getIdProduit().equals(id)){
				produit = p;
				break;
			}
		}
		return produit;
	}

	public List<Produit> getAllProduits() {
		return produits;
	}

	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

}
