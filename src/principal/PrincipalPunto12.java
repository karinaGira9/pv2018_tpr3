/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto12.Libro2;
import dominio.punto12.ListaLibro2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author karina
 */
public class PrincipalPunto12 {
    public static void main(String[] args) {
        ListaLibro2 lista = new ListaLibro2();
        lista.mostrarListaDeLibros();
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------ingrese tipo de busqueda----------- ");
        System.out.println("1- categoria");
        System.out.println("2- titulo");
        System.out.println("----------------------------------------------");
        if (entrada.nextInt()==1){
           lista.buscarLibroPorCategoria();
                        
        }else{
        Scanner entrada2 = new Scanner(System.in);
            System.out.println("ingrese titulo a buscar :");
            lista.buscarLibroPorTitulo(entrada2.nextLine());
        }
    }
  
}
