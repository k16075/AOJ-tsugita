/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg2.c;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP12C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();
        java.util.Arrays.sort(x);
        System.out.println(x[0] + " " + x[1] + " " + x[2]);
    }

}
