/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg6.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP16B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] array = new int[4][13];
        for (int i = 0; i < a; i++) {
            String b = scanner.next();
            int c = scanner.nextInt();
            if (b.equals("S")) {
                array[0][c - 1] = 1;
            } else if (b.equals("H")) {
                array[1][c - 1] = 1;
            } else if (b.equals("C")) {
                array[2][c - 1] = 1;
            } else {
                array[3][c - 1] = 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (array[i][j] == 0) {
                    if (i == 0) {
                        System.out.println("S " + (j + 1));
                    } else if (i == 1) {
                        System.out.println("H " + (j + 1));
                    } else if (i == 2) {
                        System.out.println("C " + (j + 1));
                    } else {
                        System.out.println("D " + (j + 1));
                    }
                }
            }
        }
    }
}
