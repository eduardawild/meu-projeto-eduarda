package caixa.eletronico;
    import java.util.Scanner;
    import javax.swing.JOptionPane;
public class CaixaEletronico {

    public static void main(String[] args) {
        Conta c = new Conta();
        Cliente cl = new Cliente();
        
        String nome, numero, agencia, deposito, saque, cpf, datanasc, endereco, spc, serasa;
        Boolean deucerto;
        
        /*JOptionPane.showMessageDialog(null,"ABERTURA DE CONTA");
        
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        numero = JOptionPane.showInputDialog("Informe o numero: ");
        agencia = JOptionPane.showInputDialog("Informe a agencia: ");
        
        c.Abrir(nome, agencia, numero);
        
        JOptionPane.showMessageDialog(null,"DEPOSITO");
        deposito = JOptionPane.showInputDialog("Informe o valor do deposito: ");
        
        if (c.Deposito(Double.parseDouble(deposito)) == false)
        {
            JOptionPane.showMessageDialog(null,"Deposito nao realizado, a conta ainda nao esta aberta");
        }
             
        saque = JOptionPane.showInputDialog("Informe o valor do saque: ");
        if (c.Sacar(Double.parseDouble(saque)) == false)
        {
            JOptionPane.showMessageDialog(null,"Saque nao realizado, a conta nao esta aberta ou nao ha saldo suficiente: ");
        }
        
        JOptionPane.showMessageDialog(null,"Saldo restante: " + c.retornaSaldo()); */
        
        nome = JOptionPane.showInputDialog("Informe o nome:");
        cl.setNome(nome);
        
        cpf = JOptionPane.showInputDialog("Informe o cpf:");
        cl.setCpf(Integer.parseInt(cpf));
        
        datanasc = JOptionPane.showInputDialog("Informe a data de nascimento:");
        cl.setDatanasc(Integer.parseInt(datanasc));
        
        endereco = JOptionPane.showInputDialog("Informe o endereco:");
        cl.setEndereco(endereco);
        
        spc = JOptionPane.showInputDialog("Negativo no spc? SIM ou NAO:");
        if(spc.equals("SIM")==true)        
            cl.setSpc(true);
        else 
            cl.setSpc(false);
        
        serasa = JOptionPane.showInputDialog("Negativo no serasa? SIM ou NAO:");
        if(serasa.equals("SIM")==true)        
            cl.setSerasa(true);
        else 
            cl.setSerasa(false);     
    }
    
}
