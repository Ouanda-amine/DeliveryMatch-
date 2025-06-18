package com.example.DeliveryMatch.Repository;

import com.example.DeliveryMatch.Dto.TrajetDto;
import com.example.DeliveryMatch.Model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrajetRepository extends JpaRepository<Trajet, Long> {

    List<Trajet> getTrajetByConducteur_Id(Long conducteurId);
}
