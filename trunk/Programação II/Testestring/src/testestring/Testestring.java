package testestring;
    import javax.swing.JOptionPane;
public class Testestring {

    public static void main(String[] args) {
        String escalacao = "Júlio César, D. Alves, D. Luiz, T. Silva, Maxwell, L. Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk", escala;
        Integer tamanho;
        boolean ronaldo;
        
        tamanho = escalacao.length();
        JOptionPane.showMessageDialog(null,"Tamanho da String: " + tamanho + " caracters");
        
        escala = escalacao.trim();
        JOptionPane.showMessageDialog(null,"Sem barra de espaços: " + escala);
        
        escalacao = escalacao.replace("Fred", "Jô");
        JOptionPane.showMessageDialog(null,"Substituições feitas: " + escalacao);
        
        ronaldo = escalacao.contains("Ronaldinho");
        
        if (ronaldo == true)
        {
            JOptionPane.showMessageDialog(null,"Ronaldinho está na escalação? SIM");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Ronaldinho está na escalação? NÃO");
        }
        
        String lista [] = escalacao.split(",");
        JOptionPane.showMessageDialog(null,"1 ." + lista[0] +
                 "\n2 ." + lista[1] +
                "\n3 ." + lista[2] +
                "\n4 ." + lista[3] +
                "\n5 ." + lista[4] +
                "\n6 ." + lista[5] +
                "\n7 ." + lista[6] +
                "\n8 ." + lista[7] +
                "\n9 ." + lista[8] +
                "\n10 ." + lista[9] +
                "\n11 ." + lista[10]);      
    }
    
}
