/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg5.c;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP15C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int H = sc.nextInt(), W = sc.nextInt();
                if (H == 0 && W == 0) {
                    break;
                }
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }

}
