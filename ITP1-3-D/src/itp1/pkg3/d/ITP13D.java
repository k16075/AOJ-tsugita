/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg3.d;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP13D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                count++;
            }
        }

        System.out.println(count);

    }

}
