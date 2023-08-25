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

public class Reptile extends Animal {
    double bloodTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}

