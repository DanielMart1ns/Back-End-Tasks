package br.com.daniel.mock;

import br.com.daniel.dao.IContratoDAO;

public class ContratoDAOMock implements IContratoDAO {

    @Override
    public void salvar() {
        //moked method
    }

    @Override
    public boolean buscar(String value) {
        return true;
    }

    @Override
    public boolean deletar(Long key) {
        return true;
    }

    @Override
    public String atualizar(String value) {
        return "";
    }
}
