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
public class Latihan1 {
   public static void hitung(int a, int b){
       System.out.println("Hasil: "+ (a + b));
   } 
   public static void main(String[] args){ 
   Scanner input = new Scanner(System.in);
   System.out.print("masukkan bilangan 1 : ");
   int bill = input.nextInt();
   System.out.print("masukkan bilangan 2  :");
   int bil2 = input.nextInt();
   hitung(bill, bil2);
   }
   
}
