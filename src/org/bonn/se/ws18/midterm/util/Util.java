package org.bonn.se.ws18.midterm.util;

/*
 * Klasse fuer wiederverwendbaren Hilfsfunktionen, die mit einem Aufruf und ohne Objekt-Bezug ausgefuehrt werden
 * koennen.
 *
 */
public class Util {

    // Aufzaehlung von Fibonacci-Zahlen (angepasst nach der agilen Philosophie, bis max. 100)
    static int[] fibonacciZahlen = {1,2,3,5,8,13,20,35,50,100};


    /*
     * Methode zur Ueberpruefung, ob eine Zahl eine Fibonacci-Zahl ist
     */
    public static boolean checkFibonacci(int aufwandInt) {
        for ( int i = 0; i < Util.fibonacciZahlen.length ; i++ ) {
            if ( aufwandInt == Util.fibonacciZahlen[i] ) {
                return true;
            }
        }
        return false;
    }

    /*
     * Methode zur Berechnung de Priorisierung nach Gloger
     *
     */
    public static double berechnePrio(double mehrwert, double strafe, double aufwand, double risk) {
        return ( (mehrwert + strafe ) / ( aufwand + risk ) );
        // return Math.round(  prio*100 / 100.0 );
    }


}

