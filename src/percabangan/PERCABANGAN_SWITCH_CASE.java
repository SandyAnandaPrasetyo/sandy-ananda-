/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author sandy
 */
public class PERCABANGAN_SWITCH_CASE {
    

    public static void main(String[] args) {
        
                  System.out.println("--------------------------------");
        System.out.println("MENCOBA PERCABANGAN");
        System.out.println("--------------------------------");
        System.out.println("MENGGUNAKAN SWITCH CASE");
        System.out.println("--------------------------------");
        System.out.println("      BY SANDXTEAM       ");
         System.out.println("--------------------------------");
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih opsi A, B, atau C: ");
        char pilihan = scanner.next().charAt(0);

        switch (pilihan) {
            case 'A', 'a' -> System.out.println("Anda memilih opsi A.");
            case 'B', 'b' -> System.out.println("Anda memilih opsi B.");

            case 'C', 'c' -> System.out.println("Anda memilih opsi C.");
            default -> System.out.println("Pilihan tidak valid.");
        }
    }
}



