package br.com.glauber.exerc23;

import javax.swing.*;

public class StructIfElse {
    public static void main(String[] args) {
        var valor = JOptionPane.showInputDialog("DIGITE A SENHA:");
        if ("REDWOMAM".equalsIgnoreCase(valor)) {
            System.out.println("SENHA CONFIRMADA");
        } else {
            System.out.println("SENHA INCORRETA");
        }
    }
}
