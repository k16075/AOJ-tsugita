/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg5.d;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP15D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n = sc.nextInt();
        while (i <= n) {
            int x = i;
            if (x % 3 == 0) {
                System.out.printf(" %d", i);
            } else {
                while (x >= 1) {
                    if (x % 10 == 3) {
                        System.out.printf(" %d", i);
                        break;
                    }
                    x /= 10;
                }
            }
            i++;
        }
        System.out.printf("\n");
    }
}
