package edu.badpals.services;

import java.util.List;
import java.util.Optional;

import edu.badpals.domain.Farmer;
import edu.badpals.domain.Fruit;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServiceFruit {

    public List<Fruit> list(){

    List<Fruit> lista = Fruit.listAll();
    return lista;
    }

    public void add(Fruit fruit){
        
        Optional<Farmer> farmer = Farmer.find("name =?1", fruit.getFarmer().getName()).firstResultOptional();
    
        if(farmer.isPresent()){

            Fruit fruit2 = new Fruit(fruit.getName(), fruit.getdescription(), farmer.get());
        
            fruit2.persist();
            return;
        }
        Farmer farmer3 = new Farmer(fruit.getFarmer().getName(), fruit.getFarmer().getLocation());

        farmer3.persist();
    
        Fruit fruit2 = new Fruit(fruit.getName(), fruit.getdescription(), farmer3);
        
        fruit2.persist();
    }

        public void remove(String elnombredelaputafrutadeloscojones){
        
            Fruit.delete("name = ?1", elnombredelaputafrutadeloscojones);


        }

        public Optional<Fruit> getFruit(String elnombredelaputafrutadeloscojonesahoramuchomasfruta){


            Optional<Fruit> fruit = Fruit.find("name = ?1", elnombredelaputafrutadeloscojonesahoramuchomasfruta).firstResultOptional();

            return fruit;




        }
}
        



