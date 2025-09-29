package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListaTest {
    private List<Tarefa> tarefas;
    @BeforeEach
    void setUp(){
        tarefas = new ArrayList<>();
    }

    @Test
    public void constroi(){
        assertEquals(0, tarefas.size());
    }

    @Test
    public void adicionaIguais(){

    }

    @Test
    public void adicionaDiferentes(){

    }
//     helper
    private Tarefa criaTarefa(int id) {
        Tarefa t = mock(Tarefa.class);
        when(t.getId()).thenReturn(id);
        return t;
    }
}



