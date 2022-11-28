package br.com.glauber.exerc7;

public class NotacaoPonto {
    public static void main(String[] args) {

        var frase1 = "You take the blue pill, the story ends, you wake up in your bed and believe whatever you want to believe.";
        var frase2 = "You take the red pill, you stay in wonderland, and I show you how deep the rabbit hole goes.";
        var frase2EmMaiusculo = frase2.toUpperCase();
       // var fraseCompleta = frase1 + "\n" + frase2;
        var fraseCompleta = frase1.concat("\n" + frase2);

        System.out.println(frase1.toUpperCase());
        System.out.println(frase2.toLowerCase());
        System.out.println(frase2.charAt(5));
        System.out.println(frase2EmMaiusculo);
        System.out.println(frase2.replace(",", " <> "));
        System.out.println();
        System.out.println(fraseCompleta);
    }
}



