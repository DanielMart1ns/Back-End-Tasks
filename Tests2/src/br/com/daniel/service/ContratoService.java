package br.com.daniel.service;

import br.com.daniel.dao.IContratoDAO;

public class ContratoService implements IContratoService{

    private IContratoDAO dao;

    public ContratoService(IContratoDAO dao){
        this.dao = dao;
    }

    @Override
    public String salvar() {
        this.dao.salvar();
        return "Success";
    }

    @Override
    public boolean buscar(String value) {
        return this.dao.buscar(value);
    }

    @Override
    public boolean deletar(Long key) {
        return this.dao.deletar(key);
    }

    @Override
    public String atualizar(String value) {
        return this.dao.atualizar(value);
    }
}
