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
        retorno = this.getNome() + ", " + this.getTipo() + ", " + this.getTamanho() + this.autor + this.duracao;
        return retorno;
    }
    
}
