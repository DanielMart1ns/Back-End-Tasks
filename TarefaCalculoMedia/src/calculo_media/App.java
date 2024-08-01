package calculo_media;
public class App {
    public static void main(String[] args) {
        //Definindo a variável e instanciando a classe
        Media media = new Media();

        //Atribuindo as valores as propriedades de notas
        media.setNota1(7.5);
        media.setNota2(8);
        media.setNota3(7.5);
        media.setNota4(9.8);

        //Chamando o método de mostrar média
        media.mostrarMedia();
    }
}
