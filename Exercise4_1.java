public class Exercise4_1 {

    /**
     * Prints the date in American format: Day, Month Date, Year
     * Example: Saturday, November 29, 2025
     */
    public static void printAmerican(String day, int date, String month, int year) {
        // American format: Day, Month Date, Year
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    /**
     * Prints the date in European format: Day Date Month Year
     * Example: Saturday 29 November 2025
     */
    public static void printEuropean(String day, int date, String month, int year) {
        // European format: Day Date Month Year
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        // Test variables using a current date example
        String testDay = "Saturday";
        int testDate = 29;
        String testMonth = "November";
        int testYear = 2025;

        System.out.println("--- Exercise 4.1 - Date Printing Methods ---");

        // Calling American format method
        System.out.print("American Format: ");
        printAmerican(testDay, testDate, testMonth, testYear);

        // Calling European format method
        System.out.print("European Format: ");
        printEuropean(testDay, testDate, testMonth, testYear);
        
        System.out.println("------------------------------------------");
    }
}
