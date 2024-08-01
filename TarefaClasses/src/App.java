public class App {
    public static void main(String[] args){
        //Declarando a variável responsável por instanciar a classe "Car"
        Car car = new Car();
        
        //Atrinbuindo valores às nossas propriedades da classe
        car.setMarca("Volkswagen");
        car.setModelo("T-Cross");
        car.setQuantidadeDePortas(4);
        car.setAnoDeFabricacao(2021);

        //Mostando os valores atribuídos
        car.showProperties();
    }
}
