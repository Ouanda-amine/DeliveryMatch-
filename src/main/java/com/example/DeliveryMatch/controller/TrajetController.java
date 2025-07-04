package com.example.DeliveryMatch.controller;

import com.example.DeliveryMatch.Dto.TrajetDto;
import com.example.DeliveryMatch.service.TrajetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")

public class TrajetController {

    public TrajetService trajetService;

    @PostMapping("/AddTrajet")
    public TrajetDto AddTrajet(@RequestBody TrajetDto trajetDto){
        return trajetService.AddTrajet(trajetDto);
    }

    @GetMapping("/AllTrajets")
    public List<TrajetDto> getAllTrajets(){
        return trajetService.getAllTrajets();
    }

    @GetMapping("/Trajet/{id}")
    public TrajetDto getTrajetById(@PathVariable Long id){
        return trajetService.getTrajetById(id);
    }

    @PutMapping("/trajet/{id}")
    public TrajetDto updateTrajet(@PathVariable Long id ,@RequestBody TrajetDto trajetDto){
        return trajetService.updateTrajet(id , trajetDto);
    }

    @DeleteMapping("/trajetSup/{id}")
    public void deletetrajet(@PathVariable Long id ){
        trajetService.deleteTrajet(id);
    }

    @GetMapping("/TrajetsOfConducteur/{id}")
    public List<TrajetDto> getTrajetsByConducteurId(@PathVariable Long id){
        return trajetService.getTrajetsByConducteurId(id);
    }
}
