package com.example.DeliveryMatch.service;

import com.example.DeliveryMatch.Dto.ConducteurDto;
import com.example.DeliveryMatch.Mapper.ConducteurMapper;
import com.example.DeliveryMatch.Model.Conducteur;
import com.example.DeliveryMatch.Repository.ConducteurRipository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ConducteurService {

    private final ConducteurRipository conducteurRipository;
    private final ConducteurMapper conducteurMapper;
    @Transactional
    public ConducteurDto create(ConducteurDto conducteurDto) {
        return conducteurMapper.conducteurToDto(conducteurRipository
                .save(conducteurMapper.dtoToConducteur(conducteurDto)));
    }


    public List<ConducteurDto> getAllConducteurs() {
        return conducteurRipository.findAll().stream()
                .map(conducteur->conducteurMapper.conducteurToDto(conducteur))
                .toList();
    }

    public ConducteurDto getConducteurById(Long id) {
        return conducteurRipository.findById(id)
                .map(conducteur->conducteurMapper.conducteurToDto(conducteur))
                .orElseThrow(()-> new  RuntimeException("aaaaaaaaaaaaaa"));
    }

    public ConducteurDto updateConducteur(ConducteurDto conducteurDto , Long id) {
        Conducteur conducteur = conducteurRipository.findById(id).get();
        conducteur.setFirstName(conducteurDto.getFirstName());
        conducteur.setLastName(conducteurDto.getLastName());
        conducteur.setEmail(conducteurDto.getEmail());
        conducteur.setPassword(conducteurDto.getPassword());

        return conducteurMapper.conducteurToDto(conducteurRipository
                .save(conducteurMapper.dtoToConducteur(conducteurDto)));
    }

    public void deleteConducteur(Long id) {
        conducteurRipository.deleteById(id);
    }
}
