package caixa.eletronico;
    import java.util.ArrayList;
    import java.util.List;
public class ExemploListaBanco {

    public static void main(String[] args) {
        List<Banco> lista = new ArrayList<Banco>();
        
        Banco b = new Banco();        
        b.setNome("Itau");
        b.setNumero("001");
        
        lista.add(b);
        
        b = new Banco();
        b.setNome("Banrisul");
        b.setNumero("011");
        
        lista.add(b);
        
        b = new Banco();
        b.setNome("Caixa");
        b.setNumero("111");
        
        lista.add(b);
        
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println (lista.get(i).getNome());
            System.out.println (lista.get(i).getNumero());
        }
    }
    
}
