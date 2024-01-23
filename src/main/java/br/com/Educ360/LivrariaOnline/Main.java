package br.com.Educ360.LivrariaOnline;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Livro livroF1 = new LivroFisico("Livro1", "Fulano", "001", 12.0, 2.0, 1.0);
        Livro ebook1 = new Ebook("Livro2", "Fulano de Tal", "002", 10, 20);


//        double v = livroF1.precoTotal(livroF1);
//        System.out.println(livroF1);
//        System.out.println("Preço Total: " + v);

        ArrayList<Livro> listaCompras = new ArrayList<Livro>();
        listaCompras.add(livroF1);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(listaCompras);
        System.out.println(carrinhoDeCompras);


    }
}