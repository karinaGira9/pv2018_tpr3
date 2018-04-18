/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto10.ListaProducto;
import dominio.punto10.Producto;
import java.util.Scanner;

/**
 *
 * @author karina
 */
public class PrincipalPunto10 {
    public static void main(String[] args) {
        ListaProducto producto = new ListaProducto();
        producto.agregarProducto();
        producto.mostrarProducto();
        
        for (Producto item : producto.getProducto()) {
    producto.generarCuotas(item.getCuota(), item);         
        }
   
       
        
    }
    
}
