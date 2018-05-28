/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg9.a;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP19A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        int sum = 0;
        while (true) {
            String a = sc.nextLine();
            if (a.equals("END_OF_TEXT")) {
                break;
            }
            for (String s : a.split(" ")) {
                if (s.equalsIgnoreCase(d)) {
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }
}
