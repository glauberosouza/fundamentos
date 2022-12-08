package br.com.glauber.exerc14;

import java.util.Scanner;

public class NumeroParaString {
    public static void main(String[] args) {

        Integer inteiros = 20000;
        System.out.println(inteiros.toString());
        System.out.println(inteiros.toString().length());
        System.out.println(Integer.toString(20000));

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = teclado.nextInt();

        int result = num1 + num2;
        System.out.println("A soma dos dois numeros é: " + result + " e a média é: " + result / 2);
        teclado.close();
    }
}
