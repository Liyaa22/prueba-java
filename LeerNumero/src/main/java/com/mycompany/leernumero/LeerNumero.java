/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leernumero;

import java.util.Scanner;

/**
 *
 * @author liyan
 */
public class LeerNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Porfavor, introduce un número:");
        int n = sc.nextInt();
        System.out.printf("\nHas puesto el número %d", n);
    }
}
