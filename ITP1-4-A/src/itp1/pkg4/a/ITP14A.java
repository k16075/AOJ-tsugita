/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg4.a;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP14A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.printf("%d %d %f\n", a / b, a % b, (double)a / (double)b);
        
    }

}
