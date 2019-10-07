package br.com.bianeck.designpatterns.templatemethod;

public class ICPP extends TemplateDeImpostCondicional{


    double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500.0;
    }
}
