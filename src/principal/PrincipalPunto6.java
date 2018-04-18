/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto6.TablaRectangulo;
import java.util.Scanner;

/**
 *
 * @author JAIME
 */
public class PrincipalPunto6 {

    public static void main(String[] args) {
        // TODO code application logic here
        TablaRectangulo tabla = new TablaRectangulo();
        
        tabla.visualizarTablaDeRectangulos();
        Scanner entrada =new Scanner(System.in);
        System.out.println("ingrese posicion a eliminar:");
        tabla.eliminarElementoDeTabla(entrada.nextInt());
        
        tabla.visualizarTablaDeRectangulos();//muestra la nueva tabla sin elemento eliminado.
    }
    
}
