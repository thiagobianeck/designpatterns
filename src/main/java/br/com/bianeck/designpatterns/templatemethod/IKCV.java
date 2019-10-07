package br.com.bianeck.designpatterns.templatemethod;


public class IKCV extends TemplateDeImpostCondicional{



    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for(Item item : orcamento.getItens()) {
            if(item.getValor() > 100.0) return true;
        }
        return false;
    }

    double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500.0 && temItemMaiorQue100ReaisNo(orcamento);
    }
}
