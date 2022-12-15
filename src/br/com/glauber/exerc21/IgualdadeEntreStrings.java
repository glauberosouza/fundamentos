package br.com.glauber.exerc21;

public class IgualdadeEntreStrings {
    public static void main(String[] args) {

        System.out.println("Olá" == "Olá");
        var x = "Olá";
        var y = new String("Olá");
        System.out.println(x.equalsIgnoreCase(y));
    }
}
