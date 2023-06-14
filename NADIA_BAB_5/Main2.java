import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Bintang Adi", "111", true, true);
        System.out.println(manusia1.toString());

        System.out.println("===========================================");

        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("225150407111021", 4.0, "Annisa Adinda", "1110123", true, false);
        System.out.println(mahasiswa1.toString());

        System.out.println("===========================================");

        Pekerja pekerja1 = new Pekerja(1000.0, LocalDate.of(2016, 3, 2), 3, "Yuandini Kartika", "111", false, true);
        System.out.println(pekerja1.toString());

        System.out.println("===========================================");

        Manager2 manager1 = new Manager2("HRD", 1000.0, LocalDate.of(2017, 1, 2), 3, "Malik Ahmad", "111", true, true);
        System.out.println(manager1.toString());

        System.out.println("===========================================");
    }
}