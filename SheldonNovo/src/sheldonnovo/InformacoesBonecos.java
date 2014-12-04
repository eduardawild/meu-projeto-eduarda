package sheldonnovo;

public class InformacoesBonecos {
    private String nome, editora, dataap, superpoder;

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

    public String getDataap() {
        return dataap;
    }

    public void setDataap(String dataap) {
        this.dataap = dataap;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
    
    public String InformacoesBoneco ()
    {
        String retorno;
        
        retorno = "\n" + this.getNome() + " - Editora " + this.getEditora();
        
        return retorno;
    }
}
