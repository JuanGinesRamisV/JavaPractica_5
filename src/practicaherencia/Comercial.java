/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherencia;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public final class Comercial extends Empleado {

    private int ventasRealizadas;
    private double comision;

    //constructor vacio
    public Comercial() {
    }

    //cosntructor normal
    public Comercial(int ventasRealizadas, double comision) {
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    //constructor copia
    public Comercial(Comercial c1) {
        this.setNombre(c1.getNombre());
        this.setApellido1(c1.getApellido1());
        this.setApellido2(c1.getApellido2());
        this.setNif(c1.getNif());
        this.setEdad(c1.getEdad());
        this.setSalario(c1.getSalario());
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }
    
    //getters y setters

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Ventas realizadas: "+this.getVentasRealizadas()
        +" Comisión: "+this.getComision());
    }
    
    @Override
    public void pedirAlta(){
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Introduce las ventas realizadas: ");
        this.setVentasRealizadas(lector.nextInt());
        System.out.println("Introduce la comision: ");
        this.setComision(lector.nextDouble());
    }
}
