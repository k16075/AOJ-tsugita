/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg10.d;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP110D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        for (int p = 1; p <= 3; p++) {
            double dis = 0.0;
            for (int i = 0; i < n; i++) {
                dis += Math.pow(Math.abs(x[i] - y[i]), p);
            }
            System.out.println(Math.pow(dis, 1.0 / p));
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.abs(x[i] - y[i]));
        }
        System.out.println(max);

    }

}
