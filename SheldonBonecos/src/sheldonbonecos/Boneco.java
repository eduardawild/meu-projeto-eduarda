package sheldonbonecos;

public class Boneco {
      String nome, editora, dataapar, superpoder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataapar() {
        return dataapar;
    }

    public void setDataapar(String dataapar) {
        this.dataapar = dataapar;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
      
    public String informacoesGerais ()
    {
        String retorno;        
        retorno = this.nome + " - " + this.editora;
        
        return retorno;
    }
}
