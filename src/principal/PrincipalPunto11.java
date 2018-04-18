/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto11.ListaZapatilla;
import java.util.Scanner;

/**
 *
 * @author karina
 */
public class PrincipalPunto11 {
    public static void main(String[] args) {
        ListaZapatilla lista = new ListaZapatilla();
        lista.agregarZapatilla();
        lista.mostrarLista();
        
        Scanner entrada = new Scanner(System.in);
        String respuesta = "n";
        int opc;
        
        while(respuesta.equals("n")){
             System.out.println("--------MENU ZAPATILLA------------");
             System.out.println("->(1) mostrar lista de zapatilla");
             System.out.println("->(2) agregar zapatilla");
            
             System.out.println("---------------------------------------");
             System.out.println("elija una opcion:");
             opc = entrada.nextInt();
             switch(opc){
                case 1:
                        lista.mostrarLista();
                        break;
                case 2:
                  lista.agregarZapatilla();
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
