package televisão;

import javax.swing.JOptionPane;

public class TesteNovela {

    public static void main(String[] args) {
        
        String titulo, datapcap, dataucap, horaexib, autor, emissora, violencia, sexo, drogas, ibope;
    
        Novela n = new Novela();
    
        JOptionPane.showMessageDialog(null,"Informações da Novela");
        
        titulo = JOptionPane.showInputDialog("Título: ");
        n.setTitulo(titulo);
        
        datapcap = JOptionPane.showInputDialog("Duração da Novela, \nPrimeiro Capítulo: ");
        n.setDatapcap(datapcap);
        
        dataucap = JOptionPane.showInputDialog("Duração da Novela, \nÚltimo Capítulo: ");
        n.setDataucap(dataucap);
        
        horaexib = JOptionPane.showInputDialog("Horário de Exibição: ");
        n.setHoraexib(horaexib);
        
        autor = JOptionPane.showInputDialog("Autor: ");
        n.setAutor(autor);
        
        emissora = JOptionPane.showInputDialog("Emissora que a transmite: ");
        n.setEmissora(emissora);
        
        violencia = JOptionPane.showInputDialog("Possui cenas de violência? (SIM ou NAO):");
        if (violencia.equals("SIM") == true)
            n.setViolencia(true);
        else
            n.setViolencia(false);
        
        sexo = JOptionPane.showInputDialog("Possui cenas de sexo? (SIM ou NAO):");
        if (sexo.equals("SIM") == true)
            n.setSexo(true);
        else
            n.setSexo(false);
        
        drogas = JOptionPane.showInputDialog("Possui cenas de drogas? (SIM ou NAO):");
        if (drogas.equals("SIM") == true)
            n.setDrogas(true);
        else
            n.setDrogas(false);
        
        ibope = JOptionPane.showInputDialog("Pontuação média do ibope: ");
        n.setIbop(Integer.parseInt(ibope));
        
        JOptionPane.showMessageDialog(null,"Informações da Novela:");
        JOptionPane.showMessageDialog(null,"Título: " + n.getTitulo() +
            "\nData do Primeiro Capítulo: " + n.getDatapcap() +
            "\nData do Último Capítulo: " + n.getDataucap() + 
            "\nHorário de Exibição: " + n.getHoraexib() + 
            "\nAutor: " + n.getAutor() + 
            "\nEmissora que a transmite: " + n.getEmissora() + 
            "\nCenas de violência: " + violencia + 
            "\nCenas de sexo: " + sexo + 
            "\nCenas com drogas: " + drogas + 
            "\nPontuação do Ibope: " + n.getIbop());
    }
    
}
