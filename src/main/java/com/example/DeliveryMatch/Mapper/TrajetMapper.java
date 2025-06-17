package com.example.DeliveryMatch.Mapper;

import com.example.DeliveryMatch.Dto.TrajetDto;
import com.example.DeliveryMatch.Model.Trajet;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TrajetMapper {

    TrajetDto toTrajetDto(Trajet trajet);
    Trajet toTrajet(TrajetDto trajetDto);
}
