package com.example.visitor;

public interface ProdutoVisitor {

    double visitarLivro(Livro livro);

    double visitarEletronico(Eletronico eletronico);
}