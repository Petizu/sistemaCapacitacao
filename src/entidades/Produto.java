import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);System.err.println;

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.printf("\nProduto: %s\nPreço: R$%.2f\nQuantidade: %d\n", nome, preco, quantidade);

        scanner.close();
    }
}
