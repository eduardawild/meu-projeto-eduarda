package exemplointerface;

public class Novela {
    private String titulo, datapcap, dataucap, horaexib, autor, emisora;
    private boolean violencia, sexo, drogas;
    private Integer ibope;
    private Emissora emissoraa; //variável emissora do tipo emissora

    public Novela()
    {
        this.emissoraa = new Emissora();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; //o this garante que o que está sendo mudado é o atributo e não o parâmetro que tem o mesmo nome do atributo
    }                         //quando preciso referenciar as variáveis da classe, tem que usar o this.

    public String getDatapcap() {
        return datapcap;
    }

    public void setDatapcap(String datapcap) {
        this.datapcap = datapcap;
    }

    public String getDataucap() {
        return dataucap;
    }

    public void setDataucap(String dataucap) {
        this.dataucap = dataucap;
    }

    public String getHoraexib() {
        return horaexib;
    }

    public void setHoraexib(String horaexib) {
        this.horaexib = horaexib;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmisora() {
        return emisora;
    }

    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }
    
    public Integer getIbop() {
        return ibope;
    }

    public void setIbop(Integer ibop) {
        this.ibope = ibop;
    }

    public boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(boolean violencia) {
        this.violencia = violencia;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }
    
    public Integer obterClassificacao ()
    {
        Integer classificacao;
        if (violencia == false && sexo == false && drogas == false)
        {
            classificacao = 0;
        }
        else if (violencia == true && sexo == false && drogas == false)
        {
            classificacao = 14;
        }
        else if (violencia == true && sexo == false || sexo == true && drogas == true)
        {
            classificacao = 16;
        }
        else
        {
            classificacao = 18;
        }
        return classificacao;
    }
    
    public Integer obterTelespectadores ()
    {
        return (ibope * 10000);
    }
}
