/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg11.a;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP111A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[7];
        for (int i = 1; i < 7; i++) {
            a[i] = scanner.nextInt();
        }

        char[] b = scanner.next().toCharArray();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 'N') {
                a[0] = a[1];
                a[1] = a[2];
                a[2] = a[6];
                a[6] = a[5];
                a[5] = a[0];
            } else if (b[i] == 'S') {
                a[0] = a[1];
                a[1] = a[5];
                a[5] = a[6];
                a[6] = a[2];
                a[2] = a[0];
            } else if (b[i] == 'E') {
                a[0] = a[1];
                a[1] = a[4];
                a[4] = a[6];
                a[6] = a[3];
                a[3] = a[0];
            } else {
                a[0] = a[1];
                a[1] = a[3];
                a[3] = a[6];
                a[6] = a[4];
                a[4] = a[0];
            }
        }
        System.out.println(a[1]);

    }

}
