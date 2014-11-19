package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List <Produto> lista;
    
    public Cardapio ()
    {
        lista = new ArrayList<Produto>();
    }

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }
    
    public String ListarTodos()
    {
        String saida = "";
        
        for (Produto produto : lista) 
        {
            saida = saida + produto.descricaoCardapio() + "\n"; //dependendo do tipo que ele está passando na lista, ele vai no descriçãoCardapio() específico do tipo que ele está no momento, 
        } //então se na variavel lista está uma bebida ele vai do descricaoCardapio() da bebida
        
        return saida;
    }
}
