/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import vista.ListaEmpleados;

/**
 *
 * @author tavoberry
 */
public class ControladorListaEmpleados  {
    Empleado []emp = new Empleado[50];
    ListaEmpleados lista = new ListaEmpleados();
    DefaultTableModel modelo;
    DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();//Para alinear las celdas de la tabla
    
    public ControladorListaEmpleados(Empleado []emp, ListaEmpleados lista, int indice){
        this.emp = emp;
        this.lista = lista;
        
        modelo = (DefaultTableModel) lista.jtbEmpleados.getModel();
        modelo.setNumRows(0);//Inicializa la tabla con 0 filas
        alinear.setHorizontalAlignment(SwingConstants.CENTER); //Alineamos al centro
        lista.jtbEmpleados.getColumnModel().getColumn(4).setCellRenderer(alinear);//Se agrega a la tabla la alineacion
        lista.jtbEmpleados.getColumnModel().getColumn(5).setCellRenderer(alinear);
        for (int i=0; i<indice;i++){
            modelo.addRow(new Object[]{ 
                    emp[i].getClave(), emp[i].getNombre(), 
                    emp[i].getApellidos(),emp[i].getRfc(), 
                    emp[i].getEdad(), 
                    emp[i].getTelefono() 
                }); 
        }
    }

}
