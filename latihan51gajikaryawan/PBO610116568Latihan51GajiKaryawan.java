/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan51gajikaryawan;

import java.util.Scanner;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Gaji Karyawan
 */
public class PBO610116568Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scannerText = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        Manager m = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK\t\t\t: ");m.setNik(scannerText.nextLine());
        System.out.print("Masukkan Nama\t\t\t: ");m.setNama(scannerText.nextLine());
        System.out.print("Masukkan Golongan(1/2/3)\t\t: ");m.setGolongan(scannerNumber.nextInt());
        System.out.print("Masukkan Jabatan(Manager/Kabag)\t\t: ");m.setJabatan(scannerText.nextLine());
        System.out.print("Masukkan Jumlah Kehadiran\t: ");m.setKehadiran(scannerNumber.nextInt());
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t\t: "+ m.getNik());
        System.out.println("NAMA\t\t\t: "+  m.getNama());
        System.out.println("GOLONGAN\t\t: "+  m.getGolongan());
        System.out.println("JABATAN\t\t\t: " +  m.getJabatan());        ;
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t\t: " + m.gajiTotal());
    }
    
}
