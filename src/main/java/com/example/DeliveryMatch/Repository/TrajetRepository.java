package com.example.DeliveryMatch.Repository;

import com.example.DeliveryMatch.Model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TrajetRepository extends JpaRepository<Trajet, Long> {
}
