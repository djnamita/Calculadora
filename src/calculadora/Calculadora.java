package calculadora;

/**
 * @author Juan Jose Rodriguez Parra
 * @version 1.0
 * @param resultado almacena el resultado de las operaciones
 */
public class Calculadora {
   
    private float resultado=0;
    /**
     * @param num indicamos en el constructor el parametro con el que vamos a empezar a tratar en la calculadora
     */
    public Calculadora(float num) {
        resultado=num;
    }
    /**
     * @param alter indicamos al metodo el nuevo valor que tomara la variable resultado
     */
    public void setResultado(float alter)
    {
        resultado=alter;
    }
    /**
     * 
     * @return Nos devuelde el valor que contenga en ese momento la variable resultado 
     */
    public float getResultado(){
        return resultado;
    }
    /**
     * 
     * @param numS Indica cuanto vamos a incrementar el numero guardado en la variable resultado
     * @return Devuelve el valor de dicho resultado una vez procesado
     */
    
    public float sumar(float numS)
    {
        setResultado(resultado+numS);
        return getResultado();
    }
    /**
     * 
     * @param numR indica cuanto quedemos decrementar el numero guardado en la variable resultado
     * @return Devuelve el valor de dicho resultado una vez procesado
     */
    
    public float restar(float numR)
    {
        setResultado(resultado-numR);
        return getResultado();
    }
    /**
     * 
     * @param numM Indica el numero por el que deseamos multiplicar el numero guardado en la variable resultado
     * @return Devuelve el valor de dicho resultado una vez procesado
     */
    
    public float multiplicar(float numM)
    {
        setResultado(resultado*numM);
        return getResultado();
    }
    /**
     * 
     * @param numD Indicamos entre que cantidad deseamoos dividir el numero almacenado en la variable resultado
     * @return Devuelve el valor de dicho resultado una vez procesado
     */
     public float dividir(float numD)
    {
        setResultado(resultado/numD);
        return getResultado();
    }
}

