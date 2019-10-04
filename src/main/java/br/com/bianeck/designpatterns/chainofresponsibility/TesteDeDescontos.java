package br.com.bianeck.designpatterns.chainofresponsibility;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDescontos descontos = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(1000.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);
    }
}
