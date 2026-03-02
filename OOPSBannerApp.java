/**
 * @author Anurag
 * @version 2.0
 * 
 * UC2: Display "OOPS" in a large banner using spaces and asterisks
 * 
 * This implementation demonstrates:
 * - Using individual print statements for each line of the banner
 * - String concatenation with the + operator to create visual patterns
 * - ASCII art composition using asterisks and spaces
 * - Manual string concatenation approach (drawback: creates multiple String objects)
 */
public class OOPSBannerApp {
    
    /**
     * Main method - the entry point of the application
     * @param args Command line arguments (not used in UC2)
     */
    public static void main(String[] args) {
        // Line 1 - Demonstrating manual string concatenation with + operator
        String line1 = " **** " + " **** " + "**** " + " *** ";
        System.out.println(line1);
        
        // Line 2
        String line2 = "*    *" + "*    *" + "*    *" + "*    *";
        System.out.println(line2);
        
        // Line 3
        String line3 = "*    *" + "*    *" + "*    *" + "*   * ";
        System.out.println(line3);
        
        // Line 4
        String line4 = "*    *" + "*    *" + " *** " + " *** ";
        System.out.println(line4);
        
        // Line 5
        String line5 = "*    *" + "*    *" + "*   * " + "*    *";
        System.out.println(line5);
        
        // Line 6
        String line6 = "*    *" + "*    *" + "*    *" + "*    *";
        System.out.println(line6);
        
        // Line 7
        String line7 = " **** " + " **** " + "*    " + " *** ";
        System.out.println(line7);
    }
}
