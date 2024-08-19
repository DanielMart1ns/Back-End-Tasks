package factory;

public abstract class CarFactory {
    private String modelCar;
    private Integer doorsQuantity;
    private String colorCar;
    private Long horsePower;
    private String fuelType;

    private boolean isAbleToLaunch;

    public CarFactory(String modelCar,
                      Integer doorsQuantity,
                      String colorCar,
                      Long horsePower,
                      String fuelType) {
        this.modelCar = modelCar;
        this.doorsQuantity = doorsQuantity;
        this.colorCar = colorCar;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public void setLaunch(boolean isAbleToLaunch) {
        this.isAbleToLaunch = isAbleToLaunch;

        if(this.isAbleToLaunch){
            System.out.println("=============  Fabricado  =============");
            System.out.println("Modelo do carro: " + this.modelCar);
            System.out.println("Número de portas: " + this.doorsQuantity);
            System.out.println("Cor do carro: " + this.colorCar);
            System.out.println("Potência: " + this.horsePower + "HP");
            System.out.println("Combustão: " + this.fuelType);
            System.out.println("");
        }
    }


}
