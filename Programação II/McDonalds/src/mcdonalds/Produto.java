package mcdonalds;

public class Produto{
    private String nome;
    private Double preco;
    private String codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
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
