package Exercicio2_Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    static int sequencia(int n) {
        int fibo = 0; // ultimo caractere ficonacci
        int ant  = 0; // caractere fibonacci anterior

        for(int i = 1; i < n; i++) {
            if(i == 1) {
                fibo = 1;
                ant  = 0;
            } else {
                fibo += ant;
                ant   = fibo - ant;
            }
        }
        return fibo;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Verificar se a entrada faz parte Sequencia Fibonacci");
        System.out.print("Digite um número inteiro: ");
        int num = console.nextInt();
        boolean verdadeiro = false;
        for(int i = 1; i < num; i++) {
            System.out.print(Fibonacci.sequencia(i)+"\t");
            if(Fibonacci.sequencia(i) == num) verdadeiro = true;
            if(Fibonacci.sequencia(i) >= num) break;
        }
        console.close();
        if(verdadeiro) {
            System.out.println("\n"+num+" faz parte da sequência fibonacci");
        } else {
            System.out.println("\n"+num+" não faz parte da sequência fibonacci");
        }
    }
}

/*
 * Dado a Sequência Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores,
 * escreva um código, onde informando um número, ele calcule a sequência Fibonnaci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */
