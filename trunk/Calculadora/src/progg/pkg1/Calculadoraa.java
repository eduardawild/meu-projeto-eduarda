package progg.pkg1;

public class Calculadoraa {
    Integer a;
    Integer b;
    
    void atribuirA (Integer valor)
    {
        a = valor;
    }
    
    void atribuirB (Integer valor)
    {
        b = valor;
    }
    
    Integer soma ()
    {
        return a+b;
    }
    
    Integer subt ()
    {
        return a-b;
    }
    
    Integer mult ()
    {
        return a*b;
    }
    
    Integer div ()
    {
        return a/b;
    }
}
