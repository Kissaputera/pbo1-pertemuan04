/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

/**
 *
 * @author ACER
 */
public class While {
    public static void main(String[] args) {
        int isiGelas=0;
        int penuh=225;
        
        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");
        
        while(isiGelas != penuh){
            isiGelas++;
            System.out.println("Sedang mengisi gelas...");
            System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        }
        
        System.out.println("Finale : Isi gelas sekarang : " + penuh + "ml");
    }
}
