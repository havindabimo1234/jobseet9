/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobseet9;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan4 {
       public static void main(String[] args){
    Double a, b, c;
    
    Scanner d = new Scanner(System.in);
         System.out.print("Masukkan jarak: ");
         a = d.nextDouble();
         System.out.print("Masukkan waktu: ");
         b = d.nextDouble();
         
         c = a/b;
         System.out.print("kecepatan: " +c);
    }
}

