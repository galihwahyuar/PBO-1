/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Lenovo
 */
public class genap {
    public static void main (String [] args){
        int count = 1;
        int i, j, k;
        
        i=1;
        do{
            j=4;
            k=1;
            do{
                System.out.print("");
                j--;
            }while (j>=i);
            
            do{
                System.out.print(count+"");
                
                k++;
                count++;
            }while (k<=i);
            System.out.println();
            i++;
        }while(i<=3);
    }
}