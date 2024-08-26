public class MitsubishiCar<T> extends GenericCar{

    public MitsubishiCar(String modelCar, T hp, T modelVersion){
        super(modelCar, hp, modelVersion);
    }


    @Override
    public void showCustumerCar() {
        System.out.println("==========================");
        System.out.println("Carro da marca Mitsubishi");
        System.out.println("Modelo: " + getModelCar());
        System.out.println("Potência: " + getHp() +"HP");
        System.out.println("Modelo de versão: " + getModelVersion());
    }
}
