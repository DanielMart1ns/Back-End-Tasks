package factory;

public class SuperSportVersion extends CarFactory{
    public SuperSportVersion(String modelCar,
                             Integer doorsQuantity,
                             String colorCar,
                             Long horsePower,
                             String fuelType){
        super(modelCar, doorsQuantity, colorCar, horsePower, fuelType);
    }
}
