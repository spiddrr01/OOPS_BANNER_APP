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
        System.out.println(String.join("", " **** ", "**** ", " *** ", " *** ", " **** "));
        System.out.println(String.join("", "*    ", "*    *", "*    *", "*    *", "*    *"));
        System.out.println(String.join("", "*    ", "*    *", "*    *", "*    *", "*   * "));
        System.out.println(String.join("", "*    ", "*    *", " *** ", " *** ", "*  *  "));
        System.out.println(String.join("", "*    ", "*    *", "*    *", "*   * ", "* *   "));
        System.out.println(String.join("", "*    ", "*    *", "*    *", "*    *", "**    "));
        System.out.println(String.join("", " **** ", "**** ", " *** ", "*    *", "*     "));
    }
}
