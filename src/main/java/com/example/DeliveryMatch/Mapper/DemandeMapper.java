package com.example.DeliveryMatch.Mapper;

import com.example.DeliveryMatch.Dto.DemandeDto;
import com.example.DeliveryMatch.Model.Demande;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface DemandeMapper {

    DemandeDto ToDemandeDTO (Demande demande);
    Demande ToDemandeEntity (DemandeDto demandeDto);


}
