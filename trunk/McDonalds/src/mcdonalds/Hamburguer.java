package mcdonalds;

public class Hamburguer extends Produto{
    private boolean novo;

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }
    public String descricaoProdutoHamburguer (){
        String retorno, novostr;
        if (novo== true){
            novostr = "Sim";
        }
        else{
            novostr = "Não";
        }
        retorno = this.descricaoCardapio() + "\nNovo: " + novostr;
        return retorno;
    }
}
