package br.com.alura.leilao.hello;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Hello {

    @Test
    void hello(){
        LeilaoDao leilaoDaoMockado  = Mockito.mock(LeilaoDao.class);
        List<Leilao> listaLeilaoDao = leilaoDaoMockado.buscarTodos();
        Assertions.assertTrue(listaLeilaoDao.isEmpty());
    }
}
