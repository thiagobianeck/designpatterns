package br.com.bianeck.designpatterns;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

		double valor = imposto.calcula(orcamento);

		System.out.println(valor);

	}

}