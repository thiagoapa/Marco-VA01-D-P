package application;

import entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CADASTRO DE PRODUTO ---");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade inicial: ");
        int quantidade = sc.nextInt();

        // Criando o objeto produto
        Produtos produto = new Produtos(nome, preco, quantidade);

        System.out.println("\n--- INFORMAÇÕES INICIAIS ---");
        System.out.println(produto);

        System.out.print("\nDigite a quantidade vendida: ");
        int vendida = sc.nextInt();

        // Processando a venda
        produto.realizarvenda(vendida);

        System.out.println("\n--- INFORMAÇÕES ATUALIZADAS ---");
        System.out.println(produto);

        sc.close();
    }
}
