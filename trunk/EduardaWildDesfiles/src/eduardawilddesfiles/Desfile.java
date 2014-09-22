package eduardawilddesfiles;

public class Desfile {
    private String datadesfile, ruadesfile, cidade, estado, horainicial, horafinal;

    public Desfile ()
    {
        datadesfile = "20/09/2014";
        horainicial = "08:00";
        horafinal = "16:30";
        ruadesfile = null;
        cidade = null;
        estado = null;
    }
    
    public String getDatadesfile() {
        return datadesfile;
    }

    public void setDatadesfile(String datadesfile) {
        this.datadesfile = datadesfile;
    }

    public String getRuadesfile() {
        return ruadesfile;
    }

    public void setRuadesfile(String ruadesfile) {
        this.ruadesfile = ruadesfile;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(String horainicial) {
        this.horainicial = horainicial;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }
    
    public String retornaLocal ()
    {
        return ruadesfile + " , " + cidade + " / " + estado;
    }
}
