package Exercicio3_Faturamento.Model;

public class Receita implements Comparable<Receita> {
    private int dia;
    private double valor;

    public Receita(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    // Getters and Setters
    public int getDia() {
        return this.dia;
    }

    public void setDia(int valor) {
        this.dia = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dia: "+this.dia+" Valor: "+this.valor;
    }

    @Override
    public int compareTo(Receita receita) {
        return (int) (this.valor - receita.getValor());
    }
}