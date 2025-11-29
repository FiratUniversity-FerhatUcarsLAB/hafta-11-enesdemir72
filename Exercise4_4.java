public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber(); 
        /* * CEVAP 1: Bir deger donduren metot cagrilir ancak sonucu kullanilmazsa:
         * * 1. Calisma: Metot icindeki tum kodlar calisir.
         * 2. Sonuc: Metodun dondurdugu 42 degeri, herhangi bir degiskene atanmadigi veya 
         * bir islemde kullanilmadigi icin aninda atilir (discarded). 
         * 3. Derleme: Kod derlenir ve calisir, ancak derleyici cogunlukla bir uyari (Warning) verir.
         */


        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7); 
        /*
         * CEVAP 2: Bir void metodu bir ifadenin icinde kullanilmaya calisilirsa:
         * * 1. Derleme: Kod derlenemez ve Compiler Error (Derleyici Hatasi) verir.
         * 2. Hata Sebebi: 'sayHello()' metodu 'void' tipindedir (deger dondurmez). 
         * Toplama (+) operatoru ise solunda ve saginda kullanabilecegi bir degere (int, double, String vb.) ihtiyac duyar.
         * void, bir deger olmadigi icin isleme dahil edilemez.
         */

    }
}
