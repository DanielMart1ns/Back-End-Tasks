public abstract class GenericCar <T>{
    private String modelCar;
    private T hp;
    private T modelVersion;

    protected GenericCar(String modelCar, T hp, T modelVersion) {
        this.modelCar = modelCar;
        this.hp = hp;
        this.modelVersion = modelVersion;
    }

    public String getModelCar(){
        return this.modelCar;
    }

    public T getHp(){
        return this.hp;
    }

    public T getModelVersion(){
        return this.modelVersion;
    }

    public abstract void showCustumerCar();
}
