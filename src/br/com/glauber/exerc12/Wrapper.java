package br.com.glauber.exerc12;

public class Wrapper {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = Short.valueOf(b);
        Integer i = Integer.parseInt("1000"); // Transformei uma string em int
        Long l = Long.parseLong("100000");
        Float f = Float.parseFloat("10002202020");
        Double d = Double.parseDouble("29382389278");
        Boolean n = Boolean.parseBoolean("True");
        Character c = Character.valueOf('M');

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(n);
        System.out.println(c);
    }
}
