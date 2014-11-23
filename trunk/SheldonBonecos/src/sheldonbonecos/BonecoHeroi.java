package sheldonbonecos;

public class BonecoHeroi extends Boneco {
    String alterego;
    Boolean preferido;

    public String getAlterego() {
        return alterego;
    }

    public void setAlterego(String alterego) {
        this.alterego = alterego;
    }

    public Boolean isPreferido() {
        return preferido;
    }

    public void setPreferido(Boolean preferido) {
        this.preferido = preferido;
    }
    
    public String retornaPreferido (Boolean preferido)
    {
        if (preferido == true)
        {
            return "SIM";
        }
        else
        {
            return "NÃO";
        }
    }
    
    public String informacoesGerais()
    {
        String retorno;
        
        retorno = super.nome + "(" + this.alterego + ") - " + this.editora;
                
        if (this.getNome().equals("Batman") == true)
        {
            retorno = "BATMAN - BAZINGAAAAA";
        }
        
        return retorno;
    }
    
}
