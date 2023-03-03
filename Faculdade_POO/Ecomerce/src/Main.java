import produtos.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bwem vindo ao Ecommerce!");

        System.out.print("Deseja alocar um livro ou eletronico? ");
        String response = sc.next();

        if (response == "livro"){

            System.out.print("Digite o nome do livro: ");
            String name = sc.next();
            System.out.print("Digite o preço: ");
            int preco = sc.nextInt();
            System.out.print("Digite o autor do livro: ");
            String autor = sc.next();


            var livro = new Livro(name,preco,autor);
        }


    }


}