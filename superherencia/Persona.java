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
public class Persona {
    private String nombre;
    private String rut;
    private LocalDateTime fechaNac;

    public Persona() {
        System.out.println("Soy Persona");
    }

    public Persona(String nombre, String rut, LocalDateTime fechaNac) {
        this.nombre = nombre;
        this.rut = rut;
        this.fechaNac = fechaNac;
        System.out.println("Constructor Persona 3");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDateTime getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDateTime fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
    
    
    
}
