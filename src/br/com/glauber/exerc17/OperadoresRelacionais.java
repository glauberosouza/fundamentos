package br.com.glauber.exerc17;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        var valor = 90;

        System.out.println("```");
        System.out.println("VALOR É IGUAL A 90" + (valor == 90 ? " SIM" : " NÃO"));
        System.out.println("VALOR É MAIOR QUE 90" + (valor > 90 ? " SIM" : " NÃO"));
        System.out.println("VALOR É MENOR QUE 90" + (valor < 90 ? " SIM" : " NÃO"));
        System.out.println("VALOR É MAIOR OU IGUAL A 90" + (valor >= 90 ? " SIM" : " NÃO"));
        System.out.println("VALOR É MENOR OU IGUAL A 90" + (valor <= 90 ? " SIM" : " NÃO"));
        System.out.println("VALOR É DIFERENTE DE 90" + (valor != 90 ? " SIM" : " NÃO"));
        System.out.println("```");
    }
}
