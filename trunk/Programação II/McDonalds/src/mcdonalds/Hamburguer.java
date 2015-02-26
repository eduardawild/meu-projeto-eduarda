package mcdonalds;

public class Hamburguer extends Produto{
    private boolean novo;

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }
    
    @Override
    public String descricaoCardapio (){
        String retorno, novostr;
        if (novo== true){
            novostr = "Sim";
        }
        else{
            novostr = "Não";
        }
        retorno = super.descricaoCardapio() + "\nNovo: " + novostr;
        return retorno;
    }
}
