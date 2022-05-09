package com.salcedoFawcett.services.clientService.persistence.mapper;

import com.salcedoFawcett.services.clientService.domain.model.TaxSchema;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaxSchemaMapper {
    TaxSchema toTaxSchema(com.salcedoFawcett.services.clientService.persistence.entity.TaxSchema taxSchema);
    List<TaxSchema> toTaxSchemaList(List<com.salcedoFawcett.services.clientService.persistence.entity.TaxSchema> taxSchemaList);

    com.salcedoFawcett.services.clientService.persistence.entity.TaxSchema toTaxSchema(TaxSchema taxSchema);
}
