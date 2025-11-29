public class Exercise4_6_Multadd {

    /**
     * Calculates the expression: a * b + c
     */
    public static double multadd(double a, double b, double c) {
        // Formül: a * b + c
        return a * b + c;
    }

    /**
     * Calculates expSum(x) = x * e^-x + (1 - e^-x) 
     * This function uses the multadd method.
     */
    public static double expSum(double x) {
        // c = (1 - e^-x)
        // a * b = x * e^-x
        double eNegX = Math.exp(-x);
        
        // Formülü multadd(a, b, c) yapisina cevirir
        return multadd(x, eNegX, (1.0 - eNegX));
    }

    public static void main(String[] args) {
        final double PI = Math.PI;

        System.out.println("--- Exercise 4.6: Multadd and expSum ---");
        System.out.println();

        // 1. TEST: multadd(1.0, 2.0, 3.0)
        double test1Result = multadd(1.0, 2.0, 3.0);
        System.out.printf("1. multadd(1.0, 2.0, 3.0) sonucu: %.2f\n", test1Result);
        System.out.println("----------------------------------------");


        // 2. TEST: sin(pi/4) + cos(pi/4) / 2
        // multadd(a, b, c) olarak yazilisi: multadd(0.5, cos(pi/4), sin(pi/4))
        double piOver4 = PI / 4.0;
        double test2Result = multadd(0.5, Math.cos(piOver4), Math.sin(piOver4));
        System.out.printf("2. sin(pi/4) + cos(pi/4) / 2 sonucu: %.4f\n", test2Result);
        System.out.println("----------------------------------------");


        // 3. TEST: log(10) + log(20)
        // multadd(a, b, c) olarak yazilisi: multadd(1.0, log(20), log(10))
        // Not: Math.log() dogal logaritmayi (ln) kullanir.
        double test3Result = multadd(1.0, Math.log(20), Math.log(10));
        System.out.printf("3. log(10) + log(20) sonucu:        %.4f\n", test3Result);
        System.out.println("----------------------------------------");


        // 4. TEST: expSum(x) metodu testi. x=5.0 alalim.
        double testX = 5.0;
        double expSumResult = expSum(testX);
        System.out.printf("4. expSum(%.1f) sonucu:             %.4f\n", testX, expSumResult);
        System.out.println("----------------------------------------");

    }
}
