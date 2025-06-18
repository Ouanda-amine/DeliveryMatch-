package com.example.DeliveryMatch.Repository;

import com.example.DeliveryMatch.Model.Conducteur;
import com.example.DeliveryMatch.Model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConducteurRipository extends JpaRepository<Conducteur, Long> {


}
