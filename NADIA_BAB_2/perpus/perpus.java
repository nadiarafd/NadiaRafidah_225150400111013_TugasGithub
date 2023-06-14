package perpus;
import java.util.Arrays;

class Perpus {

    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String[] penulisbanyak;
    private String sinopsis;
    private double similarityPercentage;
    private int biaya_buku;
    private int royalti_persen;
    private int Royalti;
    private int penjualan;

    public Perpus(){
        kategori = "";
        penulis = "";
        judul = "";
        bahasa = "";
    }
    public Perpus(String kategori, String judul, String bahasa, String penerbitan,
        String edisi, int halaman, String sinopsis){
        this.kategori = kategori;
        this.judul = judul;
        this.bahasa = bahasa;
        this.penerbitan = penerbitan;
        this.edisi = edisi;
        this.halaman = halaman;
        this.sinopsis = sinopsis;
    }

    public String[] getpenulisbanyak() {
        return penulisbanyak;
    }

    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }

    public void setKategori(String s) {
        kategori = s;
    }

    public void setPenulis(String s) {
        penulis = s;
    }

    public void setJudul(String s) {
        judul = s;
    }

    public void setPenerbitan(String s) {
        penerbitan = s;
    }

    public void setEdisi(String i) {
        edisi = i;
    }

    public void setHalaman(int i) {
        halaman = i;
    }

    public void setBahasa(String s) {
        bahasa = s;
    }
    public void setPenjualan(int i){
        penjualan = i;
    }
    public void setbiayaBuku(int i){
        biaya_buku = i;
    }
    public void royaltiPersen(int i){
        royalti_persen = i;
    }

   
    public void setSinopsis(String s) {
        String[] kata = s.split("\\s+");
        int jumlahKata = kata.length;
        if(jumlahKata>=10) {
            this.sinopsis = s;
        } else {
            this.sinopsis = "Jumlah kata sinopsis judul buku ini kurang dari 10 kata";
        }
            this.sinopsis = s;
    }

    public int gethitungKataSinopsis(String sinopsis) {
        String[] kata = sinopsis.split("\\s+");
        return kata.length;
    }

    public double cekTingkatKesamaan(Perpus a) {
        int sameAttributes = 0; 
        if(this.judul.equals(a.judul)){
            sameAttributes ++;
        
        if (this.kategori.equals(a.kategori)) {
            sameAttributes++;
        }
        if (this.penulis.equals(a.penulis)) {
            sameAttributes++;
        }
        if (this.bahasa.equals(a.bahasa)) {
            sameAttributes++;
        }
        if (this.penerbitan.equals(a.penerbitan)) {
            sameAttributes++;
        }
        if (this.edisi.equals(a.edisi)) {
            sameAttributes++;
        }
        if (this.halaman == a.halaman) {
            sameAttributes++;
        }
        
    }
    similarityPercentage = sameAttributes*(double)100/6;
        displaysimilarityPercentage();
        return similarityPercentage;
}

    private void displaysimilarityPercentage() {
        System.out.println("Tingkat kesamaan kedua objek tersebut sebesar " + similarityPercentage + "%");
    }   

    public int hitungRoyalti(int biaya){
        this.biaya_buku = biaya;
        Royalti = (penjualan*biaya_buku*10/100);
        return Royalti;
    }
    public int hitungRoyalti(int biaya, int persen){
        this.biaya_buku = biaya;
        this.royalti_persen = persen;
        Royalti = (penjualan*biaya_buku*royalti_persen)/100;
        return Royalti;
    }

    public void bacaFile(String pathFile){
        try{
        File file = new File(pathFile);
        Scanner input = new Scanner(file);
        String isi = input.nextLine();
        String[]isiFile = isi.split("; ");
            this.judul = isiFile[0];
            this.penulis = isiFile[1];
            input.close();
        }
        catch (FileNotFoundException exception){
        System.out.println("File not found: " +
        exception.getMessage());
        }
    }

        public void simpanFile(String namaFile){
        try{
        BufferedWriter tulis = new BufferedWriter(new
        FileWriter(namaFile));
            tulis.write(judul + "; " + penulis);
            tulis.close();
        }
        catch (IOException exception){
        System.out.println("Error : " + exception.getMessage());
        }
    }
        

    public void copy(Perpus b){
        this.judul = b.judul;
        this.bahasa = b.bahasa;
        this.halaman = b.halaman;
        this.edisi = b.edisi;
        this.kategori = b.kategori;
        this.penerbitan = b.kategori;
        this.penulis = b.penulis;
        this.penulisbanyak = b.penulisbanyak;
    }

    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]",
                    ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        if(sinopsis != null){
        System.out.println("Banyak kata dalam sinopsis adalah: " + gethitungKataSinopsis(sinopsis));
        } else {
        System.out.println("Sinopsis buku ini belum ditambahkan");
        }
    }


public class javaPerpus {
    public static void main(String[] args) {
        Perpus b1 = new Perpus();
        b1.setJudul("A History of science technology and philosophy in the eighteenth century");
        b1.setKategori("Teknologi");
        b1.setPenulis("McKie, D.");
        b1.setPenerbitan("LondonGeorge Allen & Unwin Ltd 1952");
        b1.setBahasa("Inggris");
        b1.setEdisi("Kedua");
        b1.setHalaman(814);
        b1.displayMessage();
        System.out.println("=====================================");

        Perpus b2 = new Perpus();
        b2.setJudul("Information and Communication Technology,dan Literasi Media Digital");
        b2.setKategori("Teknologi");
        b2.setPenulisbanyak(new String[]{"Dewi Kartika Sari", "Nurul Hasfi", "Hedi Pudjo Santosa", "Triyono Lukmantoro", "Narayana Mahendra Prastya", "Santi Isnaini", "Said Romadlan", "Sa’diyah El Adawiyah", "Suwarto", "Aminah Swarnawati", "AgungPrabowo", "Kurnia Arofah", "Sri Budi Lestari", "Edi antoso","M as’Amah"});
        b2.setPenerbitan("ASPIKOM 2015");
        b2.setBahasa("Indonesia");
        b2.setEdisi("Pertama");
        b2.setHalaman(178);
        b2.displayMessage();
        System.out.println("=====================================");
        
        Perpus b3 = new Perpus();
        b3.setJudul("Dunia Sophie");
        b3.setKategori("Filsafat");
        b3.setPenulis("Jostein Gaarder");
        b3.setPenerbitan("Mizan Pustaka 2014");
        b3.setBahasa("Indonesia");
        b3.setEdisi("-");
        b3.setHalaman(800);
        b3.displayMessage();
        System.out.println("=====================================");

        Perpus b4 = new Perpus();
        b4.setJudul("Filsafat Kata");
        b4.setKategori("Filsafat");
        b4.setPenulis("Reza Alexander Antonius Wattimena");
        b4.setPenerbitan("Evolitera 2011");
        b4.setBahasa("Indonesia");
        b4.setEdisi("-");
        b4.setHalaman(396);
        b4.displayMessage();
        System.out.println("=====================================");
        
        Perpus b5 = new Perpus();
        b5.setJudul("Dinamika Pendidikan Islam: Perspektif Historis");
        b5.setKategori("Sejarah");
        b5.setPenulis("Dr. Siswanto, M.Pd.I");
        b5.setPenerbitan("Pena Salsabila 2013");
        b5.setBahasa("Indonesia");
        b5.setEdisi("-");
        b5.setHalaman(190);
        b5.displayMessage();
        System.out.println("=====================================");

        Perpus b6 = new Perpus();
        b6.setJudul("Penulisan dan Penghimpunan Hadis: Kajian Historis");
        b6.setKategori("Sejarah");
        b6.setPenulis("Rasul Ja'fariyan");
        b6.setPenerbitan("Lentera 1992");
        b6.setBahasa("Indonesia");
        b6.setEdisi("Pertama");
        b6.setHalaman(100);
        b6.displayMessage();
        System.out.println("=====================================");
        
        Perpus b7 = new Perpus();
        b7.setJudul("Berkata Baik atau Diam: 294 Adab Kebiasaan Rasulullah SAW.");
        b7.setKategori("Agama");
        b7.setPenulis("Ninik Handrini");
        b7.setPenerbitan("PT. Gramedia Pustaka Utama 2016");
        b7.setBahasa("Indonesia");
        b7.setEdisi("Pertama");
        b7.setHalaman(240);
        b7.displayMessage();
        System.out.println("=====================================");

        Perpus b8 = new Perpus();
        b8.setJudul("Ya Allah, Aku Jatuh Cinta");
        b8.setKategori("Agama");
        b8.setPenulis("Qowi Alta Az Zahra");
        b8.setPenerbitan("PT. Elex Media Komputindo 2014");
        b8.setBahasa("Indonesia");
        b8.setEdisi("Pertama");
        b8.setHalaman(116);
        b8.displayMessage();
        System.out.println("=====================================");
        
        Perpus b9 = new Perpus();
        b9.setJudul("Akhir Bahagia");
        b9.setKategori("Psikologi");
        b9.setPenulis("Sandy Oogway");
        b9.setPenerbitan("PT. Karpindo 2018");
        b9.setBahasa("Indonesia");
        b9.setEdisi("Pertama");
        b9.setHalaman(121);
        b9.displayMessage();
        System.out.println("=====================================");

        Perpus b10 = new Perpus();
        b10.setJudul("Modul Pembelajaran dan Praktikum Tes Psikologi");
        b10.setKategori("Psikologi");
        b10.setPenulis("Zainul Anwar");
        b10.setPenerbitan("Psychology Forum 2021");
        b10.setBahasa("Indonesia");
        b10.setEdisi("-");
        b10.setHalaman(60);
        b10.displayMessage();
        System.out.println("=====================================");
        
        Perpus b11 = new Perpus();
        b11.setJudul("Nasionalisme Indonesia Kini dan di Masa Depan");
        b11.setKategori("Politik");
        b11.setPenulis("Benedict Anderson");
        b11.setPenerbitan("Anjing Galak Penerbitan 2010");
        b11.setBahasa("Indonesia");
        b11.setEdisi("-");
        b11.setHalaman(42);
        b11.displayMessage();
        System.out.println("=====================================");
        
        Perpus b12 = new Perpus();
        b12.setJudul("Nyanyi sunyi seorang bisu: Catatan-catatan dari P. Buru");
        b12.setKategori("Politik");
        b12.setPenulis("Pramoedya Ananta Toer");
        b12.setPenerbitan("Lentera 1995");
        b12.setBahasa("Indonesia");
        b12.setEdisi("Pertama");
        b12.setHalaman(316);
        b12.displayMessage();
        System.out.println("=====================================");
        
        Perpus b13 = new Perpus();
        b13.setJudul("Laut Bercerita");
        b13.setKategori("Fiksi");
        b13.setPenulis("Leila S. Chudori");
        b13.setPenerbitan("Gramedia Pustaka Utama 2017");
        b13.setBahasa("Indonesia");
        b13.setEdisi("-");
        b13.setHalaman(390);
        b13.displayMessage();
        System.out.println("=====================================");
        
        Perpus b14 = new Perpus();
        b14.setJudul("Seperti Dendam, Rindu Harus Dibayar Tuntas");
        b14.setKategori("Fiksi");
        b14.setPenulis("Eka Kurniawan");
        b14.setPenerbitan("Gramedia Pustaka Utama 2019");
        b14.setBahasa("Indonesia");
        b14.setEdisi("-");
        b14.setHalaman(257);
        b14.displayMessage();
        System.out.println("=====================================");
    }
    }
}
