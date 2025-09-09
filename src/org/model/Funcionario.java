package org.model;

public class Funcionario {
    private String cpf;
    private String nome;
    private String departamento;
    private String funcao;

    public Funcionario() {
        this.cpf = "";
        this.nome = "";
        this.departamento = "";
        this.funcao = "";
    }

    public Funcionario(String cpf, String nome, String departamento, String funcao) {
        this.cpf = cpf;
        this.nome = nome;
        this.departamento = departamento;
        this.funcao = funcao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
