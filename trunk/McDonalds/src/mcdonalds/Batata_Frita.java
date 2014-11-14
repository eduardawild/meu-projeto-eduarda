

package mcdonalds;


public class Batata_Frita extends Produto{
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String descricaoCardapioBt (){
        String retorno;
        retorno = this.descricaoCardapio() + "\nTamanho: " + tamanho;
        return retorno;
    }
}
