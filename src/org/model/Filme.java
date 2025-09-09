package org.model;

public class Filme {
    private long id;
    private String nome;
    private double duracao_filme;
    private String classificacao;
    private int classificacao_idade;

    public Filme() {
        this.id = 0;
        this.nome = "";
        this.duracao_filme = 0;
        this.classificacao = "";
        this.classificacao_idade = 0;
    }

    public Filme(long id, String nome, double duracao_filme, String classificacao, int classificacao_idade) {
        this.id = id;
        this.nome = nome;
        this.duracao_filme = duracao_filme;
        this.classificacao = classificacao;
        this.classificacao_idade = classificacao_idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao_filme() {
        return duracao_filme;
    }

    public void setDuracao_filme(double duracao_filme) {
        this.duracao_filme = duracao_filme;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getClassificacao_idade() {
        return classificacao_idade;
    }

    public void setClassificacao_idade(int classificacao_idade) {
        this.classificacao_idade = classificacao_idade;
    }
}
