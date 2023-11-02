package com.algodomain.test.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    private String productCategory;
    private int discount;
    private  int gst;
    private int deliveryCharge;

    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    private List<Product> products;

}
