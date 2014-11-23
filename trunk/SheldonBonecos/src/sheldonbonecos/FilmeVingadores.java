package sheldonbonecos;

import java.util.ArrayList;
import java.util.List;

public class FilmeVingadores {
    String nomefilme = "Vingadores";
    List <Boneco> lista;
    
    public FilmeVingadores ()
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
     
    
    public String personagens () 
    {
        String retorno = "", indice, personagens = "";
        
        indice = "FILME: " + nomefilme + "\n PERSONAGENS: \n";
        
        for (Boneco boneco : lista) 
        {
            personagens = personagens + boneco.informacoesGerais() + "\n";
        }
          
        retorno = indice + personagens;
        
        return retorno;
    }
}
