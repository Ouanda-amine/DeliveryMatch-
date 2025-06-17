package com.example.DeliveryMatch.Mapper;

import com.example.DeliveryMatch.Dto.ConducteurDto;
import com.example.DeliveryMatch.Model.Conducteur;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ConducteurMapper {

    ConducteurDto conducteurToDto(Conducteur conducteur);
    Conducteur dtoToConducteur(ConducteurDto conducteurDto);


}
