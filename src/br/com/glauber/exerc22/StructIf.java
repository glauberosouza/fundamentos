package br.com.glauber.exerc22;

import java.util.Scanner;

public class StructIf {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("QUE PÍLULA VOCÊ ESCOLHE?");
        var pilula = teclado.nextLine();
        if (pilula.trim().equalsIgnoreCase("AZUL")) {
            System.out.println("Ok, FOI BOM FALAR COM VOCÊ, BONS SONHOS");
        } else if (pilula.trim().equalsIgnoreCase("VERMELHA")) {
            System.out.println("VOCÊ TOMOU A DECISÃO CERTA, HORA DE ACORDAR");
        }
        teclado.close();
    }
}
