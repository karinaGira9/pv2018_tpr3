/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto8.Libro;
import dominio.punto8.ListaLibro;
import java.util.Scanner;

/**
 *
 * @author JAIME
 */
public class PrincipalPunto8 {

    public static void main(String[] args) {
        
        ListaLibro lista = new ListaLibro();
        Scanner entrada = new Scanner(System.in);
        String respuesta = "n";
        int opc;
        System.out.println("********************************************");
        System.out.println("              LISTA DE LIBROS               ");
        System.out.println("********************************************");
        while(respuesta.equals("n")){
             System.out.println("          MENU LIBROS           ");
             System.out.println("->(1) mostrar lista de libros");
             System.out.println("->(2) agregar libro");
             System.out.println("---------------------------------------");
             System.out.println("elija una opcion");
             opc = entrada.nextInt();
             switch(opc){
                case 1:
                        lista.mostrarListaDeLibros();
                        break;
                case 2:
                        System.out.println("ingrese datos del libro");
                        System.out.println("ingrese isbn");
                        String isbn = entrada.next();
                        System.out.println("ingrese titulo de libro");
                        String titulo = entrada.next();
                        System.out.println("ingrese autor:");
                        String autor = entrada.next();
                        System.out.println("ingrese precio:");
                        double precio = entrada.nextDouble();
                        
                        lista.getLibros().add(new Libro(isbn, titulo, autor, precio));
                                ;
                        break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
             
                 
            System.out.println("desea salir s/n");
            respuesta = entrada.next();
        }
        
    }
    
}
