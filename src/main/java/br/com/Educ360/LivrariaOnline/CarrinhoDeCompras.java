package br.com.Educ360.LivrariaOnline;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Livro> livros;

    public CarrinhoDeCompras(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "livros=" + livros +
                '}';
    }

    public double calcularTotal(ArrayList<Livro> carrinhoDeCompras) {
        double totalValue = 0;

        for (Livro livro : livros) {
            totalValue += livro.getPreco();

            if (livro instanceof LivroFisico) {
                totalValue += ((LivroFisico) livro).getFrete();
            }

        }
        return totalValue;
    }

}
