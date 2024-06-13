package UAS_ASD_24;
import java.util.*;
/**
 * Kendaraandll
 */
public class Kendaraandll {

    Kendaraan headKendaraan;
    TransaksiPajak headTransaksiPajak;
    int sizeKendaraan = 0;
    int sizeTransaksiPajak = 0;
    int pilih = -1;

    public boolean kosongKendaraan(){
        return headKendaraan == null;
    }
    public boolean kosongTransaksi(){
        return headTransaksiPajak == null;
    }

    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Bayar Pajak");
        System.out.println("3. Tampilkan seluruh transaski");
        System.out.println("4. Urutkan Transaksi berdasar nama pemilik");
        System.out.println("5. Keluar");
        System.out.print("pilih (1-5) :");
        return pilih = input.nextInt();
    }
        public void tambahkendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar){
        if (kosongKendaraan()) {
           headKendaraan = new Kendaraan(null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
        }else{ 
            Kendaraan current = headKendaraan; 
            while (current.next !=null) {
                current = current.next;
            }
            Kendaraan dataBaru = new Kendaraan(current, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
            current.next = dataBaru;
        }
        sizeKendaraan++;

    }
    public void tambahdata(){
        tambahkendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        tambahkendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        tambahkendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        tambahkendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);
    }

    public long hitung(Kendaraan kendaraan){
        if (kendaraan.jenis.equalsIgnoreCase("Motor")) {
            if (kendaraan.cc < 100) {
                return 100000;
            }else if (kendaraan.cc > 100 && kendaraan.cc < 250){
                return 250000;
            }else{
                return 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("Mobil")) {
            if (kendaraan.cc < 1000) {
                return 750000;
            } else if (kendaraan.cc > 1000 && kendaraan.cc <2500) {
                return 1000000;
            } else {
                return 1500000;
            }
        }
        return 0;
    }

    public long denda(int bulanHarusBayar, int bulanBayar){
        int selisihbulan = bulanBayar - bulanHarusBayar;
        if (selisihbulan <= 0) {
           return 0; 
        }else if(selisihbulan <=3){
        return 50000 ;
        }else{
        return 50000 * selisihbulan;
    }
}

    public void tampilkanData() {
        if (kosongKendaraan()) {
            System.out.println("Kosong ges");
        } else {
            System.out.printf("|%-15s |%-20s |%-15s |%-15s |%-10s |%-15s%n", 
                              "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan Harus Bayar");
            Kendaraan current = headKendaraan;
            while (current != null) {
                System.out.printf("|%-15s |%-20s |%-15s |%-15d |%-10d |%-15d%n", 
                                  current.noTNKB, current.nama, current.jenis, current.cc, current.tahun, current.bulanHarusBayar);
                current = current.next;
            }
        }
    }
}