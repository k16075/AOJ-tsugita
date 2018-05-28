/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg10.b;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP110B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.toRadians(sc.nextDouble());
        System.out.println(a * b * Math.sin(c) / 2.);
        System.out.println((a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c))));
        System.out.println(b * Math.sin(c));

    }

}
