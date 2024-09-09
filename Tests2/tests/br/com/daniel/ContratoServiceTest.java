package br.com.daniel;

import br.com.daniel.dao.ContratoDAO;
import br.com.daniel.dao.IContratoDAO;
import br.com.daniel.service.ContratoService;
import br.com.daniel.service.IContratoService;
import br.com.daniel.mock.ContratoDAOMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    //save method
    @Test
    public void salvarContratoService(){
        IContratoDAO daoMock = new ContratoDAOMock();

        IContratoService service = new ContratoService(daoMock);
        String result = service.salvar();
        Assert.assertEquals("Success", result);
    }

    //error to access database
    @Test(expected = UnsupportedOperationException.class)
    public void erroAcessoBancoDeDados(){
        IContratoDAO dao = new ContratoDAO();

        IContratoService service = new ContratoService(dao);
        service.salvar();
    }

    //search method
    @Test
    public void buscarValor(){
        IContratoDAO dao = new ContratoDAO();

        IContratoService service = new ContratoService(dao);
        String valueToBeFinded = "test";
        boolean result = service.buscar(valueToBeFinded);

        Assert.assertTrue(result);
    }

    //delete method
    @Test
    public void deletar(){
        IContratoDAO dao = new ContratoDAO();

        IContratoService service = new ContratoService(dao);
        Long dataToBeDeleted = 1L;
        boolean result = service.deletar(dataToBeDeleted);

        Assert.assertTrue(result);
    }

    //update method
    @Test
    public void atualizar(){
        IContratoDAO dao = new ContratoDAO();

        IContratoService service = new ContratoService(dao);
        String newValueUpdated = "test";
        String result = service.atualizar(newValueUpdated);

        Assert.assertEquals("test", result);
    }
}