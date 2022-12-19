package br.com.glauber.exerc25;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("INSIRA O CÓDIGO: ");

        while (teclado.nextLine().isBlank()) {
            System.out.println("O CÓDIGO NÃO PODE SER EM BRANCO");
        }
        System.out.println("CÓDIGO CONFIRMADO");
        teclado.close();
    }
}