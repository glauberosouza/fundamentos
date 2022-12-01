package br.com.glauber.exerc9;

public class TipoString {
    public static void main(String[] args) {

        var originalText = "Sou original";

        System.out.println(originalText.concat(" ???"));
        System.out.println(originalText.startsWith("original"));
        System.out.println(originalText.toLowerCase().startsWith("sou"));
        System.out.println(originalText.length());
        System.out.println(originalText.isBlank());
        System.out.println(originalText.endsWith("original"));

        var novaString = "Sou original!!!";
        System.out.println(novaString.equals(originalText));
        System.out.println(originalText.contains("!"));
        System.out.println(originalText.indexOf("Sou"));
        System.out.println(originalText.substring(0, 3));
        System.out.println(originalText.concat(" Deu pra notar!"));

        var nomeCarro = "Ferrari";
        var ano = 2020;
        var valor = 500_000.00;
        System.out.printf("Nome: %s, Ano: %d, Valor: %.2f", nomeCarro, ano, valor);
    }
}


