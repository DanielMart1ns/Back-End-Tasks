public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String setor;

    public PessoaJuridica(String razaoSocial, String cnpj, String setor){
        setName(razaoSocial);
        this.cnpj = cnpj;
        this.setor = setor;
    }

    public String toString(){
        return "Razão social: " + getName() + ", CNPJ: " + this.cnpj + ", Setor: " + this.setor;
    }
}
