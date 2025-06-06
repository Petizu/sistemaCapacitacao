package entidades;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco, int qntd){
        setNome(nome);
        setPreco(preco);
        setQuantidade(qntd);
    }
    public double valorTotalEmEstoque(){
        double total = getPreco()*getQuantidade();
        return total;
    }
    public void adicionarProdutos(int quantidade){
        setQuantidade(getQuantidade()+quantidade);
        mostrarInformacoes();
    }
    public void removerProdutos(int quantidade){
        setQuantidade(getQuantidade()-quantidade);
        mostrarInformacoes();
    }
    public void mostrarInformacoes() {
        System.out.printf("Dados atualizados: " + getNome() + ",R$ " + getPreco() + ", " + getQuantidade() + ", R$ %.2f", valorTotalEmEstoque());
        System.out.println();
    }
}
