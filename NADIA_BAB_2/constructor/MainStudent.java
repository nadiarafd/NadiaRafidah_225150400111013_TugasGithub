import java.util.Scanner;

public class MainStudent {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Student1 anna = new Student1();
    
    anna.setName("Anna");
    anna.setAddress("Malang");
    anna.setAge(20);
    anna.displayMessage();
    Student1 student1 = new Student1(85, 90, 80);
    student1.setName("contoh construkktor nilai");
    student1.displayMessage();
    
     //menggunakan constructor lain
    System.out.println("===================");
    Student1 chris = new Student1("Chris", "Kediri", 21);
    chris.setMath(70);
    chris.setScience(60);
    chris.setEnglish(90);
    chris.displayMessage();

    
     //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
     System.out.println("===================");
     anna = new Student1("anna", "Batu", 18);
     anna.setMath(100);
     anna.setScience(89);
     anna.setEnglish(80);
     anna.displayMessage();
    
     //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
     System.out.println("===================");
     chris.setAddress("Surabaya");
     chris.setAge(22);
     chris.displayMessage();

        System.out.print("Masukkan jumlah siswa: ");
        int numStudents = scanner.nextInt();

        Student1[] students = new Student1[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Siswa #" + (i+1));
            System.out.print("Nama: ");
            String name = scanner.next();
            System.out.print("Alamat: ");
            String address = scanner.next();
            System.out.print("Usia: ");
            int age = scanner.nextInt();
            System.out.print("Nilai Matematika: ");
            int mathGrade = scanner.nextInt();
            System.out.print("Nilai Bahasa Inggris: ");
            int englishGrade = scanner.nextInt();
            System.out.print("Nilai Sains: ");
            int scienceGrade = scanner.nextInt();

            students[i] = new Student1(name, address, age);
            students[i].setEnglish(englishGrade);
            students[i].setMath(mathGrade);
            students[i].setScience(scienceGrade);
        }

        for (int i = 0; i < numStudents; i++) {
            students[i].displayMessage();
            System.out.println();
        }
    }
}

