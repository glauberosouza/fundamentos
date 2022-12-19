package br.com.glauber.exerc24;

import javax.swing.*;

public class StructIfElseIf {
    public static void main(String[] args) {
        var valor = JOptionPane.showInputDialog("DIGITE A SENHA:");
        if ("REDWOMAN".equalsIgnoreCase(valor)) {
            System.out.println("SENHA CONFIRMADA");
        } else if (new StringBuilder("REDWOMAN").reverse().toString().equalsIgnoreCase(valor)) {
            System.out.println("AVISO DE INTRUSO MEDIANTE AMEAÇA DETECTADO");
        } else {
            System.out.println("SENHA INCORRETA");
        }
    }
}

