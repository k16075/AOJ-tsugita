/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg3.c;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP13C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y = 0;
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            if (x <= y) {
                System.out.println(x + " " + y);
            } else {
                System.out.println(y + " " + x);
            }
        }
    }
}
