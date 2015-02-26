package eduardawilddesfiles;
    import javax.swing.JOptionPane;
public class Testectg {

    public static void main(String[] args) {
        Informctg ctg = new Informctg ();
        
        String nome, datafund, cidade, integrantes, mensalidade, danca, declamacao, confrend = null;
        
        JOptionPane.showMessageDialog(null,"Informações do CTG");
        
        nome = JOptionPane.showInputDialog("Nome: ");
        ctg.setNome(nome);
        
        datafund = JOptionPane.showInputDialog("Data da fundação: ");
        ctg.setDatafund(datafund);
        
        integrantes = JOptionPane.showInputDialog("Número de integrantes: ");
        ctg.setIntegrantes(Integer.parseInt(integrantes));
        
        cidade = JOptionPane.showInputDialog("Cidade: ");
        ctg.setCidade(cidade);
        
        mensalidade = JOptionPane.showInputDialog("Valor da mensalidade: ");
        ctg.setMensalidade(Double.parseDouble(mensalidade));
        
        danca = JOptionPane.showInputDialog("Participa de competições de dança? 'sim' ou 'nao': ");
        if (danca.equals("sim") == true)
        {
            ctg.setDanca(true);
        }
        else
        {
            ctg.setDanca(false);
        }
        
        declamacao = JOptionPane.showInputDialog("Participa de competições de declamação? 'sim' ou 'nao': ");
        if (declamacao.equals("sim") == true)
        {
            ctg.setDeclamacao(true);
        }
        else
        {
            ctg.setDeclamacao(false);
        }
        
        if (ctg.isDanca() == true)
        {
            danca = "Sim";
        }
        else
        {
            danca = "Não";
        }
        
        if (ctg.isDeclamacao() == true)
        {
            danca = "Sim";
        }
        else
        {
            danca = "Não";
        }
        
        if(ctg.retornaAvaliacao() == true)
        {
            confrend = "Não";
        }
        else
        {
            confrend = "Sim";
        }
        
        JOptionPane.showMessageDialog(null,"Informacoes do CTG" + 
                "\nNome: " + ctg.getNome() + 
                "\nData de fundação: " + ctg.getDatafund() + 
                "\nNúmero de integrantes: " + ctg.getIntegrantes() + 
                "\nCidade: " + ctg.getCidade() + 
                "\nValor da mensalidade: " + ctg.getMensalidade() + 
                "\nParticipa de competições de dança: " + danca + 
                "\nParticipa de competições de declamação: " + declamacao + 
                "\nPorte do CTG: " + ctg.retornaPorte() + 
                "\nRendimento mensal do CTG: " + ctg.rendimentoMensal() + 
                "\nRendimento mensal do CTG está de acordo com as atividades realizadas? " + confrend);
    }
    
}
