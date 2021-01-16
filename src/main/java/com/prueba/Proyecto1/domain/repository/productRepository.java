package com.prueba.Proyecto1.domain.repository;

import java.util.List;
import java.util.Optional;

import com.prueba.Proyecto1.domain.product;
import com.prueba.Proyecto1.persistence.entity.producto;




public interface productRepository  {
    List<product> getAll();
    Optional<List<product>> getByCategory(int categoryId);
    Optional<List<product>> getScaseProducts(int quantity);
    Optional<product> getProduct(int idProducto);
    product save( product producto);
    void delete (int productId);
}
