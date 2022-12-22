package br.com.glauber.exerc27;

import java.util.Scanner;

public class StructDoWhile {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        var digito = "";

        do {
            System.out.println("INSIRA O CÓDIGO: ");
            digito = teclado.nextLine();

            if (digito.isBlank()) {
                System.out.println("O CÓDIGO NÃO PODE SER EM BRANCO");
            }

        } while (digito.isBlank());

        System.out.println("Código confirmado");
        teclado.close();
    }
}