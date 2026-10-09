public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getQuantidade(){
       return this.quantidade;
    }
}