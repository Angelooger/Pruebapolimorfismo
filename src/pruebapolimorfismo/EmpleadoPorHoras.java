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
public class EmpleadoPorHoras extends Empleado {
    private double horas;
    private double sueldo;

    public EmpleadoPorHoras(String Nombre, String Apellidos, String nSS,double horas, double sueldo) {
        super(Nombre, Apellidos, nSS);
        this.horas = horas;
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    @Override
    public double ingresos() {
        if (horas<=40){
            return sueldo*horas;
        }
        else if (horas>40){
            return 40*sueldo+(horas-40)*sueldo*1.5;
        }return 0;
        
    }
    @Override
    public String toString(){
        return String.format("empleado por horas: %s%n%s: $%,.2f%n%s:%.2f",super.toString(),"sueldo por hora",this.sueldo,"Horas trabajadas",this.horas);
    }
}
