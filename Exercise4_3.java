public class Exercise4_3 {

    public static void zoop() {
        baffle(); // 1. Baffle cagrisi
        System.out.print("You wugga ");
        baffle(); // 2. Baffle cagrisi
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle(); // 3. Baffle cagrisi
    }

    public static void baffle() {
        System.out.print("wug");
        ping(); // Ping cagrilarinin gerceklestigi satir
    }

    public static void ping() {
        System.out.println(".");
    }
}
