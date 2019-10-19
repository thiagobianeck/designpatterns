package br.com.bianeck.designpatterns;

public class Aprovado implements EstadoDeUmOrcamento{

    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.02;
    }

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado!");
    }

    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos aprovados não podem ser reprovados");
    }

    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
