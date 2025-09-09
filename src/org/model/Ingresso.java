package org.model;

public class Ingresso {
    private long id;
    private float valor_ingresso;
    private StatusIngresso statusIngresso;
    private Tipo_Ingresso tipoIngresso;
    private int quantidade_ingresso;
    private Filme filme;
    private Assento assento;
    private Sessao sessao;
    private Cliente cliente;
    private Funcionario funcionario;
    private Pagamento pagamento;

    public Ingresso() {
        this.id = 0;
        this.valor_ingresso = 0;
        this.quantidade_ingresso = 0;
    }

    public Ingresso(long id, float valor_ingresso, StatusIngresso statusIngresso, Tipo_Ingresso tipoIngresso, int quantidade_ingresso, Filme filme, Assento assento, Sessao sessao, Cliente cliente, Funcionario funcionario, Pagamento pagamento) {
        this.id = id;
        this.valor_ingresso = valor_ingresso;
        this.statusIngresso = statusIngresso;
        this.tipoIngresso = tipoIngresso;
        this.quantidade_ingresso = quantidade_ingresso;
        this.filme = filme;
        this.assento = assento;
        this.sessao = sessao;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.pagamento = pagamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValor_ingresso() {
        return valor_ingresso;
    }

    public void setValor_ingresso(float valor_ingresso) {
        this.valor_ingresso = valor_ingresso;
    }

    public StatusIngresso getStatusIngresso() {
        return statusIngresso;
    }

    public void setStatusIngresso(StatusIngresso statusIngresso) {
        this.statusIngresso = statusIngresso;
    }

    public Tipo_Ingresso getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(Tipo_Ingresso tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public int getQuantidade_ingresso() {
        return quantidade_ingresso;
    }

    public void setQuantidade_ingresso(int quantidade_ingresso) {
        this.quantidade_ingresso = quantidade_ingresso;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    enum Tipo_Ingresso {
        Inteira, Meia
    }
    enum StatusIngresso {
        Disponivel, Indisponivel
    }
}
