/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superherencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author pvespucio
 */
public class SuperHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Consejero presi = new Consejero();
        Consejero presi = new Consejero("Presidente",
                2025,
                "vespucio", 
                "informática", 
                "vespertino",
        "Oscar Badilla","20365987-3",LocalDateTime.now());

        
    }
}
