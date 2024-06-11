package edu.badpals.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruit")
public class Fruit extends PanacheEntity{

    @Column(name = "name")
    private String name = "";
    
    @Column(name = "description")
    private String description ="";
    
    @ManyToOne
    @JoinColumn (name = "farmer_id")
    private Farmer farmer;
    
    public Fruit() {
    }

    public Fruit(String name, String description, Farmer farmer) {
        this.name = name;
        this.description = description;
        this.farmer = farmer;
    }

    public String getName() {
        return name;
    }

    public String getdescription() {
        return description;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public Long getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Fruit [description=" + description + ", farmer=" + farmer + ", id=" + id + ", name=" + name + "]";
    }
}
