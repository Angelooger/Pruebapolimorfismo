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
public abstract class Empleado {
    private String Nombre,Apellidos,nSS;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getnSS() {
        return nSS;
    }

    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    public Empleado(String Nombre, String Apellidos, String nSS) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.nSS = nSS;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %nNSS: %s",this.Nombre,this.Apellidos,this.nSS );
    }
    public abstract double ingresos();
}
