package testestring;
    import javax.swing.JOptionPane;
public class Testestring {

    public static void main(String[] args) {
        String escalacao = "Júlio César, D. Alves, D. Luiz, T. Silva, Maxwell, L. Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk", escala;
        Integer tamanho;
        boolean ronaldo;
        
        tamanho = escalacao.length();
        JOptionPane.showMessageDialog(null,"Tamanho da String: " + tamanho);
        
        escala = escalacao.trim();
        JOptionPane.showMessageDialog(null,"Sem barra de espaços: " + escala);
        
    }
    
}
