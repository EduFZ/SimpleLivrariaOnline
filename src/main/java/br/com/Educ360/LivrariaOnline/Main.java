package br.com.Educ360.LivrariaOnline;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Livro livroF1 = new LivroFisico("Livro1", "Fulano", "001", 12.0, 2.0, 10.0);
        Livro ebook1 = new Ebook("Livro2", "Fulano de Tal", "002", 10, 20);
        Livro ebook2 = new Ebook("Livro3", "Autor Fulano 3", "003", 20.0, 50.0);
        Livro livroF2 = new LivroFisico("Livro4", "Ciclano", "004", 35.0, 3.0, 18.0);

        ArrayList<Livro> listaCompras = new ArrayList<>();
        listaCompras.add(livroF1);
        listaCompras.add(ebook1);
        listaCompras.add(ebook2);
        listaCompras.add(livroF2);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(listaCompras);

        double totalCompra = carrinhoDeCompras.calcularTotal(listaCompras);

        for (Livro lv : carrinhoDeCompras.getLivros()) {
            String nome = lv.getTitulo();
            double value = lv.getPreco();
            double totalValue = lv.precoTotal(lv);

            System.out.println("Livro: " + nome +
                    "\n" + "Valor: " + value);

            if (lv instanceof LivroFisico) {
                System.out.println("Valor do Frete: " + ((LivroFisico) lv).getFrete());
            }
            System.out.println("Valor Total do Livro: " + totalValue + "\n\n");
        }
        System.out.println("Valor Total do Carrinho: " + totalCompra);

    }
}