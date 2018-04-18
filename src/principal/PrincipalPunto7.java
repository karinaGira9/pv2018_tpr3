/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.punto7.ArregloAuto;

/**
 *
 * @author JAIME
 */
public class PrincipalPunto7 {
    public static void main(String[] args) {
        ArregloAuto arreglo= new ArregloAuto();
        
        arreglo.mostrarTablaDeAuto();
        System.out.println("-----------Datos de auto a editar--------------");
        arreglo.editarTablaAuto(3);
        System.out.println("---------Tabla con datos actualizados--------");
        arreglo.mostrarTablaDeAuto();
    }
    
}
