package sheldonnovo;

public class Heroi extends InformacoesBonecos{
    private String alterego;
    private Boolean preferido;

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
    
    public String InformacoesBoneco ()
    {
        String retorno;
        
        if (preferido == true)
        {
            retorno = super.InformacoesBoneco() + "\n" + this.getNome() + " BAZINGAAAA";
        }
        else
        {
            retorno = super.InformacoesBoneco();
        }
        
        return retorno;
    }
}
