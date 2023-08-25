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

public class Animal {
    int IDtag;
    String species;

    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }

    public void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}
