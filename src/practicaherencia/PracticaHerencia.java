/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juang
 */
public class PracticaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Scanner lector = new Scanner(System.in);
        int aux;
        int menu2;
        int i;
        boolean salir = false;
        
        while (salir == false) {
            System.out.println("=================");
            System.out.println("1) dar de alta");
            System.out.println("2) mostar empleados");
            System.out.println("3) Salir");
            System.out.println("===================");
            System.out.println("Introduce una opcion");
            aux = lector.nextInt();

            if (aux == 1) {
                System.out.println("=============");
                System.out.println("1) dar de alta empleado");
                System.out.println("2) dar de alta comercial");
                System.out.println("3) dar de alta Repartidor");
                System.out.println("========================");
                System.out.println("Introduce una opción: ");
                menu2 = lector.nextInt();
                if (menu2 == 1) {
                    Empleado e1 = new Empleado();
                    e1.pedirAlta();
                    empleados.add(e1);
                } else if (menu2 == 2) {
                    Comercial e1 = new Comercial();
                    e1.pedirAlta();
                    empleados.add(e1);
                } else if (menu2 == 3) {
                    Repartidor e1 = new Repartidor();
                    e1.pedirAlta();
                    empleados.add(e1);
                }
            } else if (aux == 2) {
                System.out.println("============");
                System.out.println("1)ver todos los empleados");
                System.out.println("2)ver los empleados normales");
                System.out.println("3)ver a los comerciales");
                System.out.println("4)ver a los repartidores");
                System.out.println("==================");
                System.out.println("Introduce una opcion: ");
                menu2 = lector.nextInt();
                if (menu2 == 1) {
                    for (i = 0; i <= empleados.size() - 1; i++) {
                        empleados.get(i).mostrarAtributos();
                        System.out.println("");
                    }
                } else if (menu2 == 2) {
                    for (i = 0; i <= empleados.size() - 1; i++) {
                        if (empleados.get(i) instanceof Empleado) {
                            empleados.get(i).mostrarAtributos();
                        }
                    }
                } else if (menu2 == 3) {
                    for (i = 0; i <= empleados.size() - 1; i++) {
                        if (empleados.get(i) instanceof Comercial) {
                            empleados.get(i).mostrarAtributos();
                        }
                    }
                }else if (menu2==4){
                    for(i=0;i<=empleados.size()-1;i++){
                        if(empleados.get(i) instanceof Repartidor){
                            empleados.get(i).mostrarAtributos();
                        }
                    }
                }
            }
        }
    }

}
