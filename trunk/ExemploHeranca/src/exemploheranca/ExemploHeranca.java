package exemploheranca;

public class ExemploHeranca {

    public static void main(String[] args) {
       
        ArquivoVideo arquivoV = new ArquivoVideo();
        
        arquivoV.setNome("Herança");
        arquivoV.setTipo("avi");
        arquivoV.setTamanho("120mb");
        arquivoV.setDuracao("20 minutos");
        arquivoV.setAutor("Joao");
        
        System.out.println(arquivoV.retornarInformacaoCompleta());
    }
    
}
