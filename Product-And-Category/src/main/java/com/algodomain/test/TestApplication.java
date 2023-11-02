package com.algodomain.test;

import com.algodomain.test.Repository.CategoryRepository;
import com.algodomain.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository chargesRepository;

	@Override
	public void run(String... args) throws Exception {

		// Inserting Values into Tables
		// Product Table
//		productRepository.save( new Product("Lenovo Yoga",	"Laptop", "Electronics",45000));
//		productRepository.save( new Product("LG Washing Machine", "Washing Machine", "Home Appliances", 25000));
//		productRepository.save( new Product("HP Pavilion 360",	"Laptop", "Electronics", 60000));
//		productRepository.save( new Product("US Polo Assn", "T-Shirt", "Clothing", 1200));
//		productRepository.save( new Product("Neelkamal Been Bag", "Sofa Set", "Furniture", 350));

		// Charges Table
//		chargesRepository.save( new Category("Electronics", 15, 18, 350));
//		chargesRepository.save( new Category("Home Appliances", 22, 24, 800));
//		chargesRepository.save( new Category("Clothing",	40, 12, 0));
//		chargesRepository.save( new Category("Furniture",10, 18, 300));

		// output as below

//    {
//        “productId”: “1001”,
//        "name": "Lenovo Yoga",
//        "productType": "Laptop",
//        "category": "Electronics",
//        "basePrice": "45000.00",
//        "discount": 6750.00,
//        "charges": {
//                "gst": "6885.00",
//                "delivery": "350.00"
//         },
//        "finalPrice": "45485.00"
//    }

	}
}
