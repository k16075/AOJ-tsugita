/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg7.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP17B {

    /**
     * @param args the command line arguments
     */
    static char[] xx = new char[]{'S', 'H', 'C', 'D'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 && x == 0) {
                break;
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }

    }

}
