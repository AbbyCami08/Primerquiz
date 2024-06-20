/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este programa va a ayudar a determinar el monto total que se debe pagar a la Caja Costarricense del Seguro Social(CCSS).
        //Solicitud de cantidad de empleados
        Double totalPagar = 0.0;
        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de empleados que trabajan en la empresa: "));
        //Solicitud del salario de cada uno de estos empleados
        for (int i=1; i<= numeroEmpleados; i++) {
            int salarioEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario del empleado numero " +i + "¢: "));
            
        //Calcular monto (SEM)
        Double calcularSem = salarioEmpleados * 0.0925;
        
        //Calcular monto (IVM)
        Double calcularIvm = salarioEmpleados * 0.0508;
        
        //Calcular monto total a pagar a la CCSS
        Double totalEmpleado = calcularSem + calcularIvm; 
        
        //Acumulacion
        totalPagar += totalEmpleado;
        
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de ¢: " + totalPagar + "por concepto de SEM Y IVM.");
            
        }
    }
    
}
