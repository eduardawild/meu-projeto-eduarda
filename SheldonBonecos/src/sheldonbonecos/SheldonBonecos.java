package sheldonbonecos;

import javax.swing.JOptionPane;

public class SheldonBonecos {

    public static void main(String[] args) {
        BonecoHeroi bc = new BonecoHeroi ();
        BonecoVilao bv = new BonecoVilao ();
        FilmeVingadores filme = new FilmeVingadores();
        FilmeBatmanvsSuperman filme2 = new FilmeBatmanvsSuperman ();
            
        bc.setNome("HULK");
        bc.setEditora("Marvel");
        bc.setPreferido(false);
        filme.getLista().add(bc);
        
        bc = new BonecoHeroi ();
        
        bc.setNome("Capitão América");
        bc.setEditora("Marvel");
        bc.setPreferido(false);
        filme.getLista().add(bc);
        
        bc = new BonecoHeroi ();
        
        bc.setNome("Homem de Ferro");
        bc.setEditora("Marvel");
        bc.setPreferido(false);
        filme.getLista().add(bc);
        
        bv.setNome("Loki");
        bv.setEditora("Marvel");
        filme.getLista().add(bv);
        
        bc = new BonecoHeroi();
        
        bc.setNome("Batman");
        bc.setEditora("DC");
        bc.setPreferido(false);
        filme2.getLista().add(bc);
        
        bc = new BonecoHeroi();
        
        bc.setNome("Superman");
        bc.setEditora("DC");
        bc.setPreferido(false);
        filme2.getLista().add(bc);
        
        bc.setNome("Lanterna Verde");
        bc.setEditora("DC");
        bc.setPreferido(true);
        filme2.getLista().add(bc);
        
        bv = new BonecoVilao ();
        bv.setNome("Coringa");
        bv.setEditora("DC");
        filme2.getLista().add(bv);
        
        bv = new BonecoVilao ();
        
        bv.setNome("Lex Luthor");
        bv.setEditora("DC");
        filme2.getLista().add(bv);
        
        JOptionPane.showMessageDialog (null, "" + filme.personagens());
        JOptionPane.showMessageDialog (null, "" + filme2.personagenslista2());        
    }
    
}
