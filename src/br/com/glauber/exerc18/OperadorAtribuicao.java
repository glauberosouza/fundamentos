package br.com.glauber.exerc18;

public class OperadorAtribuicao {
    public static void main(String[] args) {

        var numero1 = 10;
        var numero2 = 20;

        numero1 -= numero2;
        System.out.println(numero1);
        numero1 += numero2;
        System.out.println(numero1);
        numero1 *= numero2;
        System.out.println(numero1);
        numero1 /= numero2;
        System.out.println(numero1);
        numero1 %= numero2;
        System.out.println(numero1);
    }
}
