package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int id;
    private String descricao;
    Momento inicio;
    Momento fim;

    public Tarefa(int id) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Momento getInicio() {
        return inicio;
    }
    public Momento getFim() {
        return fim;
    }

}
