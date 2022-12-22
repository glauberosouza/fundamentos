package br.com.glauber.exerc29;

public class BreakAndContinue {
    public static void main(String[] args) {

        System.out.println("FLUXO BREAK");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("O VALOR DO I É: " + i);
        }

        System.out.println("FLUXO CONTINUE");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("O VALOR DO I É: " + i);
        }
    }
}
