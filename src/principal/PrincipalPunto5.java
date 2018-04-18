/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto5.Circulo;
import dominio.punto5.ListaCirculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author karina
 */
public class PrincipalPunto5 {

    public static void main(String[] args) {
        
        ListaCirculo lista = new ListaCirculo();
        
        
        Scanner entrada = new Scanner(System.in);
        String s ="si";
        while(s.equals("si")){
            Circulo c = new Circulo();
            System.out.println("Ingrese radio: ");
            c.setRadio(entrada.nextDouble());
            lista.getLista().add(c);
            
            System.out.println("¿Desea ingresar mas radios? si/no");
            s = entrada.next();
        }
        lista.mostrarElementoDeLista();
     }
    
}
