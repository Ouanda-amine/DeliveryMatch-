package com.example.DeliveryMatch.Repository;

import com.example.DeliveryMatch.Model.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeRepository extends JpaRepository<Demande , Long> {
}
