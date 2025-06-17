package com.example.DeliveryMatch.Mapper;

import com.example.DeliveryMatch.Dto.ExpediteurDto;
import com.example.DeliveryMatch.Model.Expediteur;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ExpediteurMapper {

    ExpediteurDto ToExpediteurDto (Expediteur expediteur);
    Expediteur ToExpediteurEntity (ExpediteurDto expediteurDto);
}
