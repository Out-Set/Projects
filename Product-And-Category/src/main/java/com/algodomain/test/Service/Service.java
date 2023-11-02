package com.algodomain.test.Service;

import com.algodomain.test.Entity.Product;
import com.algodomain.test.Repository.CategoryRepository;
import com.algodomain.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository chargesRepository;

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

//        int productId = 1001;


    public Map<String, Object> productDetails(int productId) {
        Product p1 = new Product();
        p1 = productRepository.findByProductId(productId);

        int pId = p1.getProductId();
        String pName = p1.getProductName();
        String pType = p1.getProductType();
        String pCategory = p1.getCategory().getProductCategory();
        int pBasePrice = p1.getProductPrice();
        int pDiscount = p1.getCategory().getDiscount();

        // Calculated Total Discount on Product
        int totalDiscount = pBasePrice - (pBasePrice * pDiscount) / 100;

        // Charges
        int pGst = p1.getCategory().getGst();
        int pDeliveryCharge = p1.getCategory().getDeliveryCharge();


        // Product Final Price
        int finalPrice = pBasePrice + (pBasePrice - (pBasePrice * pGst) / 100) + pDeliveryCharge - totalDiscount;

        // ArrayList
//            ArrayList<Object> objects = new ArrayList<>();
//            objects.add(pId);
//            objects.add(pName);
//            objects.add(pType);
//            objects.add(pCategory);
//            objects.add(pBasePrice);
//            objects.add(pDiscount);
//            objects.add(totalDiscount);
//            objects.add(pGst);
//            objects.add(pDeliveryCharge);
//            objects.add(finalPrice);

        HashMap<String, Integer> charges = new HashMap<>();
        charges.put("gst", pGst);
        charges.put("delivery", pDeliveryCharge);

        // HashMap
        HashMap<String, Object> map = new HashMap<>();
        map.put("productId", pId);
        map.put("name", pName);
        map.put("productType", pType);
        map.put("category", pCategory);
        map.put("basePrice", pBasePrice);
        map.put("discount", pDiscount);
        map.put("charges", charges);
        map.put("finalPrice", finalPrice);

        return map;
    }
}

