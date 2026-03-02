/**
 * @author Anurag
 * @version 5.0
 * 
 * UC5: Combine array declaration and initialization with String.join() calls
 * 
 * This implementation demonstrates:
 * - Array declaration and initialization in a single statement
 * - Direct value assignment using array initializer syntax
 * - More concise and readable code
 * - Maintained modularity through array storage and looping
 */
public class OOPSBannerApp {
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC5)
     */
    public static void main(String[] args) {
        // Declare and initialize banner array in a single statement
        String[] bannerLines = {
            String.join("", " **** ", "**** ", " *** ", " *** ", " **** "),
            String.join("", "*    ", "*    *", "*    *", "*    *", "*    *"),
            String.join("", "*    ", "*    *", "*    *", "*    *", "*   * "),
            String.join("", "*    ", "*    *", " *** ", " *** ", "*  *  "),
            String.join("", "*    ", "*    *", "*    *", "*   * ", "* *   "),
            String.join("", "*    ", "*    *", "*    *", "*    *", "**    "),
            String.join("", " **** ", "**** ", " *** ", "*    *", "*     ")
        };
        
        // Use enhanced for-loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
