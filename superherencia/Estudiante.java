/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superherencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author pvespucio
 */
public class Estudiante extends Persona {

    private String sede;
    private String carrera;
    private String jornada;

    public Estudiante() {
        System.out.println("Soy estudiante");
    }

    public Estudiante(String sede, String carrera, String jornada) {
        this.sede = sede;
        this.carrera = carrera;
        this.jornada = jornada;
        System.out.println("Estudiante con 3 párametros");
    }

    public Estudiante(String sede, String carrera, String jornada, String nombre, String rut, LocalDateTime fechaNac) {
        super(nombre, rut, fechaNac);
        this.sede = sede;
        this.carrera = carrera;
        this.jornada = jornada;
        System.out.println("Estudiante con 6 párametros");
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

}
