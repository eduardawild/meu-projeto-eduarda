package hotel;
    import javax.swing.JOptionPane;
public class Hotel {

    public static void main(String[] args) {
        String nome, localizacao, diaria, telefone, anofund, dias;
        
        HotelInf h = new HotelInf ();
        
        nome = JOptionPane.showInputDialog("Nome do hotel:");
        h.atribuirNome(nome);
        
        localizacao = JOptionPane.showInputDialog("Localizacao:");
        h.atribuirLocalizacao(localizacao);
        
        diaria = JOptionPane.showInputDialog("Valor da diaria:");
        h.atribuirDiaria(Double.parseDouble(diaria));
        
        dias = JOptionPane.showInputDialog("Dias de hospedagem:");
        h.atribuirDias(Integer.parseInt(dias));
        
        telefone = JOptionPane.showInputDialog("Telefone:");
        h.atribuirTelefone(Integer.parseInt(telefone));
        
        anofund = JOptionPane.showInputDialog("Ano da fundacao:");
        h.atribuirAnofund(Integer.parseInt(anofund));
        
        JOptionPane.showMessageDialog(null,"Nome: " + h.retornaNome() + "\nLocalizacao: " + h.retornaLocalizacao()
                + "\nValor da diaria: " + h.retornaDiaria() + "\nDias de hospedagem: " + h.retornaDias() + "\nTelefone: " + h.retornaTelefone() +
                "\nAno da fundacao: " + h.retornaAnofund() + "\nValor da hospedagem em dolar: " + h.retornaDolar() 
                + "\nValor da hospedagem em euro: " + h.retornaEuro());
    }
    
}
