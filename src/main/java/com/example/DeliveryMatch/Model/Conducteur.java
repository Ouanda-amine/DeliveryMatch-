package com.example.DeliveryMatch.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
public class Conducteur extends User {

    public Conducteur() {
        this.setRole(Role.CONDUCTEUR);
    }
    @OneToMany(mappedBy = "conducteur"  , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Trajet> trajets;
}
