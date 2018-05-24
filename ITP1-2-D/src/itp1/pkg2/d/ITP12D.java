/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp1.pkg2.d;

import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class ITP12D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        if (0 <= x-r && x+r <= W && 0<= y - r && y+r <= H) {
             System.out.println("Yes");
            
        } else {
            System.out.println("No");
        }
    }
}
