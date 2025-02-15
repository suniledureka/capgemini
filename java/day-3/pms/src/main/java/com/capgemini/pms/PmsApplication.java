package com.capgemini.pms;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.pms.entities.Product;
import com.capgemini.pms.services.ProductServices;

@SpringBootApplication
public class PmsApplication implements CommandLineRunner{
	@Autowired
	private ProductServices service;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		SpringApplication.run(PmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		while(true) {
			System.out.println("1. New Product");
			System.out.println("2. Search Product");
			System.out.println("3. Delete Product");
			System.out.println("4. All Products");
			System.out.println("5. Exit");
			
			System.out.print("\nwhat you want to do?  ");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1:
				Product p = createProduct();
				service.saveProduct(p);
				break;
			case 2:
				System.out.print("search product with id: ");
				int pd = sc.nextInt();
				Product prod = service.searchProductById(pd);
				if(prod != null)
					System.out.println(prod);
				else
					System.out.println("No matching product found");
				break;
			case 3:
				System.out.print("enter product id to be deleted: ");
				int pid = sc.nextInt();
				prod = service.searchProductById(pid);
				if(prod != null) {
					System.out.println(prod);
					System.out.print("do yo want to delete above product? [Y/N]: ");
					String req = sc.next();
					if(req.equalsIgnoreCase("Y"))
						service.deleteByProductId(pid);
				}
				
				break;
			case 4:
				service.listAllProducts();
				break;
			case 5:
				System.out.println("Application Designed & developed by ");
				System.out.println("\t team@capgemini");
				sc.close();
				System.exit(0);
				break;
			default:
				System.err.println("Please provide a valid option");				
			}//switch
			System.out.println("=".repeat(60));
		}//while
		
	}

	private Product createProduct() {
		System.out.print("enter product id: ");
		int pid = sc.nextInt();
		
		System.out.print("enter product name: ");
		String pname = sc.next();
		
		System.out.print("enter product price: ");
		float pprice = sc.nextFloat();
		
		return new Product(pid, pname, pprice);
	}

}
