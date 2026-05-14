package com.example.visitor;

public class Eletronico implements Produto {

    private double preco;

    public Eletronico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public double aceitar(ProdutoVisitor visitor) {
        return visitor.visitarEletronico(this);
    }
}