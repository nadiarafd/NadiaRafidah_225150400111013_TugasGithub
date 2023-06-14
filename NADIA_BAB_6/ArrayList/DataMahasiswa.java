import java.util.ArrayList;
public class DataMahasiswa {
    private static ArrayList<Mahasiswa> students = new ArrayList<>();

    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa msw) {
        students.add(msw);
        return students;
    }

    public static void tampilSemuaData() {
        for (Mahasiswa mahasiswa : students) {
            System.out.println("============== Tampilan Data Mahasiswa " + (students.indexOf(mahasiswa) + 1) + " Filkom UB ==============");
            System.out.println("Nama Mahasiswa \t: " + mahasiswa.getNama());
            System.out.println("Jurusan \t: " + mahasiswa.getJurusan());
            System.out.println("Status \t\t: " + (mahasiswa.getStatus() ? "Menikah" : "Lajang"));
            System.out.println();
        }
    }

    public static Mahasiswa cariMahasiswa(String nama) {
        for (Mahasiswa mahasiswa : students) {
            if (mahasiswa.getNama().equals(nama)) {
                System.out.println("Data mahasiswa atas nama " + nama + " ditemukan");
                return mahasiswa;
            }
        }

        System.out.println("Data mahasiswa atas nama " + nama + " tidak ditemukan");
        return null;
    }

    public static void tampilMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("Nama Mahasiswa \t: " + mahasiswa.getNama());
        System.out.println("Jurusan \t: " + mahasiswa.getJurusan());
        System.out.println("Status \t\t: " + (mahasiswa.getStatus() ? "Menikah" : "Lajang"));
        System.out.println();
    }

    public static void updateMahasiswa(Mahasiswa msw1, Mahasiswa msw2) {
        msw1.setNama(msw2.getNama());
        msw1.setJurusan(msw2.getJurusan());
        msw1.setStatus(msw2.getStatus());
    }
}