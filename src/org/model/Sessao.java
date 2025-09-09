package org.model;

import java.util.Date;

public class Sessao {
    private long id;
    private Date data_sessao;
    private double hora_inicio;
    private double  hora_termino;
    private StatusSessao status;
    private Filme filme;
    private Sala sala;

    public Sessao() {
        this.id = 0;
        this.data_sessao = new Date();
        this.hora_inicio = 0;
        this.hora_termino = 0;
        this.status = status;
    }

    public Sessao(long id, Date data_sessao, double hora_inicio, double hora_termino, StatusSessao status, Filme filme, Sala sala) {
        this.id = id;
        this.data_sessao = data_sessao;
        this.hora_inicio = hora_inicio;
        this.hora_termino = hora_termino;
        this.status = status;
        this.filme = filme;
        this.sala = sala;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData_sessao() {
        return data_sessao;
    }

    public void setData_sessao(Date data_sessao) {
        this.data_sessao = data_sessao;
    }

    public double getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(double hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public double getHora_termino() {
        return hora_termino;
    }

    public void setHora_termino(double hora_termino) {
        this.hora_termino = hora_termino;
    }

    public StatusSessao getStatus() {
        return status;
    }

    public void setStatus(StatusSessao status) {
        this.status = status;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    enum StatusSessao {
        Disponivel, Indisponivel
    }
}
