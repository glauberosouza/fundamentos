package br.com.glauber.exerc5;

public class Inferencia {

    static String typeOf(Object obj) {
        return obj.getClass().toGenericString();
    }

    public static void main(String[] args) {

        var numero1 = 1;
        var numero2 = 1.2;
        var numero3 = 428343885882L;
        var texto1 = "Glauber";
        var texto2 = 'M';
        System.out.println(typeOf(numero1));
        System.out.println(typeOf(numero2));
        System.out.println(typeOf(numero3));
        System.out.println(typeOf(texto1));
        System.out.println(typeOf(texto2));
    }
}




