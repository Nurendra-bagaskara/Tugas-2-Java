/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Anda");

        String Nama,noKTP,alamat;
        System.out.print("Nama\t\t: ");
         Nama = input.nextLine();
        System.out.print("Nomer KTP\t: ");
         noKTP = input.nextLine();
        System.out.print("Alamat\t\t: ");
         alamat = input.nextLine();

        int harga,uang,Total;
        System.out.println("Tujuan kereta");
        System.out.println("1.Malang\n2.Blitar\n3.Kediri");
        System.out.print("Masukan Angka Tujuan\t: ");
        String kota = input.next();
        switch (kota) {
            case "1":
                harga = 50000;
                System.out.print("Harga Tiket Malang\t: Rp."+harga+"\nMasukan uang anda\t: Rp.");
                uang = input.nextInt();
                Total = uang - harga;
                System.out.println("Kembalian\t\t: Rp."+Total);
                System.out.println("berhasil");
                break;
            case "2":
                harga = 30000;
                System.out.print("Harga Tiket Blitar\t: Rp."+harga+"\nMasukan uang anda\t: Rp.");
                uang = input.nextInt();
                Total = uang - harga;
                System.out.println("Kembalian\t\t: Rp."+Total);
                System.out.println("berhasil");
                break;
            case "3":
                harga = 45000;
                System.out.print("Harga Tiket Tulungagung\t: Rp."+harga+"\nMasukan uang anda\t: Rp.");
                uang = input.nextInt();
                Total = uang - harga;
                System.out.println("Kembalian\t\t: Rp."+Total);
                System.out.println("berhasil");
                break;
        }

    }

}
