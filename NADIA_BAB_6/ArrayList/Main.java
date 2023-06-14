public class Main {
    public static void main(String[] args) {
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Ali Avand", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Asyraf Verdino", "Ilmu Komputer", true));

        Mahasiswa mahasiswa3 = new Mahasiswa("Kayla Faustina", "Teknik Informatika", false);
        DataMahasiswa.tambahMahasiswa(mahasiswa3);
        Mahasiswa mahasiswa4 = new Mahasiswa("Arkananta Arief", "Teknik Komputer", true);
        DataMahasiswa.tambahMahasiswa(mahasiswa4);
        Mahasiswa mahasiswa5 = new Mahasiswa("Layalia Lula", "Sistem Informasi", false);
        DataMahasiswa.tambahMahasiswa(mahasiswa5);

        DataMahasiswa.tampilSemuaData();

        System.out.println("============== Pencarian Data Mahasiswa ==============");
        DataMahasiswa.cariMahasiswa("Ali Avand");
        DataMahasiswa.cariMahasiswa("Kayla Faustina");
        DataMahasiswa.cariMahasiswa("Layalia Lula");
        System.out.println();

        DataMahasiswa.cariMahasiswa("Andi Nurkhalisa");
        DataMahasiswa.cariMahasiswa("Wafa Fatmah");
        DataMahasiswa.cariMahasiswa("Nadia Rafidah");
        System.out.println();

        System.out.println("======= Tampilan Data Mahasiswa Sebelum Update =======");
        DataMahasiswa.tampilMahasiswa(mahasiswa3);

        // Method tampilMahasiswa (setelah diupdate)
        System.out.println("======= Tampilan Data Mahasiswa Setelah Update =======");
        Mahasiswa mahasiswa6 = new Mahasiswa("Nadia Rafidah", "Magister Sistem Informasi", true);
        DataMahasiswa.updateMahasiswa(mahasiswa3, mahasiswa6);
        DataMahasiswa.tampilMahasiswa(mahasiswa3);
    }
}