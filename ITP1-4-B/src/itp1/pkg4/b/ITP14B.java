/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg4.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP14B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        r = sc.nextDouble();
        
        System.out.printf("%.10f  %.10f",r * r * Math.PI, (2 * r) * Math.PI);
        
    }
    
}
