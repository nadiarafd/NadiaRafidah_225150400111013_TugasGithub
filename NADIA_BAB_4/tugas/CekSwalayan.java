public public class CekSwalayan {
    public static void main(String[] args) {
    Swalayan t1 = new Swalayan("Nadia Rafidah", "Gold");
    System.out.println(" PELANGGAN 001");
    System.out.println("--------------------------------------------------------------------");
    System.out.println("Nama: " + t1.getNama());
    System.out.println("Jenis Rekening: " + t1.getjenisRekening());
    t1.setnomorPelanggan("5608745001");
    t1.setPin("1234");
    System.out.println("--------------------------------------------------------------------");
    t1.autentifikasi("5608745001", "1234");
    t1.topUp(300000);
    t1.setPembelian(50000);
    System.out.println("\n");
    Swalayan t2 = new Swalayan("Elvina Jelita", "Silver");
    System.out.println(" PELANGGAN 002");System.out.println("-----------------------------------------------------------------------");
    System.out.println("Nama: " + t2.getNama());
    System.out.println("Jenis Rekening: " + t2.getjenisRekening());
    t2.setnomorPelanggan("3806865004");
    t2.setPin("5678");
    System.out.println("--------------------------------------------------------------------");
    t2.autentifikasi("3806865003","5678");
    t2.autentifikasi("3806845004", "5678");
    t2.autentifikasi("3805865004", "5678");
    t2.setPembelian(150000);
    System.out.println("\n");
    Swalayan t3 = new Swalayan("Bintang Adi", "Platinum");
    System.out.println(" PELANGGAN 003");
    System.out.println("--------------------------------------------------------------------");
    System.out.println("Nama: " + t3.getNama());
    System.out.println("Jenis Rekening: " + t3.getjenisRekening());
    t3.setnomorPelanggan("7408347009");
    t3.setPin("9876");
    System.out.println("--------------------------------------------------------------------");
    t3.autentifikasi("7408347009", "1234");
    t3.autentifikasi("7408347009", "9876");
    t3.topUp(2000000);
    t3.setPembelian(1500000);
    }
    
    } 
    

