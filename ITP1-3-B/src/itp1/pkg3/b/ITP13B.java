/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg3.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP13B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i = 0;
        while(true) {
            x = sc.nextInt();
            if(x == 0) break;
            System.out.println("Case " + (++i) + ": " + x);
        }
    }
}
