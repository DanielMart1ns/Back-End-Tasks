package br.com.daniel.dao;

public interface IContratoDAO {
    void salvar();

    boolean buscar(String value);

    boolean deletar(Long key);

    String atualizar(String value);
}
