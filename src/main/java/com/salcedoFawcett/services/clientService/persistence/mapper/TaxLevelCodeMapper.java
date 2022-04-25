package com.salcedoFawcett.services.clientService.persistence.mapper;

import com.salcedoFawcett.services.clientService.domain.model.TaxLevelCode;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaxLevelCodeMapper {

    TaxLevelCode toTaxLevelCode(com.salcedoFawcett.services.clientService.persistence.entity.TaxLevelCode taxLevelCode);
    List<TaxLevelCode> toTaxLevelCodes(List<com.salcedoFawcett.services.clientService.persistence.entity.TaxLevelCode> taxLevelCodes);

    @InheritInverseConfiguration()
    com.salcedoFawcett.services.clientService.persistence.entity.TaxLevelCode toTaxLevelCode(TaxLevelCode taxLevelCode);
}
