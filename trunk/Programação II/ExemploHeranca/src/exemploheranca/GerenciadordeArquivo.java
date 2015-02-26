package exemploheranca;

public class GerenciadordeArquivo {
    
    private String sistemaoperacional;

    public String getSistemaoperacional() {
        return sistemaoperacional;
    }

    public void setSistemaoperacional(String sistemaoperacional) {
        this.sistemaoperacional = sistemaoperacional;
    }
    
    public String visualizarArquivo (Arquivo exibir) //Arquivo se refere à ArquivoVideo também, ou seja aceita todos os seus descendentes
    {
        String retorno;
        retorno = this.sistemaoperacional + " ARQUIVO: " + exibir.retornarInformacoes(); //retornarInformaçoes() vale para as duas classes (arquivo e arquivoVideo)
        return retorno;
    }
    
}
