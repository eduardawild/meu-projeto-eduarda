

package mcdonalds;


public class Batata_Frita extends Produto{
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String descricaoCardapio (){
        String retorno;
        retorno = super.descricaoCardapio() + "\nTamanho: " + tamanho;
        return retorno;
    }
}
