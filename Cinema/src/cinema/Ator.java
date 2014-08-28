package cinema;

public class Ator {
    
    String atores, datanasc, nacionalidade;
    Float cachefilme;
    Boolean vencoscar; 
    Integer totalfilmes, filmeultimo;
    
    void atribuirAtores (String valor)
    {
        atores = valor;
    }
    
    String retornaAtores ()
    {
        return atores;
    }
    
    void atribuirDatanasc (String valor)
    {
        datanasc = valor;
    }
    
    String retornarDatanasc ()
    {
        return datanasc;
    }
    
    void atribuirCache (Float valor)
    {
        cachefilme = valor; 
    }
    
    Float retornarCache ()
    {
        return cachefilme;
    }
    
    void atribuirNacionalidade (String valor)
    {
        nacionalidade = valor;
    }
    
    String retornarNacionalidade ()
    {
        return nacionalidade;
    }
    
    void atribuirVencOscar (Boolean valor)
    {
        vencoscar = valor;
    }
    
    boolean retornarVencOscar ()
    {   
        return vencoscar; 
    }
    
    void atribuirTotalFilmes (Integer valor)
    {
        totalfilmes = valor;
    }
    
    Integer retornarTotalFilmes ()
    {
        return totalfilmes;
    }
    
    void atribuirFilmeUltimo (Integer valor)
    {
        filmeultimo = valor;
    }
    
    Integer retornarFilmeUltimo ()
    {
        return filmeultimo;
    }
    
    Float retornarGanhos ()
    {
        return (filmeultimo * cachefilme);
    }
}
