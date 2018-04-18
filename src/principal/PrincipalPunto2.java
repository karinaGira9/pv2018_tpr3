/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto1.Punto;
import dominio.punto2.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author karina
 */
public class PrincipalPunto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Punto punto = new Punto();
        
        System.out.println("Ingrese coordenada x:");
        double x = entrada.nextDouble();
        System.out.println("Ingrese coordenada y:");
        double y = entrada.nextDouble();
        System.out.println("Ingrese base:");
        int base = entrada.nextInt();
        System.out.println("Ingrese altura:");
        int altura = entrada.nextInt();
        
        punto.setX(x);
        punto.setY(y);
        
        Rectangulo rectangulo = new Rectangulo(punto,base,altura);
         
        System.out.println("la superficie es :"+rectangulo.obtenerSuperficie());
        System.out.println("el perimtro es: "+rectangulo.obtenerPerimetro());
        rectangulo.buscarPuntos(punto, base, altura);
        
    }
    
}
