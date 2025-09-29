package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int hora;
    private int minuto;
    private int data;

    public DataHorario(int data) {
        this.hora = 0;
        this.minuto = 0;
        this.data = data;
    }

    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    @Override
    public int minutos() {
        return 0;
    }
}
