package cinema;
    import java.util.Scanner;
    import javax.swing.JOptionPane;
public class Cinema {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Filme f = new Filme();
        Ator a = new Ator ();
        
        String nome, duracao, classificacao, genero, ator, idade, atores, datanasc, cachefilme, nacionalidade, vencoscar,
        totalfilmes, filmeultimo;
        
        atores = JOptionPane.showInputDialog("Informe o ator: ");
        a.atribuirAtores(atores);
        
        datanasc = JOptionPane.showInputDialog("Informe a data de nascimento do ator: ");
        a.atribuirDatanasc(datanasc);
        
        cachefilme = JOptionPane.showInputDialog("Informe o cache por filme: ");
        a.atribuirCache(Float.parseFloat(cachefilme));
        
        nacionalidade = JOptionPane.showInputDialog ("Informe a nacionalidade: ");
        a.atribuirNacionalidade(nacionalidade);
        
        vencoscar = JOptionPane.showInputDialog("Ele é vencedor do oscar? Responda com 'sim' ou 'nao': ");
        if(vencoscar.equals("sim")==true)
            
            a.atribuirVencOscar(true);
        else 
            a.atribuirVencOscar(false);
        
        
        a.atribuirVencOscar(vencoscar.equals("sim"));
        totalfilmes = JOptionPane.showInputDialog("Informe o total de filmes realizados por ele: ");
        a.atribuirTotalFilmes(Integer.parseInt(totalfilmes));
        
        filmeultimo = JOptionPane.showInputDialog("Informe quantos filmes foram realizados no último ano: ");
        a.atribuirFilmeUltimo(Integer.parseInt(filmeultimo));
        
        if(a.retornarVencOscar()== true)
            vencoscar = "SIM";
        else
            vencoscar = "NAO";
        
        JOptionPane.showMessageDialog(null, "Dados do filme: \n Nome do Ator: " + a.retornaAtores() + "\n Data de nascimento: "
        + a.retornarDatanasc() + "\n Cache por filme: " + a.retornarCache() + "\n Nacionalidade: " + a.retornarNacionalidade()+
                "\n Vencedor do Oscar: " + vencoscar + "\n Total de filmes: " + a.retornarTotalFilmes() + 
                "\n Filmes realizados no ultimo ano: " + a.retornarFilmeUltimo() + "\n Ganhos do ator no último ano: " + 
                a.retornarGanhos());
    }
    
}
