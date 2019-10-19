package br.com.bianeck.designpatterns;

interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}