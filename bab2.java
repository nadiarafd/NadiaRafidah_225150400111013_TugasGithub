
public class bab2 {
    
    public class Manusia {
        String nama;
        int jumlahBuah;
    
        public Manusia(String nama, int jumlahBuah) {
            this.nama = nama;
            this.jumlahBuah = jumlahBuah;
        }
    
        public void beliBuah(Buah buah, int jumlah) {
            if (jumlah <= buah.jumlahBuah) {
                System.out.println("Berhasil checkout buah");
                buah.jumlahBuah -= jumlah;
                this.jumlahBuah += jumlah;
                System.out.println("Sisa stok " + buah.nama + ": " + buah.jumlahBuah);
            } else {
                System.out.println("Gagal checkout buah");
            }
        }
    }

    public class Buah {
        String nama;
        int jumlahBuah;
    
        public Buah(String nama, int jumlahBuah) {
            this.nama = nama;
            this.jumlahBuah = jumlahBuah;
        }
    }
    public static void main(String[] args) {
        Buah jeruk = new Buah("Jeruk", 10);
        Manusia pakTejo = new Manusia("Pak Tejo", 0);
    
        pakTejo.beliBuah(jeruk, 5); // Berhasil checkout buah, Sisa stok Jeruk: 5
        pakTejo.beliBuah(jeruk, 8); // Gagal checkout buah
    }
    
    

}
