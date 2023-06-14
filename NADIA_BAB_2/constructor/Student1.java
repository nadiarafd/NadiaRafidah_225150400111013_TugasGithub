public class Student1 {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int numObjects;

    public Student1(){
     name = "";
     address = "";
     age = 0;
     numObjects++;
     }

     public Student1(String n, String a, int ag){
     name = n;
     address = a;
     age = ag;
     numObjects++;
     }

     public Student1(double math, double english, double science) {
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        numObjects++;
    }

     public void setName(String n){
        name = n;
      }
     public void setAddress(String a){
        address = a;
        }
     public void setAge(int ag){
        age = ag;
        }
     public void setMath(int math){
        mathGrade = math;
        }
     public void setEnglish(int english){
        englishGrade = english;
        }
     public void setScience(int science){
        scienceGrade = science;
        }
        
 private double getAverage(){
 double result = 0;
 result = (mathGrade+scienceGrade+englishGrade)/3;
 return result;
 }

 public boolean statusAkhir() {
    double average = getAverage();
    if (average >= 61) {
        return true; // lolos
    } else {
        return false; // remidi
    }
}

public static void jumlahObjek() {
    System.out.println("Jumlah murid yang terdaftar: " + numObjects);
}

 public void displayMessage(){
 System.out.println("Siswa dengan nama "+name);
 System.out.println("beramalat di "+address);
 System.out.println("berumur "+age);
 System.out.println("mempunyai nilai rata rata "+getAverage());
 System.out.println("Status: " + (statusAkhir() ? "Lolos" : "Remidi"));
 jumlahObjek();
 }
 }