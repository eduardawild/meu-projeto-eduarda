package caixa.eletronico;

public class Banco {
    private String nome, numero;
    private boolean empimovel, empcarro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void atribuirEmpImovel(boolean valor)
    {
        empimovel = valor;
    }
    
    public boolean retornaEmpImovel ()
    {
        return empimovel;
    }
    
    public void atribuirEmpCarro(boolean valor)
    {
        empcarro = valor;
    }
    
    public boolean retornaEmpCarro ()
    {
        return empcarro;
    }
}
