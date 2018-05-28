/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg9.c;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP19C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.compareTo(s2) > 0) {
                x += 3;
            } else if (s1.compareTo(s2) < 0) {
                y += 3;
            } else {
                x++;
                y++;
            }
        }
        System.out.println(x + " " + y);
    }

}
