package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    @Test
    public void constroi(){
        Data d = new Data();
        assertEquals(1, d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(1970, d.getAno());
    }

    @Test
    public void dataBaixa(){

    }

    @Test
    public void dataAlta(){

    }
}
