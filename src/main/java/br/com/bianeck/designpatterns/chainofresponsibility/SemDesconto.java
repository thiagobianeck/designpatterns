package br.com.bianeck.designpatterns.chainofresponsibility;

public class SemDesconto implements Desconto{

    public double desconta(Orcamento orcamento) {
        return 0;
    }

    public void setProximo(Desconto proximo) {
    }
}
