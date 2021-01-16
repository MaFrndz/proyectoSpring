package com.prueba.Proyecto1.persistence;

import java.util.List;
import java.util.Optional;

import com.prueba.Proyecto1.persistence.entity.producto;
import com.prueba.Proyecto1.persistence.mapper.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prueba.Proyecto1.domain.product;
import com.prueba.Proyecto1.domain.repository.productRepository;
import com.prueba.Proyecto1.persistence.crud.productoCrudRepository;


@Repository
public class productoRepository  implements productRepository  {
    
    @Autowired
    private productoCrudRepository crud ;
    
    @Autowired
    public ProductMapper mapper;
    
    @Override
    public List<product> getAll() {
        //List<producto> productos = (List<producto>) crud.findAll();
        List<producto> productos = (List<producto>) crud.findAll();
         
        return   mapper.toProducts(productos);
    }

    @Override
    public Optional<List<product>> getByCategory(int categoryId) {
        List<producto> productos =  crud.findByIdCategoriaOrderByNombreAsc(categoryId);
        return null;//Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<product>> getScaseProducts(int quantity) {
        Optional<List<producto>> productos  = crud.findByCantidadStockLessThanAndEstado(quantity, true);
        return null;//productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<product> getProduct(int idProducto) {
         
        return null;//crud.findById(idProducto).map(prod -> mapper.toProduct(prod));
    }

    @Override
    public product save(product product) {

        //producto producto = mapper.toProducto(product);
        return null;//mapper.toProduct(crud.save(producto)) ;
        
    }
    @Override
    public void delete(int idProducto){
         crud.deleteById(idProducto);
    }

    
}
