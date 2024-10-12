/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superherencia;

import java.time.LocalDateTime;

/**
 *
 * @author pvespucio
 */
public class Consejero extends Estudiante {

    private String cargo;
    private Integer periodo;

    public Consejero() {
        System.out.println("Soy Consejero");
    }

    public Consejero(String cargo, Integer periodo) {
        this.cargo = cargo;
        this.periodo = periodo;
    }

    public Consejero(String cargo, Integer periodo, String sede, String carrera, String jornada) {
        super(sede, carrera, jornada);
        this.cargo = cargo;
        this.periodo = periodo;
    }

    public Consejero(String cargo, Integer periodo, String sede, String carrera, String jornada, String nombre, String rut, LocalDateTime fechaNac) {
        super(sede, carrera, jornada, nombre, rut, fechaNac);
        this.cargo = cargo;
        this.periodo = periodo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }
}
