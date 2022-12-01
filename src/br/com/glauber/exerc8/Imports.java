package br.com.glauber.exerc8;

import java.util.Random;

public class Imports {
    public static void main(String[] args) {

        var doubleRandom = Math.random();
        var nome = "Gabriel";
        var inteiroRandom = new Random().nextInt(10);

        System.out.println(doubleRandom);
        System.out.println(nome);
        System.out.println(inteiroRandom);
    }
}
