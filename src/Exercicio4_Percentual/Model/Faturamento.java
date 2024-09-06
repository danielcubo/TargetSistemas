package Exercicio4_Percentual.Model;

public class Faturamento {
    private String uf;
    private double receita;

    public Faturamento(String uf, double receita) {
        this.uf = uf;
        this.receita = receita;
    }

    public String getUF() {
        return this.uf;
    }

    public double getReceita() {
        return this.receita;
    }

    @Override
    public String toString() {
        return "UF: "+this.uf+" Receita: "+this.receita;
    }
}
