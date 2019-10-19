package br.com.bianeck.designpatterns;

public class TesteDeDescontoExtra {

    public static void main(String[] args) {

        Orcamento reforma = new Orcamento(500.0);

        System.out.println(reforma.getValor());
        reforma.aplicaDescontoExtra();

        reforma.aprova();

        System.out.println(reforma.getValor());
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        reforma.finaliza();


        System.out.println(reforma.getValor());
    }
}
