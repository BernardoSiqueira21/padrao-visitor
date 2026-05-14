package com.example.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {

    @Test
    void testImpostoLivro() {

        Produto livro = new Livro(100);

        ProdutoVisitor visitor =
                new CalculadoraImpostoVisitor();

        double imposto = livro.aceitar(visitor);

        assertEquals(5.0, imposto);
    }

    @Test
    void testImpostoEletronico() {

        Produto notebook = new Eletronico(2000);

        ProdutoVisitor visitor =
                new CalculadoraImpostoVisitor();

        double imposto = notebook.aceitar(visitor);

        assertEquals(400.0, imposto);
    }
}