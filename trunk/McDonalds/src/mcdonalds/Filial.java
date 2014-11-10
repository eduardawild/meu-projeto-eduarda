package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private String cidade;
    private Gerente gerente;
    private Double precolanche;
    private Integer quantvend;
    private Cozinheiro cozinheiros;
    private Caixa caixas;

    List <Caixa> listacaixas;
    List <Cozinheiro> listacozinheiros;
            
    public Filial()
    {
        Integer posicao = 0;
        listacaixas = new ArrayList <Caixa>();
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

    public Cozinheiro getCozinheiros() {
        return cozinheiros;
    }

    public void setCozinheiros(Cozinheiro cozinheiros) {
        this.cozinheiros = cozinheiros;
    }

    public Caixa getCaixas() {
        return caixas;
    }

    public void setCaixas(Caixa caixas) {
        this.caixas = caixas;
    }
    
    public Double faturamentoMedio()
    {
        return (quantvend * precolanche);
    }
}

