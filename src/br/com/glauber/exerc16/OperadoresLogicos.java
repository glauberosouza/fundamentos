package br.com.glauber.exerc16;

public class OperadoresLogicos {
    public static void main(String[] args) {

        // São conhecidos como operadores lógicos.
        // && And // Ambos os lados precisam ser verdadeiros.
        // || Or
        // ^ exclusive Or (Xor)
        // ! Not

        var todosVoltaramASalvo = false;
        var morpheusFoiCapturado = true;
        var trinityFoiCapturada = false;
        var oculos1 = "COLORIDOS";
        var oculos2 = "PRETOS";
        var capa1 = "normal";
        var capa2 = "preta";
        var calcado1 = "tênis";
        var calcado2 = "coturno";
        var parceiro1 = "Morpheus";
        var parceiro2 = "Trinity";
        var acessorios1 = "guarda-chuva";
        var acessorios2 = "guns, a lot of guns";

        System.out.println("TODOS NÃO VOLTARAM A SALVO? " + !todosVoltaramASalvo);
        System.out.println("MORPHEUS OU TRINITY FOI CAPTURADO (A)? " + (morpheusFoiCapturado || trinityFoiCapturada));

        var buscaPerfeita1 = "PRETOS".equalsIgnoreCase(oculos1)
                && "PRETA".equalsIgnoreCase(capa1)
                && "COTURNO".equalsIgnoreCase(calcado1)
                && "TRINITY".equalsIgnoreCase(parceiro1)
                && "GUNS, A LOT OF GUNS".equalsIgnoreCase(acessorios1);


        var buscaPerfeita2 = "PRETOS".equals(oculos2)
                && "PRETA".equalsIgnoreCase(capa2)
                && "COTURNO".equalsIgnoreCase(calcado2)
                && "TRINITY".equalsIgnoreCase(parceiro2)
                && "GUNS, A LOT OF GUNS".equalsIgnoreCase(acessorios2);
        System.out.println("A BUSCA 1 ENCONTROU O QUE PRECISO? " + (buscaPerfeita1 ? "SIM" : "NÃO"));
        System.out.println("A BUSCA 2 ENCONTROU O QUE PRECISO? " + (buscaPerfeita2 ? "SIM" : "NÃO"));
    }
}
