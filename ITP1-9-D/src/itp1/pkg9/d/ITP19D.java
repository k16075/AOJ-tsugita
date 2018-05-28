/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg9.d;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP19D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder S = new StringBuilder(sc.next());
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                String operator = sc.next();
                int a = sc.nextInt(), b = sc.nextInt() + 1;
                if (operator.equals("print")) {
                    System.out.println(S.substring(a, b));
                } else if (operator.equals("reverse")) {
                    S.replace(a, b, (new StringBuilder(S.substring(a, b))).reverse().toString());
                } else {
                    String x = sc.next();
                    S.replace(a, b, x);
                }
            }
        }
    }

}
