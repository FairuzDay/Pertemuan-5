/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan55handphone;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Handphone
 */
public class PBO610116568Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android", "Grand", 500000, "23jkl132h4");
        android.displayProduct();
        
        Blackberry blackberry = new Blackberry("BlackBerry", "RIM", "Curve", 300000, "7231DAC21");
        blackberry.displayProduct();
        
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8.1", "Lumia", 240000, "UUQWEJDK23");
        windowsPhone.displayProduct();
    }
    
}
