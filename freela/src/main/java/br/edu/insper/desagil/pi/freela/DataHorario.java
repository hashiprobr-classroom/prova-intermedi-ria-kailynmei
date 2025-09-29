package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int data;
    private int minuto;
    private int hora;

    public DataHorario(int hora) {
        this.data = 0;
        this.minuto = 0;
        this.hora = hora;
    }

    @Override
    public int minutos() {
        return 0;
    }
}
