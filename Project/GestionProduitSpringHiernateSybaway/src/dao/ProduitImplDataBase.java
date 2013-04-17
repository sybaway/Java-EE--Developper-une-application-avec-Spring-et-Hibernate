package dao;

import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;

public class ProduitImplDataBase implements ProduitDAO {

	public void addProduit(Produit p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	public void deleteProduit(Long id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, id);
		session.delete(p);
		session.getTransaction().commit();
	}

	public Produit getProduitById(Long id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, id);
		return p;
	}

	public List<Produit> getAllProduits() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Produit").list();
	}

	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
	}
	
	public void init(){
		System.out.println("hibernate framework !! ");
	}
}
