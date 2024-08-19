package factory;

public class LuxuryVersion extends CarFactory{
    public LuxuryVersion(String modelCar,
                         Integer doorsQuantity,
                         String colorCar,
                         Long horsePower,
                         String fuelType){
        super(modelCar, doorsQuantity, colorCar, horsePower, fuelType);
    }
}
