package test;
import Calculadora.*;

public class Test {

   
    public static void main(String[] args) {
        
        Calculadora calcu = new Calculadora();
        calcu.sumar(5F);
        calcu.restar(9F);
        calcu.multiplicar(7F);
        calcu.dividir(2F);
        
        System.out.printf("> %.2f \n",Calculadora.getResultado());
    }
    
}
