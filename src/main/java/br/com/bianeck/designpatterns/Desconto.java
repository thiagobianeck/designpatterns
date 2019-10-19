package br.com.bianeck.designpatterns;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
