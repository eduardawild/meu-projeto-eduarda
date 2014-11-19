

package mcdonalds;


public class McOferta extends Produto{
    private Hamburguer hamburguer;
    private Bebida bebida;
    private Batata_Frita batata;

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Batata_Frita getBatata() {
        return batata;
    }

    public void setBatata(Batata_Frita batata) {
        this.batata = batata;
    }
    
    public String decricaoOferta (){
        String retorno;
        retorno = super.descricaoCardapio();
        return retorno;
    }
    
    public Double valorEconomia ()
    {
       Double retorno;     
       retorno = (hamburguer.getPreco() + batata.getPreco() + bebida.getPreco()) - (this.getPreco());
       return retorno;
    }
    
}
