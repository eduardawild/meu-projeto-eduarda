package progg.pkg1;

public class Progg1 {

    public static void main(String[] args) {
        Calculadoraa calc = new Calculadoraa();
        
        Integer resultado;
        
        calc.atribuirA(8);
        calc.atribuirB(2);

        resultado = calc.soma();      
        System.out.println ("Soma: " + resultado);
        
        resultado = calc.subt();
        System.out.println ("Subtração: " + resultado);
        
        resultado = calc.mult();
        System.out.println ("Multiplicação: " + resultado);
        
        resultado = calc.div();
        System.out.println ("Divisão: " + resultado);
    }
    
}
