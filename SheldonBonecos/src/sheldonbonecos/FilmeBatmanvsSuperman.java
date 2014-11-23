package sheldonbonecos;

import java.util.ArrayList;
import java.util.List;

public class FilmeBatmanvsSuperman {
    String nomefilme = "Batman vs Superman";
    List <Boneco> lista;
    
    public FilmeBatmanvsSuperman ()
    {
        lista = new ArrayList <Boneco> ();
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public List<Boneco> getLista() {
        return lista;
    }

    public void setLista(List<Boneco> lista) {
        this.lista = lista;
    }
    
    public String personagenslista2 ()
    {
        String retorno = "", indice, personagens = "";
        
        indice = "FILME: " + this.nomefilme + "\n PERSONAGENS: \n";
        
        for (Boneco boneco : lista) 
        {
            personagens = personagens + boneco.informacoesGerais() + "\n";
        }
          
        retorno = indice + personagens;
        
        return retorno;
    }
}
