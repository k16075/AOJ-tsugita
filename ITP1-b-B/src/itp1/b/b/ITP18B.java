/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.b.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP18B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("0")) {
                break;
            }
            int ret = 0;
            for (int i = 0; i < s.length(); i++) {
                ret += s.charAt(i) - 48;
            }
            System.out.println(ret);
        }
    }
}
