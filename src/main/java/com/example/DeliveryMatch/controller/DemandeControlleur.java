package com.example.DeliveryMatch.controller;

import com.example.DeliveryMatch.Dto.DemandeDto;
import com.example.DeliveryMatch.service.DemandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DemandeControlleur {

    public DemandeService demandeService ;


    @PostMapping("/AddDemande")
    public DemandeDto AddDemande(@RequestBody DemandeDto demandeDto){
        return demandeService.AddDemande(demandeDto);
    }

    @GetMapping("/AllDemandes")
    public List<DemandeDto> getAllDemandes(){
        return demandeService.getAllDemandes();
    }

    @GetMapping("/Demande/{id}")
    public DemandeDto getDemandeById(@PathVariable Long id){
        return demandeService.getDemandeById(id);
    }

    @PutMapping("/demande/{id}")
    public DemandeDto UpdateDemande(@RequestBody DemandeDto demandeDto ,@PathVariable Long id){
        return demandeService.UpdateDemande(demandeDto , id);
    }


    @DeleteMapping("supDemande/{id}")
    public void DeleteDemande (@PathVariable Long id){
        demandeService.deleteById(id);
    }


}
