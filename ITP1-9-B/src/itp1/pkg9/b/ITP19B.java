/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg9.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP19B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String a = sc.next();
            if (a.equals("-")) {
                break;
            }
            int b = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum += sc.nextInt();
            }
            String c = a + a;
            System.out.println(c.substring(sum % a.length(), sum
                    % a.length() + a.length()));
        }
    }
}
