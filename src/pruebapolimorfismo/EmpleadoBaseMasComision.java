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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public EmpleadoBaseMasComision( String Nombre, String Apellidos, String nSS, double tarifaComision, double ventasBrutas,double salarioBase) {
        super(Nombre, Apellidos, nSS, tarifaComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double ingresos(){
        return this.salarioBase+((tarifaComision/100)*ventasBrutas);
    }
    @Override
    public String toString(){
        return String.format("empleado base más comisión: %s %s; %s : $%,.2f","con salario base",super.toString(),"salario base",this.salarioBase);
    }
}
