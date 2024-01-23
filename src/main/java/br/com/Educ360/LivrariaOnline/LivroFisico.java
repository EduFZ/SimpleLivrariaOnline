package br.com.Educ360.LivrariaOnline;

public class LivroFisico extends Livro{

    private double peso;
    private double frete;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}
