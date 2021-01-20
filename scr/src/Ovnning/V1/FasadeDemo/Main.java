package Ovnning.V1.FasadeDemo;

import java.util.ArrayList;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/20/2021
 */
public class Main {
    public  static void main(String[] args)
    {
        //Data
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Animal("Tiger"));
        animals.add(new Animal("Lion"));
//Facade
        ZooKeepingFacade zooKeepingFacade=new ZooKeepingFacade();
        zooKeepingFacade.handleAnimals(animals);
    }    }

