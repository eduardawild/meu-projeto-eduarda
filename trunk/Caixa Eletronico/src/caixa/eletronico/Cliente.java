package caixa.eletronico;

public class Cliente {
    
    private Integer cpf, datanasc;
    private String nome, endereco;
    private boolean spc, serasa;

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Integer datanasc) {
        this.datanasc = datanasc;
    }

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

    public boolean isSpc() {
        return spc;
    }

    public void setSpc(boolean spc) {
        this.spc = spc;
    }

    public boolean isSerasa() {
        return serasa;
    }

    public void setSerasa(boolean serasa) {
        this.serasa = serasa;
    }
    
    
}
