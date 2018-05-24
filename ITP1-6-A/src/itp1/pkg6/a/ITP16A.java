/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg6.a;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP16A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.print(x[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(" " + x[i]);
        }
        System.out.println();
    }
}
