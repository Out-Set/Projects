package com.eComm.backend.controllers;

import com.eComm.backend.entities.Seller;
import com.eComm.backend.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService service;

    @PostMapping("")
    public Seller save(@RequestBody Seller seller){
        return service.saveSeller(seller);
    }

    @GetMapping("")
    public List<Seller> get(){
        return service.getSeller();
    }
}
