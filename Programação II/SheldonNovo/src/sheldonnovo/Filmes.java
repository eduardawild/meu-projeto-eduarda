package sheldonnovo;

import java.util.ArrayList;
import java.util.List;

public class Filmes extends InformacoesBonecos{
    private String nomedofilme;
    List <InformacoesBonecos> lista;
    
    public Filmes ()
    {
        lista = new ArrayList <InformacoesBonecos>();
    }

    public String getNome() {
        return nomedofilme;
    }

    public void setNome(String nome) {
        this.nomedofilme = nome;
    }

    public List<InformacoesBonecos> getLista() {
        return lista;
    }

    public void setLista(List<InformacoesBonecos> lista) {
        this.lista = lista;
    }
    
    public String Lista ()
    {
        String retorno = "", retornofinal = "";
        
        for (InformacoesBonecos informacoesBonecos : lista) 
        {
            retorno = retorno + informacoesBonecos.InformacoesBoneco() + "\n";
        }
        
        retornofinal = "FILME: " + this.nomedofilme + "\n PERSONAGENS: \n" +  retorno;
        return retornofinal;
    }
}
