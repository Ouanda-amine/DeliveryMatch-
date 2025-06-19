package com.example.DeliveryMatch.Repository;

import com.example.DeliveryMatch.Model.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemandeRepository extends JpaRepository<Demande , Long> {

    List<Demande> getDemandeByExpediteur_Id(Long idExpediteur);
}
