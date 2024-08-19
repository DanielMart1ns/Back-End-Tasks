package factory;

public class StandardVersion extends CarFactory{
    public StandardVersion(
            String model,
            Integer doorsQuantity,
            String colorCar,
            Long horsePower,
            String fuelType)
            {
        super(model, doorsQuantity, colorCar, horsePower, fuelType);
    }
}
