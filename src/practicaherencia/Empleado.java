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
public class Empleado {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private double salario;

    //constructor copia
    public Empleado() {
    }

    //constructor normal
    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    //constructor copia
    public Empleado(Empleado c1) {
        this.nombre = c1.nombre;
        this.apellido1 = c1.apellido1;
        this.apellido2 = c1.apellido2;
        this.nif = c1.nif;
        this.edad = c1.edad;
        this.salario = c1.salario;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        char a;
        boolean salir = false;
        Scanner lector = new Scanner(System.in);
        while (salir == false) {
            a = nombre.charAt(0);
            if (Character.isUpperCase(a)) {
                this.nombre = nombre;
                salir = true;
            } else {
                System.out.println("El nombre tiene que tener la primera letra"
                        + "en mayuscula introduce el nombre de nuveo");
                nombre = lector.next();
            }
        }
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        boolean salir = false;
        Scanner lector = new Scanner(System.in);
        while (salir == false) {
            char a = apellido1.charAt(0);
            if (Character.isUpperCase(a)) {
                this.apellido1 = apellido1;
                salir = true;
            } else {
                System.out.println("El apellido tiene que ser en mayuscula"
                        + " introducelo de nuevo");
                apellido1 = lector.next();
            }
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        boolean salir = false;
        Scanner lector = new Scanner(System.in);
        while (salir == false) {
            char a = apellido2.charAt(0);
            if (Character.isUpperCase(a)) {
                this.apellido2 = apellido2;
                salir = true;
            } else {
                System.out.println("El apellido tiene que estar en mayuscula"
                        + " introducelo de nuevo");
                apellido2 = lector.next();
            }
        }
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        while (salir == false) {
            if (edad >= 16) {
                this.edad = edad;
                salir = true;
            } else {
                System.out.println("Introduce la edad: ");
                edad = lector.nextInt();
            }
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarAtributos() {
        System.out.print("nombre: " + this.getNombre() + " Apellido: " + this.getApellido1()
                + " Apellido 2: " + this.getApellido2() + " Nif: " + this.getNif() + " edad: "
                + this.getEdad());
        System.out.print(" salario: " + this.getSalario());
    }

    public void pedirAlta() {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        this.setNombre(lector.nextLine());
        System.out.println("Introduce el primer apellido: ");
        this.setApellido1(lector.next());
        System.out.println("Introduce el segundo apellido: ");
        this.setApellido2(lector.next());
        System.out.println("Introduce nif: ");
        this.setNif(lector.next());
        System.out.println("Introduce la edad: ");
        this.setEdad(lector.nextInt());
        System.out.println("Introduce el salario: ");
        this.setSalario(lector.nextDouble());
    }
}
