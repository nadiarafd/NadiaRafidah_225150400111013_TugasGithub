import java.time.LocalDate;

public class Manager2 extends Pekerja {
    private String departemen;

    public Manager2(String departemen, double gaji, LocalDate tahunMasuk, int jmlAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jmlAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * super.getGaji());
    }

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen : " + departemen;
    }
   }