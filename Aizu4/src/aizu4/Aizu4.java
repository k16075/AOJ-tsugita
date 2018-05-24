/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aizu4;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Aizu4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int h = a/3600;
        int m = a%3600/60;
        int s = a%3600%60;
        
        System.out.println(h + ":" +m + ":" + s);
    }
    
}
