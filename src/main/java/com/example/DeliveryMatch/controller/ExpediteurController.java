package com.example.DeliveryMatch.controller;

import com.example.DeliveryMatch.Dto.ExpediteurDto;
import com.example.DeliveryMatch.service.ExpediteurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")

public class ExpediteurController {

    public ExpediteurService expediteurService;

    @PostMapping("/AddExpediteur")
    public ExpediteurDto AddExpediteur(@RequestBody ExpediteurDto expediteurDto){
        return expediteurService.createExpediteur(expediteurDto);
    }

   @GetMapping("/AllExpediteur")
    public List<ExpediteurDto> getAllExpediteur(){
        return expediteurService.getAllExpediteur();
    }

    @GetMapping("Expediteur/{id}")
    public ExpediteurDto getExpediteurById(@PathVariable Long id){
        return expediteurService.getExpediteurById(id);
    }
    @PutMapping("/expediteur/{id}")
    public ExpediteurDto UpdateExpediteur(@RequestBody ExpediteurDto expediteurDto ,@PathVariable Long id){
        return expediteurService.updateEx( expediteurDto , id);
    }

    @DeleteMapping("/removeExpediteur/{id}")
    public void deleteExpediteur(@PathVariable Long id){
        expediteurService.DeleteExpediteur(id);
    }
}
