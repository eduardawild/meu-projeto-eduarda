package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private String cidade;
    private Gerente gerente;
    private Double precolanche;
    private Integer quantvend; 
    private List <Caixa> listacaixas;
    private List <Cozinheiro> listacozinheiros;
            
    public Filial()
    {
        Integer posicao = 0;
        listacaixas = new ArrayList <Caixa>(); //inicializa a lista
        listacozinheiros = new ArrayList <Cozinheiro>();
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getPrecolanche() {
        return precolanche;
    }

    public void setPrecolanche(Double precolanche) {
        this.precolanche = precolanche;
    }

    public Integer getQuantvend() {
        return quantvend;
    }

    public void setQuantvend(Integer quantvend) {
        this.quantvend = quantvend;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Caixa> getListacaixas() {
        return listacaixas;
    }

    public void setListacaixas(List<Caixa> listacaixas) {
        this.listacaixas = listacaixas;
    }

    public List<Cozinheiro> getListacozinheiros() {
        return listacozinheiros;
    }

    public void setListacozinheiros(List<Cozinheiro> listacozinheiros) {
        this.listacozinheiros = listacozinheiros;
    }
    
    
    public Double faturamentoMedio()
    {
        return (quantvend * precolanche);
    }
}

