package edu.badpals.domain;

import java.util.Optional;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "farmer")
public class Farmer extends PanacheEntity{

    @Column(name = "name")
    private String name = "";

    @Column (name = "location")
    private String location = "";

    public Farmer() {
    }

    public Farmer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    
    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId(){
        return id;
    }

}
