/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

/**
 *
 * @author ACER
 */
public class DoWhile {
    public static void main(String[] args) {
       int isiGelas=0;
       int penuh=225;
        
        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");
        
        do {
        isiGelas++;
        System.out.println("Sedang mengisi gelas...");
        System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        }while(isiGelas != penuh);
        
        System.out.println("Finale : Isi gelas sekarang : " + isiGelas + "ml"); 
        
    }
}
