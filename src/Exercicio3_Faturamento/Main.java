package Exercicio3_Faturamento;

import org.json.simple.parser.ParseException;

import Exercicio3_Faturamento.Model.Receitas;

public class Main {
    public static void main(String args[]) throws ParseException {
        Receitas receitas = new Receitas();
        receitas.lerJSON();
    }
}

/*
 * Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
 * -> O menor valor de faturamento ocorrido em um dia do mês;
 * -> O maior valor de faturamento ocorrido em um dia do mês;
 * -> O número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 * 
 *  Importante:
 *  -> Usar o JSON ou XML disponível como fonte dos dados do faturamento mensal;
 *  -> Podem existir dias sem faturamento, como nos finas de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */
