package br.com.bianeck.designpatterns;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}

	public ImpostoMuitoAlto() {
		super();
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}