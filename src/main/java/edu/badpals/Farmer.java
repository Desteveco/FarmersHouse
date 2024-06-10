package edu.badpals;

import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "farmer")
public class Farmer extends PanacheEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(unique = true)
    public String name;
    @Column
    public String location;

    public Farmer() {
    }

    public Farmer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "farmer")
    public Set<Fruit> fruits;
}