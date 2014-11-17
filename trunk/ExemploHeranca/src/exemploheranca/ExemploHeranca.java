package exemploheranca;

public class ExemploHeranca {

    public static void main(String[] args) {
       
        ArquivoVideo arquivoV = new ArquivoVideo ();
        
        arquivoV.setNome("Teste");
        arquivoV.setTamanho("120mb");
        arquivoV.setTipo("avi");
        arquivoV.setAutor("fulano");
        arquivoV.setDuracao("30min");
         
        
        Arquivo arquivo  = new Arquivo();
        
        arquivo.setNome("qualquer um");
        arquivo.setTipo("txt");
        arquivo.setTamanho("1kb");
        
        GerenciadordeArquivo gerenciador = new GerenciadordeArquivo();
        
        gerenciador.setSistemaoperacional("Windows 8");
        
        System.out.println(gerenciador.visualizarArquivo(arquivo)); //posso passar um arquivo e qualquer descendente dele, como nesse caso um arquivo Vídeo
        //se eu "mandasse como parâmetro acima o arquivoV ele pegaria o método retornarInformaçoes() do ArquivoVideo"
    }
    
}
