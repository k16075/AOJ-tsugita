/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg8.d;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP18D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        s += s;
        boolean flag;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == p.charAt(0)) {
                flag = true;
                for (int j = i + 1, k = 1; k < p.length(); j++, k++) {
                    if (s.charAt(j) != p.charAt(k)) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
