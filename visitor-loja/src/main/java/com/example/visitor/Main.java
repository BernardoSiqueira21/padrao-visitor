package com.example.visitor;

public class Main {

    public static void main(String[] args) {

        Produto livro = new Livro(100);
        Produto notebook = new Eletronico(2000);

        ProdutoVisitor visitor = new CalculadoraImpostoVisitor();

        System.out.println("Imposto livro: " +
                livro.aceitar(visitor));

        System.out.println("Imposto eletrônico: " +
                notebook.aceitar(visitor));
    }
}