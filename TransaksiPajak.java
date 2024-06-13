package UAS_ASD_24;

public class TransaksiPajak {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan kendaraan;
    TransaksiPajak next, prev;

    public TransaksiPajak(TransaksiPajak prev, int kode, int bulanBayar, long nominalBayar, long denda, Kendaraan kendaraan, TransaksiPajak next) {
        this.kode = kode;
        this.bulanBayar = bulanBayar;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.kendaraan = kendaraan;
    }
}
