/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla.de.empleado;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class PlanillaDeEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in).useDelimiter("\n");
       
        String nombre;
        int dias;
        double salario, salarioHora, salarioSemana;
       
        System.out.print("Favor ingrese el nombre del empleado: ");
            nombre = scanner.next();
       
        System.out.print("Favor ingrese los dias trabajados del mes: ");
            dias = scanner.nextInt();
       
        System.out.print("Favor ingrese su salario: ");
            salario = scanner.nextDouble();
       
       salarioHora = salario/dias;
       
       salarioSemana = salario/4;
       
       System.out.println("****BOLETA DE EMPLEADO****");
       System.out.print("Nombre del empleado: "+nombre+
                        "\nHora de trabajo mensual: "+salario+
                        "\nTarifa por Hora: "+salarioHora+
                        "\nSalario del empleado Semanal: "+salarioSemana+"\n");
       
               
    }
   
}

      
    
    

