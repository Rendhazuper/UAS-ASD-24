package UAS_ASD_24;
import java.util.*;
/**
 * Kendaraandll
 */
public class Kendaraandll {

    Kendaraan head;
    int size  = 0;
    int pilih = -1;

    public boolean kosong(){
        return head == null;
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
        if (kosong()) {
           head = new Kendaraan(null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
        }else{ 
            Kendaraan current = head; 
            while (current.next !=null) {
                current = current.next;
            }
            Kendaraan dataBaru = new Kendaraan(current, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
            current.next = dataBaru;
        }
        size++;

    }
    public void tambahdata(){
        tambahkendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        tambahkendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        tambahkendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        tambahkendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);
    }

    public void tampilkanData() {
        if (kosong()) {
            System.out.println("Kosong ges");
        } else {
            System.out.printf("|%-15s |%-20s |%-15s |%-15s |%-10s |%-15s%n", 
                              "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan Harus Bayar");
            Kendaraan current = head;
            while (current != null) {
                System.out.printf("|%-15s |%-20s |%-15s |%-15d |%-10d |%-15d%n", 
                                  current.noTNKB, current.nama, current.jenis, current.cc, current.tahun, current.bulanHarusBayar);
                current = current.next;
            }
        }
    }
}