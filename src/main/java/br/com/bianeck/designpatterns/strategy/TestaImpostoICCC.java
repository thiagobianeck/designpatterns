package br.com.bianeck.designpatterns.strategy;

public class TestaImpostoICCC {

    public static void main(String[] args) {

        Imposto iccc = new ICCC();

        Orcamento orcamento1 = new Orcamento(100.0);
        Orcamento orcamento2 = new Orcamento(2000.0);
        Orcamento orcamento3 = new Orcamento(10000.0);

        CalculadorDeImposto calculador = new CalculadorDeImposto();

        calculador.realizaCalculo(orcamento1, iccc);
        calculador.realizaCalculo(orcamento2, iccc);
        calculador.realizaCalculo(orcamento3, iccc);
    }
}
