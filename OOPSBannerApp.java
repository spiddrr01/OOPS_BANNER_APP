/**
 * @author Anurag
 * @version 3.0
 * 
 * UC3: Refactor UC2 to use String.join() instead of + concatenation
 * 
 * This implementation demonstrates:
 * - Using String.join() method for efficient string composition
 * - Reduced memory overhead by avoiding intermediate String objects
 * - Better memory management compared to the + operator
 * - Sequential print statements maintained for clarity
 */
public class OOPSBannerApp {
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC3)
     */
    public static void main(String[] args) {
        // Line 1 - Using String.join() instead of + operator for memory efficiency
        String line1 = String.join("", " **** ", " **** ", "**** ", " *** ");
        System.out.println(line1);
        
        // Line 2
        String line2 = String.join("", "*    *", "*    *", "*    *", "*    *");
        System.out.println(line2);
        
        // Line 3
        String line3 = String.join("", "*    *", "*    *", "*    *", "*   * ");
        System.out.println(line3);
        
        // Line 4
        String line4 = String.join("", "*    *", "*    *", " *** ", " *** ");
        System.out.println(line4);
        
        // Line 5
        String line5 = String.join("", "*    *", "*    *", "*   * ", "*    *");
        System.out.println(line5);
        
        // Line 6
        String line6 = String.join("", "*    *", "*    *", "*    *", "*    *");
        System.out.println(line6);
        
        // Line 7
        String line7 = String.join("", " **** ", " **** ", "*    ", " *** ");
        System.out.println(line7);
    }
}
