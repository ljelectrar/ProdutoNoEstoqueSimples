package entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque() {
        return this.preco * this.quantidade;
    }

    public void addProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
}
