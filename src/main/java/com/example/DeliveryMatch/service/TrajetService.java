package com.example.DeliveryMatch.service;

import com.example.DeliveryMatch.Dto.TrajetDto;
import com.example.DeliveryMatch.Mapper.TrajetMapper;
import com.example.DeliveryMatch.Model.Trajet;
import com.example.DeliveryMatch.Repository.ConducteurRipository;
import com.example.DeliveryMatch.Repository.TrajetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TrajetService {

    private  final TrajetRepository trajetRepository;
    private final TrajetMapper trajetMapper;
    private final ConducteurRipository conducteurRipository;

    public TrajetDto AddTrajet(TrajetDto trajetDto) {
        var conducteur = conducteurRipository.findById(trajetDto.getConducteurId()).orElse(null);
        Trajet trajet = new Trajet();
        var res = trajetRepository.save(new Trajet(null , trajetDto.getLieuDepart() , trajetDto.getEtapesIntermediaire(), trajetDto.getDestinationFinal() , trajetDto.getDimensionAccepte() , trajetDto.getTypeMarchandise() , trajetDto.getCapacite() , conducteur));
        return new TrajetDto(res.getId(), res.getLieuDepart(), res.getEtapesIntermediaire(), res.getDestinationFinal(), res.getDimensionAccepte(), res.getTypeMarchandise(), res.getCapacite(), res.getConducteur().getId());
    }

    public List<TrajetDto> getAllTrajets() {
        return trajetRepository.findAll().stream()
                .map(trajetMapper::toTrajetDto)
                .toList();
    }

    public TrajetDto getTrajetById(Long  id) {
        return trajetRepository.findById(id).map(trajet->trajetMapper.toTrajetDto(trajet))
                .orElseThrow(()->new RuntimeException("not found"));
    }

    public TrajetDto updateTrajet(Long id ,TrajetDto trajetDto) {
        Trajet trajet = trajetRepository.findById(id).get();

        trajet.setCapacite(trajetDto.getCapacite());
        trajet.setLieuDepart(trajetDto.getLieuDepart());
        trajet.setEtapesIntermediaire(trajetDto.getEtapesIntermediaire());
        trajet.setDimensionAccepte(trajetDto.getDimensionAccepte());
        trajet.setDestinationFinal(trajetDto.getDestinationFinal());
        trajet.setTypeMarchandise(trajetDto.getTypeMarchandise());

        return trajetMapper.toTrajetDto(trajetRepository.save(trajetMapper.toTrajet(trajetDto)));
    }

    public  void deleteTrajet(Long id) {
        trajetRepository.deleteById(id);
    }
}
