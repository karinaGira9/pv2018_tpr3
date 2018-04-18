/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalPunto9;

import dominio.punto8.ListaLibro;
import java.util.Scanner;

/**
 *
 * @author susans
 */
public class PrincipalPunto9 {
     public static void main(String[] args) {
        
         ListaLibro lista = new ListaLibro();
         Scanner entrada = new Scanner(System.in);
         //UTILIZAMOS LA LISTA YA CREADA EN EL PUNTO 8
         lista.mostrarListaDeLibros();
         System.out.println("**********************************");
                        System.out.println("Ingrese titulo de libro");
                        String l = entrada.next();
                        System.out.println("----------LIBRO BUSCADO-----------");
                        lista.buscarLibroPorTitulo(l);
                        System.out.println("-----------------------------------");
                        
         
    }
}
