package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.Produit;

import services.ProduitMetier;


@Controller
public class ProduitController  {
	
	@Autowired
	ProduitMetier services;
	
	// index.aspx
	@RequestMapping(value="/index")
	public String pageIndex(Model model){
		// trai....
		model.addAttribute("listeProduit", services.getAllProduits());
		return "produits";
		//   /Pages/produit.jsp
	}
	
	
	@RequestMapping(value="/searchProduct")
	public String searchProduct(Model model,@RequestParam(value ="idProduit") Long id){
		
		List<Produit> liste = new ArrayList<Produit>();
		liste.add(services.getProduitById(id));
		model.addAttribute("listeProduit", liste);
		model.addAttribute("idProduit", id);
		
		return "produits";
	}
	
	/*
	 * @RequestParam String nom, 
	   @RequestParam String description, 
	   @RequestParam Double prix
	 * 
	 */
	@RequestMapping(value="/addProduct")
	public String addProduct(Model model,Produit p){
		
		//Produit p = new Produit(nom, description, prix);
		services.addProduit(p);
		model.addAttribute("listeProduit", services.getAllProduits());

		return "produits";
	}
	
	
	@RequestMapping(value="/deleteProduit")
	public String supprimerProduit(Model model,@RequestParam Long id){
		services.deleteProduit(id);
		model.addAttribute("listeProduit", services.getAllProduits());
		return "produits";
	}
	
	

}
