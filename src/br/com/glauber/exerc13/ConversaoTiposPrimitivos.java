package br.com.glauber.exerc13;

public class ConversaoTiposPrimitivos {
    public static void main(String[] args) {

        float  f = (float) 10000.25;
        System.out.println(f);
        int i =  10000;
        double d = i; // cast implicito
        System.out.println(i);
        int e = (int) 10000.25;
        System.out.println(e);
        byte b = (byte) 225;
        System.out.println(b);
    }
}

/*
- CRIE UM CAST EXPLÍCITO DE UM VALOR DOUBLE PARA FLOAT E IMPRIMA NO CONSOLE
- CRIE UM CAST IMPLÍCITO DE UM VALOR INTEIRO PARA DOUBLE E IMPRIMA NO CONSOLE
- CRIE UM CAST EXPLÍCITO DE UM VALOR DOUBLE PARA INTEIRO E IMPRIMA NO CONSOLE
- TENTE ATRIBUIR UM SHORT PARA BYTE E VALIDE SE É POSSÍVEL

 */