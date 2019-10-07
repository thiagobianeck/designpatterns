package br.com.bianeck.designpatterns.templatemethod;

public abstract class TemplateDeImpostCondicional implements Imposto{

    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }

    }

    abstract double minimaTaxacao(Orcamento orcamento);

    abstract double maximaTaxacao(Orcamento orcamento);

    abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
