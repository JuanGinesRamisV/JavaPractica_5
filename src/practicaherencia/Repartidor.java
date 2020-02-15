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
public final class Repartidor extends Empleado{
    private int horasTrabajadas;
    private String zona;
    
    //constructor vacio
    public Repartidor() {
    }
    
    //constructor normal

    public Repartidor(int horasTrabajadas, String zona, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }

    //constructor copia

    public Repartidor(Repartidor c1) {
        this.setNombre(c1.getNombre());
        this.setApellido1(c1.getApellido1());
        this.setApellido2(c1.getApellido2());
        this.setNif(c1.getNif());
        this.setEdad(c1.getEdad());
        this.setSalario(c1.getSalario());
        this.horasTrabajadas = c1.horasTrabajadas;
        this.zona=c1.zona;
    }
    
    //getters y setters

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Horas Trabajadas: "+this.getHorasTrabajadas()+
                " Zona: "+this.getZona());
    }
    
    public void pedirAlta(){
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Introduce las horas trabajadas: ");
        this.setHorasTrabajadas(lector.nextInt());
        System.out.println("Introduce la zona:");
        this.setZona(lector.nextLine());
    }
}
