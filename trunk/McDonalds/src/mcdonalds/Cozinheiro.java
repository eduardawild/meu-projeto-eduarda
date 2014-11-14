package mcdonalds;

public class Cozinheiro {
    private String nomecoz, datanascoz, cpfcoz, turno_traba;

    public String getNomecoz() {
        return nomecoz;
    }

    public void setNomecoz(String nomecoz) {
        this.nomecoz = nomecoz;
    }

    public String getDatanascoz() {
        return datanascoz;
    }

    public void setDatanascoz(String datanascoz) {
        this.datanascoz = datanascoz;
    }

    public String getCpfcoz() {
        return cpfcoz;
    }

    public void setCpfcoz(String cpfcoz) {
        this.cpfcoz = cpfcoz;
    }

    public String getTurno_traba() {
        return turno_traba;
    }

    public void setTurno_traba(String turno_traba) {
        this.turno_traba = turno_traba;
    }
    
    public Double retornarSalario()
    {
        if (turno_traba.equals("Noite"))
        {
            return 1700.0;
        }
        else
        {
            return 1300.0;
        }       
    }
}
