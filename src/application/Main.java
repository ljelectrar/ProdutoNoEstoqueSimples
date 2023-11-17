package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Instanciação
        Produto p1 = new Produto();

        // Pegando os dados do usuário
        System.out.println("Entre com os dados do produto: Nome, Preço e Quantidade em estoque!");
        p1.nome = sc.next();
        p1.preco = sc.nextDouble();
        p1.quantidade = sc.nextInt();

        System.out.println("Dados do produto: " + p1);

        System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
        int quantAdiciona = sc.nextInt();
        p1.addProduto(quantAdiciona);

        System.out.println("Dados atualizados: " + p1);

        System.out.println("Entre com o número de produtos para ser Removido no estoque: ");
        int quantRemove = sc.nextInt();
        p1.removeProduto(quantRemove);

        System.out.println("Dados atualizados: " + p1);
    }
}