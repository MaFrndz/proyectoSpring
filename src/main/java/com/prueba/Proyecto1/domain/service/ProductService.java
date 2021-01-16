package com.prueba.Proyecto1.domain.service;

import java.util.List;
import java.util.Optional;

import com.prueba.Proyecto1.domain.product;
import com.prueba.Proyecto1.domain.repository.productRepository;
import com.prueba.Proyecto1.persistence.entity.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    private productRepository productRepository ;

    public List<product> getAll(){
        return productRepository.getAll();
    }
    public Optional<product> getProduct(int productId){
        return productRepository.getProduct(productId);
    }
    public Optional<List<product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }
    public product save( product producto){
        return productRepository.save(producto);
    }
    public boolean delete (int productId){
        return getProduct(productId).map( product ->  {
            productRepository.delete(productId);
            return true;
        }).orElse( false);
        
        // otra forma
        //if(getProduct(productId).isPresent()){ return true; }
    }
}
