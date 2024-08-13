public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("Daniel", "000-000-000-99", 22, "Masculino");
        PessoaJuridica empresa = new PessoaJuridica("Volkswagen", "00.000.000./0001-00", "Automotivo");
        System.out.println("Pessoa Física: " + pessoa);
        System.out.println("Pessoa Jurídica: " + empresa);
    }
}