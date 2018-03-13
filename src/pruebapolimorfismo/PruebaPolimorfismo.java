/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolimorfismo;

/**
 *
 * @author Angel
 */
public class PruebaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        EmpleadoAsalariado E1= new EmpleadoAsalariado("Carlos","Pano","1234-3453",20000.00);
    EmpleadoPorHoras E2= new EmpleadoPorHoras("Angel","Ramírez","0000-1111",60.00,200);
    EmpleadoPorComision E3= new EmpleadoPorComision("Maggie","Simpson","1234-12323",20,30000);
    EmpleadoBaseMasComision E4=new EmpleadoBaseMasComision("Pepito","Hernández","010101-01010",15,50000,3000.00);
    
    System.out.println("Empleados procesados independientemente");
    /*//System.out.println(E1);
    System.out.printf("%n%s%n%s: $%,.2f%n",E1,"ingresos",E1.ingresos());
    System.out.printf("%n%s%n%s: $%,.2f%n",E2,"ingresos",E2.ingresos());
    System.out.printf("%n%s%n%s: $%,.2f%n",E3,"ingresos",E3.ingresos());
    System.out.printf("%n%s%n%s: $%,.2f%n",E4,"ingresos",E4.ingresos());
    */
    Empleado [] empleados;
    empleados= new Empleado[4];
    empleados[0]=E1;
    empleados[1]=E2;
    empleados[2]=E3;
    empleados[3]=E4;
    
    for (Empleado EmpleadoActual : empleados){
        System.out.println("\n"+EmpleadoActual);
        System.out.printf("ingresos  $%,.2f%n",EmpleadoActual.ingresos());
    }
    }
    
    
}
