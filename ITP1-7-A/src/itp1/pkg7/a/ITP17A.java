/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg7.a;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP17A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int m = sc.nextInt(), f = sc.nextInt(), r = sc.nextInt();
                if (m == -1 && f == -1 && r == -1) {
                    break;
                }
                if (m == -1 || f == -1) {
                    System.out.println("F");
                } else if (m + f >= 80) {
                    System.out.println("A");
                } else if (m + f >= 65) {
                    System.out.println("B");
                } else if (m + f >= 50) {
                    System.out.println("C");
                } else if (m + f >= 30) {
                    if (r >= 50) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }
                } else {
                    System.out.println("F");
                }
            }
        }
    }
}