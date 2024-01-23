package br.com.Educ360.LivrariaOnline;

public class Main {
    public static void main(String[] args) {

        LivroFisico livroFisico = new LivroFisico("Livro1", "Fulano", "001", 12.0, 1.0, 5.0);
        double v = livroFisico.precoTotal(livroFisico);
        System.out.println(livroFisico);
        System.out.println("Preço Total: " + v);

    }
}