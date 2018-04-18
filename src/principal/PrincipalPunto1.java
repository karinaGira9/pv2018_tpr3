/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto1.Punto;

/**
 *
 * @author karina
 */
public class PrincipalPunto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciamos los objetos. 
        Punto puntoUno = new Punto();
        Punto puntoDos = new Punto();
        
        puntoUno.setX(2);
        puntoUno.setY(7);
        puntoDos.setX(4);
        puntoDos.setY(5);
        
        double distancia = puntoUno.calcularDistanciaEntrePuntos(puntoDos);
        
        System.out.println("Distancia entre: ("+puntoUno.getX()+","+puntoUno.getY()+") y ("+puntoDos.getX()+","+puntoDos.getY()+ ") = "+distancia);
        
        
    }
    
}
