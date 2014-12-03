package sheldonnovo;

public class Vilao extends InformacoesBonecos{
    private InformacoesBonecos arquiinimigo;

    public InformacoesBonecos getArquiinimigo() {
        return arquiinimigo;
    }

    public void setArquiinimigo(InformacoesBonecos arquiinimigo) {
        this.arquiinimigo = arquiinimigo;
    }
    
    public String InformacoesVilao ()
    {
        String retorno;
        
        retorno = super.getNome() + "- arqui-inimigo: " + this.arquiinimigo.InformacoesGeraisBoneco();
        
        return retorno;
    }
}
