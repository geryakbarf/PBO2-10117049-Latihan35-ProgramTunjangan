/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung berapa besar
 * tunjangan dan gaji total yang akan diterima
 */
public class CobaCoba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        GajiPokok gaji1 = new GajiPokok();

        System.out.println("===Program Tunjangan===");
        System.out.print("Berapa gaji pokok anda perbulan : ");
        gaji1.gajiAwal = baca.nextDouble();
        System.out.print("Status Anda (Menikah/Belum) : ");
        gaji1.status = baca.next();

        System.out.println("===Hasil Perhitungan===");
        System.out.println("Gaji Pokok : " + gaji1.gajiAwal);
        System.out.println("Tunjangan : " + gaji1.hitungTunjangan());
        System.out.println("Total gaji : " + gaji1.hitungTotalGaji());

    }

}
