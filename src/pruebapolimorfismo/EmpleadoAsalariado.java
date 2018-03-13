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
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado(String Nombre, String Apellidos, String nSS,double salarioSemanal) {
        super(Nombre, Apellidos, nSS);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return this.salarioSemanal;
    }
    @Override
    public String toString(){
        return String.format("empleado asalariado: %s%n%s: $%,.2f",super.toString(),"salario semanal",this.salarioSemanal);
    }
    
}
