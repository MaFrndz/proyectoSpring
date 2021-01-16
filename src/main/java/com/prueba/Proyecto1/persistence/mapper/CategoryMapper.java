package com.prueba.Proyecto1.persistence.mapper;

import com.prueba.Proyecto1.domain.category;
import com.prueba.Proyecto1.persistence.entity.categoria;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper( CategoryMapper.class );
    @Mappings({
        @Mapping(source = "idCategoria",target = "categoryId"),
        @Mapping(source = "descripcion",target = "category"),
        @Mapping(source = "estado",target = "active")
    })
    category toCategory ( categoria categoria );

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    categoria toCategoria (category category); 
}
