package br.com.bianeck.designpatterns.chainofresponsibility;

public interface Desconto {
    public double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
