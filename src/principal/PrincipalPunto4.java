/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto4.ArregloNumero;
import java.util.Scanner;

/**
 *
 * @author karina
 */
public class PrincipalPunto4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ArregloNumero numeros = new ArregloNumero();
        int contador = 0;
        
        while(contador < 10){
            System.out.println("Ingrese numero al arreglo: ");
            numeros.getNumeros()[contador] = entrada.nextInt();
            contador++;
        }
        
        numeros.mostrarElementosDeArreglo();
        numeros.mostrarMayorMenorDeArreglo();
        
        System.out.println("Promedio del Arreglo: "+numeros.calcularPromedio());
    }
    
}
