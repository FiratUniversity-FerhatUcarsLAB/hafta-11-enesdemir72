public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) { // 1. cagri: bob=5 (True)
            ping("not ");
        } else { // 2. cagri: bob=4 (False)
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        
        // 1. zoop cagrisi: fred="just for", bob=5
        zoop("just for", bizz); 
        
        // clink cagrisi: fork = 2 * 2 = 4
        clink(2 * buzz); 
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        
        // 2. zoop cagrisi: fred="breakfast ", bob=4
        zoop("breakfast ", fork); 
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
