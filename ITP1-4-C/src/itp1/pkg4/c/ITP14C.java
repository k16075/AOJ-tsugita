/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg4.c;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP14C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            if (op.equals("?")) {
                break;
            }
            int x = 0;
            if (op.equals("+")) {
                x = a + b;
            } else if (op.equals("-")) {
                x = a - b;
            } else if (op.equals("*")) {
                x = a * b;
            } else {
                x = a / b;
            }
            System.out.println(x);

        }
    }
}
