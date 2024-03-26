package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department department = new Department(1, "Atlantic Records");
		Seller seller = new Seller(1, "Wiz", "wiz@gmail.com", new Date(), 7400.00, department);
		
		System.out.println(seller);	
	}
}
