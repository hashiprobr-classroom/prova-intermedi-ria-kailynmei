package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private int ano;
    private int mes;
    private int dia;
    Map<Integer, Integer> limite = new HashMap<>();

    public Data() {
//        Map<Integer, Integer> limite = new HashMap<>();
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
//        this.limite = limite;
    }

    public int getAno() {
        return ano;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }

//    public void atualiza (int i1, int i2, int i3){
//        int novoAno = 0;
//        int novoMes = 0;
//        int novoDia = 0;
//
//    }

    @Override
    public int minutos() {
        ano = getAno();
        mes = getMes();
        dia = getDia();


    return 0;
    }
}
