package br.com.glauber.exerc4;

public class VarAndConst {
    public static void main(String[] args) {
        String textoBase = "Hoje o dia está:";

        final String bom = "BOM";
        final String regular = "REGULAR";
        final String ruim = "RUIM";
        System.out.println(textoBase + " " + bom);
        System.out.println(textoBase + " " + regular);
        System.out.println(textoBase + " " + ruim);
        System.out.println();
        textoBase = "Hoje a noite está:";
        System.out.println(textoBase + " " + bom);
        System.out.println(textoBase + " " + regular);
        System.out.println(textoBase + " " + ruim);
    }
}


