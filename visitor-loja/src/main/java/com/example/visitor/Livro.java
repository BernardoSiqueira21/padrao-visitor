package com.example.visitor;

public class Livro implements Produto {

    private double preco;

    public Livro(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public double aceitar(ProdutoVisitor visitor) {
        return visitor.visitarLivro(this);
    }
}