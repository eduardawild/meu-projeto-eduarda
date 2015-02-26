package sheldonnovo;

import javax.swing.JOptionPane;

public class SheldonNovo {

    public static void main(String[] args) {
        Heroi heroi = new Heroi ();
        
        heroi.setNome("Hulk");
        heroi.setEditora("Marvel");
        heroi.setDataap("1962");
        heroi.setSuperpoder("Super força");
        heroi.setAlterego("Robert Bruce Banner");
        heroi.setPreferido(false);
        
        Heroi heroi2 = new Heroi ();
        
        heroi2.setNome("Capitão América");
        heroi2.setEditora("Marvel");
        heroi2.setDataap("1941");
        heroi2.setSuperpoder("Super força, velocidade, reflexo, inteligencia e uma resistencia sobre humana");
        heroi2.setAlterego("Steve Rogers");
        heroi2.setPreferido(false);
        
        Heroi heroi3 = new Heroi ();
        
        heroi3.setNome("Homem de Ferro");
        heroi3.setEditora("Marvel");
        heroi3.setDataap("1963");
        heroi3.setSuperpoder("Armadura lhe confere superforça, poder de vôo");
        heroi3.setAlterego("Tony Stark");
        heroi3.setPreferido(false);
        
        Vilao vilao = new Vilao ();
        
        vilao.setNome("Loki");
        vilao.setEditora("Marvel");
        vilao.setDataap("1949");
        vilao.setSuperpoder("Magia");
        vilao.setArquiinimigo("Thor");
        
        Heroi heroi4 = new Heroi ();
        
        heroi4.setNome("Batman");
        heroi4.setEditora("DC");
        heroi4.setDataap("1939");
        heroi4.setSuperpoder("Atleta incomparável, habilidoso em todas as formas de combate, maior detetive do mundo");
        heroi4.setPreferido(false);
        
        Heroi heroi5 = new Heroi ();
        
        heroi5.setNome("Lanterna Verde");
        heroi5.setEditora("DC");
        heroi5.setDataap("1940");
        heroi5.setSuperpoder("Anel");
        heroi5.setPreferido(true);
        
        Vilao vilao2 = new Vilao ();
        
        vilao2.setNome("Coringa");
        vilao2.setEditora("DC");
        vilao2.setDataap("1940");
        vilao2.setSuperpoder("Conhecimento em Artes, Química, Engenharia e possui muitos equipamentos");
        vilao2.setArquiinimigo("Batman");
        
        Vilao vilao3 = new Vilao ();
        
        vilao3.setNome("Lex Luthor");
        vilao3.setEditora("DC");
        vilao3.setSuperpoder("Grande inteligência e incrível proeza tecnológica");
        vilao3.setArquiinimigo("Superman");
        
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
