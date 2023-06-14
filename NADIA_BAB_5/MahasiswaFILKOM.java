public class MahasiswaFILKOM extends Manusia {
  private String nim;
  private double ipk;

  public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
      super(nama, nik, jenisKelamin, menikah);
      this.nim = nim;
      this.ipk = ipk;
  }

  public String getNim() {
      return nim;
  }

  public void setNim(String nim) {
      this.nim = nim;
  }

  public double getIpk() {
      return ipk;
  }

  public void setIpk(double ipk) {
      this.ipk = ipk;
  }

  public double getBeasiswa() {
      if (ipk > 3.5) {
          return 0.75 * super.getTunjangan();
      } else if (ipk > 3.0) {
          return 0.50 * super.getTunjangan();
      } else {
          return 0;
      }
  }

  public String getStatus() {
      String prodi = nim.substring(6, 7);
      String angkatan = nim.substring(0, 2);
      String status = null;

      switch (prodi) {
          case "2":
              status = "Teknik Informatika, 20" + angkatan;
              break;
          case "3":
              status = "Teknik Komputer, 20" + angkatan;
              break;
          case "4":
              status = "Sistem Informasi, 20" + angkatan;
              break;
          case "6":
              status = "Pendidikan Teknologi Informasi, 20" + angkatan;
              break;
          case "7":
              status = "Teknologi Informasi, 20" + angkatan;
              break;
          default:
              status = null;
              break;
      }

      return status;
  }

  @Override
  public double getPendapatan() {
      return super.getTunjangan() + getBeasiswa();
  }

  @Override
  public String toString() {
      return super.toString() + "\nnim : " + nim  + "\nipk : " + ipk + "\nstatus : " + getStatus();
  }
  }
  
