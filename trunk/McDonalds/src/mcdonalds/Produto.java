package mcdonalds;

public class Produto extends Hamburguer{
    private String nome;
    private String preco;
    private String codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String descricaoCardapio ()
    {
        String descricao;
        descricao = "Nome: " + nome + "\nPreco: " + preco;
        return descricao;
    }
}
