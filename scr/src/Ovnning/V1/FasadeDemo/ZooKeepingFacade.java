package Ovnning.V1.FasadeDemo;

import java.util.ArrayList;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/20/2021
 */
public class ZooKeepingFacade {
    private CleaningService cleaningService=new CleaningService();
    private WaterService waterService=new WaterService();
    private FoodService foodService=new FoodService();

    public void  handleAnimals(ArrayList<Animal> animals) {
        for(Animal animal: animals)
        {
            this.cleaningService.clean(animal);
            this.foodService.feed(animal);
            this.waterService.serviceWater(animal);
        }
    }
}
