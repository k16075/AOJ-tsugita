/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg11.c;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP111C {

    /**
     * @param args the command line arguments
     */
    static String[] a;
    static String[] b;
    static String temp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine().split(" ");
        b = scanner.nextLine().split(" ");
        char[] c = {'E', 'E', 'E', 'N', 'W', 'W', 'W', 'S'};

        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (char d : c) {
                roll(d);
                if (Arrays.equals(a, b)) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void roll(char c) {
        switch (c) {
            case 'E':
                temp = a[0];
                a[0] = a[3];
                a[3] = a[5];
                a[5] = a[2];
                a[2] = temp;
                break;
            case 'N':
                temp = a[0];
                a[0] = a[1];
                a[1] = a[5];
                a[5] = a[4];
                a[4] = temp;
                break;
            case 'W':
                temp = a[0];
                a[0] = a[2];
                a[2] = a[5];
                a[5] = a[3];
                a[3] = temp;
                break;
            default:
                temp = a[0];
                a[0] = a[4];
                a[4] = a[5];
                a[5] = a[1];
                a[1] = temp;
                break;

        }
    }
}
