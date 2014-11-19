
package mcdonalds;

public class Bebida extends Produto{
    private Double quantidade;
    private String unidademedida;

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidademedida() {
        return unidademedida;
    }

    public void setUnidademedida(String unidademedida) {
        this.unidademedida = unidademedida;
    }
    
    @Override //escrevendo de novo o método que ja tinha na classe produto
    public String descricaoCardapio (){
        String retorno;
        retorno = super.descricaoCardapio() + "\nQuantidade: " + quantidade + "\nUnidade de Medida: " + unidademedida;
        return retorno;
    }
}
