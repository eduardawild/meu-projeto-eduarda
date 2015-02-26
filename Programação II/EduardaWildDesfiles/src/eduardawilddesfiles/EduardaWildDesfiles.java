package eduardawilddesfiles;
    import javax.swing.JOptionPane;
public class EduardaWildDesfiles {

    public static void main(String[] args) {
        Desfile d = new Desfile ();
        
        String datadesfile, ruadesfile, cidade, estado, horainicial, horafinal;
        
        JOptionPane.showMessageDialog(null,"Informações do desfile");
        
        ruadesfile = JOptionPane.showInputDialog("Rua: ");
        d.setRuadesfile(ruadesfile);
        
        cidade = JOptionPane.showInputDialog("Cidade: "); 
        d.setCidade(cidade);
        
        estado = JOptionPane.showInputDialog("Estado: ");
        d.setEstado(estado);
        
        JOptionPane.showMessageDialog(null,"Informacoes do desfile" +
                "\nData: " + d.getDatadesfile() +
                "\nHorário de início: " + d.getHorainicial() + 
                "\nHorário de fim do desfile: " + d.getHorafinal() +
                "\nLocal: " + d.retornaLocal());
    }
    
}
