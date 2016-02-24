/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3poogrupoa;

import controlador.ControladorVentanaEmpleado;
import modelo.Empleado;
import vista.VentanaEmpleado;

/**
 *
 * @author tavoberry
 */
public class Practica3POOgrupoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado []e = new Empleado[50];
        VentanaEmpleado v = new VentanaEmpleado();
        ControladorVentanaEmpleado c = new ControladorVentanaEmpleado(v,e);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }
    
}
