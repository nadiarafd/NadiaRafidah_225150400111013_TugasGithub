public class Manusia {
    private String nama;
    private boolean jenisKelamin = false;
    private String nik;
    private boolean menikah = false;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25.0;
            } else {
                return 20.0;
            }
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }
    public String toString(){
      if(jenisKelamin){
      return "nama : " + nama + "\nnik : " + nik + "\nJenis Kelamin: Laki laki"+ "\npendapatan : " + getPendapatan();
      }
        else{
        return "nama : " + nama + "\nnik : " + nik + "\nJenis Kelamin: Perempuan"+ "\npendapatan : " +
      getPendapatan();
      }
   }
  }

  