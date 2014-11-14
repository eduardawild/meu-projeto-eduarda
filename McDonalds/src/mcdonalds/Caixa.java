package mcdonalds;

public class Caixa {
    private String nomecaixa, datanascaixa, cpfcaixa, horariotrab;

    public String getNomecaixa() {
        return nomecaixa;
    }

    public void setNomecaixa(String nomecaixa) {
        this.nomecaixa = nomecaixa;
    }

    public String getDatanascaixa() {
        return datanascaixa;
    }

    public void setDatanascaixa(String datanascaixa) {
        this.datanascaixa = datanascaixa;
    }

    public String getCpfcaixa() {
        return cpfcaixa;
    }

    public void setCpfcaixa(String cpfcaixa) {
        this.cpfcaixa = cpfcaixa;
    }

    public String getHorariotrab() {
        return horariotrab;
    }

    public void setHorariotrab(String horariotrab) {
        this.horariotrab = horariotrab;
    }
    
    public Double retornarSaldo ()
    {
        return 1200.0;
    }
}
