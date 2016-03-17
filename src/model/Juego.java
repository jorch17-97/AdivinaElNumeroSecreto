/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Jorge Antonio
 */
public class Juego {
    
    // Variables de instancia de la clase Juego
    private NumeroSecreto numeroSecreto;
    private int limiteInferior;
    private int limiteSuperior;
    private int numeroDeIntentos;
    private int intentosRealizados;
    
    // Dos constantes con nombre (constantes simbolicas)
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;
    
    // Implemento  del metodo setRangoDelNumeroSecreto()
    public void setRangoDelNumeroSecreto(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        numeroSecreto.setRango(this.limiteInferior, this.limiteSuperior);
    }
    
    // Declare el constructor de la clase Juego
    public Juego(int limiteInferior, int limiteSuperior, int intentos) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.numeroDeIntentos = intentos;
        this.numeroSecreto = new NumeroSecreto(this.limiteInferior, this.limiteSuperior);
        this.intentosRealizados = 0;
    }
    
    // Metodo setter para la variables de instancia numeroDeIntentos
    public void setNumeroDeIntentos (int intentos) {
        this.numeroDeIntentos = intentos;
    }
    
    // El metodo esElNumeroSecreto() permitira adivinar el numero y utilizara los intentos restantes
    public  boolean esElNumeroSecreto(int numero) {
        this.intentosRealizados++;
        return numeroSecreto.esIgual(numero);
    }
    
    // Metodo puedeIntentarDeNuevo()
    public boolean puedeIntentarDeNuevo() {
        boolean hayMasOportunidades = this.intentosRestantes() > 0;
        return hayMasOportunidades;
    }
    
    // Metodo que permite saber el numero de intentos restantes a utilizar en el juego
    public int intentosRestantes() {
        int numeroDeIntentosRestantes = this.numeroDeIntentos - this.intentosRealizados;
        return (numeroDeIntentosRestantes);
    }
    
    // Metodo getTextoDeAyuda()
    public String getTextoDeAyuda(int numero) {
        String texto = null;
        if (this.numeroSecreto.esMayor(numero) == true) {
            texto = "mayor";
        }
        else if (this.numeroSecreto.esMenor(numero) == true) {
            texto = "menor";
        }
        return texto;
    }
    
    // Metodo de nombre getNumeroSecreto()
    public int getNumeroSecreto() {
        return this.numeroSecreto.getNumeroSecreto();
    }
}
