package exemploheranca;

public class ArquivoVideo extends Arquivo {
    private String duracao;
    private String autor;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String retornarInformacaoCompleta ()
    {
        String retorno;
        retorno = this.retornarInformacoes() + ", " + this.autor + ", " +  this.duracao; //herda o método retornarInformaçoes com os atributos nome, tipo e tamanho, e acrescenta o autor e a duracao
        return retorno;
    }
    
}
