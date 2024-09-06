package Exercicio4_Percentual.Model;

import java.util.ArrayList;
import java.util.List;

public class Percentual {
        private List<Faturamento> faturamento;
    private List<Double> receitas;

    public Percentual() {
        this.faturamento = new ArrayList<>();
        this.receitas = new ArrayList<>();
    }

    public List<Faturamento> getFaturamento() {
        return this.faturamento;
    }

    public List<Double> getReceitas() {
        return this.receitas;
    }

    public void adicionarFaturamento(Faturamento fat) {
        this.faturamento.add(fat);
    }

    public void adicionarReceita(Object receita) {
        this.receitas.add((Double) receita);
    }
}
