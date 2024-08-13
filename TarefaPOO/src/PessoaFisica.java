public class PessoaFisica extends Pessoa{
    private String cpf;
    private Integer age;
    private String gender;

    public PessoaFisica(String name, String cpf, Integer age, String gender) {
        setName(name);
        this.cpf = cpf;
        this.age = age;
        this.gender = gender;
    }

    public String toString(){
        return "Nome: " + getName() + ", CPF: " + this.cpf + ", Idade: " + this.age + ", Gênero: " + this.gender;
    }
}
