package revisão;

public class Professor {
    String nome, endereco, escola;
    double salario;
    boolean aulatec, aulasuperior;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAulatec() {
        return aulatec;
    }

    public void setAulatec(boolean aulatec) {
        this.aulatec = aulatec;
    }

    public boolean isAulasuperior() {
        return aulasuperior;
    }

    public void setAulasuperior(boolean aulasuperior) {
        this.aulasuperior = aulasuperior;
    }
}
