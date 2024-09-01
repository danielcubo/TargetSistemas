package Exercicio1_Soma;

public class Soma {
    public static void main(String args[]) {
        int indice = 13;
        int soma = 0;
        for(int k = 0; k < indice; k++) {
            soma = soma + k;
        }
        System.out.println(soma);
    }
}