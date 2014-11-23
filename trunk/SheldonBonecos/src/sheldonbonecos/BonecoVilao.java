package sheldonbonecos;

public class BonecoVilao extends Boneco {
    BonecoHeroi arquiinimigo;

    public BonecoHeroi getArquiinimigo() {
        return arquiinimigo;
    }

    public void setArquiinimigo(BonecoHeroi arquiinimigo) {
        this.arquiinimigo = arquiinimigo;
    }
     
    public String informacoesGerais()
    {
        String retorno;
        
        retorno = super.nome + " - arqui-inimigo: " + arquiinimigo.getNome() + " - " + arquiinimigo.getEditora();
        
        return retorno;
    }
}
