public class Car {
    private String marca;
    private String modelo;
    private int quantidadeDePortas;
    private int anoDeFabricacao;

    //Marca do veículo
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marcaInformada){
        this.marca = marcaInformada;
    }

    //Modelo
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modeloInformado){
        this.modelo = modeloInformado;
    }

    //Quantidade de portas
    public int getQuantidadeDePortas(){
        return this.quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int numeroDePortas){
        this.quantidadeDePortas = numeroDePortas;
    }

    //Ano de fabricação
    public int getAnoDeFabricacao(){
        return this.anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoInformado){
        this.anoDeFabricacao = anoInformado;
    }

    //Método responsável por mostrar as propriedades
    public void showProperties(){
        System.out.println("===== Carro informado =====");
        System.out.println("");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de portas: " + getQuantidadeDePortas());
        System.out.println("Ano de fabricação: " + getAnoDeFabricacao());
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
    }
}
