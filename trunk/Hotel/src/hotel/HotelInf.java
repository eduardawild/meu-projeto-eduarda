package hotel;

public class HotelInf {
    private String nome, localizacao;
    private double diaria, tarifa;
    private Integer telefone, anofund, dias;
    
    void atribuirNome (String valor)
    {
        nome = valor;
    }
    
    String retornaNome ()
    {
        return nome;
    }
    
    void atribuirLocalizacao (String valor)
    {
        localizacao = valor;
    }
    
    String retornaLocalizacao ()
    {
        return localizacao;
    }
    
    void atribuirDiaria (double valor)
    {
        diaria = valor;
    }
    
    double retornaDiaria ()
    {
        return diaria;
    }
    
    void atribuirTelefone (Integer valor)
    {
        telefone = valor;
    }
    
    Integer retornaTelefone ()
    {
        return telefone;
    }
    
    void atribuirAnofund (Integer valor)
    {
        anofund = valor;
    }
    
    Integer retornaAnofund ()
    {
        return anofund;
    }
    
    void atribuirDias (Integer valor)
    {
        dias = valor;
    }
    
    void valorTarifa ()
    {
        if (dias <= 6)
        {   
            tarifa = (diaria * dias);
        }
        else if (dias >= 7 || dias <= 10)
        {
            tarifa = ((diaria * dias) - (diaria * dias) * 0.10);
                     
        }
        else
        {
            tarifa = ((diaria * dias) - (diaria * dias) * 0.30);            
        }
    }
    
    double retornaDolar ()
    {
        valorTarifa();
        return (tarifa* 2);
    }
    
    double retornaEuro ()
    {
        valorTarifa();
        return (tarifa * 3);
    }
    
}
