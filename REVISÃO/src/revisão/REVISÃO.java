package revisão;
    import javax.swing.JOptionPane;
public class REVISÃO {

    public static void main(String[] args) {
        String nome, endereco, salario, escola, aulatec, aulasup;
        
        Professor p = new Professor ();
        nome = JOptionPane.showInputDialog("Nome: ");
        p.setNome(nome);
        
        endereco = JOptionPane.showInputDialog("Endereco: ");
        p.setEndereco(endereco);
        
        salario = JOptionPane.showInputDialog("Salario: ");
        p.setSalario(Double.parseDouble(salario));
        
        escola = JOptionPane.showInputDialog("Escola: ");
        p.setEscola(escola);
        
        aulatec = JOptionPane.showInputDialog("Aula para Tecnico (SIM ou Nao): ");
        if(aulatec.equals("SIM") == true)
            p.setAulatec(true);
        else
            p.setAulatec(false);
        
        aulasup = JOptionPane.showInputDialog("Aula para Superior (SIM ou NAO): ");
        if(aulasup.equals("SIM") == true)
            p.setAulasuperior(true);
        else
            p.setAulasuperior(false);
        
        if (p.isAulatec() == true)
            aulatec = "SIM";
        else
            aulatec = "NAO";
        
        if (p.isAulasuperior() == true)
            aulasup = "SIM";
        else
            aulasup = "NAO";
        
        JOptionPane.showMessageDialog(null,"Nome: " + p.getNome()+ "\nEndereco: " + p.getEndereco() + "\nSalario: " + p.getSalario() + "\nEscola: " +
                p.getEscola() + "\nAula para Tecnico? " + aulatec + "\nAula para Superior? " + aulasup);
    }
    
}
