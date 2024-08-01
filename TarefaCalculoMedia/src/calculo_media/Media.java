package calculo_media;

public class Media {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    //Definindo notas
    public void setNota1(double notaInformada){
        this.nota1 = notaInformada;
    }

    public void setNota2(double notaInformada){
        this.nota2 = notaInformada;
    }

    public void setNota3(double notaInformada){
        this.nota3 = notaInformada;
    }

    public void setNota4(double notaInformada){
        this.nota4 = notaInformada;
    }

    //Calculando e informando média
    public void mostrarMedia(){
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        double media = somaDasNotas / 4;
        System.out.println("==== Média final ====");
        System.out.println("");
        System.out.println(media);
    }
}
