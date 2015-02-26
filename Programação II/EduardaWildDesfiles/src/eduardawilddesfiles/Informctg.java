package eduardawilddesfiles;

public class Informctg {
    private String nome, datafund, cidade, porte;
    private Integer integrantes;
    private double mensalidade, rendmensal, gastos;
    private boolean danca, declamacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatafund() {
        return datafund;
    }

    public void setDatafund(String datafund) {
        this.datafund = datafund;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integer integrantes) {
        this.integrantes = integrantes;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean isDanca() {
        return danca;
    }

    public void setDanca(boolean danca) {
        this.danca = danca;
    }

    public boolean isDeclamacao() {
        return declamacao;
    }

    public void setDeclamacao(boolean declamacao) {
        this.declamacao = declamacao;
    }
    
    public String retornaPorte ()
    {
        if (integrantes <= 50)
        {
            porte = "Pequeno Porte";
        }
        else if (integrantes >= 51 && integrantes <= 80)
        {
            porte = "Médio Porte";
        }
        else 
        {
            porte = "Grande Porte";
        }
        return porte;
    }
    
    public double rendimentoMensal ()
    {
        rendmensal = integrantes * mensalidade;
        return rendmensal;
    }
    
    public void confereRendimento ()
    {
        if (danca == true && declamacao == true)
        {
            gastos = 700 + 1500 + 1000;
        }
        else if (danca == true && declamacao == false)
        {
            gastos = 700 + 1500;
        }
        else if (danca == false && declamacao == true)
        {
            gastos = 700 + 1000;
        }
        else if (danca == false && declamacao == false)
        {
            gastos = 700;
        }
    }
    
    public boolean retornaAvaliacao ()
    {
        confereRendimento();
        if (gastos > rendmensal)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
