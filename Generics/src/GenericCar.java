public abstract class GenericCar <T>{
    private String carBrand;
    private T hp;
    private T doorsQuantity;

    protected GenericCar(String carBrand, T hp, T doorsQuantity) {
        this.carBrand = carBrand;
        this.hp = hp;
        this.doorsQuantity = doorsQuantity;
    }

    public String getCarBrand(){
        return this.carBrand;
    }

    public T getHp(){
        return this.hp;
    }

    public T getDoorsQuantity(){
        return this.doorsQuantity;
    }

    public void showCustumerCar(){
        System.out.println("A marca do carro é: " + this.carBrand +
                " possuindo " + this.hp + " cavalos" +
                " com " + this.doorsQuantity + " portas.");
    }
}
