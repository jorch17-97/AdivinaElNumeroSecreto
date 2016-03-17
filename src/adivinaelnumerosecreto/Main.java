/*
 * Laboratorio 1
 * Proyecto adivina el numero secreto
 * Matricula 15470297
 * Jorge Antonio Nicolas Morales
 * Grupo: MS2
 * 13 de Marzo de 2016
 */
package adivinaelnumerosecreto;
import java.util.Scanner;
import model.Juego;

/**
 *
 * @author Jorge Antonio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Modificacion del metodo Main
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean seAdivinoElNumeroSecreto = false;
        Juego juego = new Juego(1, 100, 5);
        while (juego.puedeIntentarDeNuevo() == true
                && !seAdivinoElNumeroSecreto) {
            System.out.print("Adivine el numero secreto: ");
            numero = entrada.nextInt();
            seAdivinoElNumeroSecreto = juego.esElNumeroSecreto(numero);
            if (seAdivinoElNumeroSecreto) {
                System.out.println("Felicidades. Has adivinado el numero secreto.");
            }
            else {
                System.out.println("Fallaste. El numero secreto es "
                        + juego.getTextoDeAyuda(numero)
                        + " que el numero proporcionado");
                System.out.println("Intenta de nuevo.");
            }
        }
        System.out.println("El numero secreto es " + juego.getNumeroSecreto());
    }
}
