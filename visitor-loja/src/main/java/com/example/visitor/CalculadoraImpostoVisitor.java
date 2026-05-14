package com.example.visitor;

public class CalculadoraImpostoVisitor implements ProdutoVisitor {

    @Override
    public double visitarLivro(Livro livro) {
        return livro.getPreco() * 0.05;
    }

    @Override
    public double visitarEletronico(Eletronico eletronico) {
        return eletronico.getPreco() * 0.20;
    }
}