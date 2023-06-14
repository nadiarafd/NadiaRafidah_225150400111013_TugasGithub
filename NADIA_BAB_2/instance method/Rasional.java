public class Rasional{

    private int pembilang, penyebut;
    public Rasional() {
        pembilang=0;
        penyebut=0;
    }
    public Rasional(int pbl, int pyb) { 
        pembilang=pbl;
        penyebut=pyb;
    }
        
        //mengecek suatu bilangan adalah rasional atau bukan
        public boolean isRasional() {
        return (penyebut!= 0);
    }

        //menyederhanakan bilangan rasional
        public void Sederhana() {
        int temp, A, B;
        if (penyebut ==0){
            return;
        }

        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;
        
        for(;B!=0;){
            temp= A % B;
        A = B;
        B = temp;
        }

        pembilang /=A;
        penyebut /=A;
    }

        public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang /
        (double)penyebut;
    }
        
     //oprator >
     public boolean moreThan (Rasional A){
     return (pembilang * A.penyebut > penyebut * A.pembilang
     );
     }

     //oprator <
     public boolean lessThan (Rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang
    );
    }
        
    //oprator >=
    public boolean moreOrEqual (Rasional A){
        return (pembilang * A.penyebut >= penyebut * A.pembilang
    );
    }

    //oprator <=
    public boolean lessOrEqual (Rasional A){
        return (pembilang * A.penyebut <= penyebut * A.pembilang
    );
    }

    //operator -
    public void unarymin(Rasional A){
        int a = pembilang;
       pembilang = penyebut * A.pembilang-a * A.penyebut;
       penyebut *=A.penyebut;
    }

    //operator *
    public void multiple(Rasional A){
        int a = pembilang;
        int b = penyebut;
        pembilang = a* A.pembilang;
        penyebut =b*A.penyebut;
     }

     //operator /
    public void divide(Rasional A){
        int a = pembilang;
        int b = penyebut;
        pembilang = a*A.penyebut;
        penyebut =b*A.pembilang;
     }
   
     //operator Unary- ---> A = -A
     public void negasi(){
     pembilang = - pembilang;
     }
     //operator unary += \
     public void unaryPlus(Rasional A){
     pembilang = pembilang * A.penyebut + penyebut *
     A.pembilang;
     penyebut *=A.penyebut;
     }
     public void cetak(){
     System.out.println(pembilang + "/" + penyebut);
     }
     }