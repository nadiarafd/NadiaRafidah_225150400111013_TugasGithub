import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jmlAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jmlAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.tahunMasuk = tahunMasuk;
        this.gaji = gaji;
        this.jmlAnak = jmlAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJmlAnak() {
        return jmlAnak;
    }

    public void setJmlAnak(int jmlAnak) {
        this.jmlAnak = jmlAnak;
    }

    public double getBonus() {
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaKerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaKerja <= 10) {
            return 0.1 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jmlAnak * 20) + gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntahun Masuk : " + tahunMasuk + "\njumlah Anak : " + jmlAnak + "\ngaji : " + gaji;
    }
}
