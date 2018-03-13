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
public class EmpleadoPorComision extends Empleado{
    protected  double tarifaComision;
    protected double ventasBrutas;

    public EmpleadoPorComision(String Nombre, String Apellidos, String nSS,double tarifaComision, double ventasBrutas) {
        super(Nombre, Apellidos, nSS);
        this.tarifaComision = tarifaComision;
        this.ventasBrutas = ventasBrutas;
    }
    
    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }
    
    @Override
    public double ingresos() {
        return (this.tarifaComision/100)*this.ventasBrutas;
    }
    @Override
    public String toString(){
        return String.format("empleado por comisión: %s%n%s: %%%.2f%n%s: $%,.2f",super.toString(),"tarifa por comisión",this.tarifaComision,"Ventas brutas",this.ventasBrutas);
    }
    
}
