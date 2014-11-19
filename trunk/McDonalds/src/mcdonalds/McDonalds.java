package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class McDonalds {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio ();
             
        Batata_Frita bf = new Batata_Frita();
        
        bf.setNome("Feliz!");
        bf.setPreco(3.50);
        bf.setTamanho("Pequena");
        
        Bebida beb = new Bebida ();
        
        beb.setNome("Coca-Cola!");
        beb.setPreco(5.0);
        beb.setQuantidade(1.0);
        beb.setUnidademedida("l");
        
        Hamburguer h = new Hamburguer ();
        
        h.setNome("FISH");
        h.setPreco(7.0);
        h.setNovo(true);
        
        cardapio.getLista().add(bf); //nesse caso estou mandando uma batata-frita, então ele vai direto no descriçãoCardapio() de batata-frita
        cardapio.getLista().add(beb);
        cardapio.getLista().add(h);
        
        System.out.println(cardapio.ListarTodos());
    }
    
}
