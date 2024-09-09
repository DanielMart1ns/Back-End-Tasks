package br.com.daniel.service;

public interface IContratoService {
    String salvar();

    boolean buscar(String value);

    boolean deletar(Long key);

    String atualizar(String value);
}
