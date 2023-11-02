package com.algodomain.test.Controller;

import com.algodomain.test.Entity.Category;
import com.algodomain.test.Entity.Product;
import com.algodomain.test.Repository.CategoryRepository;
import com.algodomain.test.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    // Required API
    @GetMapping("product/{id}")
    public Map<String, Object> productDetails(@PathVariable int id) {
        Product p1 = new Product();
        p1 = productRepository.findByProductId(id);

        int pId = p1.getProductId();
        String pName = p1.getProductName();
        String pType = p1.getProductType();
        String pCategory = p1.getCategory().getProductCategory();
        int pBasePrice = p1.getProductPrice();

        // Get Discount %
        int pDiscount = p1.getCategory().getDiscount();

        // Calculated Total Discount on Product
        float totalDiscount = (pBasePrice * pDiscount)/100;

        // Get gst %
        int pGst = p1.getCategory().getGst();

        // Calculated Total GST on Product
        float totalGst = ((pBasePrice - totalDiscount)*pGst)/100;

        // Delivery Charge
        float pDeliveryCharge = p1.getCategory().getDeliveryCharge();

        // Product Final Price
        float finalPrice = pBasePrice - totalDiscount + totalGst + pDeliveryCharge;


        // Charges HashMap
        HashMap<String, Float> charges = new HashMap<>();
        charges.put("gst", totalGst);
        charges.put("delivery", pDeliveryCharge);

        // HashMap
        HashMap<String, Object> map = new HashMap<>();
        map.put("productId", pId);
        map.put("name", pName);
        map.put("productType", pType);
        map.put("category", pCategory);
        map.put("basePrice", pBasePrice);
        map.put("discount", totalDiscount);
        map.put("charges", charges);
        map.put("finalPrice", finalPrice);

        return map;
    }
}
