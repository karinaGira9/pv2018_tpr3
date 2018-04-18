/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto3.Triangulo;
import java.util.Scanner;

/**
 *
 * @author karina
 */
public class PrincipalPunto3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        
        System.out.println("Ingrese lado A:");
        int a = entrada.nextInt();
        System.out.println("Ingrese lado B:");
        int b = entrada.nextInt();
        System.out.println("Ingrese lado C:");
        int c = entrada.nextInt();
        
        triangulo.setLadoA(a);
        triangulo.setLadoB(b);
        triangulo.setLadoC(c);
        
        triangulo.verificarTriangulo();
    }
    
}
