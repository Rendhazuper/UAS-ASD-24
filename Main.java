package UAS_ASD_24;

import java.util.*;

public class Main {

    // public int menu(){
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Menu");
    //     System.out.println("1. Daftar Kendaraan");
    //     System.out.println("2. Bayar Pajak");
    //     System.out.println("3. Tampilkan seluruh transaski");
    //     System.out.println("4. Urutkan Transaksi berdasar nama pemilik");
    //     System.out.println("5. Keluar");
    //     System.out.print("pilih (1-5) :");
    //     return pilih = input.nextInt();
    // }
   
    
    public static void main(String[] args) {
        Kendaraandll dll = new Kendaraandll();
        dll.tambahdata();
     while (dll.pilih != 5 || dll.pilih != 0) {
        dll.menu();
        switch (dll.pilih) {
            case 1:
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan");
            System.out.println("+++++++++++++++++++++++++++");
                dll.tampilkanData();
                break;
        
            case 2:
            System.out.println("=================================");
            System.out.println("Masukkan Data Pembayaran");
            System.out.println("=================================");

                break;
        }
     }


    }
    
}
