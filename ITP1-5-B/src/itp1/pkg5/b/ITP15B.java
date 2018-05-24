/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg5.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP15B {

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
                        if (i == 0 || j == 0 || i == H - 1 || j == W - 1) {
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
