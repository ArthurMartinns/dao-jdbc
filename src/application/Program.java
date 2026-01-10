package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.print(seller);
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		Seller newSeller = new Seller(null, "NovoVendedor", "novovendedor@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		
		System.out.print("New id after insert method: " + newSeller.getId());
		
		System.out.println();
		
		seller = sellerDao.findById(1);
		seller.setName("Marta");
		sellerDao.update(seller);
		
		System.out.print("Updated!");
	}

}
