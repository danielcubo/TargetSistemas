package Exercicio5_Inverter;

import java.util.Scanner;

public class Inverter {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        teclado.close();

        StringBuilder inverter = new StringBuilder(nome);
        System.out.println("Seu nome invertido: "+inverter.reverse().toString());
    }
}

/*
 * Escreva um código que inverta os caracteres de uma string.
 * 
 * Importante:
 * -> Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 * -> Evite usar funções prontas, como, por exemplo, reverse;
  */