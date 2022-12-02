/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hargabarang;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Hargabarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double a,b,c,d,disc,total;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Masukan harga barang 1 = ");
        a = scan.nextDouble();
        System.out.print ("Masukan harga barang 2 = ");
        b = scan.nextDouble();
        System.out.print ("Masukan harga barang 3 = ");
        c = scan.nextDouble();
        System.out.print ("Masukan harga barang 4 = ");
        d = scan.nextDouble();
        
        total = a+b+c+d;
        
        if (total >= 500000)
                {
                    disc = total-total*30/100;
        System.out.println ("total diskon belanjaan 30%="+total+"total belanjaan tanpa disko"+disc);
                }
        else if (total <=500000 && total >=300000)
        {
        disc = total-total*20/100;
        System.out.println ("total diskon belanjaan 20%="+total+"total belanjaan tanpa disko"+disc);
        }
         else if (total <=300000 && total >=150000)
        {
        disc = total-total*10/100;
        System.out.println ("total diskon belanjaan 10%="+total+"total belanjaan tanpa disko"+disc);
        }
         else 
                 {
                 System.out.println ("tidak dapat diskon");
                 }
}
}
