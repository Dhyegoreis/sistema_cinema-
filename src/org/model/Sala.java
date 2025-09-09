package org.model;

public class Sala {
    private long id ;
    private int capacidade;
    private StatusSala status;
    private Assento assento;

    public Sala() {
        this.id = 0;
        this.capacidade = 0;
        this.status = StatusSala.Disponivel;
    }

    public Sala(long id, int capacidade, StatusSala status, Assento assento) {
        this.id = id;
        this.capacidade = capacidade;
        this.status = status;
        this.assento = assento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public StatusSala getStatus() {
        return status;
    }

    public void setStatus(StatusSala status) {
        this.status = status;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    enum StatusSala  {
        Disponivel, Lotada, Manutencao
    }
}
