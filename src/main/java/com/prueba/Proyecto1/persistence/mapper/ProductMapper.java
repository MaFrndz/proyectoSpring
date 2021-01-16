package com.prueba.Proyecto1.persistence.mapper;

import java.util.List;

import com.prueba.Proyecto1.domain.product;
import com.prueba.Proyecto1.persistence.entity.producto;

import org.mapstruct.InheritInverseConfiguration;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;



@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper  {
    ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

    
    @Mappings({
        @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category"),
    })
    product toProduct(producto producto);

    List<product> toProducts (List<producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    producto toProducto(product product);
}
