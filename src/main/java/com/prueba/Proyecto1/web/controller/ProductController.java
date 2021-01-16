package com.prueba.Proyecto1.web.controller;

import java.util.List;
import java.util.Optional;

import com.prueba.Proyecto1.domain.product;
import com.prueba.Proyecto1.domain.service.ProductService;
import com.prueba.Proyecto1.persistence.entity.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductService serv;

    @GetMapping("/all")
    public List<product> getAll(){
        return serv.getAll();
    }

    public Optional<product> getProduct(int productId){
        return serv.getProduct(productId);
    }

    public Optional<List<product>> getByCategory(int categoryId){
        return serv.getByCategory(categoryId);
    }

    public product save(product prod){
        return serv.save(prod);
    }

    public boolean delete (int productId){
        return serv.delete(productId);
    }
}
