package br.com.glauber.exerc10;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Na mesma ");
        System.out.print("linha");
        System.out.print(" Eu sou um grande programador. \n");
        System.out.println(" Eu sou um grande programador. ");
        System.out.printf("Minha idade é: %d\n", 30);
        System.out.println("==================================");
        var entrada = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        var nome = entrada.nextLine();
        System.out.println("Qual a sua sobremesa preferida? ");
        var sobremesa = entrada.nextLine();
        System.out.println("Qual a sua idade? ");
        var idade = entrada.nextInt();
        var textoBase = "ENTENDI, SEU NOME É: %s, VOCÊ TEM %d ANOS E SUA SOBREMESA PREFERIDA É: %s";
        System.out.printf(textoBase, nome, idade, sobremesa);
    }
}
