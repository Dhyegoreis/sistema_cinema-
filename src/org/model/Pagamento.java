package org.model;

public class Pagamento {
    private long id;
    private String forma_pagamento;
    private StatusPagamento statusPagamento;

    public Pagamento() {
        this.id = 0;
        this.forma_pagamento = "";
    }

    public Pagamento(long id, String forma_pagamento, StatusPagamento statusPagamento) {
        this.id = id;
        this.forma_pagamento = forma_pagamento;
        this.statusPagamento = statusPagamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    enum StatusPagamento {
        Aprovado, Reprovado, Analise
    }
}
