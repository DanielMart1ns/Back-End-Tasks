package br.com.daniel.dao;

public class ContratoDAO implements IContratoDAO{

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco de dados");
    }

    @Override
    public boolean buscar(String value) {
        String valueToBeFinded = "test";

        if(valueToBeFinded.equalsIgnoreCase(value)){
            return true;
        }

        return false;
    }

    @Override
    public boolean deletar(Long key) {
        Long dataToBeDeleted = 1L;

        if(dataToBeDeleted == key){
            return true;
        }

        return false;
    }

    @Override
    public String atualizar(String value) {
        boolean valueExists = buscar(value);

        if(valueExists){
            return value;
        }

        return "Value not exists";
    }
}
