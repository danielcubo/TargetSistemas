package Exercicio4_Percentual;

import java.text.DecimalFormat;

import Exercicio4_Percentual.Model.Faturamento;
import Exercicio4_Percentual.Model.Percentual;

public class Main {
    public static void main(String args[]) {
        Faturamento receita1 = new Faturamento("SP", 67836.43);
        Faturamento receita2 = new Faturamento("RJ", 36678.66);
        Faturamento receita3 = new Faturamento("MG", 29229.88);
        Faturamento receita4 = new Faturamento("ES", 27165.48);
        Faturamento receita5 = new Faturamento("Outros", 19849.53);

        Percentual receitas = new Percentual();

        receitas.adicionarFaturamento(receita1);
        receitas.adicionarFaturamento(receita2);
        receitas.adicionarFaturamento(receita3);
        receitas.adicionarFaturamento(receita4);
        receitas.adicionarFaturamento(receita5);

        receitas.adicionarReceita(receita1.getReceita());
        receitas.adicionarReceita(receita2.getReceita());
        receitas.adicionarReceita(receita3.getReceita());
        receitas.adicionarReceita(receita4.getReceita());
        receitas.adicionarReceita(receita5.getReceita());

        double soma = 0.00;
        double porcentagem = 0.00;

        for(int i = 0; i < receitas.getReceitas().size(); i++) {
            soma += receitas.getReceitas().get(i);
        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        for(int i = 0; i < receitas.getReceitas().size(); i++) {
            porcentagem = (receitas.getReceitas().get(i)*100)/soma;
            System.out.println(receitas.getFaturamento().get(i)+" \t- Percentual: "+df.format(porcentagem)+" %");
        }
    }
}

/*
 * Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 * -> SP: 67.836,43
 * -> RJ: 36.678,66
 * -> MG: 29.229,88
 * -> ES: 27.165,48
 * -> Outros: 19.849,53
 * 
 * Escreva um código onde calcule o percentual de representação que cada estado teve dentro do valor mensal da distribuidora.
 */