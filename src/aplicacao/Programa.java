package aplicacao;
import java.util.Scanner;

import entidades.Produto;
import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//
//        isabela.calcularSalarioHorasExtras(10, 5.6);
//        System.out.println("Servidor: " + isabela.getNome());
//        System.out.printf("Valor hora extra: R$ %.2f",  isabela.getHorasExtras());
//        System.out.printf("\nSalário R$ %.2f", isabela.calcularSalario(1000));
//        double soma = isabela.calcularNumero(4,6,8);
//
//        ServidorPublico joao = new ServidorPublico();
//        ServidorPublico maria = new ServidorPublico(123, "Maria");
//        System.out.println(maria.getNome());
//        ServidorPublico jose = new ServidorPublico(1234, "José", "Auditor");
//        System.out.println(jose.getNome());
//        System.out.println(jose.getCargo());
        String nome;
        int qntd;
        double preco;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados do produto");
        System.out.println("Digite o nome do produto: ");
        nome = sc.nextLine();
        System.out.println("Digite o preço do produto");
        preco = sc.nextDouble();
        System.out.println("Digite a quantidade disponível do produto");
        qntd = sc.nextInt();
        Produto produto = new Produto(nome, preco, qntd);
        produto.mostrarInformacoes();
        System.out.println("Digite a quantidade de produtos que serão adicionaos ao estoque: ");
        qntd = sc.nextInt();
        produto.adicionarProdutos(qntd);
        System.out.println("Digite a quantidade de produtos que serão removidos ao estoque: ");
        qntd = sc.nextInt();
        produto.removerProdutos(qntd);

    }
}
