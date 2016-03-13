/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Random;

/**
 *
 * @author Jorge Antonio
 */
public class NumeroSecreto {
    
    // Variables de instancia de la clase NumeroSecreto
    private int numero;
    private int limiteInferior;
    private int limiteSuperior;
    private Random generador;
    
    // Dos constantes con nombre (Constantes Simbolicas)
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;
    
    // Metodo setRango() para inicializar las variabes de instancia que definen el rango
    public void setRango(int limiteInferior, int limiteSuperior) {
        if (limiteInferior > limiteSuperior) {
            this.limiteInferior = LIM_INF_PREDET;
            this.limiteSuperior = LIM_SUP_PREDET;
        }
        else {
            this.limiteInferior = limiteInferior;
            this.limiteSuperior = limiteSuperior;
        }
    }
    
    // Metodo generar()
    public final void generar() {
        this.numero = generador.nextInt(limiteSuperior) + 1;
    }
    
    // Constructor con dos parametros para la clase
    public NumeroSecreto(int limiteInferior, int limiteSuperior) {
        this.setRango(limiteInferior, limiteSuperior);
        this.generador = new Random();
        this.generar();
    }
    
    // Segundo constructor sin parametros para la clase
    public NumeroSecreto() {
        this(LIM_INF_PREDET, LIM_SUP_PREDET);
    }
    
    // Declare un getters para las variables de instancia numero, lim Inf y Sup
    public int getNumeroSecreto() {
        return this.numero;
    }
    
    public int getLimiteInferior() {
        return this.limiteInferior;
    }
    
    public int getLimiteSuperior() {
        return this.limiteSuperior;
    }
    
    //Declare la Clase esMayor()
    public boolean esMayor(int numero) {
        boolean elNumeroSecretoEsMayor;
        if (this.numero > numero) {
            elNumeroSecretoEsMayor = true;
        }
        else {
            elNumeroSecretoEsMayor = false;
        }
        return elNumeroSecretoEsMayor;
    }
    
    //Declare la clase esMenor()
    public boolean esMenor(int numero) {
        boolean elNumeroSecretoEsMenor = false;
        if (this.numero < numero) {
            elNumeroSecretoEsMenor = true;
        }
        return elNumeroSecretoEsMenor;
    }
    
    // Declare la clase es igual()
    public boolean esIgual(int numero) {
        return (this.numero == numero);
    }

}
