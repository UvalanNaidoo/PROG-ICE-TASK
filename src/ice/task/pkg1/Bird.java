/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg1;

/**
 *
 * @author lab_services_student
 */

import java.util.Scanner;

public class Bird extends Animal {
    int featherColor;

    public Bird(int IDtag, String species, int featherColor) {
        super(IDtag, species);
        this.featherColor = featherColor;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather color (1=grey, 2=white, 3=black): ");
        featherColor = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        String colorName;
        switch (featherColor) {
            case 1:
                colorName = "grey";
                break;
            case 2:
                colorName = "white";
                break;
            case 3:
                colorName = "black";
                break;
            default:
                colorName = "unknown";
        }
        System.out.println("Feather Color: " + colorName);
    }
}


    

