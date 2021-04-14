/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blockbuster.models;

/**
 *
 * @author power
 */
public class Actor {
    private String nombre;
    private String nacionalidad;
    private char sexo;

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + '}';
    }

    public Actor() {
    }

    public Actor(String nombre, String nacionalidad, char sexo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }
   
}
