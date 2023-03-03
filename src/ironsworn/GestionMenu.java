/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironsworn;

import java.util.Scanner;

/**
 *
 * @author @yuripastorovic
 */
public class GestionMenu {

    Scanner sc = new Scanner(System.in);

    public void menu() {
        boolean fin = false;
        do {
            System.out.println("Bienvenido a IronsWorn");
            System.out.println("Pulse 1     para añadir Jugador");
            System.out.println("Pulse 2     para modificar Jugador");
            System.out.println("Pulse 3     para borrar Jugador");
            System.out.println("Pulse 4     para buscar Jugador");
            System.out.println("Pulse 5     para mostrar Jugador");
            System.out.println("\nPulse 6     para mostrar todos los Jugadores");
            System.out.println("Pulse 7     para generar tiradas ");
            System.out.println("\nPulse 0     para Salir");
            String select = sc.nextLine();
            if (select.equalsIgnoreCase("1")) {

            } else if (select.equalsIgnoreCase("2")) {

            } else if (select.equalsIgnoreCase("3")) {

            } else if (select.equalsIgnoreCase("3")) {

            } else if (select.equalsIgnoreCase("4")) {

            } else if (select.equalsIgnoreCase("5")) {

            } else if (select.equalsIgnoreCase("6")) {

            } else if (select.equalsIgnoreCase("7")) {

            } else if (select.equalsIgnoreCase("0")) {
                fin = true;
            }
        } while (!fin);
    }

    public void annadir() {
        String nombre = "";
        System.out.println("Introduzca nombre de Jugador en la vida real");
        System.out.println("Introduzca nombre de Jugador en la aventura");
        System.out.println("Introduzca estadistica de FIL de " + nombre);
        System.out.println("Introduzca estatistica de CORAZON de " + nombre);
        System.out.println("Introduzca estatistica de HIERRO de " + nombre);
        System.out.println("Introduzca estatistica de SOMBRA de " + nombre);
        System.out.println("Introduzca estatistica de SABIDURIA de " + nombre);
        System.out.println("Tiene " + nombre + " alguna descripcion de personaje");
        System.out.println("Tiene " + nombre + " alguna perk");
        System.out.println("Tiene " + nombre + " algun proposito");
        System.out.println("Tiene " + nombre + " algo en su inventario");

    }

}
