package sheldonnovo;

public class Vilao extends InformacoesBonecos{
    private String arquiinimigo;

    public String getArquiinimigo() {
        return arquiinimigo;
    }

    public void setArquiinimigo(String arquiinimigo) {
        this.arquiinimigo = arquiinimigo;
    }
    
    public String InformacoesBoneco ()
    {
        String retorno;
        
        retorno = this.getNome() + "- arqui-inimigo: " + this.arquiinimigo + " " +this.getEditora();
        
        return retorno;
    }
}
