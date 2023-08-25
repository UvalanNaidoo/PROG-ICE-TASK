/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.task.pkg1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class IceTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);

        System.out.println("Input values for Bird:");
        brd.input();

        System.out.println("\nInput values for Reptile:");
        rept.input();

        System.out.println("\nBird object details:");
        brd.output();

        System.out.println("\nReptile object details:");
        rept.output();
    }
}

       
    
    
