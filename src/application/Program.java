package application;

import java.sql.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "First Department");
		Seller seller = new Seller(21, "Arthur", "arthur@gmail.com", new Date(0), 5000.0, obj);
	
		System.out.print(seller);
	}

}
