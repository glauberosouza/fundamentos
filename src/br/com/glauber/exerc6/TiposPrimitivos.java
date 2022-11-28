package br.com.glauber.exerc6;

public class TiposPrimitivos {
    public static void main(String[] args) {

        byte anosDeColonia = 70;
        short diasDeColonia = 25000;
        int idDocampo = 1123232343;
        long idDoIndividuoNoSetor = 9_850_500_300L;
        float pressaoArterial = 11.5F;
        double temperaturaCorporal = 37.44;

        boolean contemErrosNaMatrix = false;
        char tipoDeConsole = 'X';

        System.out.println("Anos de colonia: " + anosDeColonia);
        System.out.println("Dias de colonia: " + diasDeColonia);
        System.out.println("ID do campo: " + idDocampo);
        System.out.println("Id do invidivuo no setor: " + idDoIndividuoNoSetor);
        System.out.println("Pressão arterial: " + pressaoArterial);
        System.out.println("Temperatura corporal: " + temperaturaCorporal);
        System.out.println("Contem erros na matrix? " + contemErrosNaMatrix);
        System.out.println("Qual o tipo de console? " + tipoDeConsole);
    }
}


