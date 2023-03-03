/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ironsworn;

import java.util.ArrayList;

/**
 *
 * @author @yuripastorovic
 */
public abstract class Jugador {
    private String nombre;      //nombre en la vida real del jugador
    private String personaje;   //nombre del personaje en la aventura
    private int salud;
    private int entereza;
    private int momentum;
    private int filo;           //estadistica de filo del personaje
    private int corazon;        //estadistica de  corazon del persnaje
    private int hierro;         //estadistica de  hierro del persnaje
    private int sombra;         //estadistica de  sombra del persnaje
    private int sabiduria;      //estadistica de  sabiduria del persnaje
    private int fallos;         //estadistica de  fallos del persnaje
    private ArrayList<String> inventario;
    private ArrayList<String> caracteristicas;
    private ArrayList<String> propositos;
    private String descripcion; 

    public Jugador(String nombre, String personaje, int filo, int corazon, int hierro, int sombra, int sabiduria, int fallos, ArrayList<String> inventario, ArrayList<String> propositos, String descripcion) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.filo = filo;
        this.corazon = corazon;
        this.hierro = hierro;
        this.sombra = sombra;
        this.sabiduria = sabiduria;
        this.fallos = fallos;
        this.inventario = inventario;
        this.propositos = propositos;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getFilo() {
        return filo;
    }

    public void setFilo(int filo) {
        this.filo = filo;
    }

    public int getCorazon() {
        return corazon;
    }

    public void setCorazon(int corazon) {
        this.corazon = corazon;
    }

    public int getHierro() {
        return hierro;
    }

    public void setHierro(int hierro) {
        this.hierro = hierro;
    }

    public int getSombra() {
        return sombra;
    }

    public void setSombra(int sombra) {
        this.sombra = sombra;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public ArrayList<String> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<String> getPropositos() {
        return propositos;
    }

    public void setPropositos(ArrayList<String> propositos) {
        this.propositos = propositos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", personaje=" + personaje + ", filo=" + filo + ", corazon=" + corazon + ", hierro=" + hierro + ", sombra=" + sombra + ", sabiduria=" + sabiduria + ", fallos=" + fallos + ", inventario=" + inventario + ", propositos=" + propositos + ", descripcion=" + descripcion + '}';
    }

   
    
}
