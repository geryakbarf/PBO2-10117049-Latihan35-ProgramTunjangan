/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung berapa besar
 * tunjangan dan gaji total yang akan diterima
 */
public class GajiPokok {
    public double gajiAwal;
    public String status;
    public double tunjangan;
    
    public double  hitungTunjangan(){
        tunjangan =(status.equals("Menikah"))? 0.35 * gajiAwal:0;
        
        return tunjangan;
    }
    
    public double hitungTotalGaji(){
        
        return gajiAwal + tunjangan;   
        
        
    }
}
