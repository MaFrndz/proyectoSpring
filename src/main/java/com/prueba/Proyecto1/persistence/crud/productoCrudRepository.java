package com.prueba.Proyecto1.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.prueba.Proyecto1.persistence.entity.producto;


import org.springframework.data.repository.CrudRepository;

public interface productoCrudRepository extends CrudRepository<producto,Integer> {
    
    //@Query(value = "SELECT * FROM productos WHERE id_categoria= ?", nativeQuery = true)
    //List<producto> obtenerPorCategoria(int idCategoria);
    //List<producto> findByIdCategoria(int idCategoria);
    List<producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    
}
