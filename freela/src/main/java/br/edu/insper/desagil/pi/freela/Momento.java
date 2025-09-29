package br.edu.insper.desagil.pi.freela;

public abstract class Momento {
    public int ajusta(int valor, int min, int max){
        if (valor < min){
            return min; // retorna o min se o valor for menor q ele
        } else if (valor > max) {
            return max; // retorna o max se o valor for maior q ele
        }
        return valor;
    }

    public abstract int minutos(); // abstract: implementacao definida em subclasses
}
