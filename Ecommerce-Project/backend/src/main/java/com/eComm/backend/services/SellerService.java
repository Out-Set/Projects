package com.eComm.backend.services;

import com.eComm.backend.entities.Seller;
import com.eComm.backend.repositories.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    private SellerRepo sellerRepo;

    public Seller saveSeller(Seller seller){
        return sellerRepo.save(seller);
    }

    public List<Seller> getSeller(){
        return sellerRepo.findAll();
    }
}
