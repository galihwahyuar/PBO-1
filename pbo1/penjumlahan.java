/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Lenovo
 */
public class penjumlahan {
    public static void main (String [] args){
        int nim [] = {2,1,4,1,7,6,2,0,9,5};
        
        int jumlah = 0;
        
        for(int num : nim){
            jumlah = jumlah + num;
        }
        System.out.println("Jumlah Nilai NIM : "+jumlah);
    }
}
