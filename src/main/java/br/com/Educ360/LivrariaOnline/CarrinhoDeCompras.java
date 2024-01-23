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



}
