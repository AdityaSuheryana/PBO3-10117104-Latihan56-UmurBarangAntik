/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan56.barangantik;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan Program Barang Antik yg berisi nama dan umur 
 * barang
 */
public class PBO310117104Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
    Radio brgAntik = new Radio(254); 
    brgAntik.setName("Radio");
    
    System.out.println("Nama Barang Antik : "+brgAntik.getName());
    brgAntik.tampilUmur();
    }
    
}
