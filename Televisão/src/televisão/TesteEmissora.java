package televisão;

import javax.swing.JOptionPane;

public class TesteEmissora {

    public static void main(String[] args) {
        Emissora e = new Emissora ();
        
        String nomemis, endemis, tv;
        
        JOptionPane.showMessageDialog(null,"Informações da Emissora");
        
        nomemis = JOptionPane.showInputDialog("Nome: ");
        e.setNomemis(nomemis);
        
        endemis = JOptionPane.showInputDialog("Endereço: ");
        e.setEndemis(endemis);
        
        tv = JOptionPane.showInputDialog("TV aberta ou fechada? ");
        if (tv.equals("aberta") == true)
        {
            e.setTv(true);
        }
        else
        {
            e.setTv(false);
        }
        
        JOptionPane.showMessageDialog(null,"Informações da Emissora");
        
        JOptionPane.showMessageDialog(null,"Nome: " + e.getNomemis() +
                "\nEndereço: " + e.getEndemis() + 
                "\nTV: " + tv);

    }
    
}
