package mcdonalds;

public class Gerente {
    private String nomegerente, datanascgerente, cpf;

    public String getNome() {
        return nomegerente;
    }

    public void setNome(String nome) {
        this.nomegerente = nome;
    }

    public String getDatanasc() {
        return datanascgerente;
    }

    public void setDatanasc(String datanasc) {
        this.datanascgerente = datanasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Double retornarSalario ()
    {
        return 3500.0;
    }
}
