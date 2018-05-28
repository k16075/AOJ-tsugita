/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg8.a;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP18A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                System.out.print((char) (c - 32));
            } else if ('A' <= c && c <= 'Z') {
                System.out.print((char) (c + 32));
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }

}
