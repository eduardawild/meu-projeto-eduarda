package cinema;

public class Filme {
        String nome;
        String duracao;
        String classificacao;
        String genero;
        String ator;
        String idade;
        
        void atribuirNome (String valor)
        {
            nome = valor;
        }
        
        String retornarNome ()
        {
            return nome;
        }
        
        void atribuirDuracao (String valor)
        {
            duracao = valor;
        }
        
        String retornarDuracao ()
        {
            return duracao;
        }
        
        void atribuirClassificacao (String valor)
        {
            classificacao = valor;
        }
        
        String retornarClassificacao ()
        {
            return classificacao;
        }
        
        void atribuirGenero (String valor)
        {
            genero = valor;
        }
        
        String retornarGenero ()
        {
            return genero;
        }
        
        void atribuirAtor (String valor)
        {
            ator = valor;
        }
        
        String retornarAtor ()
        {
            return ator;
        }
        
        void atribuirIdade (String valor)
        {
            idade = valor;
        }
        
        boolean retornarIdade ()
        {
            
            if (Integer.parseInt(idade)< Integer.parseInt(classificacao))
                return false;
            else
                return true;
        }
}
