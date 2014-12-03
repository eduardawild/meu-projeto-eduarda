package sheldonnovo;

import javax.swing.JOptionPane;

public class SheldonNovo {

    public static void main(String[] args) {
        Heroi heroi = new Heroi ();
        
        heroi.setNome("Hulk");
        heroi.setEditora("Marvel");
        heroi.setPreferido(false);
        
        Heroi heroi2 = new Heroi ();
        
        heroi2.setNome("Capitão América");
        heroi2.setEditora("Marvel");
        heroi2.setPreferido(false);
        
        Heroi heroi3 = new Heroi ();
        
        heroi3.setNome("Homem de Ferro");
        heroi3.setEditora("Marvel");
        heroi3.setPreferido(false);
        
        Vilao vilao = new Vilao ();
        
        vilao.setNome("Loki");
        vilao.setEditora("Marvel");
        
        Heroi heroi4 = new Heroi ();
        
        heroi4.setNome("Batmam");
        heroi4.setEditora("DC");
        heroi4.setPreferido(false);
        
        Heroi heroi5 = new Heroi ();
        
        heroi5.setNome("Lanterna Verde");
        heroi5.setEditora("DC");
        heroi5.setPreferido(true);
        
        Vilao vilao2 = new Vilao ();
        
        vilao2.setNome("Coringa");
        vilao2.setEditora("DC");
        
        Vilao vilao3 = new Vilao ();
        
        vilao3.setNome("Lex Luthor");
        vilao3.setEditora("DC");
        
        Filmes filme = new Filmes ();
        
        filme.setNome("VINGADORES");
        filme.lista.add(heroi);
        filme.lista.add(heroi2);
        filme.lista.add(heroi3);
        filme.lista.add(vilao);
        
        
        Filmes filme2 = new Filmes ();
        
        filme2.setNome("BATMAN VS SUPERMAN");
        filme2.lista.add(heroi4);
        filme2.lista.add(heroi5);
        filme2.lista.add(vilao2);
        filme2.lista.add(vilao3);
        
        JOptionPane.showMessageDialog(null, filme.Lista());
        JOptionPane.showMessageDialog(null, filme2.Lista());
    }
    
}
