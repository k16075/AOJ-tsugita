/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg2.a;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP12A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a>b) {
            System.out.println("a > b");
            
        } else if (a<b){
            System.out.println("a < b");
            
        } else {
            System.out.println("a == b");
        }
    }
    
}