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
    
    public String retornarInformacoes()
    {
        String retorno;
        retorno = super.retornarInformacoes() + ", " + this.autor + ", " +  this.duracao; //herda o método retornarInformaçoes com os atributos nome, tipo e tamanho, e acrescenta o autor e a duracao
        return retorno;
        
        //em java, o PAI é super, ou seja ele se refere à classe retornarinformaçoes() da classe "Geral" "Pai" "Super Classe"
    }
    
}
